<!DOCTYPE html>
<html>
<head>
    <title>Professional Resume</title>
    <link rel="stylesheet" href="style.css">
</head>

<body style="background:#e5e5e5;">

<div style="width:800px; margin:30px auto; background:white; padding:40px; border-radius:10px; box-shadow:0 0 10px gray;">

    <h1 id="name" style="text-align:center;color:#2575fc;"></h1>

    <hr>

    <h2>Contact</h2>

    <p><b>Email:</b> <span id="email"></span></p>

    <hr>

    <h2>Education</h2>

    <p><b>College:</b> <span id="college"></span></p>

    <p><b>Course:</b> <span id="course"></span></p>

    <hr>

    <h2>Technical Skills</h2>

    <p id="skills"></p>

    <hr>

    <h2>Area of Interest</h2>

    <p id="interest"></p>

    <hr>

    <h2>Career Objective</h2>

    <p>
        Motivated and enthusiastic student seeking an opportunity
        to apply my technical knowledge, improve my practical
        skills, and contribute effectively to an organization
        while continuously learning new technologies.
    </p>

    <hr>

    <h2>Strengths</h2>

    <ul>
        <li>Problem Solving</li>
        <li>Quick Learner</li>
        <li>Team Player</li>
        <li>Communication Skills</li>
    </ul>

    <hr>

    <h2>Declaration</h2>

    <p>
        I hereby declare that the above information is true to the
        best of my knowledge and belief.
    </p>

    <br>

    <button onclick="window.print()">🖨 Print / Save as PDF</button>

    <button onclick="window.location.href='dashboard.html'">
        ⬅ Back to Dashboard
    </button>

</div>

<script>
document.getElementById("name").innerHTML = localStorage.getItem("name");
document.getElementById("email").innerHTML = localStorage.getItem("email");
document.getElementById("college").innerHTML = localStorage.getItem("college");
document.getElementById("course").innerHTML = localStorage.getItem("course");
document.getElementById("skills").innerHTML = localStorage.getItem("skills");
document.getElementById("interest").innerHTML = localStorage.getItem("interest");
</script>

</body>
</html>
