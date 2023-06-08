<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>member page</h1>
	<form action="logout.do" method="get"> 
		<table>
			<tr>
			<td>
			hello. ${loginUser.name}(${loginUser.userid})
			</td>
			</tr>
			
			<tr>
			<td colspan="2" align="center">
			<input type="submit" value="logout">
			<input type="button" value="member information change" onclick ="location.href='memberUpdate.do?userid=${loginUser.userid}'">
			</td>
			</tr>
		</table>
	
	</form>
</body>
</html>