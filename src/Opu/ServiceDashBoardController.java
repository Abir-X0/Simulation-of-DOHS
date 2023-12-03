/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Opu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class ServiceDashBoardController implements Initializable {

    @FXML
    private Button jobbut;
    @FXML
    private TextField SERHELPNAME;
    @FXML
    private TextField SERHELPeml;
    @FXML
    private TextField SERHELPNum;
    @FXML
    private TextField SERHELPpbm;
    @FXML
    private TextField SERHELPpbmdes;
    @FXML
    private TextArea plicieSER;
    @FXML
    private PieChart piechart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void applyissue(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void monthJOBSER(ActionEvent event) {
    }

    @FXML
    private void YERJOBSER(ActionEvent event) {
    }
    
}
