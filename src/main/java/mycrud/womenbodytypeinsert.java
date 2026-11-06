package mycrud;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
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

/**
 * Servlet implementation class womenbodytypeinsert
 */
@WebServlet("/womenbodytypeinsert")
@MultipartConfig
public class womenbodytypeinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public womenbodytypeinsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part imagePart1 = request.getPart("image");
		 
		 
	    InputStream imageInputStream1 = imagePart1.getInputStream();
	        
	        String bodytypename1 = request.getParameter("name");
	        String bodytypeimage1 = request.getParameter("image");
	       
	       
	        
	        
	        // Connect to the database
	     Connection  conn = null;
	        PreparedStatement pstmt = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
	            pstmt = conn.prepareStatement("insert into womenbodytype (bodytypename,bodytypeimage) VALUES (?,?)");
	            pstmt.setString(1, bodytypename1);
	            pstmt.setString(2, imagePart1.getSubmittedFileName());
	           
	            
	            pstmt.executeUpdate();
	      	  response.sendRedirect("adminwomenbodyshapeinsert.jsp");
	           
	        } catch (Exception e) {
	            response.getWriter().println("Error uploading image: " + e.getMessage());
	        } finally {
	            if (pstmt != null)
	        try {
	          pstmt.close();
	        } catch (SQLException e) {
	        }
	        }
	          //
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
