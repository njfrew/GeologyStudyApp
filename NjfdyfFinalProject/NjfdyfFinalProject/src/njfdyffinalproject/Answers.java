/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njfdyffinalproject;

import javafx.scene.control.Button;

/**
 *
 * @author njfdyf
 */
public class Answers extends Button {
    private boolean isCorrect;
    
    private String buttonText;
    
    public Answers(String buttonText) {
        super(buttonText);
        this.isCorrect = isCorrect;
        this.buttonText = buttonText;
        this.setPrefHeight(40);
        this.setPrefWidth(365);
        
    }
    
    public boolean getCorrect() {
        return isCorrect;
    }
    
    public void setCorrect(boolean isCorrect){
        this.isCorrect = isCorrect;
    }
}
