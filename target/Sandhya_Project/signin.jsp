<html>
<head><title>SIGN IN</title>
<style>
        .log{
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
             </style>
</head>
<body>
<form action="loginuser" method="get">
<div class="log">

<table style="height:70%;width:80%">
<tr><td><label for="uname" id="option"> USERNAME </label></td><td><input type="text" name="uname" ></td></tr>
<tr><td><label for="upw" id="option"> PASSWORD </label></td><td><input type="password" name="upw" ></td></tr>
<tr><td><label for="sign" id="option"> SIGN IN </label></td><td><input type="submit" name="sign" value="sign in"></td></tr>

</div>
</form>
</body>
</html>