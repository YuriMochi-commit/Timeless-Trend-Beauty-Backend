package mycrud;
import java.sql.*;
import java.util.ArrayList;

public class fashionDAO {
	
	      public Connection getConnection() throws ClassNotFoundException, SQLException {
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
	      return con;
	      }
	      
	      
	      public ArrayList<menbodytype>getAllmenbodytype() throws SQLException, ClassNotFoundException{
	        Connection con=getConnection();
	        String sql="select* from menbodytype";
	        PreparedStatement stmt=con.prepareStatement(sql);
	        ResultSet rs=stmt.executeQuery();
	        ArrayList<menbodytype>clist=new  ArrayList<menbodytype>();
	        while(rs.next()) {
	        	menbodytype m=new menbodytype();
	        	m.setId(rs.getInt("bodytypeid"));
	        	m.setName(rs.getString("bodytypename"));
	        	m.setImage(rs.getString("bodytypeimage"));
	          clist.add(m);
	        }
	        return clist;
	      }
	      
	      public menbodytype getmenbodytype(int bodytypeid) throws ClassNotFoundException, SQLException {
	          Connection con=getConnection();
	          String sql="select* from menbodytype where bodytypeid=?";
	          PreparedStatement stmt=con.prepareStatement(sql);
	          stmt.setInt(1, bodytypeid);
	          ResultSet rs=stmt.executeQuery();
	          menbodytype m=new menbodytype();
	          while(rs.next()) {
	            m.setId(rs.getInt(1));
	            m.setName(rs.getString(2));
	            m.setImage(rs.getString(3));
	            
	          }
	      return m;
	        }
	      
