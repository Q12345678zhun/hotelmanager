<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>输出订单</title>
</head>
<body>
<h1><font color="red"><center>输出订单</center></font></h1>
<table width="80%" align="center" border="1">
    <tr>
        <th>订单号</th>
        <th>房间号</th>
        <th>用户号</th>
    </tr>
    <s:iterator value="#request.list" id="order">
         <tr>
              <td><s:property value="#order.orderid"></s:property></td>
              <td><s:property value="#order.roomid"></s:property></td>
              <td><s:property value="#order.userid"></s:property></td>
         </tr>
    </s:iterator>
</table>

</body>
</html>