/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Abir.MainApplication;
import java.io.IOException;
import java.util.Objects;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Abir
 */
public class scene {
        public scene(AnchorPane currentAnchorPane, String fxml) throws IOException {
    AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(MainApplication.class.getResource(fxml))); currentAnchorPane.getChildren().removeAll();
    currentAnchorPane.getChildren().setAll(nextAnchorPane);
    
}
}