	      public ArrayList<womenbodytype>getAllwomenbodytype() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from womenbodytype";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<womenbodytype>clist=new  ArrayList<womenbodytype>();
		        while(rs.next()) {
		        	womenbodytype w=new womenbodytype();
		        	w.setId(rs.getInt("bodytypeid"));
		        	w.setName(rs.getString("bodytypename"));
		        	w.setImage(rs.getString("bodytypeimage"));
		          clist.add(w);
		        }
		        return clist;
		      }
		      
		      public womenbodytype getwomenbodytype(int bodytypeid) throws ClassNotFoundException, SQLException {
		          Connection con=getConnection();
		          String sql="select* from womenbodytype where bodytypeid=?";
		          PreparedStatement stmt=con.prepareStatement(sql);
		          stmt.setInt(1, bodytypeid);
		          ResultSet rs=stmt.executeQuery();
		          womenbodytype m=new womenbodytype();
		          while(rs.next()) {
		            m.setId(rs.getInt(1));
		            m.setName(rs.getString(2));
		            m.setImage(rs.getString(3));
		            
		          }
		      return m;
		        }
		      
		      public int womenbodyDelete(int bodytypeid) throws ClassNotFoundException, SQLException {
		          Connection con = getConnection();
		          String sql = "delete from womenbodytype where bodytypeid=?";
		          PreparedStatement stmt = con.prepareStatement(sql);
		          stmt.setInt(1,bodytypeid);
		          int status=stmt.executeUpdate();
		        return status;
		          
		      }
		      
	      public ArrayList<menfashion>getmenfashion() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from menfashion ";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<menfashion>mtflist=new  ArrayList<menfashion>();
		        while(rs.next()) {
		        	menfashion mtf=new menfashion();
		        	mtf.setFid(rs.getInt("fid"));
		        	mtf.setF1name(rs.getString("f1name"));
		        	mtf.setF1img(rs.getString("f1img"));
		        	mtf.setF2name(rs.getString("f2name"));
		        	mtf.setF2img(rs.getString("f2img"));
		        	mtf.setF3name(rs.getString("f3name"));
		        	mtf.setF3img(rs.getString("f3img"));
		        	mtf.setF4name(rs.getString("f4name"));
		        	mtf.setF4img(rs.getString("f4img"));
		        	mtf.setF5name(rs.getString("f5name"));
		        	mtf.setF5img(rs.getString("f5img"));
		        	mtf.setF6name(rs.getString("f6name"));
		        	mtf.setF6img(rs.getString("f6img"));
		        	
		          mtflist.add(mtf);
		        }
		        return mtflist;
		      }
	      
	      
	      public menfashion getmenfashion(int id) throws ClassNotFoundException, SQLException {
	          Connection con=getConnection();
	          String sql="select* from menfashion where fid=?";
	          PreparedStatement stmt=con.prepareStatement(sql);
	          stmt.setInt(1, id);
	          ResultSet rs=stmt.executeQuery();
	          menfashion m=new menfashion();
	          while(rs.next()) {
	            m.setFid(rs.getInt(1));
	            m.setF1name(rs.getString(2));
	            m.setF1img(rs.getString(3));
	            m.setF2name(rs.getString(4));
	            m.setF2img(rs.getString(5));
	            m.setF3name(rs.getString(6));
	            m.setF3img(rs.getString(7));
	            m.setF4name(rs.getString(8));
	            m.setF4img(rs.getString(9));
	            m.setF5name(rs.getString(10));
	            m.setF5img(rs.getString(11));
	            m.setF6name(rs.getString(12));
	            m.setF6img(rs.getString(13));
	          }
	      return m;
	        }
	      
	      
	      public ArrayList<mentrianglefashion>getAllmentrianglefashion() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from mentrianglefashion";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<mentrianglefashion>clist=new  ArrayList<mentrianglefashion>();
		        while(rs.next()) {
		        	mentrianglefashion m=new mentrianglefashion();
		        	m.setId(rs.getInt("fid"));
		        	m.setF1name(rs.getString("f1name"));
		        	m.setF1img(rs.getString("f1img"));
		        	m.setF2name(rs.getString("f2name"));
		        	m.setF2img(rs.getString("f2img"));
		        	m.setF3name(rs.getString("f3name"));
		        	m.setF3img(rs.getString("f3img"));
		        	m.setF4name(rs.getString("f4name"));
		        	m.setF4img(rs.getString("f4img"));
		        	m.setF5name(rs.getString("f5name"));
		        	m.setF5img(rs.getString("f5img"));
		        	m.setF6name(rs.getString("f6name"));
		        	m.setF6img(rs.getString("f6img"));
		        	m.setF7name(rs.getString("f7name"));
		        	m.setF7img(rs.getString("f7img"));
		        	m.setF8name(rs.getString("f8name"));
		        	m.setF8img(rs.getString("f8img"));
		        	m.setF9name(rs.getString("f9name"));
		        	m.setF9img(rs.getString("f9img"));
		        	
		          clist.add(m);
		        }
		        return clist;
		      }
	      
	      
	      public mentrianglefashion getmentrianglefashion(int id) throws ClassNotFoundException, SQLException {
	          Connection con=getConnection();
	          String sql="select* from mentrianglefashion where fid=?";
	          PreparedStatement stmt=con.prepareStatement(sql);
	          stmt.setInt(1, id);
	          ResultSet rs=stmt.executeQuery();
	          mentrianglefashion m=new mentrianglefashion();
	          while(rs.next()) {
	            m.setId(rs.getInt(1));
	            m.setF1name(rs.getString(2));
	            m.setF1img(rs.getString(3));
	            m.setF2name(rs.getString(4));
	            m.setF2img(rs.getString(5));
	            m.setF3name(rs.getString(6));
	            m.setF3img(rs.getString(7));
	            m.setF4name(rs.getString(8));
	            m.setF4img(rs.getString(9));
	            m.setF5name(rs.getString(10));
	            m.setF5img(rs.getString(11));
	            m.setF6name(rs.getString(12));
	            m.setF6img(rs.getString(13));
	            m.setF7name(rs.getString(14));
	            m.setF7img(rs.getString(15));
	            m.setF8name(rs.getString(16));
	            m.setF8img(rs.getString(17));
	            m.setF9name(rs.getString(18));
	            m.setF9img(rs.getString(19));
	          }
	      return m;
	        }
	      
	     
	      
	      
	      
	     
	      
	      
	      public ArrayList<womenfashion>getwomenfashion() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from womenfashion ";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<womenfashion>mtflist=new  ArrayList<womenfashion>();
		        while(rs.next()) {
		        	womenfashion wtf=new womenfashion();
		        	wtf.setFid(rs.getInt("fid"));
		        	wtf.setF1name(rs.getString("f1name"));
		        	wtf.setF1img(rs.getString("f1img"));
		        	wtf.setF2name(rs.getString("f2name"));
		        	wtf.setF2img(rs.getString("f2img"));
		        	wtf.setF3name(rs.getString("f3name"));
		        	wtf.setF3img(rs.getString("f3img"));
		        	wtf.setF4name(rs.getString("f4name"));
		        	wtf.setF4img(rs.getString("f4img"));
		        	wtf.setF5name(rs.getString("f5name"));
		        	wtf.setF5img(rs.getString("f5img"));
		        	wtf.setF6name(rs.getString("f6name"));
		        	wtf.setF6img(rs.getString("f6img"));
		        	
		          mtflist.add(wtf);
		        }
		        return mtflist;
		      }
	      
	      
	      public womenfashion getwomenfashion(int id) throws ClassNotFoundException, SQLException {
	          Connection con=getConnection();
	          String sql="select* from womenfashion where fid=?";
	          PreparedStatement stmt=con.prepareStatement(sql);
	          stmt.setInt(1, id);
	          ResultSet rs=stmt.executeQuery();
	          womenfashion w=new womenfashion();
	          while(rs.next()) {
	            w.setFid(rs.getInt(1));
	            w.setF1name(rs.getString(2));
	            w.setF1img(rs.getString(3));
	            w.setF2name(rs.getString(4));
	            w.setF2img(rs.getString(5));
	            w.setF3name(rs.getString(6));
	            w.setF3img(rs.getString(7));
	            w.setF4name(rs.getString(8));
	            w.setF4img(rs.getString(9));
	            w.setF5name(rs.getString(10));
	            w.setF5img(rs.getString(11));
	            w.setF6name(rs.getString(12));
	            w.setF6img(rs.getString(13));
	          }
	      return w;
	        }
	      
	     
	      
	      
	      public ArrayList<menfacetype>getAllmenfacetype() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from menfaceshape";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<menfacetype>flist=new  ArrayList<menfacetype>();
		        while(rs.next()) {
		        	menfacetype m=new menfacetype();
		        	m.setId(rs.getInt("fid"));
		        	m.setName(rs.getString("fname"));
		        	m.setImage(rs.getString("fimg"));
		          flist.add(m);
		        }
		        return flist;
		      }
	      
	      public ArrayList<menhairstyles>getmenhairstyles() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from menhairstyle";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<menhairstyles>mhslist=new  ArrayList<menhairstyles>();
		        while(rs.next()) {
		        	menhairstyles mhs=new menhairstyles();
		        	mhs.setId(rs.getInt("hid"));
		        	mhs.setH1name(rs.getString("h1name"));
		        	mhs.setH1image(rs.getString("h1image"));
		        	mhs.setH2name(rs.getString("h2name"));
		        	mhs.setH2image(rs.getString("h2image"));
		        	mhs.setH3name(rs.getString("h3name"));
		        	mhs.setH3image(rs.getString("h3image"));
		        
		          mhslist.add(mhs);
		        }
		        return mhslist;
		      }
	      
	      
	      public menhairstyles getmenhairstyles(int id) throws ClassNotFoundException, SQLException {
	          Connection con=getConnection();
	          String sql="select* from menhairstyle where hid=?";
	          PreparedStatement stmt=con.prepareStatement(sql);
	          stmt.setInt(1, id);
	          ResultSet rs=stmt.executeQuery();
	          menhairstyles m=new menhairstyles();
	          while(rs.next()) {
	            m.setId(rs.getInt(1));
	            m.setH1name(rs.getString(2));
	            m.setH1image(rs.getString(3));
	            m.setH2name(rs.getString(4));
	            m.setH2image(rs.getString(5));
	            m.setH3name(rs.getString(6));
	            m.setH3image(rs.getString(7));
	            
	          }
	      return m;
	        }
	      
	      
	      public ArrayList<womenfacetype>getAllwomenfacetype() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from womenfaceshape";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<womenfacetype>flist=new  ArrayList<womenfacetype>();
		        while(rs.next()) {
		        	womenfacetype w=new womenfacetype();
		        	w.setId(rs.getInt("fid"));
		        	w.setName(rs.getString("fname"));
		        	w.setImage(rs.getString("fimg"));
		          flist.add(w);
		        }
		        return flist;
		      }
	      
	      
	      public ArrayList<womenhairstyles>getwomenhairstyles() throws SQLException, ClassNotFoundException{
		        Connection con=getConnection();
		        String sql="select* from womenhairstyle";
		        PreparedStatement stmt=con.prepareStatement(sql);
		        ResultSet rs=stmt.executeQuery();
		        ArrayList<womenhairstyles>whslist=new  ArrayList<womenhairstyles>();
		        while(rs.next()) {
		        	womenhairstyles whs=new womenhairstyles();
		        	whs.setId(rs.getInt("hid"));
		        	whs.setH1name(rs.getString("h1name"));
		        	whs.setH1image(rs.getString("h1image"));
		        	whs.setH2name(rs.getString("h2name"));
		        	whs.setH2image(rs.getString("h2image"));
		        	whs.setH3name(rs.getString("h3name"));
		        	whs.setH3image(rs.getString("h3image"));
		        
		          whslist.add(whs);
		        }
		        return whslist;
		      }
	      
	      
	      public womenhairstyles getwomenhairstyles(int id) throws ClassNotFoundException, SQLException {
	          Connection con=getConnection();
	          String sql="select* from womenhairstyle where hid=?";
	          PreparedStatement stmt=con.prepareStatement(sql);
	          stmt.setInt(1, id);
	          ResultSet rs=stmt.executeQuery();
	          womenhairstyles w=new womenhairstyles();
	          while(rs.next()) {
	            w.setId(rs.getInt(1));
	            w.setH1name(rs.getString(2));
	            w.setH1image(rs.getString(3));
	            w.setH2name(rs.getString(4));
	            w.setH2image(rs.getString(5));
	            w.setH3name(rs.getString(6));
	            w.setH3image(rs.getString(7));
	            
	          }
	      return w;
	        }
	      
	      
	      public menfashion getmenfashions(int id) throws ClassNotFoundException, SQLException {
	          Connection con = getConnection();
	          String sql = "select * from menfashion where fid=?  ";
	           PreparedStatement stmt = con.prepareStatement(sql);
	           stmt.setInt(1, id);
	           ResultSet rs = stmt.executeQuery();
	           menfashion m=new menfashion();
	           
	           while(rs.next()) {
	        	   m.setFid(rs.getInt(1));
		            m.setF1name(rs.getString(2));
		            m.setF1img(rs.getString(3));
		            m.setF2name(rs.getString(4));
		            m.setF2img(rs.getString(5));
		            m.setF3name(rs.getString(6));
		            m.setF3img(rs.getString(7));
		            m.setF4name(rs.getString(8));
		            m.setF4img(rs.getString(9));
		            m.setF5name(rs.getString(10));
		            m.setF5img(rs.getString(11));
		            m.setF6name(rs.getString(12));
		            m.setF6img(rs.getString(13));
		           
	               
	           } 
	        return m;
	          
	        }
	        
	      public int updatemenfashions(menfashion cag) throws ClassNotFoundException {
	    	    Connection con = null;
	    	    PreparedStatement ps = null;
	    	    int result = 0;

	    	    try {
	    	        // Initialize database connection
	    	    	con = getConnection();

	    	        // Prepare SQL update statement
	    	        String sql = "UPDATE menfashion SET f1name=?, f1img=?, f2name=?, f2img=?, f3name=?, f3img=?, f4name=?, f4img=?, f5name=?, f5img=?, f6name=?, f6img=? WHERE fid=?";
	    	        ps = con.prepareStatement(sql);

	    	        // Set parameters
	    	      
	    	        ps.setString(1, cag.getF1name());
	    	        ps.setString(2, cag.getF1img());
	    	        ps.setString(3, cag.getF2name());
	    	        ps.setString(4, cag.getF2img());
	    	        ps.setString(5, cag.getF3name());
	    	        ps.setString(6, cag.getF3img());
	    	        ps.setString(7, cag.getF4name());
	    	        ps.setString(8, cag.getF4img());
	    	        ps.setString(9, cag.getF5name());
	    	        ps.setString(10, cag.getF5img());
	    	        ps.setString(11, cag.getF6name());
	    	        ps.setString(12, cag.getF6img());
	    	        ps.setInt(13, cag.getFid());	    	       

	    	        // Execute update
	    	        result = ps.executeUpdate();
	    	    } catch (SQLException e) {
	    	        e.printStackTrace();
	    	    } finally {
	    	        // Close resources
	    	        try {
	    	            if (ps != null) ps.close();
	    	            if (con != null) con.close();
	    	        } catch (SQLException e) {
	    	            e.printStackTrace();
	    	        }
	    	    }
	    	    return result;
	    	}

}
