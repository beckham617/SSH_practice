<%@ page language="java" contentType="text/html; charset=GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SSH练习</title>
</head>
<body bgcolor=black>
	<h2 align="center"><font color=cyan>用户信息插入</font></h2>
	<form  action="insert.action" method="post">
		<table border="1" align="center">
			<tr>
				<td><font color=cyan>ID:</font></td>
				<td><input type="text" name="id"></td>
			</tr>		
			<tr>
				<td><font color=cyan>用户名:</font></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><font color=cyan>密码:</font></td>
				<td><input type="password" name="password"></td>
			</tr>	
			<tr>
				<td align="center"><input type="submit" name="submit" value="提交">
								   <input type="reset" name="reset" value="重置">
				</td>
			</tr>				
		</table>
		<h2 align="center"><a  href="index.jsp"><font color=cyan>返回</font></a></h2>
	</form>
</body>
</html>