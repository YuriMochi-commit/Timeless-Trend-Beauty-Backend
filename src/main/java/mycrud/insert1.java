package mycrud;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import java.sql.Connection;


/**
 * Servlet implementation class insert1
 */
@WebServlet("/insert1")
@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class insert1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Part imagePart1 = request.getPart("f1image");
		 Part imagePart2 = request.getPart("f2image");
		 Part imagePart3 = request.getPart("f3image");
		 Part imagePart4 = request.getPart("f4image");
		 Part imagePart5 = request.getPart("f5image");
		 Part imagePart6 = request.getPart("f6image");
		 
		 
	        InputStream imageInputStream1 = imagePart1.getInputStream();
	        InputStream imageInputStream2 = imagePart2.getInputStream();
	        InputStream imageInputStream3 = imagePart3.getInputStream();
	        InputStream imageInputStream4 = imagePart4.getInputStream();
	        InputStream imageInputStream5 = imagePart5.getInputStream();
	        InputStream imageInputStream6 = imagePart6.getInputStream();
	        
	        String name1 = request.getParameter("f1name");
	        String name2 = request.getParameter("f2name");
	        String name3 = request.getParameter("f3name");
	        String name4 = request.getParameter("f4name");
	        String name5 = request.getParameter("f5name");
	        String name6 = request.getParameter("f6name");
	        
	        String image1 = request.getParameter("f1image");
	        String image2 = request.getParameter("f2image");
	        String image3 = request.getParameter("f3image");
	        String image4 = request.getParameter("f4image");
	        String image5 = request.getParameter("f5image");
	        String image6 = request.getParameter("f6image");
	       
	       
	        
	        
	        // Connect to the database
	     Connection  conn = null;
	        PreparedStatement pstmt = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
	            pstmt = conn.prepareStatement("insert into womenfashion (f1name,f1img,f2name,f2img,f3name,f3img,f4name,f4img,f5name,f5img,f6name,f6img) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
	            pstmt.setString(1, name1);
	            pstmt.setString(2, imagePart1.getSubmittedFileName());
	            pstmt.setString(3, name2);
	            pstmt.setString(4, imagePart2.getSubmittedFileName());
	            pstmt.setString(5, name3);
	            pstmt.setString(6, imagePart3.getSubmittedFileName());
	            pstmt.setString(7, name4);
	            pstmt.setString(8, imagePart4.getSubmittedFileName());
	            pstmt.setString(9, name5);
	            pstmt.setString(10, imagePart5.getSubmittedFileName());
	            pstmt.setString(11, name6);
	            pstmt.setString(12, imagePart6.getSubmittedFileName());
	          
	          
	            pstmt.executeUpdate();
	      	  response.sendRedirect("adminwomenfashion.jsp");	           
	        } catch (Exception e) {
	            response.getWriter().println("Error uploading image: " + e.getMessage());
	        } finally {
	            if (pstmt != null)
	        try {
	          pstmt.close();
	        } catch (SQLException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	        }
	            

	            
	            if (conn != null)
	        try {
	          conn.close();
	        } catch (SQLException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	        }
	        }
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
