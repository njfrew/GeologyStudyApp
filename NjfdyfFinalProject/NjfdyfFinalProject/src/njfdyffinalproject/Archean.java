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
public class Archean implements Precambrian {
    
    private final String name = "Archaean Eon";

    private Image archeanImage;
    private final String archeanImageName = "archean.jpg";
    
    public Archean() {
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void start(AnchorPane vizPane, ImageView eraImage, TextArea contentArea) {                
 
        contentArea.clear();
        
        archeanImage = new Image(getClass().getResourceAsStream(archeanImageName));
        eraImage.setImage(archeanImage);

        contentArea.appendText("Archaean Eon\n- 4-2.5 billion years ago\n"
                + "- Split into 4 eras: Eoarchaean, Paleoarchaean, Mesoarchaean, and Neoarchaean\n"
                + "- Formation of continents\n"
                + "- Earliest life 3.4 billion years ago, found in South African cherts\n"
                + "- Ocean formation and development of Hydrosphere at 3.8 billion years ago from volcanic outgassing and comets\n"
                + "- Increase in Oxygen by end of Archaean in the Neoarchaean");
        
    }
    
}
