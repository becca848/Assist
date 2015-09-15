package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class PastRecordController {
	
	private static TableView table;
	private static ObservableList<ObservableList> Data;

	public static void getDocument() {

		Data = FXCollections.observableArrayList();

		String user = "40062952";
		String url = "jdbc:mysql://web2.eeecs.qub.ac.uk/40062952";
		String password = "PHH5849";
		Connection myConn;

		try {
			// get connection to database
			myConn = DriverManager.getConnection(url, user, password);

			Statement st = myConn.createStatement();
			String reciveMedicalRecords = "SELECT * FROM records";
			ResultSet rs = st.executeQuery(reciveMedicalRecords);

			String status;
			if (!rs.next()) {
				status = "ERROR";
			} else {
				status = "SUCCESS";
			}
			System.out.println(status + "Past DocumentT");

			for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
				final int j = i;
				TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
				col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
					public ObservableValue<String> call(
							CellDataFeatures<ObservableList, String> param) {
						return new SimpleStringProperty(param.getValue().get(j)
								.toString());
					}
				});

				table.getColumns().addAll(col);
			} 

			while (rs.next()) {
				ObservableList<String> row = FXCollections
						.observableArrayList();

				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					row.add(rs.getString(i));
					System.out.println(i);
				}
				// System.out.println(row);
				Data.add(row);
				System.out.println("Data added");
			}

			System.out.println("Complete!");
			table.setItems(Data);

		} catch (Exception exc) {
			exc.printStackTrace();
			System.out.println("Err...");
		}

	}
}
