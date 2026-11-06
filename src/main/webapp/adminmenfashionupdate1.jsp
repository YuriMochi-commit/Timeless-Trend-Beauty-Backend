<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>

<%@ page import="java.util.*" %>
<%@ page import="mycrud.menfashion" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fashion</title>
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
  <link rel="stylesheet" href="assets/Admin Dashboard/Admin Dashboard/simple-admin-dashboard-master/css/bootstrap.css">
  <link rel="stylesheet" href="assets/Admin Dashboard/Admin Dashboard/simple-admin-dashboard-master/css/style.css">
  <link rel="stylesheet" href="assets/Admin Dashboard/Admin Dashboard/simple-admin-dashboard-master/css/dataTables.bootstrap5.min.css">
</head>

<body>
    <!-- navbar -->
    
    <!-- navbar end -->
<!-- sidebar -->
 <div class="offcanvas offcanvas-start bg-dark text-white sidebar-nav" tabindex="-1" id="offcanvasExample"
    aria-labelledby="offcanvasExampleLabel">
    <div class="offcanvas-header bg-dark shadow-sm d-block text-center">
      <div class="offcanvas-title " id="offcanvasExampleLabel">
        <a  style="font-size: 15px;" class="navbar-brand fw-bold" href="index.html">Timeless Trends Beauty</a>
      </div>
    </div>
    <div class="offcanvas-body pt-3 p-0">
      <nav class="navbar-dark">
        <ul class="navbar-nav sidenav">
          <li class="nav-link bordered px-3 active">
            <a href="adminindex.jsp" class="nav-link px-3 active">
              <span class="me-2"><i class="bi bi-speedometer2"></i></span>
              <span>Dashboard</span>
            </a>
          </li>
          

          <li class="nav-link bordered px-3">
            <a class="nav-link px-3 sidebar-link" data-bs-toggle="collapse" href="#collapseCategory" role="button"
              aria-expanded="false" aria-controls="collapseCategory">
              <span class="me-2">
                <i class="bi bi-intersect"></i>
              </span>
              <span>Men</span>
              <span class="right-icon ms-auto">
                <i class="bi bi-chevron-down"></i>
              </span>
              
            </a>
            <div class="collapse" id="collapseCategory">
            
              <div>
                <ul class="navbar-nav ps-3">
                  <li>
                    <a href="adminmenbodyshapeinsert.jsp" class="nav-link px-3">
                      <span class="me-2"><i class="bi bi-1-circle"></i></span>
                      <span>Men Body Type</span>
                    </a>
                  </li>
                  <li>
                    <a href="adminmenfashion.jsp" class="nav-link px-3">
                      <span class="me-2"><i class="bi bi-2-circle"></i></span>
                      <span>Men Fashion</span>
                    </a>
                  </li>
                </ul>
              </div>
            </div>
          </li>

          <li class="nav-link bordered px-3">
            <a class="nav-link px-3 sidebar-link" data-bs-toggle="collapse" href="#collapseCategory" role="button"
              aria-expanded="false" aria-controls="collapseCategory">
              <span class="me-2">
                <i class="bi bi-intersect"></i>
              </span>
              <span>Women</span>
              <span class="right-icon ms-auto">
                <i class="bi bi-chevron-down"></i>
              </span>
              
            </a>
            <div class="collapse" id="collapseCategory">
            
              <div>
                <ul class="navbar-nav ps-3">
                  <li>
                    <a href="adminwomenbodyshapeinsert.jsp" class="nav-link px-3">
                      <span class="me-2"><i class="bi bi-1-circle"></i></span>
                      <span>Women Body Type</span>
                    </a>
                  </li>
                  <li>
                    <a href="adminwomenfashion.jsp" class="nav-link px-3">
                      <span class="me-2"><i class="bi bi-2-circle"></i></span>
                      <span>Women Fashion</span>
                    </a>
                  </li>
                </ul>
              </div>
            </div>
          </li>
          <li class="nav-link bordered px-3">
            <a href="index.jsp" class="nav-link px-3">
              <span class="me-2"><i class="bi bi-intersect"></i></span>
              <span>Log Out</span>
            </a>
          </li>
          
          </li> 
        </ul>
      </nav>
    </div>
  </div>
