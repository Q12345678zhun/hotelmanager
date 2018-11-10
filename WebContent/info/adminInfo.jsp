<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员管理首页</title>
</head>
<body>
<h1><font color="red">管理员菜单</font></h1>



   <s:a href="../hotelManage/authorityAdmin/listUser.action">客户管理</s:a>
    &nbsp;
   <s:a href="../hotelManage/authorityAdmin/listRoom.action">房间管理</s:a> 
   &nbsp; 
   <s:a href="../hotelManage/authorityAdmin/listOrder.action">订单管理</s:a> 
   &nbsp;
   <s:a href="../hotelManage/authorityAdmin/userAndRoom.action">订单</s:a> 
   &nbsp;
    <s:a href="../hotelManage/authorityAdmin/adminService!loginOut">退出</s:a> 
   &nbsp;
   

</body>
</html>