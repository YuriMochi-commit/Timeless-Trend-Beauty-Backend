<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,mycrud.menfashion"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="cag" class="mycrud.menfashion"></jsp:useBean>
<jsp:setProperty property="*" name="cag"/>
<jsp:useBean id="cagdao" class="mycrud.fashionDAO"></jsp:useBean>

      <%
      String f1name= request.getParameter("f1name");
      String f1img= request.getParameter("f1img");
      String f2name= request.getParameter("f2name");
      String f2img= request.getParameter("f2img");
      String f3name= request.getParameter("f3name");
      String f3img= request.getParameter("f3img");
      String f4name= request.getParameter("f4name");
      String f4img= request.getParameter("f4img");
      String f5name= request.getParameter("f5name");
      String f5img= request.getParameter("f5img");
      String f6name= request.getParameter("f6name");
      String f6img= request.getParameter("f6img");
      int fid=Integer.parseInt("fid");
      
      menfashion m=new menfashion();
      m.setFid(fid);
      m.setF1name(f1name);
      m.setF1img(f1img);
      m.setF2name(f2name);
      m.setF2img(f2img);
      m.setF3name(f2name);
      m.setF3img(f2img);
      m.setF4name(f2name);
      m.setF4img(f2img);
      m.setF5name(f2name);
      m.setF5img(f2img);
      m.setF6name(f2name);
      m.setF6img(f2img);
      
      int flag=cagdao.updatemenfashions(cag);
       if(flag>0)
         out.println("Update Successful");
      
      %>

</body>
</html>