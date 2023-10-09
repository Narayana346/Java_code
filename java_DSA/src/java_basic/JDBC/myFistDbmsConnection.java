package java_basic.JDBC;

import java.sql.*;
//import java.util.Scanner;

public class myFistDbmsConnection {
    static {
        System.out.println("my class is loading...");
    }
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class is loaded....");
// initialize an Appropriate JDBC Driver --- by using class loading
// and Driver class object to call getConnection Method

//            DriverManager.registerDriver(new Driver());
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the name of the driver --> ");
//            String driver = sc.next();
//            Class.forName("com.mysql.cj.jdbc.Driver");
          con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/learningdbms","root","mydatabase@2001");
         //create an object for passing SQL Queries to connected DataBase
            // it responsible to return statement object
            Statement st = con.createStatement();

            // pass to Queries to connected DB   ---->
            // void st.execute(String DDL);
            // int st.executeUpdate(String DML);
            // int st.executeQuery(String DRL);
////            close the connection -->
//            String sql = "insert into user(name,id) values (\"narayanan14@gmail.com\",99);";
//            st.execute(sql);
//            System.out.println("DB Table value is inserted -- ");
//            long i  = st.executeUpdate("insert into user values(\"Bishal\",45);");
//            if (i>0){
//                System.out.println("record inserted --> ");
//            }else {System.out.println("Something Went Wrong");}
            ResultSet rs =st.executeQuery("select * from user;");
            while (rs.next()){
                System.out.print(rs.getString("name"));
                System.out.print("     ");
                System.out.print(rs.getInt("id"));
                System.out.println();

            }

            st.close();

        } catch (Exception e){ System.out.println("ERROR --> "+ e.getMessage()); }
    finally {
            try {
                extracted(con);
            }catch (Exception e){System.out.println( "ERROR --> "+ e.getMessage());}
        }
    }

    private static void extracted(Connection con) throws SQLException {
        con.close();
    }
}