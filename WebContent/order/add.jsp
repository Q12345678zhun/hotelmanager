<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>增加入住信息</title>
		<script type="text/javascript">
function sav() {
	if (confirm("你确定要入住该房间吗?")) {
		return true;
	}
	return false;
}
</script>
	</head>
	<body>
 	<%@include file="/info/userInfo.jsp"%>
		<h1>
			<font color="red"><center> 
					新增入住信息 
				</center> </font>
		</h1>
		<table border="1" width="80%" align="center">
			<tr>
				<td colspan="5">
					<h2>
						<font color="red"><center> 
								<br>房间列表 
							</center> </font>
					</h2>
				</td>
			</tr>
			<tr>
				<td> 
					房间号 
				</td>
				<td>
					房间名称
				</td>
				<td>
					房间价格
				</td>
				<td> 
					房间类型 
				</td>
				<td>
					操作
				</td>
			</tr>
			<s:iterator value="#request.list" id="room">
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
						空闲
						<s:else>已入住</s:else>
					</td>
					<td>
						<s:a href="saveOrder!add?order.roomid=%{#room.roomid}&room.roomid=%{#room.roomid}"
							onclick="return sav();">入住</s:a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>