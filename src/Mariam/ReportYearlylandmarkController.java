/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mariam;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class ReportYearlylandmarkController implements Initializable {

    @FXML
    private ComboBox<String> yearCombobx;
    @FXML
    private StackedBarChart<String, Number> stackBarChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        String year;
        yearCombobx.getItems().addAll("2023","2022","2021","2020");
        
        yearCombobx.setValue("2023");
        
        final XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName ("Office");
        series1.getData().add(new XYChart.Data("January", 810));
        series1.getData().add(new XYChart.Data("February", 820));
        series1.getData().add(new XYChart.Data("March", 800)); 
        series1.getData().add(new XYChart.Data("June", 820));
        series1.getData().add(new XYChart.Data("July", 810));
        series1.getData().add(new XYChart.Data("August", 830));
        series1.getData().add(new XYChart.Data("September", 800));
        series1.getData().add(new XYChart.Data("October", 810)); 
        series1.getData().add(new XYChart.Data("November", 820));
        series1.getData().add(new XYChart.Data("December", 815));
  
        
        final XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName ("Hospital");
        series2.getData().add(new XYChart.Data("January", 310));
        series2.getData().add(new XYChart.Data("February", 320));
        series2.getData().add(new XYChart.Data("March", 315)); 
        series2.getData().add(new XYChart.Data("June", 310));
        series2.getData().add(new XYChart.Data("July", 330));
        series2.getData().add(new XYChart.Data("August", 320));
        series2.getData().add(new XYChart.Data("September", 330));
        series2.getData().add(new XYChart.Data("October", 310)); 
        series2.getData().add(new XYChart.Data("November", 300));
        series2.getData().add(new XYChart.Data("December", 315));
        
        final XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName ("Mosque");
        series3.getData().add(new XYChart.Data("January", 95));
        series3.getData().add(new XYChart.Data("February", 90));
        series3.getData().add(new XYChart.Data("March", 96)); 
        series3.getData().add(new XYChart.Data("June", 93));
        series3.getData().add(new XYChart.Data("July", 95));
        series3.getData().add(new XYChart.Data("August", 90));
        series3.getData().add(new XYChart.Data("September", 90));
        series3.getData().add(new XYChart.Data("October", 94)); 
        series3.getData().add(new XYChart.Data("November", 94));
        series3.getData().add(new XYChart.Data("December", 95));
        
        
        final XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName ("School");
        series4.getData().add(new XYChart.Data("January", 210));
        series4.getData().add(new XYChart.Data("February", 220));
        series4.getData().add(new XYChart.Data("March", 215)); 
        series4.getData().add(new XYChart.Data("June", 210));
        series4.getData().add(new XYChart.Data("July", 213));
        series4.getData().add(new XYChart.Data("August", 230));
        series4.getData().add(new XYChart.Data("September", 235));
        series4.getData().add(new XYChart.Data("October", 210)); 
        series4.getData().add(new XYChart.Data("November", 233));
        series4.getData().add(new XYChart.Data("December", 205));
  
        
        final XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName ("Security");
        series5.getData().add(new XYChart.Data("January", 135));
        series5.getData().add(new XYChart.Data("February", 130));
        series5.getData().add(new XYChart.Data("March", 130)); 
        series5.getData().add(new XYChart.Data("June", 155));
        series5.getData().add(new XYChart.Data("July", 130));
        series5.getData().add(new XYChart.Data("August", 130));
        series5.getData().add(new XYChart.Data("September", 140));
        series5.getData().add(new XYChart.Data("October", 110)); 
        series5.getData().add(new XYChart.Data("November", 140));
        series5.getData().add(new XYChart.Data("December", 125));
        
        final XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series6.setName ("Electricity");
        series6.getData().add(new XYChart.Data("January", 115));
        series6.getData().add(new XYChart.Data("February", 110));
        series6.getData().add(new XYChart.Data("March", 110)); 
        series6.getData().add(new XYChart.Data("June", 120));
        series6.getData().add(new XYChart.Data("July", 110));
        series6.getData().add(new XYChart.Data("August", 115));
        series6.getData().add(new XYChart.Data("September", 125));
        series6.getData().add(new XYChart.Data("October", 110)); 
        series6.getData().add(new XYChart.Data("November", 105));
        series6.getData().add(new XYChart.Data("December", 124));
            
        stackBarChart.getData().setAll(series1,series2,series3,series4,series5,series6);    
       
    }    

    @FXML
    private void onaction(ActionEvent event) {
        String selectedYear = yearCombobx.getValue();
        
        if("2022".equals(selectedYear)){
                                        
        final XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName ("Office");
        series1.getData().add(new XYChart.Data("January", 810));
        series1.getData().add(new XYChart.Data("February", 920));
        series1.getData().add(new XYChart.Data("March", 1000)); 
        series1.getData().add(new XYChart.Data("June", 920));
        series1.getData().add(new XYChart.Data("July", 910));
        series1.getData().add(new XYChart.Data("August", 930));
        series1.getData().add(new XYChart.Data("September", 1000));
        series1.getData().add(new XYChart.Data("October", 910)); 
        series1.getData().add(new XYChart.Data("November", 920));
        series1.getData().add(new XYChart.Data("December", 915));
  
        
        final XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName ("Hospital");
        series2.getData().add(new XYChart.Data("January", 410));
        series2.getData().add(new XYChart.Data("February", 420));
        series2.getData().add(new XYChart.Data("March", 415)); 
        series2.getData().add(new XYChart.Data("June", 410));
        series2.getData().add(new XYChart.Data("July", 430));
        series2.getData().add(new XYChart.Data("August", 420));
        series2.getData().add(new XYChart.Data("September", 430));
        series2.getData().add(new XYChart.Data("October", 410)); 
        series2.getData().add(new XYChart.Data("November", 400));
        series2.getData().add(new XYChart.Data("December", 415));
        
        final XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName ("Mosque");
        series3.getData().add(new XYChart.Data("January", 105));
        series3.getData().add(new XYChart.Data("February", 110));
        series3.getData().add(new XYChart.Data("March", 106)); 
        series3.getData().add(new XYChart.Data("June", 103));
        series3.getData().add(new XYChart.Data("July", 105));
        series3.getData().add(new XYChart.Data("August", 110));
        series3.getData().add(new XYChart.Data("September", 130));
        series3.getData().add(new XYChart.Data("October", 104)); 
        series3.getData().add(new XYChart.Data("November", 104));
        series3.getData().add(new XYChart.Data("December", 105));
        
        
        final XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName ("School");
        series4.getData().add(new XYChart.Data("January", 310));
        series4.getData().add(new XYChart.Data("February", 320));
        series4.getData().add(new XYChart.Data("March", 315)); 
        series4.getData().add(new XYChart.Data("June", 310));
        series4.getData().add(new XYChart.Data("July", 313));
        series4.getData().add(new XYChart.Data("August", 330));
        series4.getData().add(new XYChart.Data("September", 335));
        series4.getData().add(new XYChart.Data("October", 310)); 
        series4.getData().add(new XYChart.Data("November", 333));
        series4.getData().add(new XYChart.Data("December", 305));
  
        
        final XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName ("Security");
        series5.getData().add(new XYChart.Data("January", 165));
        series5.getData().add(new XYChart.Data("February", 170));
        series5.getData().add(new XYChart.Data("March", 160)); 
        series5.getData().add(new XYChart.Data("June", 175));
        series5.getData().add(new XYChart.Data("July", 150));
        series5.getData().add(new XYChart.Data("August", 180));
        series5.getData().add(new XYChart.Data("September", 190));
        series5.getData().add(new XYChart.Data("October", 130)); 
        series5.getData().add(new XYChart.Data("November", 160));
        series5.getData().add(new XYChart.Data("December", 175));
        
        final XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series6.setName ("Electricity");
        series6.getData().add(new XYChart.Data("January", 135));
        series6.getData().add(new XYChart.Data("February", 140));
        series6.getData().add(new XYChart.Data("March", 150)); 
        series6.getData().add(new XYChart.Data("June", 140));
        series6.getData().add(new XYChart.Data("July", 130));
        series6.getData().add(new XYChart.Data("August", 135));
        series6.getData().add(new XYChart.Data("September", 155));
        series6.getData().add(new XYChart.Data("October", 140)); 
        series6.getData().add(new XYChart.Data("November", 135));
        series6.getData().add(new XYChart.Data("December", 144));
            
        stackBarChart.getData().setAll(series1,series2,series3,series4,series5,series6);    
        }
        else if("2021".equals(selectedYear)){
                                        
        final XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName ("Office");
        series1.getData().add(new XYChart.Data("January", 710));
        series1.getData().add(new XYChart.Data("February", 720));
        series1.getData().add(new XYChart.Data("March", 1000)); 
        series1.getData().add(new XYChart.Data("June", 720));
        series1.getData().add(new XYChart.Data("July", 710));
        series1.getData().add(new XYChart.Data("August", 730));
        series1.getData().add(new XYChart.Data("September", 700));
        series1.getData().add(new XYChart.Data("October", 710)); 
        series1.getData().add(new XYChart.Data("November", 720));
        series1.getData().add(new XYChart.Data("December", 715));
  
        
        final XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName ("Hospital");
        series2.getData().add(new XYChart.Data("January", 210));
        series2.getData().add(new XYChart.Data("February", 220));
        series2.getData().add(new XYChart.Data("March", 215)); 
        series2.getData().add(new XYChart.Data("June", 210));
        series2.getData().add(new XYChart.Data("July", 230));
        series2.getData().add(new XYChart.Data("August", 220));
        series2.getData().add(new XYChart.Data("September", 230));
        series2.getData().add(new XYChart.Data("October", 210)); 
        series2.getData().add(new XYChart.Data("November", 200));
        series2.getData().add(new XYChart.Data("December", 215));
        
        final XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName ("Mosque");
        series3.getData().add(new XYChart.Data("January", 85));
        series3.getData().add(new XYChart.Data("February", 80));
        series3.getData().add(new XYChart.Data("March", 86)); 
        series3.getData().add(new XYChart.Data("June", 103));
        series3.getData().add(new XYChart.Data("July", 85));
        series3.getData().add(new XYChart.Data("August", 110));
        series3.getData().add(new XYChart.Data("September", 130));
        series3.getData().add(new XYChart.Data("October", 84)); 
        series3.getData().add(new XYChart.Data("November", 84));
        series3.getData().add(new XYChart.Data("December", 85));
        
        
        final XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName ("School");
        series4.getData().add(new XYChart.Data("January", 220));
        series4.getData().add(new XYChart.Data("February", 170));
        series4.getData().add(new XYChart.Data("March", 185)); 
        series4.getData().add(new XYChart.Data("June", 190));
        series4.getData().add(new XYChart.Data("July", 199));
        series4.getData().add(new XYChart.Data("August", 180));
        series4.getData().add(new XYChart.Data("September", 135));
        series4.getData().add(new XYChart.Data("October", 210)); 
        series4.getData().add(new XYChart.Data("November", 233));
        series4.getData().add(new XYChart.Data("December", 205));
  
        
        final XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName ("Security");
        series5.getData().add(new XYChart.Data("January", 100));
        series5.getData().add(new XYChart.Data("February", 110));
        series5.getData().add(new XYChart.Data("March", 105)); 
        series5.getData().add(new XYChart.Data("June", 110));
        series5.getData().add(new XYChart.Data("July", 100));
        series5.getData().add(new XYChart.Data("August", 105));
        series5.getData().add(new XYChart.Data("September", 100));
        series5.getData().add(new XYChart.Data("October", 130)); 
        series5.getData().add(new XYChart.Data("November", 90));
        series5.getData().add(new XYChart.Data("December", 115));
        
        final XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series6.setName ("Electricity");
        series6.getData().add(new XYChart.Data("January", 105));
        series6.getData().add(new XYChart.Data("February", 100));
        series6.getData().add(new XYChart.Data("March", 100)); 
        series6.getData().add(new XYChart.Data("June", 100));
        series6.getData().add(new XYChart.Data("July", 100));
        series6.getData().add(new XYChart.Data("August", 105));
        series6.getData().add(new XYChart.Data("September", 105));
        series6.getData().add(new XYChart.Data("October", 100)); 
        series6.getData().add(new XYChart.Data("November", 105));
        series6.getData().add(new XYChart.Data("December", 104));
            
        stackBarChart.getData().setAll(series1,series2,series3,series4,series5,series6);    
        }
        else if("2020".equals(selectedYear)){
                                        
        final XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName ("Office");
        series1.getData().add(new XYChart.Data("January", 600));
        series1.getData().add(new XYChart.Data("February", 620));
        series1.getData().add(new XYChart.Data("March", 700)); 
        series1.getData().add(new XYChart.Data("June", 620));
        series1.getData().add(new XYChart.Data("July", 610));
        series1.getData().add(new XYChart.Data("August", 630));
        series1.getData().add(new XYChart.Data("September", 700));
        series1.getData().add(new XYChart.Data("October", 610)); 
        series1.getData().add(new XYChart.Data("November", 620));
        series1.getData().add(new XYChart.Data("December", 615));
  
        
        final XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName ("Hospital");
        series2.getData().add(new XYChart.Data("January", 110));
        series2.getData().add(new XYChart.Data("February", 120));
        series2.getData().add(new XYChart.Data("March", 115)); 
        series2.getData().add(new XYChart.Data("June", 110.15));
        series2.getData().add(new XYChart.Data("July", 130));
        series2.getData().add(new XYChart.Data("August", 120));
        series2.getData().add(new XYChart.Data("September", 130));
        series2.getData().add(new XYChart.Data("October", 110)); 
        series2.getData().add(new XYChart.Data("November", 100));
        series2.getData().add(new XYChart.Data("December", 115));
        
        final XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName ("Mosque");
        series3.getData().add(new XYChart.Data("January", 85));
        series3.getData().add(new XYChart.Data("February", 90));
        series3.getData().add(new XYChart.Data("March", 76)); 
        series3.getData().add(new XYChart.Data("June", 73));
        series3.getData().add(new XYChart.Data("July", 105));
        series3.getData().add(new XYChart.Data("August", 60));
        series3.getData().add(new XYChart.Data("September", 70));
        series3.getData().add(new XYChart.Data("October", 64)); 
        series3.getData().add(new XYChart.Data("November", 54));
        series3.getData().add(new XYChart.Data("December", 65));
        
        
        final XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName ("School");
        series4.getData().add(new XYChart.Data("January", 110));
        series4.getData().add(new XYChart.Data("February", 120));
        series4.getData().add(new XYChart.Data("March", 115)); 
        series4.getData().add(new XYChart.Data("June", 110));
        series4.getData().add(new XYChart.Data("July", 113));
        series4.getData().add(new XYChart.Data("August", 130));
        series4.getData().add(new XYChart.Data("September", 135));
        series4.getData().add(new XYChart.Data("October", 110)); 
        series4.getData().add(new XYChart.Data("November", 133));
        series4.getData().add(new XYChart.Data("December", 105));
  
        
        final XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName ("Security");
        series5.getData().add(new XYChart.Data("January", 95));
        series5.getData().add(new XYChart.Data("February", 90));
        series5.getData().add(new XYChart.Data("March", 90)); 
        series5.getData().add(new XYChart.Data("June", 95));
        series5.getData().add(new XYChart.Data("July", 80));
        series5.getData().add(new XYChart.Data("August", 90));
        series5.getData().add(new XYChart.Data("September", 80));
        series5.getData().add(new XYChart.Data("October", 70)); 
        series5.getData().add(new XYChart.Data("November", 99));
        series5.getData().add(new XYChart.Data("December", 85));
        
        final XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series6.setName ("Electricity");
        series6.getData().add(new XYChart.Data("January", 105));
        series6.getData().add(new XYChart.Data("February", 100));
        series6.getData().add(new XYChart.Data("March", 100)); 
        series6.getData().add(new XYChart.Data("June", 100));
        series6.getData().add(new XYChart.Data("July", 100));
        series6.getData().add(new XYChart.Data("August", 105));
        series6.getData().add(new XYChart.Data("September", 95));
        series6.getData().add(new XYChart.Data("October", 100)); 
        series6.getData().add(new XYChart.Data("November", 105));
        series6.getData().add(new XYChart.Data("December", 104));
            
        stackBarChart.getData().setAll(series1,series2,series3,series4,series5,series6);    
        }
        else if("2023".equals(selectedYear)){
                                        
        final XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName ("Office");
        series1.getData().add(new XYChart.Data("January", 810));
        series1.getData().add(new XYChart.Data("February", 820));
        series1.getData().add(new XYChart.Data("March", 800)); 
        series1.getData().add(new XYChart.Data("June", 820));
        series1.getData().add(new XYChart.Data("July", 810));
        series1.getData().add(new XYChart.Data("August", 830));
        series1.getData().add(new XYChart.Data("September", 800));
        series1.getData().add(new XYChart.Data("October", 810)); 
        series1.getData().add(new XYChart.Data("November", 820));
        series1.getData().add(new XYChart.Data("December", 815));
  
        
        final XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName ("Hospital");
        series2.getData().add(new XYChart.Data("January", 310));
        series2.getData().add(new XYChart.Data("February", 320));
        series2.getData().add(new XYChart.Data("March", 315)); 
        series2.getData().add(new XYChart.Data("June", 310));
        series2.getData().add(new XYChart.Data("July", 330));
        series2.getData().add(new XYChart.Data("August", 320));
        series2.getData().add(new XYChart.Data("September", 330));
        series2.getData().add(new XYChart.Data("October", 310)); 
        series2.getData().add(new XYChart.Data("November", 300));
        series2.getData().add(new XYChart.Data("December", 315));
        
        final XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName ("Mosque");
        series3.getData().add(new XYChart.Data("January", 95));
        series3.getData().add(new XYChart.Data("February", 90));
        series3.getData().add(new XYChart.Data("March", 96)); 
        series3.getData().add(new XYChart.Data("June", 93));
        series3.getData().add(new XYChart.Data("July", 95));
        series3.getData().add(new XYChart.Data("August", 90));
        series3.getData().add(new XYChart.Data("September", 90));
        series3.getData().add(new XYChart.Data("October", 94)); 
        series3.getData().add(new XYChart.Data("November", 94));
        series3.getData().add(new XYChart.Data("December", 95));
        
        
        final XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName ("School");
        series4.getData().add(new XYChart.Data("January", 210));
        series4.getData().add(new XYChart.Data("February", 220));
        series4.getData().add(new XYChart.Data("March", 215)); 
        series4.getData().add(new XYChart.Data("June", 210));
        series4.getData().add(new XYChart.Data("July", 213));
        series4.getData().add(new XYChart.Data("August", 230));
        series4.getData().add(new XYChart.Data("September", 235));
        series4.getData().add(new XYChart.Data("October", 210)); 
        series4.getData().add(new XYChart.Data("November", 233));
        series4.getData().add(new XYChart.Data("December", 205));
  
        
        final XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName ("Security");
        series5.getData().add(new XYChart.Data("January", 135));
        series5.getData().add(new XYChart.Data("February", 130));
        series5.getData().add(new XYChart.Data("March", 130)); 
        series5.getData().add(new XYChart.Data("June", 155));
        series5.getData().add(new XYChart.Data("July", 130));
        series5.getData().add(new XYChart.Data("August", 130));
        series5.getData().add(new XYChart.Data("September", 140));
        series5.getData().add(new XYChart.Data("October", 110)); 
        series5.getData().add(new XYChart.Data("November", 140));
        series5.getData().add(new XYChart.Data("December", 125));
        
        final XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series6.setName ("Electricity");
        series6.getData().add(new XYChart.Data("January", 115));
        series6.getData().add(new XYChart.Data("February", 110));
        series6.getData().add(new XYChart.Data("March", 110)); 
        series6.getData().add(new XYChart.Data("June", 120));
        series6.getData().add(new XYChart.Data("July", 110));
        series6.getData().add(new XYChart.Data("August", 115));
        series6.getData().add(new XYChart.Data("September", 125));
        series6.getData().add(new XYChart.Data("October", 110)); 
        series6.getData().add(new XYChart.Data("November", 105));
        series6.getData().add(new XYChart.Data("December", 124));
            
        stackBarChart.getData().setAll(series1,series2,series3,series4,series5,series6);    
        }
    }
    
    }    
    

