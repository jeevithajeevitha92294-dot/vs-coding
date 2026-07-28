<!DOCTYPE html>
<html>
<head>
    <title>Career Recommendations - NextHire</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="dashboard-box">

    <h1>🎯 Career Recommendations</h1>
    <hr>

    <h3>Your Interest</h3>
    <p id="interest"></p>

    <hr>

    <h3>Recommended Careers</h3>
    <div id="career"></div>

    <br>

    <button onclick="window.location.href='dashboard.html'">
        ⬅ Back to Dashboard
    </button>

</div>

<script>

let interest = localStorage.getItem("interest");

document.getElementById("interest").innerHTML = interest;

let career = "";

if(interest == "Artificial Intelligence")
{
    career = "🤖 AI Engineer<br><br>🧠 Machine Learning Engineer<br><br>💡 AI Research Engineer";
}
else if(interest == "Data Science")
{
    career = "📊 Data Analyst<br><br>📈 Data Scientist<br><br>🗄 Database Analyst";
}
else if(interest == "Web Development")
{
    career = "🌐 Front-End Developer<br><br>💻 Full Stack Developer<br><br>🎨 UI Developer";
}
else if(interest == "Cyber Security")
{
    career = "🔒 Cyber Security Analyst<br><br>🛡 Ethical Hacker<br><br>🔐 Security Engineer";
}
else if(interest == "Cloud Computing")
{
    career = "☁ Cloud Engineer<br><br>🚀 DevOps Engineer<br><br>🖥 Cloud Architect";
}
else
{
    career = "Please complete Career Assessment.";
}

document.getElementById("career").innerHTML = career;

</script>

</body>
</html>
