<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="cag" class="mycrud.signup"></jsp:useBean>
<jsp:setProperty property="*" name="cag"/>
<jsp:useBean id="cagdao" class="mycrud.signupDAO"></jsp:useBean>

    <%
   
    
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    
        boolean isValid = cagdao.checkLogin(email, password);
        if (isValid) {
            request.getRequestDispatcher("loginerror.jsp").include(request, response);
        }  else {
            request.getRequestDispatcher("adminindex.jsp").include(request, response);
        }
    
   
    %>  
</body>
</html>