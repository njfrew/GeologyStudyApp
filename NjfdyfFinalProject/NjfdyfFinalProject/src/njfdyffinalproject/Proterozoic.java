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
public class Proterozoic implements Precambrian {
    
    private final String name = "Proterozoic Eon";
    
    private AnchorPane vizPane;
    
    
    private Image proterozoicImage;
    private final String proterozoicImageName = "proterozoic.jpg";
    
    public Proterozoic() {
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void start(AnchorPane vizPane, ImageView eraImage, TextArea contentArea) {        
 
        contentArea.clear();
        
        proterozoicImage = new Image(getClass().getResourceAsStream(proterozoicImageName));
        eraImage.setImage(proterozoicImage);
        
        contentArea.appendText("Proterozoic Eon\n- 2500-541 million years ago\n"
                + "- Split into eras: Paleoproterozoic, Mesoproterozoic, and Neoproterozoic\n- Oxygen revolution throughout\n"
                + "- First complex eukaryotic life 2.7 Billion\n"
                + "- First supercontinent Rodinia\n"
                + "- First major climate crisis\n- First multicellular and true metazoans in the Ediacaran");
        
    }
    
    
}
