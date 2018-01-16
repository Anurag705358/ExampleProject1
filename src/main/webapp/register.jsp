<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="/struts-tags" prefix="s"%>

	<s:form action="registerprocess">
		<s:textfield name="name" label="UserName"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:radio list="{'male','female'}" name="gender"></s:radio>


		<s:submit value="register"></s:submit>

	</s:form>

</body>
</html>