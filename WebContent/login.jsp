<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
</head>
<body>
<h1><font color="red">用户登录</font></h1>
<s:form action="userService">
  <s:textfield name="user.username" label="用户名"></s:textfield>
  <s:password name="user.password" label="密码"></s:password>
  <s:submit value="登录" method="login"/>
  <br/>
  <s:a href="adminLogin.jsp">管理员登录</s:a>
 <s:a href="register.jsp">用户注册</s:a>
</s:form>

</body>
</html>