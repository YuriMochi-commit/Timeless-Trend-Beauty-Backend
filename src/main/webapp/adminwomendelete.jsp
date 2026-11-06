<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="cag" class="mycrud.womenfashion" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="cag"/>
<jsp:useBean id="cagdao" class="mycrud.signupDAO"></jsp:useBean>

<%
String id=request.getParameter("id");
if(id!= null){
  int editid=Integer.parseInt(id);

    int flag=cagdao.womenfashionDelete(editid);
    if(flag>0){
  	  response.sendRedirect("adminwomenfashion.jsp");
    }
}
%>
</body>
</html>