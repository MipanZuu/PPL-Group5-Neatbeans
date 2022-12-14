/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.review;

import javax.swing.JOptionPane;

/**
 *
 * @author dentabramasta
 */
public class EReview {
    public static Connection connectmysqldb(){
        try{
            String username = "root";
            String pass = "";
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(parentComponent, e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new mainPage().setVisible(true);
    }
    
}
