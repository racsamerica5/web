<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="index.jsp" method="get">

		<p>Número 01:</p>
		<input type="text" name="numero1"></input>
		<p>Número 02:</p>
		<input type="text" name="numero2"></input> <br>
		<input type="submit" name="enviar" value="Sumar"></input>
	</form>
</body>
</html>
<%

if(request.getParameter("enviar")!=null){
	int num1=Integer.parseInt(request.getParameter("numero1"));
	int num2=Integer.parseInt(request.getParameter("numero2"));
	int suma=num1+num2;
	out.print("La suma es:"+suma);
}

%>