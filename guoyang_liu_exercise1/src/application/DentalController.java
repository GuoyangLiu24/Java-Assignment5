package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class DentalController {
	
	 @FXML
	    private Button btnCalculate;

	    @FXML
	    private TextField txtName;

	    @FXML
	    private TextField txtAddress;

	    @FXML
	    private ChoiceBox<String> chxProvince;
	    @FXML
	    void initialize() {
	    	chxProvince.getItems().addAll("Alberta","Ontario","Quebec");
	    }

	    @FXML
	    private RadioButton rdoSenior;

	    @FXML
	    private ToggleGroup discount;

	    @FXML
	    private RadioButton rdoKids;

	    @FXML
	    private RadioButton rdoAdult;

	    @FXML
	    private CheckBox cekFlossing;

	    @FXML
	    private CheckBox cekFilling;

	    @FXML
	    private CheckBox cekRoot;

	    @FXML
	    private Label lblOutput;

	    static double result=0; 
	    @FXML
	    void getCalculation(ActionEvent event) {
	       if(cekFlossing.isSelected()) {
	    	   result+=20;
	       }
	       if(cekFilling.isSelected()) {
	    	   result+=75;
	       }
	       if(cekRoot.isSelected()) {
	    	   result+=150;
	       }
	       if(rdoSenior.isSelected()) {
	    	   result=result*0.9;
	       }else if(rdoKids.isSelected()) {
	    	   result=result*0.85;
	       }else {
	    	   result=result+0;
	       }
	       if(chxProvince.getValue()=="Alberta") {
	    	   result=result*(1+0.07);
	       }else if(chxProvince.getValue()=="Ontario") {
	    	   result=result*(1+0.13);
	       }else if(chxProvince.getValue()=="Quebec") {
	    	   result=result*(1+0.06);
	       }
	       lblOutput.setText(String.format("%.2f",result));
	       result=0;
	       
	    }


   

    

   
}
