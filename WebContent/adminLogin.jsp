<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登录</title>
</head>
<body>

<h1><font color="color">管理员登录</font></h1>
<s:form action="adminService">
    <s:textfield name="admin.username" label="用户名"></s:textfield>
    <s:textfield name="admin.password" label="密码"></s:textfield>
    <s:submit value="登录" method="login"></s:submit>
    <br/>
    <s:a href="/hotelManage/login.jsp">用户登录</s:a>
</s:form>

</body>
</html>