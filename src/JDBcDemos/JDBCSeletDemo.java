package JDBcDemos;

import java.sql.*;

public class JDBCSeletDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Loading a driver - For Mysql

        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creatign a connection

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url, user, pass);

        // 3. creating statement

        Statement st = con.createStatement();

        // 4. extecute query --- A .DML Queries

        String sql = "select * from student";

        ResultSet rs =  st.executeQuery(sql);


        while(rs.next())
        {

            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("branch")+" ");
            System.out.println(rs.getInt("marks"));
        }


    }
}
