<html>
<head><title>REGISTER</title>
  <style>
        .registering{
           width: 320px;
           padding: 10px;
           border: 5px solid gray;
           margin: 0;
           background-color:B2BEB5;
           }
           #option{
             color:FF0000;
             font-size:14px;
             }
           body
           {
              background-color:"aqua";

             }
          <link rel="stylesheet" href="./bootstrap-3.3.7-dist/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    </style>
</head>
<body style="background-color:aqua";>
<h2 style="color:red;margin-left:70px;margin-top:60px;"> Create an Account</h2>
<form action="register" method="get">
<div class="registering">
<div class="row">
<center>
<table style="height:70%;width:80%">
<tr><td><label for="uname" id="option"><b> USERNAME </b></label></td><td><input type="text" name="uname" ></td></tr>
<tr><td><label for="fname" id="option"><b> FIRST NAME </b></label></td><td><input type="text" name="Fname" ></td></tr>
<tr><td><label for="lname" id="option"><b> LAST NAME </b></label></td><td><input type="text" name="lname"></td></tr>
<tr><td><label for="mobilenum" id="option"><b> MOBILE NUMBER </b></label></td><td><input type="text" name="mobilenum" ></td></tr>
<tr><td><label for="email" id="option"><b> EMAIL </b></label></td><td><input type="email" name="email" ></td></tr>
<tr><td><label for="pw" id="option"> <b>PASSWORD </b></label></td><td><input type="password" name="pw" ></td></tr>
<tr><td><label for="sign" id="option" style="color:FF000;font-size:14px"><b> REGISTER </b></label> </td><td> <input type="submit" name="reg" value="register"></td></tr>
</table>
</center>
</div>
</div>
</form>
</body>
</html>