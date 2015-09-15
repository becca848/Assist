package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class CreateRecordController {

	@FXML
	private TextArea textarea;

	@FXML
	private Button SaveButton;

	@FXML
	private Button CancelButton;

	@FXML
	private void HandleCancelButton() {
		Stage stage = (Stage)textarea.getScene().getWindow();
		stage.close();
	}

	@FXML
	private void HandleSaveButton() {
		Stage stage = (Stage)textarea.getScene().getWindow();
		stage.close();
		String data;
		data = textarea.getText();
		SaveData(data);
		System.out.println("Saved");
	}

	public static void SaveData(String description) {

		String user = "40062952";
		String url = "jdbc:mysql://web2.eeecs.qub.ac.uk/40062952";
		String password = "PHH5849";

		try {

			// get connection to database
			Connection myConn = DriverManager
					.getConnection(url, user, password);

			String insertTableSQL = "INSERT INTO records"
					+ "(NHSNumber, Description, Date, Symptom)"
					+ " values (?, ?, ?, ?)";

			PreparedStatement preparedStatement = myConn
					.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, 400667279);
			preparedStatement.setString(2, description);
			preparedStatement.setTimestamp(3, getCurrentTimeStamp());
			preparedStatement.setString(4, getSymptom());

			// execute insert SQL statement
			preparedStatement.executeUpdate();

			System.out.println("Complete!");

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

	public static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

	public static String getSymptom() {
		String symptom = null;

		String[] symptomArray = new String[20];
		symptomArray[0] = "blood in your stools";
		symptomArray[1] = "Constipation";
		symptomArray[2] = "diarrhoea";
		symptomArray[3] = "abdominal pain";
		symptomArray[4] = "persistent bloating";
		symptomArray[5] = "coughing up blood";
		symptomArray[6] = "blood in your vomit";
		symptomArray[7] = "persistent cough";
		symptomArray[8] = "persistent breathlessness";
		symptomArray[9] = "weight loss";
		symptomArray[10] = "unexplained tiredness";
		symptomArray[11] = "ache or pain when breathing or coughing";
		symptomArray[12] = "loss of appetite";
		symptomArray[13] = "wheezing";
		symptomArray[14] = "swelling of your face or neck";
		symptomArray[15] = "high temperature";
		symptomArray[16] = "difficulty swallowing or pain when swallowing";
		symptomArray[17] = "hoarse voice";
		symptomArray[18] = "persistent chest or shoulder pain";
		symptomArray[19] = "persistent change in bowel habit";

		Random random = new Random();

		for (int i = 0; i < symptomArray.length; i++) {
			int idx = random.nextInt(symptomArray.length);
			symptom = symptomArray[idx];
		}
		System.out.println(symptom);
		return symptom;

	}

}
