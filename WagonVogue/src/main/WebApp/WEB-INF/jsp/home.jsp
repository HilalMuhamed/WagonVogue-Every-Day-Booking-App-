<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wagon Vogue</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/global.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">
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
        <h1>SCHEDULE YOUR<br>APOINTMENT WITH <span>US</span></h1>
        <div class="button-container">
<button class="ActionBtn" type="button" onclick="window.location.href='/explore'">Browse<svg width="77" height="37" viewBox="0 0 77 37" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M75.7678 20.2678C76.7441 19.2915 76.7441 17.7085 75.7678 16.7322L59.8579 0.82233C58.8816 -0.15398 57.2986 -0.15398 56.3223 0.82233C55.346 1.79864 55.346 3.38155 56.3223 4.35786L70.4645 18.5L56.3223 32.6421C55.346 33.6184 55.346 35.2014 56.3223 36.1777C57.2986 37.154 58.8816 37.154 59.8579 36.1777L75.7678 20.2678ZM0 21H74V16H0V21Z" fill="white"/>
            </svg>
            </button></div>
    <div class="HomeFullCard">
    <div class="HomeCard">
        <img src="https://s3-alpha-sig.figma.com/img/b35c/bf6f/fba634677d886bfb50db66f9c671e482?Expires=1730073600&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4&Signature=HYzyK~AmNLNXTUXfXOTA1OmVyQo5bTi5V7osCiNQE5ZILaQqTs5YvrpOwFQd0J~G4y~J~nUIHc8icknQIdTQcLZF0nZZTv5FFNLcibllSm5lb1WlaZSkHcGoZWhePJ8661FFwKqN-xen4BoVHU5g4AKoXwCsz6YdFYZvYO91gTGYJbwXZ-Ujz1q1HlA1gMDDqcj6PgKpVib9UAO8FmTaWPfw5yloRXlhl9fEbPubQfhso-d2qbOfM6JstrPy0VqDQwA67CacHE1Leg2l~HFhrHqTslH9sT9NLvPuNfIjmtSmvjwBdyAzFbuIA-ZOoW0R8Kn2MpNr7ngcLpu8fJvdCw__" alt="Girl in a jacket" width="200px" height="250px">       
        <br><button onclick="window.location.href='/explore'" type="button">Saloons<svg width="40" height="15" viewBox="0 0 77 37" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M75.7678 20.2678C76.7441 19.2915 76.7441 17.7085 75.7678 16.7322L59.8579 0.82233C58.8816 -0.15398 57.2986 -0.15398 56.3223 0.82233C55.346 1.79864 55.346 3.38155 56.3223 4.35786L70.4645 18.5L56.3223 32.6421C55.346 33.6184 55.346 35.2014 56.3223 36.1777C57.2986 37.154 58.8816 37.154 59.8579 36.1777L75.7678 20.2678ZM0 21H74V16H0V21Z" fill="white"/>
            </svg>
            </button>
    </div>
      <div class="HomeCard">
      <img src="https://images.pexels.com/photos/1640772/pexels-photo-1640772.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"alt="Girl in a jacket" width="200px" height="250px">  
       <button onclick="window.location.href='/explore'" type="button">Resturants<svg width="40" height="15" viewBox="0 0 77 37" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M75.7678 20.2678C76.7441 19.2915 76.7441 17.7085 75.7678 16.7322L59.8579 0.82233C58.8816 -0.15398 57.2986 -0.15398 56.3223 0.82233C55.346 1.79864 55.346 3.38155 56.3223 4.35786L70.4645 18.5L56.3223 32.6421C55.346 33.6184 55.346 35.2014 56.3223 36.1777C57.2986 37.154 58.8816 37.154 59.8579 36.1777L75.7678 20.2678ZM0 21H74V16H0V21Z" fill="white"/>
            </svg>
            </button>

    </div>
      <div class="HomeCard">
      <img src="https://images.pexels.com/photos/1105666/pexels-photo-1105666.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"alt="Girl in a jacket" width="200px" height="250px">  
        <br><button onclick="window.location.href='/explore'" type="button">Concert<svg width="40" height="15" viewBox="0 0 77 37" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M75.7678 20.2678C76.7441 19.2915 76.7441 17.7085 75.7678 16.7322L59.8579 0.82233C58.8816 -0.15398 57.2986 -0.15398 56.3223 0.82233C55.346 1.79864 55.346 3.38155 56.3223 4.35786L70.4645 18.5L56.3223 32.6421C55.346 33.6184 55.346 35.2014 56.3223 36.1777C57.2986 37.154 58.8816 37.154 59.8579 36.1777L75.7678 20.2678ZM0 21H74V16H0V21Z" fill="white"/>
            </svg>
            </button>

    </div>
      <div class="HomeCard">
        <img src="https://images.pexels.com/photos/2350325/pexels-photo-2350325.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"alt="Girl in a jacket" width="200px" height="250px">         
        <br><button onclick="window.location.href='/explore'" type="button">LiveEvents<svg width="40" height="15" viewBox="0 0 77 37" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M75.7678 20.2678C76.7441 19.2915 76.7441 17.7085 75.7678 16.7322L59.8579 0.82233C58.8816 -0.15398 57.2986 -0.15398 56.3223 0.82233C55.346 1.79864 55.346 3.38155 56.3223 4.35786L70.4645 18.5L56.3223 32.6421C55.346 33.6184 55.346 35.2014 56.3223 36.1777C57.2986 37.154 58.8816 37.154 59.8579 36.1777L75.7678 20.2678ZM0 21H74V16H0V21Z" fill="white"/>
            </svg>
            </button>
 
    </div>
    </div>  <div class="button-container">
            <br><button type="button" onclick="window.location.href='/explore'">More<svg width="52" height="30" viewBox="0 0 52 30" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M51.4142 16.4142C52.1953 15.6332 52.1953 14.3668 51.4142 13.5858L38.6863 0.857864C37.9052 0.0768156 36.6389 0.0768156 35.8579 0.857864C35.0768 1.63891 35.0768 2.90524 35.8579 3.68629L47.1716 15L35.8579 26.3137C35.0768 27.0948 35.0768 28.3611 35.8579 29.1421C36.6389 29.9232 37.9052 29.9232 38.6863 29.1421L51.4142 16.4142ZM0 17H50V13H0V17Z" fill="#EEEEEE"/>
            </svg>
            </button></div>
    <h1>Digital reservation for <span>better</span> convinience</h1>
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