<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:form="http://www.springframework.org/tags/form" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" omit-xml-declaration="true"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>App Spring MyBatis</title>
</head>
<body>
	<form:form id="fRegistrarUsuario" method="post" modelAttribute="usuario" action="${pageContext.request.contextPath}/modificar-usuario.action">
		<div>
			<form:input type="text" path="codigo" placeholder="Código" required="requiered" disabled="true"/>
			<br/>
			<form:input type="text" path="nombre" placeholder="Nombre" required="requiered"/>
			<br/>
			<form:input type="text" path="apellidos" placeholder="Apellidos" required="requiered"/>
			<br/>
			<form:input type="password" path="clave" placeholder="Clave" required="required"/>
			<br/>
			<button>Modificar</button>
		</div>
	</form:form>
</body>
</html>
</jsp:root>
