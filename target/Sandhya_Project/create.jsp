<html>
    <head><title> Create class</title>
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
      <section>
      <center>
      <h1> Create your class </h1>
      <form action="createclass" method="get">
      <div class="creation">
      <div>
      <label for="uclassname" id="option"> Class Name </label><input type="text" name="uclassname" >
      </div><br><br>
      <div>
      <label for="usection" id="option"> Section </label><input type="text" name="usection">
      </div><br><br>
      <div>
            <label for="classcode" id="option"> Class Code </label><input type="text" name="uclasscode" >
            </div><br><br>
      <div>
            <label for="subject" id="option"> Subject </label><input type="text" name="usubject" >
            </div><br><br>
      <div>
      <label for="create" id="option"> CREATE  </label><input type="submit" name="create" value="create">
      </div>
      </div>
      </div>
      </form
      <h2> Create your Assignments </h2>
       <div>
       <form action="assignment.jsp" method="get">
       <label for="Assign" id="option"> ASSIGN  </label><input type="submit" name="Assign" value="Assign">
       </form>
       </div>
       </center>
      </section>
      </body>
</html>
