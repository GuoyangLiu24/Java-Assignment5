package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class EmpInfoController {
	   @FXML
	    private Button btnAdd;

	    @FXML
	    private Button btnDispaly;

	    @FXML
	    private Button btnClear;

	    @FXML
	    private Button btnSearch;

	    @FXML
	    private TextField txtId;

	    @FXML
	    private TextField txtName;

	    @FXML
	    private DatePicker txtDate;

	    @FXML
	    private TextField txtSalary;

	    @FXML
	    private TextField txtSearch;

	    @FXML
	    private TextArea txtAreaList;

	    @FXML
	    private Label lblSearchResult;

	    @FXML
	    void AddEmployee(ActionEvent event) {
	    	if(String.valueOf(txtId.getText()).length()!=3) {
	    		lblSearchResult.setText("Please enter 3 digits id number ");
	    		lblSearchResult.setTextFill(Color.web("#ff0000", 0.8));
	    	}else {
	    		lblSearchResult.setText("");
	    		Employee newEmployee=new Employee
	    				(Integer.parseInt(txtId.getText()),txtName.getText(),txtDate.getValue(),Double.parseDouble(txtSalary.getText()));
	    		EmployeeList.addEmployee(newEmployee);
	    		System.out.println("Employee added");
	    	}

	    }

	    @FXML
	    void clearList(ActionEvent event) {
	    	EmployeeList.clearList();
	    	txtAreaList.setText("");

	    }

	    @FXML
	    void displayList(ActionEvent event) {
	    	String text="";
	    	for(Employee emp : EmployeeList.getList()) {
	    		text=text+emp.toString()+"\n";
	    	}
	    	txtAreaList.setText(text);
	    }

	    @FXML
	    void searchList(ActionEvent event) {
	         for(Employee emp:EmployeeList.getList()) {
	        	 if(emp.getName().equals(txtSearch.getText()) || txtSearch.getText().equals(String.format("%03d",emp.getId()))) {
	        		 lblSearchResult.setText("Employee Exits");
	        		 lblSearchResult.setTextFill(Color.web("#000000", 0.8));
	        		 return;
	        	 }else {
	        		 lblSearchResult.setText("Employee does not Exits");
	        		 lblSearchResult.setTextFill(Color.web("#ff0000", 0.8));
	        	 }
	         }
	    }
}
