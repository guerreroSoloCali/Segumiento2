package ui;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
	ArrayList<Contact> contacts;
	
	public MainController() {
		contacts = new ArrayList<>();
	}

    @FXML
    private Button addBTN;

    @FXML
    private TextArea contacts;

    @FXML
    private Button eliminarBTN;

    @FXML
    private TextField namePer;

    @FXML
    private TextField nameTF;
    
    
    @FXML
    void addContact(ActionEvent event) {
    	System.out.println("addContact");
    	String name = namePer.getText();
    	String phone = nameTF.getText();
    	Contact c = new contact();
    	c.name = name;
    	c.phone = phone;
    	contactsTA.appendText(name + "\n   " + phone + "\n   ");
    }

    @FXML
    void deleteContact(ActionEvent event) {
    	System.out.println("deleteContact");
    }
    
}

