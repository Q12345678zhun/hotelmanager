<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>预定信息</title>
</head>
<body>
<%@include file="/info/userInfo.jsp"%>
		<h1>
			<font color="red"><center>
					所预定的房间列表
				</center> </font>
		</h1>
		<table border="1" width="80%" align="center">
			<tr>
				<td>
					房间序号
				</td>
				<td>
					房间名称
				</td>
				<td>
					房间价格
				</td>
				<td>
					房间型号
				</td>
				<!-- <td>
					房间状态
				</td> -->
				<td>
					操作
				</td>
			</tr>
			<s:iterator value="#request.listUserRoom" id="room">
				<tr>
					<td>
						<s:property value="#room.roomid" />
					</td>
					<td>
						<s:property value="#room.name" />
					</td>
					<td>
						<s:property value="#room.price" />
					</td>
					<td>
						<s:property value="#room.category" />
					</td>
					<td>
						<s:if test="#room.status == 0">空房</s:if>
						<s:else>有客人</s:else>
					</td>
					<td>
						<s:a
							href="/hotelManage/serviceAction!delete?room.roomid=%{#room.roomid}"
							onclick="return del();">退订</s:a>
					</td>
				</tr>
			</s:iterator>
		</table>

</body>
</html>