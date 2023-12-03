/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Abir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Util.PdfGenerator;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ButtonType;
/**
 * FXML Controller class
 *
 * @author Abir
 */
public class ResidentDashbordController implements Initializable {

    @FXML
    private StackPane Stackpane;
    @FXML
    private TextField CarStickerNameFld;
    @FXML
    private TextField CarStickerMobFld;
    @FXML
    private TextField CarStickerNidFld;
    @FXML
    private TextArea CarStickerPendingTXTarea;
    @FXML
    private TextField MaintanNameFld;
    @FXML
    private TextField MaintanNumberFld;
    @FXML
    private TextField MaintanHouserFld;
    @FXML
    private TextField MaintanRoadfld;
    @FXML
    private Label MaintainPendLABLE;
    @FXML
    private ComboBox<String> EventsComboBox;
    @FXML
    private TextField DonateNameTxtFLD;
    @FXML
    private TextField DonateMobileTxtFLD;
    @FXML
    private TextField DonateAmountTxtFLD;
    @FXML
    private TextArea ProjectsTxtArea;
    @FXML
    private TextArea PolicisTXTAREA;
    @FXML
    private TextArea logoutXTAREA;
    @FXML
    private Tab MaintaenanceTAB;
    @FXML
    private Tab DonateTab;
    @FXML
    private Tab PoliceTab;
    @FXML
    private Tab LogOutTab;
    @FXML
    private AnchorPane RESIDENTanchorPanel;
    @FXML
    private PieChart piechartres;
    @FXML
    private StackedBarChart<String, Number> barchartRes;
    @FXML
    private ComboBox<String> picombo;
    @FXML
    private ComboBox<String> barcombo;
   
    private XYChart.Series<String, Number> series1;
    private XYChart.Series<String, Number> series2;
    private XYChart.Series<String, Number> series3;
    private XYChart.Series<String, Number> series4;
    @FXML
    private Button OnlinePay;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        picombo.getItems().addAll("2023","2022","2021","2020");
        barcombo.getItems().addAll("2023","2022","2021","2020");
        picombo.setValue("2023");
        barcombo.setValue("2023");
        
        initializeStackedBarChart("2023");
        
        
       ObservableList<PieChart.Data> piechartMonthlyData= FXCollections.observableArrayList(
                      new PieChart.Data("Housing Expenses:", 43),
                    new PieChart.Data("Utilities: ", 15),
                    new PieChart.Data("Groceries:" , 12),
                    new PieChart.Data( "Healthcare:", 9),
                    new PieChart.Data("Communication:" , 6));
       
        piechartMonthlyData.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        piechartres.setData(piechartMonthlyData);
        
        EventsComboBox.getItems().addAll("Community Clean-Up Crusade", "Wellness Wednesday: Fitness Classes","Literary Lounge: Book Club Gathering");
        