<!-- sidebar end -->
    <!-- main content -->
    <main class="mt-3 p-2">
        <div class="container">
            <div class="page-title">
                <div style="font-weight: 500;" class="fs-3">Fashion</div>
            </div>
            <nav class="mt-2 mb-4" style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Fashion</li>
                </ol>
            </nav>
            <div class="row">
                <div class="col-md-5">
                    <div class="add-dept mt-5">
                        <div class="card border-0 shadow-sm">
                            <div class="card-body">
                                
                                <form action="adminmenfashionupdate.jsp" method="post" enctype="multipart/form-data">
                                 <jsp:useBean id="cagdao" class="mycrud.fashionDAO"></jsp:useBean>
							        <%
							        String a=request.getParameter("id");
							        
							        menfashion c=null;
							       if(a!=null){
							        int editID=Integer.parseInt(a);
							        c=cagdao.getmenfashion(editID);
							        }
							        %>
                                    <div class="row">
                                        <div class="col-md-12">
                                        	<div class="mb-3 px-2">
                                                <label for="pg_name" class="form-label"> Id</label>
                                                <input class="form-control" type="hidden" id="pg_name"
                                                    name="fid" value="<%=c.getFid() %>" >
                                            </div>
                                            <div class="mb-3 px-2">
                                                <label for="pg_name" class="form-label"> Fashion Name</label>
                                                <input class="form-control" type="text" id="pg_name"
                                                    name="f1name" value="<%=c.getF1name() %>" >
                                            </div>
                                            
                                            <div class="mb-3 px-2">
                                                <label for="pg_image" class="form-label">Fashion Image</label>
                                                <input class="form-control" type="file" id="pg_image" 
                                                name="f1img" value="<%=c.getF1img() %>">
                                            </div>

											<div class="mb-3 px-2">
                                                <label for="pg_name" class="form-label"> Fashion Name</label>
                                                <input class="form-control" type="text" id="pg_name"
                                                    name="f2name" value="<%=c.getF2name() %>">
                                            </div>
                                            
                                            <div class="mb-3 px-2">
                                                <label for="pg_image" class="form-label">Fashion Image</label>
                                                <input class="form-control" type="file" id="pg_image"
                                                 name="f2img" value="<%=c.getF2img() %>">
                                            </div>
                                            <div class="mb-3 px-2">
                                                <label for="pg_name" class="form-label"> Fashion Name</label>
                                                <input class="form-control" type="text" id="pg_name"
                                                    name="f3name" value="<%=c.getF3name() %>">
                                            </div>
                                            <div class="mb-3 px-2">
                                                <label for="pg_image" class="form-label">Fashion Image</label>
                                                <input class="form-control" type="file" id="pg_image" 
                                                name="f3img" value="<%=c.getF3img() %>">
                                            </div>
                                           <div class="mb-3 px-2">
                                                <label for="pg_name" class="form-label"> Fashion Name</label>
                                                <input class="form-control" type="text" id="pg_name"
                                                    name="f4name" value="<%=c.getF4name() %>">
                                            </div>
                                            <div class="mb-3 px-2">
                                                <label for="pg_image" class="form-label">Fashion Image</label>
                                                <input class="form-control" type="file" id="pg_image" 
                                                name="f4img" value="<%=c.getF5img() %>">
                                            </div>
                                            
                                            <div class="mb-3 px-2">
                                                <label for="pg_name" class="form-label"> Fashion Name</label>
                                                <input class="form-control" type="text" id="pg_name"
                                                    name="f5name" value="<%=c.getF5name() %>">
                                            </div>
                                            
                                            <div class="mb-3 px-2">
                                                <label for="pg_image" class="form-label">Fashion Image</label>
                                                <input class="form-control" type="file" id="pg_image" 
                                                name="f5img" value="<%=c.getF5img() %>">
                                            </div>
                                            
                                            <div class="mb-3 px-2">
                                                <label for="pg_name" class="form-label"> Fashion Name</label>
                                                <input class="form-control" type="text" id="pg_name"
                                                    name="f6name" value="<%=c.getF6name() %>">
                                            </div>
                                            
                                            <div class="mb-3 px-2">
                                                <label for="pg_image" class="form-label">Fashion Image</label>
                                                <input class="form-control" type="file" id="pg_image"
                                                name="f6img" value="<%=c.getF6img() %>">
                                            </div>
                                            
                                            
                                            <div class="col-12 mt-md-4">
                                                <div class="mb-3 px-2">
                                                    <button type="submit" class="btn btn-success"> Update </button>
                                                </div>
                                            </div>
											
                                            
                                            
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                

                
                                   
                 					
                                    
    </main>

    <!-- main content end-->

    <script src="js/jquery-3.5.1.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
 
    <script src="js/bootstrap.bundle.min.js"></script>

    
</body>

</html>