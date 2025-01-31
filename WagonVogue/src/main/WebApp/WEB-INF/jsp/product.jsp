<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wagon Vogue</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/product.css">
<script>
        function countSelectedCheckboxes() {
        	  const checkboxes = document.querySelectorAll('input[name="seats"]:checked');
              const seatsSelectedInput = document.getElementById('seatsSelected');
              const priceInput = document.getElementById('totalPrice'); 
              const selectedCount = checkboxes.length;
              seatsSelectedInput.value = selectedCount; // Update the seats count
              const pricePerSeat = 10; 
              priceInput.value = selectedCount * pricePerSeat; 
              }
    </script>
</head>
<body>
<nav>
        <a  href="/profile"><p>PROFILE</p></a>   
        <a href="/explore"><p>BROWSE</p></a>
        <div ><a class="MainTitle" href="/home"><p>WAGON<span class="purpleColor">VOGUE</span></p><br>
        <svg width="114" height="5" viewBox="0 0 114 5" fill="none" xmlns="http://www.w3.org/2000/svg">
<path d="M2 3L112 2" stroke="#8800FF" stroke-width="3" stroke-linecap="round"/>
</svg></a></div>
        <a href="/about"><p>ABOUTUS</p></a>
        <a href="/login" class="LoginButton" ><p>LOGIN</p></a>
    </nav>
    <main>
    <h1>${product.name}</h1>
    <div class="BrowsingCard">
            		<div class="product-item">
            		<a  href="${pageContext.request.contextPath}/product/${product.id}">
                	<img src="${pageContext.request.contextPath}/image/${product.id}" width="400" height="300" alt="${product.name}" />
            		<h4>${product.name}</h2>
                	<p>${product.features}</p>
                	<p>Price: ${product.rate}</p></a></div>
                	</div>
    <form action="/saveOrder" method="post">
        <div>
            <div>
                <h3>SCHEDULED TIME</h4>
                <h5>CHECK IN-<br><input type = "time" name="time1" ></h5>
                <h5>CHECK OUT-<br><input type = "time" name="time2"></h5>
            </div>
            <div>
                <h4>DATE</h4>
                <input type = "date" name="date" value="1111-11-11">
            </div>
        </div>
		<div>
        <div class= "checkingBoxes">
        	<c:forEach var="i" begin="1" end="${product.seats}">
            <input type="checkbox" id="seat${i}" name="seats" value="${i}"  onchange="countSelectedCheckboxes()">
            <label for="seat${i}"></label>
            <c:if test="${i%20 == 0}"><br>
            </c:if>
            
        </c:forEach>	
        </div>

        <div>
            <div>
                 <h5>SEATS SELECTED- <input type="number" id="seatsSelected" value="0" readonly></h5>
                <h5>TOTAL PRICE- <input type="number" id="totalPrice" name = "price" value="0" readonly></h5>
            </div>
            <div class="sub-btn"><input type="submit" value="PLACE ORDER"></input></div>
            
            
        </div>
        </div>
        </form>
    </main>
    <footer>
        <div class="footer-container">
            <div class="footer-section brand">
                <h2>Wagon<br>Vogue</h2>
            </div>
            <div class="footer-section">
                <h3>Our Services</h3>
                <ul>
                    <li>Saloons</li>
                    <li>Restaurants</li>
                    <li>Concerts</li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Info</h3>
                <ul>
                    <li>My Account</li>
                    <li>Privacy Policy</li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Follow Us</h3>
                <div class="social-icons">
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-github"></i></a>
                    <a href="#"><i class="fab fa-linkedin"></i></a>
                    <a href="#"><i class="fab fa-facebook"></i></a>
                </div>
                <p>Gmail : hello@gamil.com</p>
            </div>
        </div>
    </footer>
</body>
</html>