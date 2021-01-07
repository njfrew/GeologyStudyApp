/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njfdyffinalproject;

import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author dale
 */
public interface Precambrian {
    public void start(AnchorPane vizPane, ImageView eraImage, TextArea contentArea);
    public String getName();
}
