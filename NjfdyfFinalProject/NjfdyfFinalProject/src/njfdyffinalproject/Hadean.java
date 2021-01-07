/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njfdyffinalproject;

import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author njfdyf
 */
public class Hadean implements Precambrian {
    
    private final String name = "Hadean Eon";
 
    private Image hadeanImage;
    private final String hadeanImageName = "hadean.jpg";
    
    public Hadean() {
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void start(AnchorPane vizPane, ImageView eraImage, TextArea contentArea) {        
        
        contentArea.clear();
        
        hadeanImage = new Image(getClass().getResourceAsStream(hadeanImageName));
        eraImage.setImage(hadeanImage);
        
        contentArea.appendText("Hadean Eon\n- Time 4.6-4 billion years ago\n"
                + "- Formation of the Earth\n- Earth was a Hellish landscape\n"
                + "- Continued Impacts\n"
                + "- No Oceans\n"
                + "- Formation of the moon at ~ 4.4 Biliion years ago");
        
    }
    
    
}
