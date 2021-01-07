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
public class Sodoku extends Game implements Solvable {
    private int i, j;
    Sodoku(int i, int j) {
       this.i = i;
       this.j = j;
    }
}
