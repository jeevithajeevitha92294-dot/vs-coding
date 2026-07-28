<!DOCTYPE html>
<html>
<head>
    <title>My Profile - NextHire</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="dashboard-box">

    <h1>👤 My Profile</h1>
    <hr>

    <h3>Student Details</h3>

    <p><b>Name:</b> <span id="name"></span></p>
    <p><b>College:</b> <span id="college"></span></p>
    <p><b>Course:</b> <span id="course"></span></p>
    <p><b>Email:</b> <span id="email"></span></p>

    <hr>

    <h3>💻 Skills</h3>

    <p id="skills"></p>

    <hr>

    <h3>🎯 Area of Interest</h3>

    <p id="interest"></p>

    <br>

    <button onclick="window.location.href='dashboard.html'">
        ⬅ Back to Dashboard
    </button>

</div>

<script>

document.getElementById("name").innerHTML =
localStorage.getItem("name");

document.getElementById("college").innerHTML =
localStorage.getItem("college");

document.getElementById("course").innerHTML =
localStorage.getItem("course");

document.getElementById("email").innerHTML =
localStorage.getItem("email");

document.getElementById("skills").innerHTML =
localStorage.getItem("skills");

document.getElementById("interest").innerHTML =
localStorage.getItem("interest");

</script>

</body>
</html>
