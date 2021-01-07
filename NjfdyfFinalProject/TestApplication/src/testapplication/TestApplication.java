/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;

/**
 *
 * @author noahfrew
 */
public class TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game p = new Game();
        Sodoku s = new Sodoku(10, 20);
        
        Solvable x = new Sodoku(10,20);
        
        p = new Sodoku(10, 20);
    }
    
    
    
}
