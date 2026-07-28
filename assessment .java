<!DOCTYPE html>
<html>
<head>
    <title>Career Assessment - NextHire</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="dashboard-box">

    <h1>🧠 Career Assessment</h1>
    <hr>

    <h3>Find Your Ideal Career Path</h3>

    <input type="text" placeholder="Enter Your Name">

    <select>
        <option>Select Your Interest</option>
        <option>Artificial Intelligence</option>
        <option>Data Science</option>
        <option>Web Development</option>
        <option>Cyber Security</option>
        <option>Cloud Computing</option>
    </select>

    <select>
        <option>Select Your Skill Level</option>
        <option>Beginner</option>
        <option>Intermediate</option>
        <option>Advanced</option>
    </select>

    <button onclick="recommendCareer()">
        🔍 Get Recommendation
    </button>

    <br><br>

    <button onclick="window.location.href='dashboard.html'">
        ⬅ Back to Dashboard
    </button>

</div>

<script>
function recommendCareer()
{
    alert("Recommended Career: AI Engineer 🚀");
}
</script>

</body>

</html>
