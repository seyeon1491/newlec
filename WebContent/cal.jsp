<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="cal" method="post">
		
		<div>
	
				<input type="text" style="height:50px; width:213px;" value="${num}"/>
	
				<input type="text" style="height:50px; width:213px;" name="s" value="${num}"/>
		</div>
	
		<div>
			<c:forEach var="a" begin="7" end="9">
				<input type="submit" style="height:50px; width:50px;" name="cmd" value="${a}"/>
			</c:forEach>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="*"/>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="Del"/>
		</div>
		
		<div>
			<c:forEach var="a" begin="4" end="6">
				<input type="submit" style="height:50px; width:50px;" name="cmd" value="${a}"/>
			</c:forEach>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="-"/>
		</div>
		
		<div>
			<c:forEach var="a" begin="1" end="3">
				<input type="submit" style="height:50px; width:50px;" name="cmd" value="${a}"/>
			</c:forEach>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="+"/>
		</div>
		
		<div>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="C"/>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="0"/>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="/"/>
			<input type="submit" style="height:50px; width:50px;" name="cmd" value="="/>
		</div>
	
	</form>
	
</body>
</html>