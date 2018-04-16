<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<h4>Display screen ModelAndView	+${DATA_FROM_CONTROLLER}+</h4>

<h2>save user data<!-- <a href="saveUserData"> save userdata</a> --></h2>

<form action="saveUserData" method="post">
	<input type="text" name="userName" id="userName">
	<input type="submit" name="save">
	<!-- <button type="sub" id="submit">Submit</button> -->
</form>


</html>