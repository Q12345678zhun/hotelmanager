package com.integration.interceptor;

import java.util.Map;

import com.bean.Admin;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class AdminInterceptor extends AbstractInterceptor {
	@SuppressWarnings("unchecked")
	@Override
	// ����Ա��¼������
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		Map session = context.getSession();
		Admin admin = (Admin) session.get("admin");
		if (admin != null) {
			return invocation.invoke();
		}
		context.put("message", "����û�е�¼�����¼ϵͳ��");
		return Action.LOGIN;
	}
}