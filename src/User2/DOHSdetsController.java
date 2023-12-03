/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package User2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Abir
 */
public class DOHSdetsController implements Initializable {

    @FXML
    private TextArea dettxtarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        details.setDet("Mirpur DOHS Details:\n" +
"\n" +
"1. Location:\n" +
"   Mirpur DOHS is situated in the Mirpur area of Dhaka, Bangladesh.\n" +
"\n" +
"2. Purpose:\n" +
"   The society was established to provide housing for military officers.\n" +
"\n" +
"3. Residential Facilities:\n" +
"   Mirpur DOHS comprises houses and apartments allocated based on military ranks.\n" +
"\n" +
"4. Amenities:\n" +
"   The society offers parks, playgrounds, community centers, and educational institutions.\n" +
"\n" +
"5. Security:\n" +
"   Mirpur DOHS is a gated community with controlled access for resident safety.\n" +
"\n" +
"6. Community Services:\n" +
"   Healthcare facilities, mosques, markets, and essential services are provided.\n" +
"\n" +
"7. Green Spaces:\n" +
"   The area includes green spaces and landscaping for a pleasant environment.\n" +
"\n" +
"8. Educational Institutions:\n" +
"   Schools and colleges are available for quality education.\n" +
"\n" +
"9. Transportation:\n" +
"   Well-connected with transportation facilities for convenient travel.\n" +
"\n" +
"10. Cultural and Recreational Facilities:\n" +
"    There may be clubs, sports complexes, and cultural centers for community activities.");
        dettxtarea.setText(details.det);
    }    
    
    
}
