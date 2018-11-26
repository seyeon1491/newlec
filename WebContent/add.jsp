<!--  지시 블럭-->
<%@
	page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>

<%!
private int add(int x, int y) {
	return x+y;
}

%>


<% 
	//에러  :  이대로 실행하여 jsp.java파일을 보면 our.write가 실행되는거 볼수있다
	//response.setCharacterEncoding("UTF-8");
	//response.setContentType("text/html; charset=UTF-8");
	
	int x = 3;
	int y = 4;


	//int sum = x+y;
	int sum = add(x,y);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">

		<div>
			<label>x:</label>
			<input type="text" name="x" /> 
		</div>
		
		<div>
			<label>y:</label>
			<input type="text" name="y" />
		</div>
		
		<div>
			<input type="submit" name="cmd" value="덧셈" />
			<input type="submit" name="cmd" value="application" />
			<input type="submit" name="cmd" value="session" />
			<input type="submit" name="cmd" value="cookie" />
		
		</div>
		
		<div>
			<label>sum : ${sum } - ${param.s }</label>
			<input type="hidden" name="sum" value="${sum}" />
		</div>

	</form>
	<a href="mypage.jsp">마이페이지</a>
</body>
</html>