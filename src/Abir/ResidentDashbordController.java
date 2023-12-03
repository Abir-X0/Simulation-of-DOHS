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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EventsComboBox.getItems().addAll("Community Clean-Up Crusade", "Wellness Wednesday: Fitness Classes","Literary Lounge: Book Club Gathering");
        setStrings.setProj("Residential Area Development Projects Overview\n" +"1. **Infrastructure Enhancement:**\n" +"2. **Green Spaces and Recreational Facilities:**\n" +"3. **Smart Home Integration:**\n");
        ProjectsTxtArea.setText(setStrings.proj);
        PolicisTXTAREA.setText(setStrings.setProj(""));
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
                String content = "Residential Area Development Projects Overview\n" +
"\n" +
"1. **Infrastructure Enhancement:**\n" +
"   - *Description:* We are currently focused on enhancing the overall infrastructure of the residential area. This includes upgrading roads, sidewalks, and street lighting for improved safety and accessibility.\n" +
"   - *Progress:* Substantial progress has been made, with road resurfacing and sidewalk reconstruction completed in several key sections. Street lighting installation is underway, contributing to a more secure and well-lit environment.\n" +
"\n" +
"2. **Green Spaces and Recreational Facilities:**\n" +
"   - *Description:* Our commitment to creating a sustainable and vibrant community involves the development of green spaces and recreational facilities. These areas aim to promote community interaction and a healthy lifestyle.\n" +
"   - *Progress:* Multiple parks and green spaces are under development, featuring landscaping, seating areas, and play zones for residents of all ages. The construction of a community center is also in progress, offering a space for social events and recreational activities.\n" +
"\n" +
"3. **Smart Home Integration:**\n" +
"   - *Description:* Embracing modern technology, we are integrating smart home solutions into the residential area. This includes intelligent security systems, energy-efficient lighting, and smart waste management to enhance the overall living experience.\n" +
"   - *Progress:* The implementation of smart home features is ongoing, with pilot installations showcasing automated security systems and energy-saving technologies. Residents will soon have the option to adopt these innovations for a more connected and sustainable lifestyle.\n" +
"\n" +
"We are committed to creating a thriving residential community that prioritizes quality of life and sustainability. Stay tuned for further updates as these projects progress towards completion.";
                String filePath = "D:\\Project.pdf";
                pdfGenerator.generatePDF(content, filePath);
            
            } 
        });
            
        }
}
