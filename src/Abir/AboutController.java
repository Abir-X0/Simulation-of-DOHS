/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Abir;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class AboutController implements Initializable {

    @FXML
    private TableView<AboutTable> tableABout;
    @FXML
    private TableColumn<AboutTable, String> noticeName;
    @FXML
    private TableColumn<AboutTable, String> DateAbout;
    @FXML
    private TextField AboutTxtArea;
    @FXML
    private AnchorPane AncorPanelAbout;

    ObservableList<AboutTable>list = FXCollections.observableArrayList(new AboutTable(AboutTable.notice,AboutTable.date));
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        noticeName.setCellValueFactory(new PropertyValueFactory<AboutTable, String>("notice"));
        DateAbout.setCellValueFactory(new PropertyValueFactory<AboutTable, String>("date"));
        
        tableABout.setItems(list);
        }
    


   
    

    @FXML
    private void DownloadPdfbot(ActionEvent event) {
    }

    @FXML
    private void ViewNoticebot(ActionEvent event) {

    }
    
}
