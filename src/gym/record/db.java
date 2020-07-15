/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.record;

/**
 *
 * @author Navi Choudhary
 */
import java.sql.*;
import javax.swing.*;
public class db {

    Connection conn=null;
    public static Connection java_db(){
       // String currentDir=System.getProperty("user.dir");
        try{
            Class.forName("org.sqlite.JDBC");
           // Connection conn =DriverManager.getConnection("jdbc:sqlite:"+currentDir+"\\gymrecord.sqlite");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\nsaha\\Documents\\NetBeansProjects\\Proper Fitness Gym\\Gym\\gymrecord.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}