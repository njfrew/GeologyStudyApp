/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njfdyffinalproject;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.VBox;

/**
 *
 * @author noahfrew
 */
public class Model {
    
    static public ArrayList<Questions> questionList;
    static public int correctAnswers;
    static public float percentCorrect;
    
    static private int previousScore; //out of 10
    
    public Model(VBox wrapperBox){
        
        questionList = new ArrayList<>();
        
        String[] questions;
        questions = new String[]{"4.1 Billion Years Ago", "3.7 Billion Years Ago", "2.8 Billion Years Ago", "4.6 Billion Years Ago"};
        questionList.add(new Questions(wrapperBox, questions, "When was the earth formed?", 3));
        
        questions = new String[]{"A beautiful tropical world", "A Hellish landscape", "A barren rocky world", "Icy cold world"};
        questionList.add(new Questions(wrapperBox, questions, "What was the Earth like during the Hadean?", 1));
        
        questions = new String[]{"In the Neoarchaean", "In the Paleoproterozoic", "In the Ediacaran", "In the Hadean"};
        questionList.add(new Questions(wrapperBox, questions, "When did oxygen start to increase in the atmosphere?", 0));
        
        questions = new String[]{"Through sedimentary weathering", "Earthquakes led to water secretion", "Bombardment of comets and volcanic outgassing", "Collisions from Mars-based meteors"};
        questionList.add(new Questions(wrapperBox, questions, "How did the Earth form the oceans?", 2));
        
        questions = new String[]{"Rodinia", "Pangaea", "Gondwana", "Pannotia"};
        questionList.add(new Questions(wrapperBox, questions, "What was the first supercontinent named?", 0));
        
        questions = new String[]{"Paleoproterozoic", "Mesoproterozoic", "Neoproterozoic", "Eoproterozoic"};
        questionList.add(new Questions(wrapperBox, questions, "What’s the middle era of the Proterozoic?", 1));
        
        questions = new String[]{"Archean", "Proterozoic", "Hadean", "Phanerozoic"};
        questionList.add(new Questions(wrapperBox, questions, "When was the first major climate crisis?", 1));
        
        questions = new String[]{"4.2 billion years ago", "1.8 billion years ago", "2.1 billion years ago", "3.4 billion years ago"};
        questionList.add(new Questions(wrapperBox, questions, "When was the earliest signs of life from?", 3));
        
        questions = new String[]{"South African cherts ", "Newfoundland burgess shales", "Australian sediments", "Hawaiian pahoehoe"};
        questionList.add(new Questions(wrapperBox, questions, "What were the earliest signs of life found in?", 0));
        
        questions = new String[]{"320 million years ago", "636 million years ago", "541 million years ago", "574 million years ago"};
        questionList.add(new Questions(wrapperBox, questions, "10. When did the Proterozoic end?", 2));
        
    }
    
    static public int getPrevious(){
        return previousScore;
    }
    
    public void saveScore() {
        
        previousScore = correctAnswers;
        
        File file = new File("src/scorefile.ser");
        
        if (file != null){
            
            PrintWriter pw;
            try {
                
                pw = new PrintWriter(file);
                pw.write(""); //clear last save
                pw.close();
                
                FileOutputStream fileOut = new FileOutputStream(file.getPath());
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                
                out.writeObject(previousScore);
                
                out.close();
                fileOut.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
    }
    
    static public void loadScore(){
        
        File file = new File("src/scorefile.ser");
        
        if(file != null){
            
            FileInputStream fileIn;
            
            try {
                
                fileIn = new FileInputStream(file.getPath());
                ObjectInputStream in = new ObjectInputStream(fileIn);
                
                int tempInt = (int) in.readObject();
                
                previousScore = tempInt;
                
                in.close();
                fileIn.close();
                
                
            } catch (EOFException ex){           
                System.out.println("File is empty.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
    
}
