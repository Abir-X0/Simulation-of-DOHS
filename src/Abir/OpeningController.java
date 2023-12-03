/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Abir;

import Util.scene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Abir
 */
public class OpeningController implements Initializable {

    @FXML
    private AnchorPane AnchorPanelOpening;
    @FXML
    private Label label;
    @FXML
    private TextField emailTxtFld;
    @FXML
    private TextField PassTxtFld;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signInbot(ActionEvent event) throws IOException {
          if (emailTxtFld.getText().equals(residentSignIn.Email) || (PassTxtFld.getText().equals(residentSignIn.pass))){
            new scene(AnchorPanelOpening,"residentDashbord.fxml");
        }
    }

    @FXML
    private void CantonmentBoardMemberLink(ActionEvent event) throws IOException {
            new scene(AnchorPanelOpening,"/Mariam/CantonmentBoardMemberLogin.fxml");
    }

    @FXML
    private void MaintenanceOfficerLink(ActionEvent event) throws IOException {
       // new scene(AnchorPanelOpening,"/Maroah/MaintanenceOfficerLogin.fxml");
        new scene(AnchorPanelOpening,"residentDashbord.fxml");
    }

    @FXML
    private void guestloginbot(ActionEvent event) throws IOException {
        new scene(AnchorPanelOpening,"residentDashbord.fxml");
    }

    @FXML
    private void Aboutbot(ActionEvent event) throws IOException {
        new scene(AnchorPanelOpening,"/Opu/ServiceProviderLogin.fxml");
    }

    @FXML
    private void helpDskbot(ActionEvent event) {
    }
    
}
