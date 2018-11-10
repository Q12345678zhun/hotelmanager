<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>房间管理</title>
</head>
<body>
<%@ include file="/info/adminInfo.jsp"%>
<h1><font color="red">房间管理</font></h1>
<s:a href="/hotelManage/room/add.jsp">增加房间</s:a>
<table border="1" width="80%" align="center">
   <tr>
        <th>房间序号</th>
        <th>房间名称</th>
        <th>房间价格</th>
        <th>房间类型</th>
        <th>房间状态</th>
        <th>删除</th>
        <th>更新</th>
   </tr>
   <s:iterator value="#request.list" id="us">
   <tr>
          <td><s:property value="#us.roomid"></s:property></td>
          <td><s:property value="#us.name"></s:property></td>
          <td><s:property value="#us.price"></s:property></td>
          <td><s:property value="#us.category"></s:property></td>
          <td><s:if test="#us.status==0">空闲</s:if>
          <s:else>已入住</s:else></td>
          <td><s:a href="deleteRoom.action?room.roomid=%{#us.roomid}" onclick="return del()">删除</s:a></td>
          <td><s:a href="updateRoom.action?room.roomid=%{#us.roomid}">更新</s:a></td>
   </tr>     
   </s:iterator>
   
</table>

</body>
</html>