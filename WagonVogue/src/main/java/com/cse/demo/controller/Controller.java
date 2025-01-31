package com.cse.demo.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

//import java.time.LocalDate;
//import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cse.demo.model.Customer;
import com.cse.demo.model.Owner;
import com.cse.demo.model.Product;
import com.cse.demo.model.Reserve;
//import com.cse.demo.model.Product;
//import com.cse.demo.model.Seat;
import com.cse.demo.service.CustomerService;
import com.cse.demo.service.OwnerService;
import com.cse.demo.service.ProductService;
import com.cse.demo.service.ReserveService;

import jakarta.servlet.http.HttpServletResponse;

import java.util.Base64;

@RestController
public class Controller {
    @Autowired
    ProductService ps;
    @Autowired
    CustomerService ser;
    @Autowired
    OwnerService oser;
    @Autowired 
    ReserveService rs;
    @GetMapping("/home")
    public ModelAndView home() {
    	ModelAndView modelAndView = new ModelAndView("home");
        modelAndView = setAllValues(modelAndView);
        return modelAndView;
    }
    @GetMapping("/explore")
    public ModelAndView explore() {
    	ModelAndView modelAndView = new ModelAndView("explore");
    	List<Product> allProducts = ps.getAllProducts();
        modelAndView.addObject("products", allProducts);
        modelAndView = setAllValues(modelAndView);
        return modelAndView;
    }
 
    @GetMapping("/image/{id}")
    public void showImage(@PathVariable("id") int id, HttpServletResponse response) throws IOException {
        Product product = ps.getProductById(id);
        if (product != null && product.getImage() != null) {
            String contentType = "image/jpeg"; 
            if (isPng(product.getImage())) {
                contentType = "image/png";
            }

            response.setContentType(contentType);
            response.getOutputStream().write(product.getImage());
            response.getOutputStream().close();
        }
    }

    private boolean isPng(byte[] imageBytes) {
        return imageBytes.length > 8 &&
               imageBytes[0] == (byte) 137 &&
               imageBytes[1] == (byte) 80 &&
               imageBytes[2] == (byte) 78 &&
               imageBytes[3] == (byte) 71 &&
               imageBytes[4] == (byte) 13 &&
               imageBytes[5] == (byte) 10 &&
               imageBytes[6] == (byte) 26 &&
               imageBytes[7] == (byte) 10;
    }

    
    @GetMapping("/login")
    public ModelAndView login() {
    	ModelAndView modelAndView = new ModelAndView("login");
        modelAndView = setAllValues(modelAndView);
        return modelAndView;
    }

