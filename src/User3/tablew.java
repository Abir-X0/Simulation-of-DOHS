/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User3;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Abir
 */
public class tablew {

    public String getName() {
        return this.name.getValue();
    }

    public String getEmail() {
        return this.email.getValue();
    }

    public String getNumber() {
        return this.number.getValue();
    }



    public tablew() {
        this.name = new SimpleStringProperty(this,"name");
        this.email = new SimpleStringProperty(this,"email");
        this.number = new SimpleStringProperty(this,"number");

    }
    
       public tablew(String name, String email, String number) {
        this.name = new SimpleStringProperty(this,"name");
        this.name.setValue(name);
        
        this.email = new SimpleStringProperty(this,"email");
        this.email.setValue(email);
        
        this.number = new SimpleStringProperty(this,"number");
        this.number.setValue(number);

    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public void setEmail(String email) {
        this.email.setValue(email);
    }

    public void setNumber(String number) {
        this.number.setValue(number);
    }

    private  SimpleStringProperty name ;
    private  SimpleStringProperty email ;
    private  SimpleStringProperty number ;

    
}
