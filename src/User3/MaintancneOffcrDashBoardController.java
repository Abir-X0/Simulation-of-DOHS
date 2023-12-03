/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package User3;

import Abir.setStrings;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView<tablew> mainTablaeView;
    @FXML
    private TableColumn<tablew, String> tablemail;
    @FXML
    private TableColumn<tablew, String> tablename;
    @FXML
    private TableColumn<tablew, String> tableNum;
    @FXML
    private TextField emailbertxtfld;
    @FXML
    private TextField namebertxtfld;
    @FXML
    private TextField numbertxtfld;
    
    private ArrayList<tablew>tablist;
    @FXML
    private PieChart piemaint;
    @FXML
    private TextField offtxtfld;
    @FXML
    private TextField hospitaltxtfld;
    @FXML
    private TextField mostxtfld;
    @FXML
    private TextField securtxtfld;
    @FXML
    private TextField electritxtfld;
    @FXML
    private TextArea policiestxtfld;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("src/Util/34.jpg");
        Image image = new Image(file.toURI().toString());
        imageview.setImage(image);
        

       policiestxtfld.setText(polics.prolic);
        
        
        
        
        
        nametxt.setText(user.name);
        emailtxt.setText(user.email);
        numbertxt.setText(user.number);
        adresstxt.setText(user.adress);
        
        
        tablename.setCellValueFactory(new PropertyValueFactory<tablew, String>("name"));
        tablemail.setCellValueFactory(new PropertyValueFactory<tablew, String>("email"));
        tableNum.setCellValueFactory(new PropertyValueFactory<tablew, String>("number"));
        
        mainTablaeView.getItems().addAll(
                    new tablew(
                            "Nihal",
                            "nihal@gmail.com",
                            "018865521"
                    ),
                                    new tablew(
                            "Tithi",
                            "tithi24@gmail.com",
                            "0166235214"
                    ),                    new tablew(
                            "Rifat",
                            "Rifat55@gmail.com",
                            "0166255211"
                    ),                    new tablew(
                            "Trisha",
                            "Trisha12@gmail.com",
                            "0144355212"
                    ),                    new tablew(
                            "Dristty",
                            "Dristty66@gmail.com",
                            "014225215"
                    ),                    new tablew(
                            "Omor",
                            "Omor433@gmail.com",
                            "0133455215"
                    )
        );
        
        
    }

    @FXML
    private void addTable(ActionEvent event) {
        
        tablew newTableData = getEmployeedata();
        mainTablaeView.getItems().add(newTableData);

        
    }

    private tablew getEmployeedata(){
        String name,email,number;
        name=namebertxtfld.getText();
        email=emailbertxtfld.getText();
   
        number=numbertxtfld.getText();
        
        tablew resd = new tablew();
        resd.setName(name);
        resd.setEmail(email);
        resd.setNumber(number);
        return resd;
        
    }
        public void inintValue(ArrayList<tablew>tablist){
        for(tablew res :tablist){
            mainTablaeView.getItems().add(res);
        }
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void makechart(ActionEvent event) {
        int officeValue = Integer.parseInt(offtxtfld.getText());
        int hospitalValue = Integer.parseInt(hospitaltxtfld.getText());
        int mosqueValue = Integer.parseInt(mostxtfld.getText());
        int securityeValue = Integer.parseInt(securtxtfld.getText());
        int electricityValue = Integer.parseInt(electritxtfld.getText());
        

        
                    ObservableList<PieChart.Data> piechartMonthlyData= FXCollections.observableArrayList(
                    new PieChart.Data("DOHS Office", officeValue),
                    new PieChart.Data("DOHS Hospital ", hospitalValue),
                    new PieChart.Data("DOHS Mosque" , mosqueValue),

                    new PieChart.Data("DOHS Security" , securityeValue),

                    new PieChart.Data("DOHS Electricity" , electricityValue)
                
        );
        piechartMonthlyData.forEach(data->data.nameProperty().bind(Bindings.concat(data.getName()," amount ",data.pieValueProperty())));
        
        piemaint.getData().addAll(piechartMonthlyData);
    }
    
}
