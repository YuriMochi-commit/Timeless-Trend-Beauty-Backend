package mycrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class signupDAO {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
        return con;
    }

    public int savesignup(signup s) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        String sql = "insert into user (name,email,password) values(?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, s.getName());
        stmt.setString(2, s.getEmail());
        stmt.setString(3, s.getPassword());
        int status = stmt.executeUpdate();
        // Close resources
        stmt.close();
        con.close();
        return status;
    }
    
    
    public ArrayList<signup> getAllsignup() throws SQLException, ClassNotFoundException{
      Connection con = getConnection();
      String sql="select * from user";
      PreparedStatement stmt = con.prepareStatement(sql);
      ResultSet rs=stmt.executeQuery();
      ArrayList<signup> clist=new ArrayList<signup>();
      while(rs.next()) {
        signup signup=new signup();
        signup.setId(rs.getInt("id"));
        signup.setName(rs.getString("name"));
        signup.setEmail(rs.getString("email"));
        signup.setPassword(rs.getString("password")); 
        clist.add(signup);
      }
      
      // Close resources
        rs.close();
        stmt.close();
        con.close();
        return clist;     
    } 
    public boolean checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        String sql = "select * from user where email=? and password=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        boolean isValid = false;
        if (rs.next()) {
            isValid = true;
        }
        // Close resources
        rs.close();
        stmt.close();
        con.close();
        return isValid;
    }
    
    public signup getsignup(String email) throws ClassNotFoundException, SQLException {
      Connection con = getConnection();
      String sql = "select * from user where email=?  ";
       PreparedStatement stmt = con.prepareStatement(sql);
       stmt.setString(1, email);
       ResultSet rs = stmt.executeQuery();
       signup s=new signup();
       
       while(rs.next()) {
         s.setEmail(rs.getString(3));
         s.setPassword(rs.getString(5));
       }
    return s;
      
    }
    
    
    
    
    public int updateSignup(signup s) throws ClassNotFoundException, SQLException {
      Connection con = getConnection();
      String sql = "update signup set password=? where email=? ";
       PreparedStatement stmt = con.prepareStatement(sql);
       stmt.setString(5, s.getPassword());
       stmt.setString(3,s.getEmail());
       int status=stmt.executeUpdate();
    return status;
      
    }
    
    public int menfashionDelete(int fid) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        String sql = "delete from menfashion where fid=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,fid);
        int status=stmt.executeUpdate();
      return status;
        
    }
    
    public int womenfashionDelete(int fid) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        String sql = "delete from womenfashion where fid=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,fid);
        int status=stmt.executeUpdate();
      return status;
        
    }
    
    public int menbodyDelete(int bodytypeid) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        String sql = "delete from menbodytype where bodytypeid=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,bodytypeid);
        int status=stmt.executeUpdate();
      return status;
        
    }
    
    public int womenbodyDelete(int bodytypeid) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        String sql = "delete from womenbodytype where bodytypeid=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1,bodytypeid);
        int status=stmt.executeUpdate();
      return status;
        
    }
    
    
    
}
