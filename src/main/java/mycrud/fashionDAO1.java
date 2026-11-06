package mycrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class fashionDAO1 {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project1","root","");
    return con;
    }
    
    public ArrayList<womenhourglassfashion>getAllwomenhourglassfashion() throws SQLException, ClassNotFoundException{
        Connection con=getConnection();
        String sql="select* from womenhourglassfashion";
        PreparedStatement stmt=con.prepareStatement(sql);
        ResultSet rs=stmt.executeQuery();
        ArrayList<womenhourglassfashion>clist=new  ArrayList<womenhourglassfashion>();
        while(rs.next()) {
        	womenhourglassfashion m=new womenhourglassfashion();
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
  
  
  public womenhourglassfashion getwomenhourglassfashion(int id) throws ClassNotFoundException, SQLException {
      Connection con=getConnection();
      String sql="select* from womenhourglassfashion where fid=?";
      PreparedStatement stmt=con.prepareStatement(sql);
      stmt.setInt(1, id);
      ResultSet rs=stmt.executeQuery();
      womenhourglassfashion m=new womenhourglassfashion();
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
  
  public int womenDelete(int fid) throws ClassNotFoundException, SQLException {
      Connection con = getConnection();
      String sql = "delete from womenhourglassfashion where fid=?";
      PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setInt(1,fid);
      int status=stmt.executeUpdate();
    return status;
      
  }
}
