/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mariam;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class ReportMonthlyMaintenanceController implements Initializable {

    @FXML
    private PieChart piechartMonthly;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            ObservableList<PieChart.Data> piechartMonthlyData= FXCollections.observableArrayList(
                    new PieChart.Data("DOHS Office", 20),
                    new PieChart.Data("DOHS Hospital ", 25),
                    new PieChart.Data("DOHS Mosque" , 10),
                    new PieChart.Data( "DOHS School", 15),
                    new PieChart.Data("DOHS Security" , 20),
                    new PieChart.Data( "DOHS Park", 10),
                    new PieChart.Data("DOHS Electricity" , 20)
                
        );
        piechartMonthlyData.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        
        piechartMonthly.getData().addAll(piechartMonthlyData);
    }    
    
}
