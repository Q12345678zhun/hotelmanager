<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>������ס��Ϣ</title>
		<script type="text/javascript">
function sav() {
	if (confirm("��ȷ��Ҫ��ס�÷�����?")) {
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
					������ס��Ϣ 
				</center> </font>
		</h1>
		<table border="1" width="80%" align="center">
			<tr>
				<td colspan="5">
					<h2>
						<font color="red"><center> 
								<br>�����б� 
							</center> </font>
					</h2>
				</td>
			</tr>
			<tr>
				<td> 
					����� 
				</td>
				<td>
					��������
				</td>
				<td>
					����۸�
				</td>
				<td> 
					�������� 
				</td>
				<td>
					����
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
						����
						<s:else>����ס</s:else>
					</td>
					<td>
						<s:a href="saveOrder!add?order.roomid=%{#room.roomid}&room.roomid=%{#room.roomid}"
							onclick="return sav();">��ס</s:a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>