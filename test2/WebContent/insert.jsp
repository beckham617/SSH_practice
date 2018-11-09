<%@ page language="java" contentType="text/html; charset=GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2 align="center">用户信息插入</h2>
	<form  action="insert.action" method="post">
		<table border="1" align="center">

			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td>密码:</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td align="center"><input type="submit" name="submit" value="提交">
								   <input type="reset" name="reset" value="重置">
				</td>
			</tr>	
			
		</table>
		<h2 align="center"><a  href="index.jsp">返回</a></h2>
	</form>
</body>
</html>