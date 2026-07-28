<!DOCTYPE html>
<html>
<head>
    <title>NextHire Login</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="login-box">

    <h1>🌟 NextHire</h1>
    <h3>Career Assistant Login</h3>

    <input type="text" id="username" placeholder="Enter Your Name">

    <input type="password" id="password" placeholder="Enter Password">

    <button onclick="login()">Login</button>

    <p>Don't have an account?</p>
    <a href="register.html">Register Here</a>

</div>

<script>
function login()
{
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    let savedName = localStorage.getItem("name");
    let savedPassword = localStorage.getItem("password");

    if(username === savedName && password === savedPassword)
    {
        alert("Login Successful!");
        window.location.href="dashboard.html";
    }
    else
    {
        alert("Invalid Username or Password!");
    }
}
</script>

</body>
</html>
