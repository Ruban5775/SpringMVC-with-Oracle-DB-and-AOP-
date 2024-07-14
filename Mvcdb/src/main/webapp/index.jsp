<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Register From</title>

<style>
body{
    background-color: gray;
}

form fieldset{
    width: fit-content;
    display: inline;
    margin: 180px;
    margin-left: 500px;
 
}

.field label{
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    font-size: large;
    font-weight: 800;
    padding-left: 25px;
}

.field input{
    font-size: 18px;
    margin-left: 15px;
    font-family:  'Times New Roman', Times, serif;
    font-weight: 800;
}

.field input:hover{
    border-color: blue;
}


.field h2{

    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    font-weight: 800;
    text-shadow: 1px 2px red;
    text-transform: uppercase;
    
}

.field .ageinput{
	margin-left: 25px;
}

.field .passinput{
	margin-left: 5px;
}


</style>
</head>
<body>

    <form action="Register" autocomplete="off"> 
        <fieldset class="field">
            <h2>Spring MVC Registration Form</h2><br><br>
            
        <label for="">Name:</label>
        <input type="text" name="tname"> <br><br>

        <label for="Email">Email:</label>
        <input type="text" name="temail"><br><br>


		<label for="pass"> Password:</label>
        <input class="passinput" type="text" name="tpass"><br><br>
		

        
        <input type = "submit" value="send">



    </fieldset>

    </form>
</body>
</html>