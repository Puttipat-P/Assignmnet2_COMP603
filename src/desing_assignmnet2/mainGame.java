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
public class mainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Database db = new Database();
                logIn login = new logIn(db);
                
                login.setVisible(true);
                   
                
            }
        });
    }
    
}
