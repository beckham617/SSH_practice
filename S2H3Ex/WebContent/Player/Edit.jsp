<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="GB2312" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Player</title>
</head>
<body bgcolor=yellow>    
	 <form  action="Store.action" method="post">
		<table border="1" align="center">
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Level:</td>
				<td><input type="text" name="level"></td>
			</tr>
			<tr>
				<td>Race:</td>
				<td><input type="text" name="race"></td>
			</tr>
			<tr>
				<td>Profession:</td>
				<td><input type="text" name="profession"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" name="submit" value="Submit">
								   <input type="reset" name="reset" value="Reset">
				</td>
			</tr>			
		</table>
	</form>

    <h2 align="center"><a  href="index.jsp"><font color=blue>Return</font></a></h2>
</body>
</html>