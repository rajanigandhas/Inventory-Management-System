
package com.raven.form;


import java.sql.Connection;
import java.sql.DriverManager;


public class databaseCon {
     private Connection con;
    public databaseCon() throws Exception{
    createCon();
    }
    public void createCon()  {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306"
                    + "/inventory?allowPublicKeyRetrieval=true&useSSL=false";
            String username="root";
            String pass="mysql@1";
            con=DriverManager.getConnection(url, username, pass);
           System.out.println("Connection create..");

        
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return con;
    }
}
