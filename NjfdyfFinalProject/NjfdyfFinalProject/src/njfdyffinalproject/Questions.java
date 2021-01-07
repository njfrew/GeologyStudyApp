/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njfdyffinalproject;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author njfdyf
 */
public class Questions {
    
    private ArrayList<Answers> answers = new ArrayList<>();
    private String questionText;
    private VBox wrapperVBox;
    private QuizFXMLController controller;
    
    public Questions(VBox wrapperVBox, String[] names, String questionText, int correctIndex) {
        
        this.questionText = questionText;
        this.wrapperVBox = wrapperVBox;
        
        for(String name : names){
            
            Answers newAnswer = new Answers(name);
            
            newAnswer.setOnAction((ActionEvent e) -> {
                if (newAnswer.getCorrect()){
                    Model.correctAnswers++;
                }
                
                controller.answerQuestion();
                
            });
            answers.add(newAnswer);
            
        }
        
        answers.get(correctIndex).setCorrect(true);
       
    }
    
    public void setController(QuizFXMLController controller){
        this.controller = controller;
    }
    
    public void renderQuestions(){
        removeQuestions();
        for(Answers a : answers) {
            wrapperVBox.getChildren().add(a);
        }
    }
    
    public void removeQuestions(){
        wrapperVBox.getChildren().clear();
    }
    
    public String getQuestionText(){
        return questionText;
    }
    
}
