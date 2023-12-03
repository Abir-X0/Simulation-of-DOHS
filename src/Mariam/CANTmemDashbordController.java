/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mariam;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class CANTmemDashbordController implements Initializable {

    @FXML
    private Tab currentAffairTAb;
    @FXML
    private AnchorPane workrportTab;
    @FXML
    private PieChart pieChart;
    @FXML
    private TextArea NewsTxtFld;
    @FXML
    private TextField updateTxtFld;
    @FXML
    private Button AddNewsBott;
    @FXML
    private Button myinfoBott;
    @FXML
    private Button DOHSdetBot;
    @FXML
    private Tab workRepTAb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<PieChart.Data> pieChartData= FXCollections.observableArrayList(
                    new PieChart.Data("Official Business", 35),
                    new PieChart.Data("Vendor ", 25),
                    new PieChart.Data("Guest" , 10),
                    new PieChart.Data( "Delivery", 20),
                    new PieChart.Data("Resident meetup" , 10)
                
        );
        pieChartData.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        
        pieChart.getData().addAll(pieChartData);
    }    

    @FXML
    private void MaintDepReportBott(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Mariam/ReportMonthlyMaintenance.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Stage stage = new Stage();
        stage.setTitle("Report of D.O.H.S Maintenance This month");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void yearlyReptBott(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Mariam/ReportYearlylandmark.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Stage stage = new Stage();
        stage.setTitle("Report of D.O.H.S Landmark this Yearl");
        stage.setScene(scene);
        stage.show();
    }
    
}