    @GetMapping("/about")
    public ModelAndView about() {
    	ModelAndView modelAndView = new ModelAndView("about");
        modelAndView = setAllValues(modelAndView);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView create() {
    	ModelAndView modelAndView = new ModelAndView("productCreation");
        modelAndView = setAllValues(modelAndView);
        return modelAndView;
    }
    @GetMapping("/product")
    public ModelAndView productPage() {
    	ModelAndView modelAndView = new ModelAndView("product");
        modelAndView = setAllValues(modelAndView);
    	return modelAndView;
    }

    @GetMapping("/product/{id}")
    public ModelAndView getPro(@PathVariable int id) {
    	Product product = ps.getProductById(id);
    	ModelAndView m = new ModelAndView("product");
    	m.addObject("product",product);
    	return m;
    }
    public ModelAndView setAllValues(ModelAndView modelAndView) {
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("owner", new Owner());
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("reserve", new Reserve());
    	return modelAndView;
    }

    @GetMapping("/profile")
    public ModelAndView ownerProfile() {
        Customer customer = ser.getCustomerById(1); 
        ModelAndView modelAndView = new ModelAndView("profile"); 
        modelAndView.addObject("customer", customer); 
        List<Product> allProducts = ps.getAllProducts(); 
        modelAndView.addObject("products", allProducts);
        return modelAndView;
    }
    @PostMapping("/createProfile")
    public ModelAndView saveProfile(
    		@RequestParam("name") String name,
    		@RequestParam("user") String user,
    	    @RequestParam("emailId") String emailId,
    	    @RequestParam("phoneNumber") int phoneNumber,
    	    @RequestParam("dob") int dob,
    	    @RequestParam("address") String address,
    	    @RequestParam("password") String password) {
    	if(user.equals("customer"))
    	{
    		 Customer cus = new Customer();
    		    cus.setName(name);
    		    cus.setUser(user);
    		    cus.setEmailId(emailId);
    		    cus.setPhoneNumber(phoneNumber);
    		    cus.setDob(dob);
    		    cus.setAddress(address);
    		    cus.setPassword(password);
    		ser.saveCustomer(cus);
    		ModelAndView m= new ModelAndView("home");
    		m= setAllValues(m);
    		m.addObject("customer",cus);
    		return m;
    	}
    	else
    	{
    		 Owner own = new Owner();
 		    own.setName(name);
 		    own.setUser(user);
 		    own.setEmailid(emailId);
 		    own.setPhonenumber(phoneNumber);
 		    own.setDob(dob);
 		    own.setAddress(address);
 		    own.setPassword(password);
    		oser.saveOwner(own);
    		ModelAndView m= new ModelAndView("home");
    		m= setAllValues(m);
    		m.addObject("customer",own);
    		return m;
    	}
    }
    
    
    @Autowired
    ReserveService ord;
    @PostMapping("/saveOrder")
    public ModelAndView saveOrder(
    		@RequestParam("time1") LocalTime time1,
    		@RequestParam("time2") LocalTime time2,
    	    @RequestParam("date") LocalDate date,
    	    @RequestParam("seats") int seats,
    	    @RequestParam("price") int price) {
    	
    			Reserve or = new Reserve();
    		    or.setTime1(time1);
    		    or.setTime2(time2);
    		    or.setDate(date);
    		    or.setSeats(seats);
    		    or.setPrice(price);
    		ord.saveReserve(or);
    		ModelAndView m= new ModelAndView("home");
    		m= setAllValues(m);
    		return m;
    }
    
    @Autowired
    ProductService pro;
    @PostMapping("/productAdded")
    public ModelAndView saveProduct(
    		@RequestParam("name") String name,
    		@RequestParam("services") String services,
    	    @RequestParam("rate") double rate,
    	    @RequestParam("features") String feactures,
    	    @RequestParam("rating") float rating,
    	    @RequestParam("seats") int seats,
    	    @RequestParam("timein") LocalTime timein,
    	    @RequestParam("timeout") LocalTime timeout,
    	    @RequestParam("image") MultipartFile imageFile) throws IOException{
  
    		 Product prod = new Product();
    		 	prod.setName(name);
    		 	prod.setServices(services);
    		 	prod.setRate(rate);
    		 	prod.setFeatures(feactures);
    		 	prod.setRating(rating);
    		    prod.setSeats(seats);
    		    prod.setTimein(timein);
    		    prod.setTimeout(timeout);
    		    byte[] imageBytes = imageFile.getBytes();
    		    prod.setImage(imageBytes);
    		pro.saveProduct(prod);
    		ModelAndView mo= new ModelAndView("home");
    		mo=setAllValues(mo);
    		return mo;
}
}
//@GetMapping("/saveProduct")
//public List<Product> getProducts(){
//	return service.getAllProducts();
//}
//@PostMapping("/addProducts")
//public String addProduct(@RequestBody Product product) {
//	return service.saveProduct(product);
//}
//@GetMapping("/product/{id}")
//public Product getProductById(@PathVariable int id){
//	return service.getProductById(id);
//}
//@DeleteMapping("/product/{id}")
//public String delProductById(@PathVariable int id) {
//	return service.deleteProductById(id);
//}
//@PutMapping("/product/{id}")
//public String updateProductById(@PathVariable int id,@RequestBody Product product) {
//	return service.updateProductById(id,product);
//}