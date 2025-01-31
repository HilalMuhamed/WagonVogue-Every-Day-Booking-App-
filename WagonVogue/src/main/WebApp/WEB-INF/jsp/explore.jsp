<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wagon Voguee</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/explore.css">
</head>
<body><nav>
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
	
    <div>
	   <h1>EXPLORE</h1>
         <div>
            <div>
                <div class="BrowsingCard">
					<c:forEach var="product" items="${products}">
            		<div class="product-item">
            		<a  href="${pageContext.request.contextPath}/product/${product.id}">
                	<img src="${pageContext.request.contextPath}/image/${product.id}" width="400" height="300" alt="${product.name}" />
            		<h2>${product.name}</h2>
                	<p>${product.features}</p>
                	<p>Price: ${product.rate}</p></a></div>
        </c:forEach>
                </div>
            </div>
         </div>
    </div>
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