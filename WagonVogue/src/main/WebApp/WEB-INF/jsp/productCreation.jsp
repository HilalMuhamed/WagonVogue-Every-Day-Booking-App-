<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wagon Vogue</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
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
	<h1>Simplifying Business Scheduling!</h1>
	<form action="/productAdded" method="post" enctype="multipart/form-data"> 
		<label> Venture Name </label>
		<input type = "text" name="name"><br><br>
		<label> Category/Services </label>
		<input type = "text" name="services"><br><br>
		<label for="image">Select Image:</label>
        <input type="file" id="image" name="image" accept="image/*" required><br><br>
		<label> Scheduled time </label>
		<input type = "time" name="timein" >
		<label> To </label>
		<input type = "time" name="timeout" ><br><br>
		<label> Available seats </label>
		<input type = "number" name = "seats"><br><br>
		<label> Rate / Pricing </label>
		<input type = "number" name="rate"><br><br>
		<label> Features </label>
		<input type = "text" name="features"><br><br>
		<label> Rating </label>
		<input type = "number" name="rating"><br><br>
		<input type = "submit">
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