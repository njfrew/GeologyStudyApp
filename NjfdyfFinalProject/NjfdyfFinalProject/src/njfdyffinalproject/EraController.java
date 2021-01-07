/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njfdyffinalproject;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author njfdyf
 */
public class EraController extends Switchable implements Initializable {
    
    @FXML
    private AnchorPane vizPane;
    
    @FXML
    private ImageView eraImageView;
    
    @FXML
    private Text eraNameText;
    
    @FXML
    private TextArea contentArea;
    
    
    @FXML
    private Menu erasMenu;
    
     @FXML
     private Menu quizMenu;
    
     @FXML
     private Menu aboutMenu;
    
    
    
    private ArrayList<Precambrian> eras;
    private Precambrian currentEra;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        eras = new ArrayList<>();
        eras.add(new Hadean());
        eras.add(new Archean());
        eras.add(new Proterozoic());
       

        
        for (Precambrian era : eras) {
            MenuItem menuItem = new MenuItem(era.getName());
            menuItem.setUserData(era);
            menuItem.setOnAction((ActionEvent event) -> {
                era.start(vizPane, eraImageView, contentArea);
                changeEra(era);
            });
            erasMenu.getItems().add(menuItem);
        }
        
        currentEra = eras.get(0);
        eraNameText.setText(currentEra.getName());
        

    }
    
    @FXML
    private void selectEra(ActionEvent event) {
        MenuItem menuItem = (MenuItem)event.getSource();
        Precambrian precambrian = (Precambrian)menuItem.getUserData();
        changeEra(precambrian);
    }
    
    
    private void changeEra(Precambrian era) {
        currentEra = era;
        eraNameText.setText(currentEra.getName());
    }
    
    @FXML
    private void handleOpen(ActionEvent e) {
        
        QuizFXMLController quizController = (QuizFXMLController) Switchable.getControllerByName("QuizFXML");
        
        if (quizController != null)
            quizController.loadQuiz();
        
        Switchable.switchTo("QuizFXML");
        
        
    }
    
    @FXML
    private void switchToGrade(ActionEvent e) {
        Switchable.switchTo("GradeFXML");
    }
    
    @FXML
    private void switchToAbout(ActionEvent e) {
        Switchable.switchTo("AboutFXML");
    }

    
}
