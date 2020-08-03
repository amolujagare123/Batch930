package JDBcDemos;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       // 1. Loading a driver - For Mysql

       Class.forName("com.mysql.cj.jdbc.Driver");

       // 2. creatign a connection

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. creating statement

        Statement st =  con.createStatement();

        // 4. extecute query --- A .DML Queries

        String sql = "insert into student values(2,'praful','IT',89)";

        // Home work , try commonds like delete & update

        st.executeUpdate(sql);





    }
}
