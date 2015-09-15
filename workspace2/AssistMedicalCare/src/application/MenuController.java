package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import application.SelectPatientController;

public class MenuController implements Initializable{

	@FXML
	private Button bellButton;

	@FXML
	private Button CreateNewButton;

	@FXML
	private Button DashBoardView;
	
	@FXML
	private Button Bell;
	
	@FXML
	private Button PastRecordButton;
	
	@FXML
	private Button SelectPatient;
	
	@FXML
	private SelectPatientController selectPatientController;
	
	@FXML
	private void HandleSelectPatient() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(
					"/fmxl/SelectPatient.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@FXML
	private void HandlePastRecordButton() {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(
					"/fmxl/PastRecords.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(root);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setTitle("Files");
		stage.setScene(scene);
		stage.show();
		stage.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void handleCreateNewButton() {

		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(
					"/fmxl/CreateRecord.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(root);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setTitle("Create Record");
		stage.setScene(scene);
		stage.show();
		stage.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Stage stage = (Stage) CreateNewButton.getScene().getWindow();
		//stage.close();
		// set icon of the application

	}
	
	@FXML
	private void HandleDashBoardView() {
		ShowDashBoard();
	}
	
	@FXML 
	private void HandleBellButton(){
		ShowDashBoard();
	}
	
	
	public void ShowDashBoard() {
	Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource(
			"/fmxl/DashBoard.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setTitle("DashBoard");
		primaryStage.setScene(scene);
		primaryStage.showAndWait();
		primaryStage.setResizable(false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public Integer setPatient() {
		Integer nhs = 0;
		nhs = selectPatientController.nhsNo;
		System.out.println("nhs from menu " + nhs);
		return nhs;
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//selectPatientController.getDetails(this);
		setPatient();
		//Integer nhs = 0;
		//nhs = selectPatientController.nhsNo;
		//System.out.println("nhs from menu " + nhs);
	}

}
