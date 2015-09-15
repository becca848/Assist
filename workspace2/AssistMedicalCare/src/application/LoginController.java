package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Application {

	@FXML
	private PasswordField password;

	@FXML
	private Button Confirm;

	@FXML
	private TextField username;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource(
					"/fmxl/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add("/style/css/application.css");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	public void Login() {
		String uInput = username.getText();
		String pInput = password.getText();

		String admin = getUser();
		String pass1 = getPass();
		
		if ((uInput.contentEquals("admin")) && (pInput.contentEquals("password"))) {
			ShowMenu();
		} 
		/*
		if ((uInput.contentEquals(admin)) && (pInput.contentEquals(pass1))) {
			ShowMenu();
		} else {
			System.out.println("Failure to login");
		}
		*/
		
		Stage stage = (Stage) Confirm.getScene().getWindow();
		stage.close();
	}

	public void ShowMenu() {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/fmxl/Menu.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getUser() {
		String user = "40062952";
		String url = "jdbc:mysql://web2.eeecs.qub.ac.uk/40062952";
		String password1 = "PHH5849";
		Connection myConn;
		String user1 = null;

		try {
			// get connection to the database
			myConn = DriverManager.getConnection(url, user, password1);

			Statement st = myConn.createStatement();
			String reciveCredentials = "SELECT * FROM doctor";
			ResultSet rs = st.executeQuery(reciveCredentials);
			
			while(rs.next()){
			user1 = rs.getString("Username");
			}

		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return user1;
	}
	
	public String getPass() {
		String user = "40062952";
		String url = "jdbc:mysql://web2.eeecs.qub.ac.uk/40062952";
		String password1 = "PHH5849";
		Connection myConn;
		String pass1 = null;

		try {
			// get connection to the database
			myConn = DriverManager.getConnection(url, user, password1);

			Statement st = myConn.createStatement();
			String reciveCredentials = "SELECT * FROM doctor";
			ResultSet rs = st.executeQuery(reciveCredentials);
			
			while(rs.next()){
			pass1 = rs.getString("Password");
			}

		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return pass1;
	}

}
