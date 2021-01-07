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
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author njfdyf
 */
public class QuizFXMLController extends Switchable implements Initializable {

    @FXML
    private Menu erasMenu;
    
    @FXML
    private Menu quizMenu;
    
    @FXML
    private Menu aboutMenu;
    
    @FXML
    private Text questionText;
    
    @FXML
    private Text finalText;
    
    @FXML
    private Button answerAButton;
    
    @FXML
    private Button answerBButton;
    
    @FXML
    private Button answerCButton;
    
    @FXML
    private Button answerDButton;
    
    @FXML
    private VBox answerBox;
    
    static public int currentQuestionIndex;
    private Model model;
    
    
    public void start(Stage stage) {
        System.out.println("quizFXMLController started!");
        
        
    }
    
    @FXML
    private void handleOpen(ActionEvent event) {
        Switchable.switchTo("EraFXML");
    }
    
    @FXML
    private void switchToAbout(ActionEvent event) {
        Switchable.switchTo("AboutFXML");
    }
    
        @FXML
    private void switchToGrade(ActionEvent event) {
        Switchable.switchTo("GradeFXML");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new Model(answerBox);
        loadQuiz();
        
    }    
    
    public void loadQuiz(){
        
        model.questionList.get(0).renderQuestions();
        questionText.setText(model.questionList.get(0).getQuestionText());
        for (Questions q : model.questionList){
            q.setController(this);
        }
        
        finalText.setText("");
        //model.loadScore();
        
    }
    
    
    public void answerQuestion(){
        if (currentQuestionIndex < model.questionList.size() - 1){
            answerBox.getChildren().clear();
            currentQuestionIndex++;
            model.questionList.get(currentQuestionIndex).renderQuestions();
            questionText.setText(model.questionList.get(currentQuestionIndex).getQuestionText());
            System.out.println(Model.correctAnswers);
        }
        
        else if (currentQuestionIndex == model.questionList.size() - 1){
            Model.percentCorrect = ((float) Model.correctAnswers / 10) * 100;
            finalText.setText("Finished. Your final score is " + Model.correctAnswers + "/10" + " (" + String.format("%.2f", Model.percentCorrect) + "%)");
            model.saveScore();
            currentQuestionIndex = 0;
            Model.correctAnswers = 0;
            answerBox.getChildren().clear();
        }
        
        
        
    }
    
}
