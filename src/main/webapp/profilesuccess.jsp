<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<jsp:include page="index.jsp"></jsp:include>  
<hr/>  
<br/>Welcome to profile  
<s:property value="#session.email"/> 
<br><a href="UserImage.jsp">d</a>
<br>  
         
        Uploaded Image: <img src="userimages/<s:property value="userImageFileName"/>"   
                                                     width="100" height="100" />   
</body>
</html>