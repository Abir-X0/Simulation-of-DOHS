/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package User2;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author Abir
 */
public class InfoController implements Initializable {

    @FXML
    private TextArea adresstxtfld;
    @FXML
    private TextArea housetxtfld;
    @FXML
    private TextArea phntxtfld;
    @FXML
    private TextArea memtxtfld;
    @FXML
    private TextArea nametxtfld;
    @FXML
    private ImageView infoIMGview;
;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        adresstxtfld.setText(user.adr);
        housetxtfld.setText(user.hous);
        phntxtfld.setText(user.phn);
        nametxtfld.setText(user.nam);
        memtxtfld.setText(user.memN0);
        
        File file = new File("src/Util/2.jpg");
        Image image = new Image(file.toURI().toString());
        infoIMGview.setImage(image);
    }    
    
}
