<!DOCTYPE html>
<html>
<head>
    <title>NextHire Registration</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="login-box">

    <h1>🌟 NextHire</h1>
    <h3>Create Your Account</h3>

    <input type="text" id="name" placeholder="Full Name">

    <input type="text" id="college" placeholder="College Name">

    <input type="text" id="course" placeholder="Course">

    <input type="email" id="email" placeholder="Email">

    <input type="password" id="password" placeholder="Password">

    <h3>Select Your Skills</h3>

    <label><input type="checkbox" name="skills" value="Java"> Java</label><br>
    <label><input type="checkbox" name="skills" value="Python"> Python</label><br>
    <label><input type="checkbox" name="skills" value="HTML & CSS"> HTML & CSS</label><br>
    <label><input type="checkbox" name="skills" value="SQL"> SQL</label><br>
    <label><input type="checkbox" name="skills" value="C Programming"> C Programming</label>

    <br><br>

    <h3>Area of Interest</h3>

    <select id="interest">
        <option>Artificial Intelligence</option>
        <option>Data Science</option>
        <option>Web Development</option>
        <option>Cyber Security</option>
        <option>Cloud Computing</option>
    </select>

    <br><br>

    <button onclick="register()">Register</button>

    <p>Already have an account?</p>

    <a href="index.html">Login Here</a>

</div>

<script>
function register()
{
    let skills = [];
    let checkboxes = document.getElementsByName("skills");

    for(let i=0;i<checkboxes.length;i++)
    {
        if(checkboxes[i].checked)
        {
            skills.push(checkboxes[i].value);
        }
    }

    localStorage.setItem("name", document.getElementById("name").value);
    localStorage.setItem("college", document.getElementById("college").value);
    localStorage.setItem("course", document.getElementById("course").value);
    localStorage.setItem("email", document.getElementById("email").value);
    localStorage.setItem("password", document.getElementById("password").value);
    localStorage.setItem("skills", skills.join(", "));
    localStorage.setItem("interest", document.getElementById("interest").value);

    alert("Registration Successful!");

    window.location.href="index.html";
}
</script>

</body>
</html>
