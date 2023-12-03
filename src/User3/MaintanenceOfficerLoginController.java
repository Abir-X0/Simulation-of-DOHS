/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package User3;

import Util.scene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class MaintanenceOfficerLoginController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField CantemailTxtFld;
    @FXML
    private TextField CantPassTxtFld;
    @FXML
    private AnchorPane AnchorPanelOpeningMainttan;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signInbotMaintanMem(ActionEvent event) throws IOException {
        if (CantemailTxtFld.getText().equals(mainlogin.name) || (CantPassTxtFld.getText().equals(mainlogin.pas))){
            new scene(AnchorPanelOpeningMainttan,"/User3/MaintancneOffcrDashBoard.fxml");
  
    }
    }

    @FXML
    private void ResidentLink(ActionEvent event) throws IOException {
        new scene(AnchorPanelOpeningMainttan,"Opening_scene.fxml");
    }

    @FXML
    private void CantonMemrLink(ActionEvent event) throws IOException {
        new scene(AnchorPanelOpeningMainttan,"/User2/MaintancneOffcrDashBoard.fxml");
    }
    
}
