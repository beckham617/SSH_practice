<%@ page language="java" import="java.util.*,player.model.Player" contentType="text/html; charset=GB2312"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Player</title>
</head>
<%				
		List list=(List)session.getAttribute("session");		
%>
<body bgcolor=yellow>
	<h2><font color=blue>Update Player</font></h2>
	<form  action="Update.action" method="post">
		<table border="1" align="center">
			<%
				if(list!=null){
				for(int i=0;i<list.size();i++){
			%>
			<font color=blue>Update <%=((Player)list.get(i)).getName()%> 's info</font>
			<tr>
				<td>Id</td>
				<td>Name(can't be change)</td>
				<td>Level</td>
				<td>Race</td>
				<td>Profession</td>
				<td>Operation</td>
			</tr>
				
				<tr>
					<td><input type="text" name="id" value="<%=((Player)list.get(i)).getId()%>"></td>
					<td><input type="text" name="name" value="<%=((Player)list.get(i)).getName()%>" readonly="readonly"></td>
					<td><input type="text" name="level" value="<%=((Player)list.get(i)).getLevel()%>"></td>
					<td><input type="text" name="race" value="<%=((Player)list.get(i)).getRace()%>"></td>
					<td><input type="text" name="profession" value="<%=((Player)list.get(i)).getProfession()%>"></td>
					<td><input type="submit" name="submit" value="Update"></td>
					<%}}%>
				</tr>
		</table>
	</form>
		<h2 align="center"><a  href="List.jsp"><font color=blue>Return</font></a></h2>
</body>
</html>