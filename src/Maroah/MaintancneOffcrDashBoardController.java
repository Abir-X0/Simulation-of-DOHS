/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Maroah;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class MaintancneOffcrDashBoardController implements Initializable {

    @FXML
    private ImageView imageview;
    @FXML
    private AnchorPane MAINTAINoffPanel;
    @FXML
    private Tab infoTab;
    @FXML
    private TextArea nametxt;
    @FXML
    private TextArea emailtxt;
    @FXML
    private TextArea numbertxt;
    @FXML
    private TextArea adresstxt;
    @FXML
    private TableView<?> mainTablaeView;
    @FXML
    private TableColumn<?, ?> tablemail;
    @FXML
    private TableColumn<?, ?> tablename;
    @FXML
    private TableColumn<?, ?> tableNum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("src/Util/1.jpg");
        Image image = new Image(file.toURI().toString());
        imageview.setImage(image);
    }

    @FXML
    private void addTable(ActionEvent event) {
    }

    @FXML
    private void DltTable(ActionEvent event) {
    }
    
}
