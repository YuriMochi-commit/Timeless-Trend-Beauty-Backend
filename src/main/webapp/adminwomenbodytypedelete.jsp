<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="cag" class="mycrud.womenbodytype" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="cag"/>
<jsp:useBean id="cagdao" class="mycrud.signupDAO"></jsp:useBean>

<%
String id=request.getParameter("bodytypeid");
if(id != null){
  int editid=Integer.parseInt(id);

  int flag=cagdao.womenbodyDelete(editid);
  if(flag>0){
	  response.sendRedirect("adminwomenbodyshapeinsert.jsp");
  }
} else {
  // Handle the case where id is null
  out.println("Error: No id parameter provided");
}
%>
</body>
</html>