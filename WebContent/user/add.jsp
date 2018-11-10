<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加用户</title>
</head>
<body>
<%@ include file="/info/adminInfo.jsp" %>
<h1><font color="red">添加用户</font></h1>
<s:form action="saveUser">
<s:textfield name="user.username" label="用户名"></s:textfield>
<s:password name="user.password" label="密码"></s:password>
<s:textfield name="user.mobile" label="电话"></s:textfield>
<s:textfield name="user.email" label="邮箱"></s:textfield>
<s:submit value="添加用户"></s:submit>
    

</s:form>

</body>
</html>