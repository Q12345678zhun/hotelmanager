<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改房间信息</title>
</head>
<body>
<%@ include file="/info/adminInfo.jsp" %>
<h1><font color="red"><center>修改房间信息</center></font></h1>
<s:form action="updateRoom">
<table>
    <tr>
       <td><s:hidden name="room.roomid" value="%{room.roomid}" label=""></s:hidden></td>
    </tr>
    <tr>
        <td><s:textfield name="room.name" value="%{room.name}"label="房间名称"></s:textfield></td>    
    </tr>
    <tr>
        <td><s:textfield name="room.price" value="%{room.price}" label="房间价格"></s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield name="room.category" value="%{room.category}"label="房间类型"></s:textfield></td>
    </tr>
    <tr>
        <td><tr><td class="tdLabel">房间状态</td>
        <s:if test="room.status==0">
            <td><select name="room.status">
                 <option value="0" selected="selected">空闲</option>
                 <option value="1">已入住</option>
            </select>
        </s:if>
        <s:else>
             <td><select name="room.status">
                 <option value="0" >空闲</option>
                 <option value="1"selected="selected">已入住</option>
             </select>
        </s:else></tr></td>
     </tr>
     <tr><td><s:submit value="修改"></s:submit></
     </tr>
</table>
</s:form>
</body>
</html>