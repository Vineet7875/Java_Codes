// import java.sql.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         // Load MySQL JDBC driver
//         Class.forName("com.mysql.cj.jdbc.Driver");
        
//         // Connect to MySQL database
//         String url = "jdbc:mysql://localhost:3306/game";
//         String username = "root";
//         String password = "coepclg@123";
//         Connection conn = DriverManager.getConnection(url, username, password);
        
//         // Create a statement object
//         Statement stmt = conn.createStatement();
        
//         // Execute SQL statement
//         ResultSet rs = stmt.executeQuery("SELECT * FROM bgmi");
//         // int idno=5;
//         // ResultSet rs = stmt.executeQuery("SELECT * FROM bgmi where id=" + idno + "");
        
//         // Process results
//         while (rs.next()) {
//             int id = rs.getInt("id");
//             String name = rs.getString("name");
//             String role = rs.getString("role");
//             System.out.println(id+" "+name+" "+role);
//         }
        
//         // Close resources
//         rs.close();
//         stmt.close();
//         conn.close();
//     }
// }

// import java.sql.*;
// public class App{
//     public static void main(String []args) throws Exception{
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         String url="jdbc:mysql://localhost:3306/game";
//         String username="root";
//         String password="coepclg@123";
//         Connection conn=DriverManager.getConnection(url, username, password);
//         Statement st=conn.createStatement();
//         // ResultSet rs=st.executeQuery("Select * from bgmi");
//         int id=12;
//         String name="man";
//         String role="cator";
//         // int count=st.executeUpdate("INSERT INTO bgmi (id, name, role) VALUES (" + id + ", '" + name + "', '"+ role+ "')");
//         int count=st.executeUpdate("INSERT INTO bgmi (id, name, role) values(10,'Aman','Educator'))");
//         System.out.println(count+" "+"rows affected");
//         st.close();
//         conn.close();
//     }
// }

// import java.sql.*;
// import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;
// public class App{
//     public static void main(String []args) throws Exception{
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         String url="jdbc:mysql://localhost:3306/game";
//         String username="root";
//         String password="coepclg@123";
//         int id=10;
//         String name="Aman";
//         String role="Educator";
//         String query="insert into bgmi (id,name,role) values(?,?,?)";
//         Connection conn=DriverManager.getConnection(url, username, password);
//         PreparedStatement st=conn.prepareStatement(query);
//         st.setInt(1,id);
//         st.setString(2,name);
//         st.setString(3,role);
//         int count=st.executeUpdate();
//         System.out.println(count+" "+"rows affected");
//         st.close();
//         conn.close();
//     }
// }


// import java.sql.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         // Load MySQL JDBC driver
//         Class.forName("com.mysql.cj.jdbc.Driver");
        
//         // Connect to MySQL database
//         String url = "jdbc:mysql://localhost:3306/game";
//         String username = "root";
//         String password = "coepclg@123";
//         Connection conn = DriverManager.getConnection(url, username, password);
        
//         // Create a statement object
//         Statement stmt = conn.createStatement();
        
//         // Execute SQL statement
//         stmt.executeUpdate("delete from bgmi where id=10");

//         // Close resources
//         stmt.close();
//         conn.close();
//     }
// }