        ProjectsTxtArea.setText(setStrings.proj);
        PolicisTXTAREA.setText(setStrings.policies);
        logoutXTAREA.setText(setStrings.thx);
 
    }
        private void initializeStackedBarChart(String selectedYear) {
                if (series1 == null) {
        series1 = new XYChart.Series<>();
    }
    if (series2 == null) {
        series2 = new XYChart.Series<>();
    }
    if (series3 == null) {
        series3 = new XYChart.Series<>();
    }
    if (series4 == null) {
        series4 = new XYChart.Series<>();
    }
    
        series1.getData().clear();
    series2.getData().clear();
    series3.getData().clear();
    series4.getData().clear();

        
       if("2023".equals(selectedYear)){
           

       series1.setName("Fruits and Vegetables:");
       series1.getData().add(new XYChart.Data("January", 12));
        series1.getData().add(new XYChart.Data("February", 10));
        series1.getData().add(new XYChart.Data("March", 13)); 
        series1.getData().add(new XYChart.Data("June", 12));
        series1.getData().add(new XYChart.Data("July", 10.5));
        series1.getData().add(new XYChart.Data("August", 13));
        series1.getData().add(new XYChart.Data("September", 14));
        series1.getData().add(new XYChart.Data("October", 12)); 
        series1.getData().add(new XYChart.Data("November", 13));
        series1.getData().add(new XYChart.Data("December", 11));
        

       series2.setName("Dairy and Eggs");
       series2.getData().add(new XYChart.Data("January", 11));
        series2.getData().add(new XYChart.Data("February", 9));
        series2.getData().add(new XYChart.Data("March", 10)); 
        series2.getData().add(new XYChart.Data("June", 9));
        series2.getData().add(new XYChart.Data("July", 9.5));
        series2.getData().add(new XYChart.Data("August", 10));
        series2.getData().add(new XYChart.Data("September", 12));
        series2.getData().add(new XYChart.Data("October", 9)); 
        series2.getData().add(new XYChart.Data("November", 9.9));
        series2.getData().add(new XYChart.Data("December", 11));
        
  
       series3.setName("Bread and Grains:");
       series3.getData().add(new XYChart.Data("January", 8.50));
        series3.getData().add(new XYChart.Data("February", 8.10));
        series3.getData().add(new XYChart.Data("March", 8.00)); 
        series3.getData().add(new XYChart.Data("June", 7.50));
        series3.getData().add(new XYChart.Data("July", 8.20));
        series3.getData().add(new XYChart.Data("August", 7.20));
        series3.getData().add(new XYChart.Data("September", 8.10));
        series3.getData().add(new XYChart.Data("October", 7.30)); 
        series3.getData().add(new XYChart.Data("November", 8.20));
        series3.getData().add(new XYChart.Data("December", 8.50));
        

       series4.setName("Proteins:");
       series4.getData().add(new XYChart.Data("January", 17));
        series4.getData().add(new XYChart.Data("February", 15));
        series4.getData().add(new XYChart.Data("March", 16)); 
        series4.getData().add(new XYChart.Data("June", 16.7));
        series4.getData().add(new XYChart.Data("July", 17.4));
        series4.getData().add(new XYChart.Data("August", 14.8));
        series4.getData().add(new XYChart.Data("September", 15));
        series4.getData().add(new XYChart.Data("October", 16.5)); 
        series4.getData().add(new XYChart.Data("November", 18.5));
        series4.getData().add(new XYChart.Data("December", 17));
 
       
    }else if("2022".equals(selectedYear)){

        
       series1.setName("Fruits and Vegetables:");

       series1.getData().add(new XYChart.Data("January", 10));
        series1.getData().add(new XYChart.Data("February", 9));
        series1.getData().add(new XYChart.Data("March", 9)); 
        series1.getData().add(new XYChart.Data("June", 10));
        series1.getData().add(new XYChart.Data("July", 9.5));
        series1.getData().add(new XYChart.Data("August", 10));
        series1.getData().add(new XYChart.Data("September", 12));
        series1.getData().add(new XYChart.Data("October", 11)); 
        series1.getData().add(new XYChart.Data("November", 10));
        series1.getData().add(new XYChart.Data("December", 9));

        
       series2.setName("Dairy and Eggs");

       series2.getData().add(new XYChart.Data("January", 9));
        series2.getData().add(new XYChart.Data("February", 8));
        series2.getData().add(new XYChart.Data("March", 10)); 
        series2.getData().add(new XYChart.Data("June", 9));
        series2.getData().add(new XYChart.Data("July", 8.5));
        series2.getData().add(new XYChart.Data("August", 9));
        series2.getData().add(new XYChart.Data("September", 8));
        series2.getData().add(new XYChart.Data("October", 8)); 
        series2.getData().add(new XYChart.Data("November", 9));
        series2.getData().add(new XYChart.Data("December", 10));
        

       series3.setName("Bread and Grains:");

       series3.getData().add(new XYChart.Data("January", 7.50));
        series3.getData().add(new XYChart.Data("February", 7.10));
        series3.getData().add(new XYChart.Data("March", 7.00)); 
        series3.getData().add(new XYChart.Data("June", 6.40));
        series3.getData().add(new XYChart.Data("July", 7.20));
        series3.getData().add(new XYChart.Data("August", 6.10));
        series3.getData().add(new XYChart.Data("September", 6.30));
        series3.getData().add(new XYChart.Data("October", 5.20)); 
        series3.getData().add(new XYChart.Data("November", 6.20));
        series3.getData().add(new XYChart.Data("December", 7.40));


       series4.setName("Proteins:");
        series4.getData().add(new XYChart.Data("February", 14));
        series4.getData().add(new XYChart.Data("March", 15)); 
        series4.getData().add(new XYChart.Data("June", 13.7));
        series4.getData().add(new XYChart.Data("July", 15.4));
        series4.getData().add(new XYChart.Data("August", 16.8));
        series4.getData().add(new XYChart.Data("September", 17));
        series4.getData().add(new XYChart.Data("October", 13.5)); 
        series4.getData().add(new XYChart.Data("November", 15.5));
        series4.getData().add(new XYChart.Data("December", 14));
  
  
    }else if("2021".equals(selectedYear)){
 
        

       series1.setName("Fruits and Vegetables:");

       series1.getData().add(new XYChart.Data("January", 10));
        series1.getData().add(new XYChart.Data("February", 9));
        series1.getData().add(new XYChart.Data("March", 11)); 
        series1.getData().add(new XYChart.Data("June", 10));
        series1.getData().add(new XYChart.Data("July", 9.5));
        series1.getData().add(new XYChart.Data("August", 10));
        series1.getData().add(new XYChart.Data("September", 12));
        series1.getData().add(new XYChart.Data("October", 10)); 
        series1.getData().add(new XYChart.Data("November", 9));
        series1.getData().add(new XYChart.Data("December", 10));
        

       series2.setName("Dairy and Eggs");
       series2.getData().add(new XYChart.Data("January", 10));
        series2.getData().add(new XYChart.Data("February", 8));
        series2.getData().add(new XYChart.Data("March", 9)); 
        series2.getData().add(new XYChart.Data("June", 8));
        series2.getData().add(new XYChart.Data("July", 8));
        series2.getData().add(new XYChart.Data("August", 9));
        series2.getData().add(new XYChart.Data("September", 10));
        series2.getData().add(new XYChart.Data("October", 8)); 
        series2.getData().add(new XYChart.Data("November", 9));
        series2.getData().add(new XYChart.Data("December", 10));
        

       series3.setName("Bread and Grains:");
       series3.getData().add(new XYChart.Data("January", 7.50));
        series3.getData().add(new XYChart.Data("February", 5.10));
        series3.getData().add(new XYChart.Data("March", 5.00)); 
        series3.getData().add(new XYChart.Data("June", 4.50));
        series3.getData().add(new XYChart.Data("July", 6.20));
        series3.getData().add(new XYChart.Data("August", 8.20));
        series3.getData().add(new XYChart.Data("September", 5.10));
        series3.getData().add(new XYChart.Data("October", 6.30)); 
        series3.getData().add(new XYChart.Data("November", 7.20));
        series3.getData().add(new XYChart.Data("December", 7.50));
        

       series4.setName("Proteins:");
       series4.getData().add(new XYChart.Data("January", 15));
        series4.getData().add(new XYChart.Data("February", 12));
        series4.getData().add(new XYChart.Data("March", 14)); 
        series4.getData().add(new XYChart.Data("June", 14));
        series4.getData().add(new XYChart.Data("July", 16));
        series4.getData().add(new XYChart.Data("August", 10.8));
        series4.getData().add(new XYChart.Data("September", 13));
        series4.getData().add(new XYChart.Data("October", 14.5)); 
        series4.getData().add(new XYChart.Data("November", 12.5));
        series4.getData().add(new XYChart.Data("December", 15));
 
    
    }else if("2020".equals(selectedYear)){



       series1.setName("Fruits and Vegetables:");
       series1.getData().add(new XYChart.Data("January", 9));
        series1.getData().add(new XYChart.Data("February", 8));
        series1.getData().add(new XYChart.Data("March", 10)); 
        series1.getData().add(new XYChart.Data("June", 9));
        series1.getData().add(new XYChart.Data("July", 8));
        series1.getData().add(new XYChart.Data("August", 7));
        series1.getData().add(new XYChart.Data("September", 9));
        series1.getData().add(new XYChart.Data("October", 10)); 
        series1.getData().add(new XYChart.Data("November", 12));
        series1.getData().add(new XYChart.Data("December", 9.60));
        

       series2.setName("Dairy and Eggs");
       series2.getData().add(new XYChart.Data("January", 9));
        series2.getData().add(new XYChart.Data("February", 10));
        series2.getData().add(new XYChart.Data("March", 9)); 
        series2.getData().add(new XYChart.Data("June", 8));
        series2.getData().add(new XYChart.Data("July", 9.5));
        series2.getData().add(new XYChart.Data("August", 8.8));
        series2.getData().add(new XYChart.Data("September", 7));
        series2.getData().add(new XYChart.Data("October", 8.9)); 
        series2.getData().add(new XYChart.Data("November", 7.9));
        series2.getData().add(new XYChart.Data("December", 9.6));
        

       series3.setName("Bread and Grains:");
       series3.getData().add(new XYChart.Data("January", 6.5));
        series3.getData().add(new XYChart.Data("February", 5.10));
        series3.getData().add(new XYChart.Data("March", 6.00)); 
        series3.getData().add(new XYChart.Data("June", 4.50));
        series3.getData().add(new XYChart.Data("July", 6.20));
        series3.getData().add(new XYChart.Data("August", 5.20));
        series3.getData().add(new XYChart.Data("September", 6.10));
        series3.getData().add(new XYChart.Data("October", 5.30)); 
        series3.getData().add(new XYChart.Data("November", 6.20));
        series3.getData().add(new XYChart.Data("December", 7.50));
        
        
 
       series4.setName("Proteins:");
       series4.getData().add(new XYChart.Data("January", 12));
        series4.getData().add(new XYChart.Data("February", 13));
        series4.getData().add(new XYChart.Data("March", 14)); 
        series4.getData().add(new XYChart.Data("June", 14.7));
        series4.getData().add(new XYChart.Data("July", 15.4));
        series4.getData().add(new XYChart.Data("August", 13.8));
        series4.getData().add(new XYChart.Data("September", 12));
        series4.getData().add(new XYChart.Data("October", 14.5)); 
        series4.getData().add(new XYChart.Data("November", 16.5));
        series4.getData().add(new XYChart.Data("December", 12));
        
   
    }
       barchartRes.getData().setAll(series1,series2,series3,series4)  ;  

    }
  

    @FXML
    private void CarStickBott(ActionEvent event) throws IOException {
        String name,mobileNumber,nid;
        
        name = CarStickerNameFld.getText();
        mobileNumber = CarStickerMobFld.getText();
        nid = CarStickerNidFld.getText();
        
        String result ="Car Sticker request Applied "+ "\nName: " + name + "\nMobile Number: " + mobileNumber + "\nNID: " + nid+ "\nFurther Information will be sent to you by SMS";
        
        CarStickerPendingTXTarea.setText(result);
        
        
    }

    @FXML
    private void MaintainPAyBott(ActionEvent event) {
                Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Payment Confirmed");

        alert.showAndWait();
        
        MaintainPendLABLE.setText("Paid");
        
        
        
    }

    @FXML
    private void DonateBott(ActionEvent event) {
        String amountD,nameD,numberD;
        amountD=DonateAmountTxtFLD.getText();
        nameD =DonateNameTxtFLD.getText();
        numberD=DonateMobileTxtFLD.getText();
        
        String selectedDonation = EventsComboBox.getValue();
        if("Community Clean-Up Crusade".equals(selectedDonation) ){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Payment Confirmed");
        alert.setContentText("Thank you for the Donating to Community Clean-Up Crusade " 
                            +"\nName :"+ nameD
                           + "\nDonation amount : " + amountD
                           + "\nmobile Number : " + numberD
                           );

        alert.showAndWait();
        
        }else if("Wellness Wednesday: Fitness Classes".equals(selectedDonation)){
                    Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Payment Confirmed");
        alert.setContentText("From Wellness Wednesday: Fitness Classes"
                            +"\nwe thank you for the Donation"
                            +"\nName :"+ nameD
                           + "\nDonation amount : " + amountD
                           + "\nmobile Number : " + numberD
                           );

        alert.showAndWait();
            
        }else if("Literary Lounge: Book Club Gathering".equals(selectedDonation)){
            Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Payment Confirmed");
        alert.setContentText("Literary Lounge: Book Club Gathering"
                            +"\nappriciates you Donation"
                            +"\nName :"+ nameD
                           + "\nDonation amount : " + amountD
                           + "\nmobile Number : " + numberD
                           );

        alert.showAndWait();
        }
                
    }

    @FXML
    private void Logoutbott(ActionEvent event) {
    }

    @FXML
    private void ClossAppBot(ActionEvent event) {
    }

    @FXML
    private void MaintainServerBott(ActionEvent event) {
        
        String name,mobileNumber,houseNo,roadNO;
        name = MaintanNameFld.getText();
        mobileNumber =MaintanNumberFld.getText();
        houseNo =MaintanHouserFld.getText();
        roadNO =MaintanHouserFld.getText();
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Service is on the way " +"\nName :"+ name
                           + "\nMobile Number : " + mobileNumber
                           + "\nHouse No : " + houseNo
                           + "\nRoad No : " + roadNO);

        alert.showAndWait();
        OnlinePay.setDisable(false);
    }

    @FXML
    private void PROJECTPDF(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Are you sure you want to perform this action?");
        alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.CANCEL);
        
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                
                PdfGenerator pdfGenerator = new PdfGenerator();
                String content = projectPDfcont.projCOnt;
                String filePath = "D:\\Project.pdf";
                pdfGenerator.generatePDF(content, filePath);
            
            } 
        });
            
        }

    @FXML
    private void onaction1(ActionEvent event) {
             String selectPirYer = picombo.getValue();
        if("2023".equals(selectPirYer)){
            ObservableList<PieChart.Data> piechartMonthlyData= FXCollections.observableArrayList(
                      new PieChart.Data("Housing Expenses:", 43),
                    new PieChart.Data("Utilities: ", 15),
                    new PieChart.Data("Groceries:" , 12),
                    new PieChart.Data( "Healthcare:", 9),
                    new PieChart.Data("Communication:" , 6));
                
       
        piechartMonthlyData.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        piechartres.setData(piechartMonthlyData);
        }else if("2022".equals(selectPirYer)){
            {
            ObservableList<PieChart.Data> piechartMonthlyData1= FXCollections.observableArrayList(
                    new PieChart.Data("Housing Expenses:", 37),
                    new PieChart.Data("Utilities: ", 9),
                    new PieChart.Data("Groceries:" , 8),
                    new PieChart.Data( "Healthcare:", 6),
                    new PieChart.Data("Communication:" , 5));
                    piechartMonthlyData1.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        piechartres.setData(piechartMonthlyData1);
                    }
            
            
        
    }
        else if("2021".equals(selectPirYer)){
            {
            ObservableList<PieChart.Data> piechartMonthlyData2= FXCollections.observableArrayList(
                    new PieChart.Data("Housing Expenses:", 30),
                    new PieChart.Data("Utilities: ", 9),
                    new PieChart.Data("Groceries:" , 9),
                    new PieChart.Data( "Healthcare:", 5),
                    new PieChart.Data("Communication:" , 5));
                    piechartMonthlyData2.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        piechartres.setData(piechartMonthlyData2);
                    }
    }
    else if("2020".equals(selectPirYer)){
            {
            ObservableList<PieChart.Data> piechartMonthlyData3= FXCollections.observableArrayList(
                      new PieChart.Data("Housing Expenses:", 29),
                    new PieChart.Data("Utilities: ", 8),
                    new PieChart.Data("Groceries:" , 7),
                    new PieChart.Data( "Healthcare:", 4),
                    new PieChart.Data("Communication:" , 5));
                    piechartMonthlyData3.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        piechartres.setData(piechartMonthlyData3);
                    }
    }
    }
    @FXML
    private void onaction2(ActionEvent event) {
        String selectedYear = barcombo.getValue();
        initializeStackedBarChart(selectedYear);
    }
    

}
