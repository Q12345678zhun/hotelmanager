<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
</head>
<body>
<%@ include file="/info/adminInfo.jsp" %>
<h1><font color="red">用户列表</font></h1>
<table border="1" align="center">
     <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>删除</th>
        <th>更新</th>
     </tr>
     <s:iterator value="#request.list" id="us">
         <tr>
              <td><s:property value="#us.userid"></s:property></td>
              <td><s:property value="#us.username"></s:property></td>
              <td><s:property value="#us.mobile"></s:property></td>
              <td><s:property value="#us.email"></s:property></td>
              <td><s:a href="deleteUser.action?user.userid=%{#us.userid}">删除</s:a></td>
              <td><s:a href="updateUser。action?user.userid=%{#us.userid}">更新</s:a></td>      
         </tr>
      
     </s:iterator>
</table>

</body>
</html>