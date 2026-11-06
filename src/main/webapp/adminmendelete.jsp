<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="cag" class="mycrud.menfashion" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="cag"/>
<jsp:useBean id="cagdao" class="mycrud.signupDAO"></jsp:useBean>

<%
String id=request.getParameter("id");
if(id!= null){
  int editid=Integer.parseInt(id);

    int flag=cagdao.menfashionDelete(editid);
    if(flag>0){
    	  response.sendRedirect("adminmenfashion.jsp");
     }
}
%>
</body>
</html>