/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing_assignmnet2;

/**
 *
 * @author Puttipat
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {

    Connection conn = null;
    String url = "jdbc:derby:PlayerDB;create=true";  //url of the DB host
    //jdbc:derby://localhost:1527/BookStoreDB
    String dbusername = "pdc";  //your DB username
    String dbpassword = "pdc";   //your DB password

    /**
     * Step 3: Create the method for initializing the connection between the
     * program and the database.
     *
     * Go to Controller.java for Step 4.
     */
    public void dbsetup() {
        try {
            conn = DriverManager.getConnection(url, dbusername, dbpassword);
            Statement statement = conn.createStatement();
            String tableName = "UserInfo";

            if (!checkTableExisting(tableName)) {
                statement.executeUpdate("CREATE TABLE " + tableName + " (userid VARCHAR(12), password VARCHAR(12), score INT)");
            }
            //statement.executeUpdate("INSERT INTO " + tableName + " VALUES('Fiction',0),('Non-fiction',10),('Textbook',20)");
            statement.close();

        } catch (Throwable e) {
            System.out.println("error");

        }
    }

    /**
     * Step 7:
     *
     * @param username
     * @param password
     * @return data
     */
    public Data checkName(String username, String password) {
        Data data = new Data(); // Initialize an instance of Data.
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT userid, password, score FROM UserInfo "
                    + "WHERE userid = '" + username + "'");
            if (rs.next()) {
                String pass = rs.getString("password");
                System.out.println("***" + pass);
                System.out.println("found user");
                /**
                 * If the username exists in the USERINFO table, and the
                 * password is correct, change the value of relating attributes
                 * of data. Otherwise, keep loginFlag as false.
                 */
                if (password.compareTo(pass) == 0) {
                    data.currentScore = rs.getInt("score");
                    data.loginFlag = true;
                } else {
                    data.loginFlag = false;
                    System.out.println("wrong password");
                }
            } else {
                /**
                 * If the username does not exist in the USERINFO table, then
                 * create a new account by using the inputted username and
                 * password.
                 */
                System.out.println("no such user");
                statement.executeUpdate("INSERT INTO UserInfo "
                        + "VALUES('" + username + "', '" + password + "', 0)");
                data.currentScore = 0;
                data.loginFlag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data; //Back to checkName() of Model.java.
    }

    private boolean checkTableExisting(String newTableName) {
        boolean flag = false;
        try {

            System.out.println("check existing tables.... ");
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);//types);
            //Statement dropStatement=null;
            while (rsDBMeta.next()) {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTableName) == 0) {
                    System.out.println(tableName + "  is there");
                    flag = true;
                }
            }
            if (rsDBMeta != null) {
                rsDBMeta.close();
            }
        } catch (SQLException ex) {
        }
        return flag;
    }

    public void quitGame(int score, String username) {
        Statement statement;
        try {
            statement = conn.createStatement();
            statement.executeUpdate("UPDATE UserInfo SET score=" + score + " WHERE userid='" + username + "'");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}