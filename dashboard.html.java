<!DOCTYPE html>
<html>
<head>
    <title>NextHire - Career Assistant Dashboard</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="dashboard-box">

    <h1>🌟 NextHire</h1>
    <h2>Career Assistant Dashboard</h2>

    <p id="welcome"></p>

    <hr>

    <button onclick="window.location.href='profile.html'">
        👤 My Profile
    </button>

    <br><br>

    <button onclick="window.location.href='assessment.html'">
        🧠 Career Assessment
    </button>

    <br><br>

    <button onclick="window.location.href='jobs.html'">
        🎯 Career Recommendations
    </button>

    <br><br>

    <button onclick="window.location.href='resume.html'">
        📄 Resume Builder
    </button>

    <br><br>

    <button onclick="window.location.href='index.html'">
        🚪 Logout
    </button>

</div>

<script>
let name = localStorage.getItem("name");

if(name)
{
    document.getElementById("welcome").innerHTML =
    "👋 Welcome, " + name + "!";
}
else
{
    document.getElementById("welcome").innerHTML =
    "👋 Welcome to NextHire!";
}
</script>

</body>
</html>
