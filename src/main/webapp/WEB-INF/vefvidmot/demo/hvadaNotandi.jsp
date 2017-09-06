<!--Síða sem spyr notanda um nafn
	Ragnheiður Ásta Karlsdóttir rak4@hi.is-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="is">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<head>
		<meta charset="utf-8">	
    	<title>Hver er notandinn</title>
	</head>

	<body>
		<h1>Góðan daginn ${nafn}</h1>
		
		<form method="POST" action="/demo/hver">
			Hvað heitirðu? <input name="nafn" type="text" placeholder="Nafn"/>
			<button type="submit">Senda</button>
		</form>
	</body>
</html>

