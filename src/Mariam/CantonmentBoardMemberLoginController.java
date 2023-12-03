/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mariam;
import Util.scene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
public class CantonmentBoardMemberLoginController implements Initializable {

    @FXML
    private AnchorPane AnchorPanelOpeningCantMem;
    @FXML
    private Label label;
    @FXML
    private TextField CantemailTxtFld;
    @FXML
    private TextField CantPassTxtFld;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void BordMemsignInbot(ActionEvent event) throws IOException {
        new scene(AnchorPanelOpeningCantMem,"/Mariam/CANTmemDashbord.fxml");

    }

    @FXML
    private void signInbotCantMem(ActionEvent event) {
    }

    @FXML
    private void ResidentLink(ActionEvent event) throws IOException {
        new scene(AnchorPanelOpeningCantMem,"Opening_scene.fxml");
    }

    @FXML
    private void MaintenanceOfficerLink(ActionEvent event) throws IOException {
        new scene(AnchorPanelOpeningCantMem,"/Mariam/CANTmemDashbord.fxml");
    }

    
}
