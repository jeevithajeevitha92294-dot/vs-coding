body{
    margin:0;
    font-family:Arial, sans-serif;
    background:linear-gradient(135deg,#6a11cb,#2575fc);
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.login-box,
.dashboard-box{
    background:white;
    padding:40px;
    border-radius:20px;
    width:380px;
    text-align:center;
    box-shadow:0 10px 30px rgba(0,0,0,0.3);
}

h1{
    color:#2575fc;
    margin-bottom:10px;
}

h2,h3{
    color:#555;
}

input{
    width:90%;
    padding:12px;
    margin:10px 0;
    border:1px solid #ccc;
    border-radius:10px;
    font-size:16px;
}

button{
    width:95%;
    padding:12px;
    border:none;
    border-radius:10px;
    background:#2575fc;
    color:white;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
}

button:hover{
    background:#6a11cb;
}

a{
    color:#2575fc;
    text-decoration:none;
    font-weight:bold;
}

a:hover{
    text-decoration:underline;
}
