<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Book List</title>
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
<body bgcolor=yellow>    
    <h2><font color=blue>Book List</font></h2>
    <s:form action="Remove" theme="simple">
        <table cellspacing="0">
            <thead>
                <tr>
                    <th><font color=blue>Select</font></th>
                    <th><font color=blue>ISBN</font></th>
                    <th><font color=blue>Title</font></th>
                    <th><font color=blue>Price</font></th>
                    <th><font color=blue>Operation</font></th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="books">
                    <tr>
                        <td><input type="checkbox" name="isbns" value='<s:property value="isbn" />' /></td>
                        <td><s:property value="isbn" /></td>
                        <td><s:property value="title" /></td>
                        <td>$<s:property value="price" /></td>
                        <td>
                            <a href='<s:url action="Edit"><s:param name="isbn" value="isbn" /></s:url>'>
                                <font color=blue>Edit</font>
                            </a>
                            &nbsp;
                            <a href='<s:url action="Remove"><s:param name="isbn" value="isbn" /></s:url>'>
                                <font color=blue>Delete</font>
                            </a>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <s:submit value="Remove" /><a href="Edit.jsp">Add Book</a>
    </s:form>
    <h2 align="center"><a  href="index.jsp"><font color=blue>Return</font></a></h2>    
</body>
</html>