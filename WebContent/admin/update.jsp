<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改用户</title>
</head>
<body>
<%@ include file="/info/adminInfo.jsp" %>
<h1><font color="red">修改用户</font></h1>
<s:form action="">
                <tr>
					<td>
						<s:hidden name="user.userid" value="%{user.userid}"></s:hidden>

					</td>
				</tr>
				<tr>
				     <td>
                         <s:textfield name="user.username" value="%{user.username}" label="用户名"></s:textfield>
                     </td>
                </tr>
                <tr>
				     <td>
                         <s:textfield name="user.password" value="%{user.password}" label="密码"></s:textfield>
                     </td>
                </tr>
                <tr>
				     <td>
                         <s:textfield name="user.mobile" value="%{user.mobile}"label="手机号码"></s:textfield>
                     </td>
                </tr>
                <tr>
				     <td>
                         <s:textfield name="user.email" value="%{user.email}"label="邮箱"></s:textfield>
                     </td>
                </tr>
                 <tr>
				     <td>
                         <s:submit value="修改"></s:submit>
                     </td>
                </tr>
                

</s:form>


</body>
</html>