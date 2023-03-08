<html>
<head><title>Assignment</title>
<style>
.creation{
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
body{
            background-color:"aqua";
            }
            </style>
</head>
<body>
<center>
<div class="creation">
      <form action="assignuser" method="get">
      <div>
      <label for="title" id="option"> Assignment Title </label><input type="text" name="title" >
      </div><br><br>
      <div>
      <label for="description" id="option"> Description </label><input type="text" name="description">
      </div><br><br>
      <div>
      <label for="points" id="option"> Maximum points </label><input type="text" name="points" >
      </div><br><br>
      <div>
      <label for="duedate" id="option"> Due Date </label><input type="datetime" name="duedate" >
      </div><br><br>
      <div>
      <label for="Assign" id="option"> Assign  </label><input type="submit" name="Assign" value="Assign">
      </div>
      </form>
      </div>
  </center>
</body>
</html>