<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�û���Ԥ�������б�</title>
		<script type="text/javascript">
function del() {
	if (confirm("��ȷ��Ҫ�˶��÷�����?")) {
		return true;
	}
	return false;
}
</script>
	</head>
	<body>
		<%@include file="/info/adminInfo.jsp"%>
		<h1>
			<font color="red"><center>
					��Ԥ���ķ����б�
				</center> </font>
		</h1>
		<table border="1" width="80%" align="center">
			<tr>
			   
				<td>
					�������
				</td>
				<td>
					��������
				</td>
				<td>
					����۸�
				</td>
				<td>
					�����ͺ�
				</td>

				<!-- <td>
					����״̬
				</td> -->
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
					<!-- <td>
						<s:if test="#room.status == 0">�շ�</s:if>
						<s:else>�п���</s:else>
					</td> -->
				</tr>
			</s:iterator>
		</table>
	</body>
</html>