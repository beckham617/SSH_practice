<%@ page language="java" contentType="text/html; charset=GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2 align="center">�û���Ϣ����</h2>
	<form  action="insert.action" method="post">
		<table border="1" align="center">

			<tr>
				<td>�û���:</td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td>����:</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td align="center"><input type="submit" name="submit" value="�ύ">
								   <input type="reset" name="reset" value="����">
				</td>
			</tr>	
			
		</table>
		<h2 align="center"><a  href="index.jsp">����</a></h2>
	</form>
</body>
</html>