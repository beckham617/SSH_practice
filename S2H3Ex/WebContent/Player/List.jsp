<%@ page language="java" import="java.util.*,player.model.Player" contentType="text/html; charset=GB2312" pageEncoding="GB2312" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Player List</title>
    <style type="text/css">
        table {
            border: 1px solid black;
            border-collapse: collapse;
        }
        
        table thead tr th {
            border: 1px solid black;
            padding: 3px;
            background-color: #cccccc;
        }
        
        table tbody tr td {
            border: 1px solid black;
            padding: 3px;
        }
    </style>
</head>
<%				
		List list=(List)session.getAttribute("session");		
%>
<body bgcolor=yellow>    
    <h2><font color=blue>Player List</font></h2>
	<form  action="List.action" method="post">
		<table border="1" align="center">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			
				<td align="center"><input type="submit" name="submit" value="Submit">
								   <input type="reset" name="reset" value="Reset">
				</td>
						
		</table>
		<h2 align="center"><font color=blue>Result</font></h2>
		<table border="1" align="center">
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Level</td>
				<td>Race</td>
				<td>Profession</td>
				<td>Operation</td>
			</tr>
				<%
				if(list!=null){
				for(int i=0;i<list.size();i++){
				%>
			<tr>
				<td><%=((Player)list.get(i)).getId()%></td>
				<td><%=((Player)list.get(i)).getName()%></td>
				<td><%=((Player)list.get(i)).getLevel()%></td>
				<td><%=((Player)list.get(i)).getRace()%></td>
				<td><%=((Player)list.get(i)).getProfession()%></td>
				<td><a href="Update.jsp?updateno=<%=i%>">Update</a>&nbsp
					<a href="Remove.action?removeno=<%=i%>">Remove</a></td>
			<%}}%>
			</tr>
		</table>
	</form>
    <h2 align="center"><a  href="index.jsp"><font color=blue>Return</font></a></h2>    
</body>
</html>
