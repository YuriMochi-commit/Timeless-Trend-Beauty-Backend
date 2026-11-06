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
   
        if (cag != null) {
            try {
                int flag = cagdao.savesignup(cag);
                if (flag > 0) {
                    out.println("User name saved successfully");
                    request.getRequestDispatcher("indexafter.jsp").include(request, response);
                    
                } else {
                    out.println("Error saving user name");
                }
            } catch (Exception e) {
                out.println("An error occurred: " + e.getMessage());
            }
        }
   
    %>   
</body>
</html>s