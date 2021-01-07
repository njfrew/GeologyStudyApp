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
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author njfdyf
 */
public class GradeFXMLController extends Switchable implements Initializable {

    @FXML
    private Text gradeText;
    
    @FXML
    private Text percentText;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Model.loadScore();
        gradeText.setText("Last Score: " + Model.getPrevious() + "/10");
        percentText.setText("Percent: " + String.format("%.2f",((float) Model.getPrevious() / 10) * 100) + "%");
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
    private void switchToAbout(ActionEvent e) {
        Switchable.switchTo("AboutFXML");
    }
    
}
