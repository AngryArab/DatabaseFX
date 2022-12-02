package com.example.databasefx;
import java.sql.*;


public class DBUtil {
    private static Connection connection = null;
    private static Statement statement = null;

    public static void dbConnect() throws SQLException{
        String dbURL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
        String username = "COMP228_F22_sh_1";
        String password = "password";
        try{
            connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("database is connected");

            statement = connection.createStatement();
        }catch (SQLException e) {
            System.out.println("datbase is not connected");
            System.out.println(e.getMessage());
        }


    }


    public static void dbDisconnect() throws SQLException{
        try{
            if(connection != null && !connection.isClosed()){
                connection.close();
                System.out.println("Database is not connected");
            }

        }catch (SQLException e){
            throw  e;
        }
    }


    public static void CreateTable(String tablename) throws SQLException{
        dbConnect();
        String sql = "CREATE TABLE " + tablename + " s_id INTEGER PRIMARY KEY, s_name VARCHAR2(100))";
        try {
            statement.execute(sql);
            System.out.println("table is created");
        } catch (SQLException e) {
            System.out.println("table is not created");
            System.out.println(e.getMessage());
        }
    }

    public static void DropTable(String tablename) throws SQLException{
        dbConnect();
        String sql = "DROP TABLE " + tablename + " s_id INTEGER PRIMARY KEY, s_name VARCHAR2(100))";
        try {
            statement.execute(sql);
            System.out.println("table is dropped");
        } catch (SQLException e) {
            System.out.println("table is not dropped");
            System.out.println(e.getMessage());
        }
    }


    public static void insertData(String tableName, int id, String name) throws SQLException{
        dbConnect();
        String sql = "INSERT INTO " + tableName + " VALUES(" + id + ",'" + name + "')";
        statement.executeUpdate(sql);
        System.out.println( id + ", " + name + " is inserted!");


    }



    public static void main(String[] args) throws SQLException {

        dbConnect();

        dbDisconnect();

        CreateTable("test table");

        insertData("test table" , 1, "TLX");

       // DropTable("test drop table");



    }




}
