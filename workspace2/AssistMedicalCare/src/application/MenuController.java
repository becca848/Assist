package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController {

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
	
	@FXML public void initialize() {
		//selectPatientController.getDetails(this);
		setPatient();
	}
	
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

	public void setPatient() {
		Integer nhs = selectPatientController.selectPatient();
		System.out.println("nhs from menu " + nhs);
	}

}
