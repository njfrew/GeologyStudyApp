/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njfdyffinalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author njfdyf
 */
public class AboutFXMLController extends Switchable implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void switchToEra(ActionEvent e) {
        Switchable.switchTo("EraFXML");
    }
    
    @FXML
    private void switchToQuiz(ActionEvent e) {
        Switchable.switchTo("QuizFXML");
    }
    
    @FXML
    private void switchToGrade(ActionEvent e) {
        Switchable.switchTo("GradFXML");
    }
    
}
