<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<h2>login</h2>
	<form name="frm" method="post" action="login.do">
		<table>

			<tr>
			<td>ID</td>
			<td><input type="text" name="userid" value="${userid}">
			</tr>
			
			<tr>
			<td>PASSWORD</td>
			<td><input type="password" name="pwd" value="${pwd}">
			</tr>
			
			<tr>
			<td colspan="2" align="center">
				<input type="submit" value="login" onclick="return loginCheck()">
				<input type="reset" value="cancel">
				<input type="button" value="join the membership"
					onclick="location.href='join.do'">
			</td>
			</tr>
			
			<tr>
				<td colspan="2">${message}></td>
			</tr>
					
		</table>

	</form>
</body>
</html>