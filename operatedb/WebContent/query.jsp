<%@ page language="java" import="java.util.* ,conn.db.*" contentType="text/html; charset=GB2312"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
		List list=(List)session.getAttribute("love");
%>
<body>
	<h2 align="center">�û���Ϣ��ѯ</h2>
	<form action="query.action" method="post">
		<table border="1" align="center">
			<tr>
				<td>�û���:</td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td align="center"><input type="submit" name="submit" value="��ѯ">
								   <input type="reset" name="reset" value="����">
				</td>
			</tr>
		</table>
	<h2 align="center"><a  href="index.jsp">����</a></h2><br>

	<h2 align="center">��ѯ���</h2>

	<table border="1" align="center">
		<tr>
			<td>�û���</td>
			<td>����</td>
			<td>ID</td>
		</tr>
		<tr>
			<%
			if(list!=null){
			for(int i=1;i<list.size();i++){
			%>
				<td><%=((info)list.get(i)).getUsername() %></td>
				<td><%=((info)list.get(i)).getPassword() %></td>
				<td><%=((info)list.get(i)).getId() %></td>
			<% }} %>
		</tr>
		
	</table>
	</form>	

	
</body>
</html>