<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�û��б�</title>
		<script type="text/javascript">
function del() {
	if (confirm("��ȷ��Ҫɾ�����û���?")) {
		return true;
	}
	return false;
}
</script>
	</head>
	<body>
		<%@include file="/info/adminInfo.jsp"%>
		<h1>
			<font color="red">
				<center> 
					����ס�ͻ���Ϣ�б� 
				</center> </font>
		</h1>
		<s:a href="/hotelManage/user/add.jsp">�����¿ͻ�</s:a>
		
		<table border="1" width="80%" align="center">
			<tr>
				<td> 
					�ͻ����<br></td>
				<td> 
					�ͻ����� 
				</td>
				<td> 
					��ϵ�绰 
				</td>
				<td> 
					�������� 
				</td>
				<td>
					ɾ��
				</td>
				<td> 
					�޸�<br></td>
			</tr>
			<s:iterator value="#request.list" id="us">
				<tr>
					<td>
						<s:property value="#us.userid" />
					</td>
					<td>
						<s:property value="#us.username" />
					</td>
					<td>
						<s:property value="#us.mobile" />
					</td>
					<td>
						<s:property value="#us.email" />
					</td>
					<td>
						<s:a href="deleteUser.action?user.userid=%{#us.userid}"
							onclick="return del();">delete</s:a>
					</td>
					<td>
						<s:a href="updatePUser.action?user.userid=%{#us.userid}">update</s:a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>