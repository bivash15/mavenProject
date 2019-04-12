<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form modelAttribute="userCmd">
User Name:<form:input path="user" />
	<br>
Password:<form:input path="pwd" />
	<br>
	<input type="submit" value="Login"/>
</form:form>
<br>
<br>
<c:if test="${msg ne null}">
	<b style="color:red"><c:out value="${msg}" /></b>
</c:if>

