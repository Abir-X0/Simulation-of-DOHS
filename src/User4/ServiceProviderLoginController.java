/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package User4;

import Util.scene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class ServiceProviderLoginController implements Initializable {

    @FXML
    private AnchorPane ServiceAnchorPan;
    @FXML
    private TextField ServiceEmail;
    @FXML
    private TextField ServicePass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SErviceLogin(ActionEvent event) throws IOException {
                  if (ServiceEmail.getText().equals(userlog.nam) || (ServicePass.getText().equals(userlog.pss))){
            new scene(ServiceAnchorPan,"/User4/ServiceDashBoard.fxml");
        }
    }

    @FXML
    private void ResLink(ActionEvent event) throws IOException {
        new scene(ServiceAnchorPan,"Opening_scene.fxml");
    }

    @FXML
    private void MaintOfflink(ActionEvent event) throws IOException {
        new scene(ServiceAnchorPan,"/Maroah/MaintanenceOfficerLogin.fxml");
    }

    @FXML
    private void CantBordMemLink(ActionEvent event) throws IOException {
        new scene(ServiceAnchorPan,"/Mariam/CantonmentBoardMemberLogin.fxml");
    }
    
}
