/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.review;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dentabramasta
 */
public class EReview {
    public static Connection connectmysqldb(){
        try{
            String username = "root";
            String pass = "";
            String sqlconn = "jdbc:mysql://localhost:3307/PPL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sqlconn, username, pass);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new mainPage().setVisible(true);
    }
    
}
