package application;

import java.beans.Visibility;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.lang.reflect.Array;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class DashboardController implements Initializable {

	@FXML
	private Circle ColonCircle;

	@FXML
	private Circle lungCircle;

	@FXML
	private VBox Column;

	@FXML
	private HBox Row1;

	@FXML
	private HBox Row2;

	@FXML
	private HBox Row3;

	@FXML
	private HBox Row4;

	@FXML
	private HBox Dates;

	@FXML
	private Label day;

	@FXML
	private Label month;

	@FXML
	private Label year;

	@FXML
	private Label illness;

	@FXML
	private Label percentage;

	@FXML
	private Label condition;

	@FXML
	private Label illness1;

	@FXML
	private Label percentage1;

	@FXML
	private Label condition1;

	@FXML
	private Label condition2;

	@FXML
	private Label condition3;

	@FXML
	private Label Symptom1;

	@FXML
	private Label Symptom2;

	@FXML
	private Label Symptom3;

	@FXML
	private Label Symptom4;

	@FXML
	private Label Symptom5;

	@FXML
	private Rectangle shape1;

	@FXML
	private Rectangle shape12;

	@FXML
	private Rectangle shape13;

	@FXML
	private Rectangle shape2;

	@FXML
	private Rectangle shape22;

	@FXML
	private Rectangle shape23;

	@FXML
	private Rectangle shape3;

	@FXML
	private Rectangle shape33;

	@FXML
	private Rectangle shape32;

	@FXML
	private Rectangle shape4;

	@FXML
	private Rectangle shape42;

	@FXML
	private Rectangle shape43;

	@FXML
	private Rectangle shape5;

	@FXML
	private Rectangle shape52;

	@FXML
	private Rectangle shape53;

	@FXML
	private Circle circle1;

	@FXML
	private Circle circle2;

	@FXML
	private Circle circle3;

	@FXML
	private Circle circle4;

	@FXML
	private Circle circle5;

	@FXML
	private Circle circle12;

	@FXML
	private Circle circle22;

	@FXML
	private Circle circle32;

	@FXML
	private Circle circle42;

	@FXML
	private Circle circle52;

	@FXML
	private Circle circle13;

	@FXML
	private Circle circle23;

	@FXML
	private Circle circle33;

	@FXML
	private Circle circle43;

	@FXML
	private Circle circle53;

	@FXML
	private Label data;

	@FXML
	private Label data2;

	@FXML
	private Label data3;

	@FXML
	private Label data4;

	@FXML
	private Label data5;

	private Patient p1;

	private Calendar date1;

	private Calendar date2;

	private Calendar date3;

	private Calendar date4;

	private Calendar date5;

	private Calendar date6;

	private Calendar date7;

	private Calendar date8;

	private Calendar date9;

	private Calendar date10;

	private Calendar date11;

	private Calendar date12;

	private Calendar date13;

	private Calendar date14;

	private Calendar date15;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		String cCancer = "Colorectal Cancer";
		String lCancer = "Lung cancer";

		// checkLenght();

		date1 = new GregorianCalendar(2013, 02, 01);
		date2 = new GregorianCalendar(2013, 05, 05);
		date3 = new GregorianCalendar(2015, 06, 07);
		date4 = new GregorianCalendar(2014, 07, 14);
		date5 = new GregorianCalendar();
		date6 = new GregorianCalendar();
		date7 = new GregorianCalendar(2014, 01, 01);
		date8 = new GregorianCalendar(2015, 04, 12);
		date9 = new GregorianCalendar();
		date10 = new GregorianCalendar(2014, 07, 23);
		date11 = new GregorianCalendar(2015, 03, 23);
		date12 = new GregorianCalendar();
		date13 = new GregorianCalendar(2015, 01, 01);
		date14 = new GregorianCalendar(2015, 06, 20);
		date15 = new GregorianCalendar(2015, 07, 27);

		/*
		 * ArrayList<Rectangle> rec1 = new ArrayList<Rectangle>();
		 * rec1.add(shape1); rec1.add(shape12); rec1.add(shape13);
		 * rec1.add(shape2); rec1.add(shape22); rec1.add(shape23);
		 * rec1.add(shape3); rec1.add(shape32); rec1.add(shape33);
		 * rec1.add(shape4); rec1.add(shape42); rec1.add(shape43);
		 * rec1.add(shape5); rec1.add(shape52); rec1.add(shape53);
		 * 
		 * //Symptom array of dates ArrayList<Calendar> symptom = new
		 * ArrayList<Calendar>(); symptom.add(date1); symptom.add(date2);
		 * symptom.add(date3);
		 * 
		 * Object[] elements = rec1.toArray();
		 * 
		 * 
		 * for (int i = 0; i<elements.length; i++){ Rectangle r = new
		 * Rectangle(); r.setWidth(55.0);
		 * 
		 * }
		 */

		p1 = new Patient(400667279, "Paul", "King", 1952, 11,
				"School Road, Lisburn", "BT27 4BH", "Male");

		// Dates of symptoms - Label
		data.setText(null);
		data2.setText(null);
		data3.setText(null);
		data4.setText(null);
		data5.setText(null);

		// Names of symptoms - Label
		Symptom1.setText("Change in bowel habit");
		Symptom2.setText("Blood in the stools");
		Symptom3.setText("Weight loss");
		Symptom4.setText("Abdominal pain");
		Symptom5.setText("Persistent cough");

		double day1 = getDays(date1);
		double day2 = getDays(date2);
		double day3 = getDays(date3);
		double day4 = getDays(date4);
		double day5 = getDays(date5);
		double day6 = getDays(date6);
		double day7 = getDays(date7);
		double day8 = getDays(date8);
		double day9 = getDays(date9);
		double day10 = getDays(date10);
		double day11 = getDays(date11);
		double day12 = getDays(date12);
		double day13 = getDays(date13);
		double day14 = getDays(date14);
		double day15 = getDays(date15);

		double maxWidth = 524.0;
		Boolean flag = false;
		double biggest = 0;
		double all = day1 + day2 + day3 + day4 + day5 + day6 + day7 + day8
				+ day9 + day10 + day11 + day12 + day13 + day14 + day15;

		for (double i = all; flag == false; i--) {
			if ((i == day1) || (i == day2) || (i == day3) || (i == day4)
					|| (i == day5) || (i == day6) || (i == day7) || (i == day8)
					|| (i == day9) || (i == day10) || (i == day11)
					|| (i == day12) || (i == day13) || (i == day14)
					|| (i == day15)) {
				flag = true;
				biggest = i;
			} else {
				flag = false;
			}
		}

		// System.out.println(biggest);
		double Onepercent = maxWidth / biggest;

		shape1.setWidth(Onepercent * day1);
		shape12.setWidth(Onepercent * day2);
		shape13.setWidth(Onepercent * day3);
		shape2.setWidth(Onepercent * day4);
		shape22.setWidth(Onepercent * day5);
		shape23.setWidth(Onepercent * day6);
		shape3.setWidth(Onepercent * day7);
		shape32.setWidth(Onepercent * day8);
		shape33.setWidth(Onepercent * day9);
		shape4.setWidth(Onepercent * day10);
		shape42.setWidth(Onepercent * day11);
		shape43.setWidth(Onepercent * day12);
		shape5.setWidth(Onepercent * day13);
		shape52.setWidth(Onepercent * day14);
		shape53.setWidth(Onepercent * day15);

		checkVisible(circle1, shape1);
		checkVisible(circle2, shape2);
		checkVisible(circle3, shape3);
		checkVisible(circle4, shape4);
		checkVisible(circle5, shape5);
		checkVisible(circle12, shape12);
		checkVisible(circle22, shape22);
		checkVisible(circle32, shape32);
		checkVisible(circle42, shape42);
		checkVisible(circle52, shape52);
		checkVisible(circle13, shape13);
		checkVisible(circle23, shape23);
		checkVisible(circle33, shape33);
		checkVisible(circle43, shape43);
		checkVisible(circle53, shape53);

		circle1.setOnMouseEntered(e -> getInfo(Symptom1.getText(), circle1,
				date1, data));
		circle12.setOnMouseEntered(e -> getInfo(Symptom1.getText(), circle12,
				date2, data));
		circle13.setOnMouseEntered(e -> getInfo(Symptom1.getText(), circle13,
				date3, data));
		circle2.setOnMouseEntered(e -> getInfo(Symptom2.getText(), circle2,
				date4, data2));
		circle22.setOnMouseEntered(e -> getInfo(Symptom2.getText(), circle22,
				date5, data2));
		circle23.setOnMouseEntered(e -> getInfo(Symptom2.getText(), circle23,
				date6, data2));
		circle3.setOnMouseEntered(e -> getInfo(Symptom3.getText(), circle3,
				date7, data3));
		circle32.setOnMouseEntered(e -> getInfo(Symptom3.getText(), circle32,
				date8, data3));
		circle33.setOnMouseEntered(e -> getInfo(Symptom3.getText(), circle33,
				date9, data3));
		circle4.setOnMouseEntered(e -> getInfo(Symptom4.getText(), circle4,
				date10, data4));
		circle42.setOnMouseEntered(e -> getInfo(Symptom4.getText(), circle42,
				date11, data4));
		circle43.setOnMouseEntered(e -> getInfo(Symptom4.getText(), circle43,
				date12, data4));
		circle5.setOnMouseEntered(e -> getInfo(Symptom5.getText(), circle5,
				date13, data5));
		circle52.setOnMouseEntered(e -> getInfo(Symptom5.getText(), circle52,
				date14, data5));
		circle53.setOnMouseEntered(e -> getInfo(Symptom5.getText(), circle53,
				date15, data5));

		circle1.setOnMouseExited(e -> Exit(circle1, data));
		circle2.setOnMouseExited(e -> Exit(circle2, data2));
		circle3.setOnMouseExited(e -> Exit(circle3, data3));
		circle4.setOnMouseExited(e -> Exit(circle4, data4));
		circle5.setOnMouseExited(e -> Exit(circle5, data5));
		circle12.setOnMouseExited(e -> Exit(circle12, data));
		circle22.setOnMouseExited(e -> Exit(circle22, data2));
		circle32.setOnMouseExited(e -> Exit(circle32, data3));
		circle42.setOnMouseExited(e -> Exit(circle42, data4));
		circle52.setOnMouseExited(e -> Exit(circle52, data5));
		circle13.setOnMouseExited(e -> Exit(circle13, data));
		circle23.setOnMouseExited(e -> Exit(circle23, data2));
		circle33.setOnMouseExited(e -> Exit(circle33, data3));
		circle43.setOnMouseExited(e -> Exit(circle43, data4));
		circle53.setOnMouseExited(e -> Exit(circle53, data5));

		// DateTableView.setItems(SetDates());

		double percentageC1 = checkForColorectal(Symptom1, shape1);
		double percentageC2 = checkForColorectal(Symptom1, shape12);
		double percentageC3 = checkForColorectal(Symptom1, shape13);
		double percentageC4 = checkForColorectal(Symptom2, shape2);
		double percentageC5 = checkForColorectal(Symptom2, shape22);
		double percentageC6 = checkForColorectal(Symptom2, shape23);
		double percentageC7 = checkForColorectal(Symptom3, shape3);
		double percentageC8 = checkForColorectal(Symptom3, shape32);
		double percentageC9 = checkForColorectal(Symptom3, shape33);
		double percentageC10 = checkForColorectal(Symptom4, shape4);
		double percentageC11 = checkForColorectal(Symptom4, shape42);
		double percentageC12 = checkForColorectal(Symptom4, shape43);
		double percentageC13 = checkForColorectal(Symptom5, shape5);
		double percentageC14 = checkForColorectal(Symptom5, shape52);
		double percentageC15 = checkForColorectal(Symptom5, shape53);

		double TotalC = percentageC1 + percentageC2 + percentageC3
				+ percentageC4 + percentageC5 + percentageC6 + percentageC7
				+ percentageC8 + percentageC9 + percentageC10 + percentageC11
				+ percentageC12 + percentageC13 + percentageC14 + percentageC15;
		System.out.println(TotalC + " IS the totalC");

		double percentageL1 = checkForLungCancer(Symptom1, shape1);
		double percentageL2 = checkForLungCancer(Symptom1, shape12);
		double percentageL3 = checkForLungCancer(Symptom1, shape13);
		double percentageL4 = checkForLungCancer(Symptom2, shape2);
		double percentageL5 = checkForLungCancer(Symptom2, shape22);
		double percentageL6 = checkForLungCancer(Symptom2, shape23);
		double percentageL7 = checkForLungCancer(Symptom3, shape3);
		double percentageL8 = checkForLungCancer(Symptom3, shape32);
		double percentageL9 = checkForLungCancer(Symptom3, shape33);
		double percentageL10 = checkForLungCancer(Symptom4, shape4);
		double percentageL11 = checkForLungCancer(Symptom4, shape42);
		double percentageL12 = checkForLungCancer(Symptom4, shape43);
		double percentageL13 = checkForLungCancer(Symptom5, shape5);
		double percentageL14 = checkForLungCancer(Symptom5, shape52);
		double percentageL15 = checkForLungCancer(Symptom5, shape53);

		double TotalL = percentageL1 + percentageL2 + percentageL3
				+ percentageL4 + percentageL5 + percentageL6 + percentageL7
				+ percentageL8 + percentageL9 + percentageL10 + percentageL11
				+ percentageL12 + percentageL13 + percentageL14 + percentageL15;

		double onepercentC = 6.66;
		double onepercentL = 7.44;

		ColonCircle.setScaleX(circleScale(TotalC, onepercentC));
		ColonCircle.setScaleY(circleScale(TotalC, onepercentC));

		lungCircle.setScaleX(circleScale(TotalL, onepercentL));
		lungCircle.setScaleY(circleScale(TotalL, onepercentL));

		getColour(ColonCircle);
		getColour(lungCircle);

		illness.setText(cCancer);
		illness1.setText(lCancer);
		percentage.setText(getPercent(TotalC, onepercentC));
		percentage1.setText(getPercent(TotalL, onepercentL));

		condition.setVisible(false);
		condition1.setVisible(false);
		condition2.setVisible(false);
		condition.setText(Symptom1.getText());
		condition1.setText(Symptom2.getText());
		condition2.setText(Symptom4.getText());

		ColonCircle.setOnMouseEntered(e -> showIllness(condition, condition1,
				condition2));
		// lungCircle.setOnMouseEntered(e -> showIllness(condition1));

		checkLenght();

		// day.setText(displayDate());
		// month.setText(null);
		// year.setText(null);
	}

	public String displayDate() {
		String dates = null;

		String d1 = checksDays(date1);
		String d2 = checksDays(date2);
		String d3 = checksDays(date3);
		String d4 = checksDays(date4);
		String d5 = checksDays(date5);
		String d6 = checksDays(date6);
		String d7 = checksDays(date7);
		String d8 = checksDays(date8);
		String d9 = checksDays(date9);
		String d10 = checksDays(date10);
		String d11 = checksDays(date11);
		String d12 = checksDays(date12);
		String d13 = checksDays(date13);
		String d14 = checksDays(date14);
		String d15 = checksDays(date15);

		return dates = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11
				+ d12 + d13 + d14 + d15;

	}

	/**
	 * Checks how to long ago a date was to determine how to display dates
	 */

	public void checkLenght() {

		// declaring vars integers, Strings, dates and formatter
		int lenght = (int) checkBiggest();
		int year1 = 0;
		int year2 = 0;
		int month1 = 0;
		int month2 = 0;
		int day1 = 0;
		int day2 = 0;
		String year = null;
		String month = null;
		String day = null;
		String todayYear = null;
		String todayMonth = null;
		String todayDay = null;
		String displayYear = null;
		String displayMonth = null;
		String displayDay = null;
		Calendar LongestDate = new GregorianCalendar().getInstance();
		Calendar today = new GregorianCalendar();
		LongestDate.add(Calendar.DATE, -lenght);
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat yearf = new SimpleDateFormat("YYYY");
		SimpleDateFormat monthf = new SimpleDateFormat("MMM");
		SimpleDateFormat dayf = new SimpleDateFormat("EEEE");
		ArrayList<String> yearArray = new ArrayList<String>();
		ArrayList<String> monthArray = new ArrayList<String>();
		ArrayList<String> dayArray = new ArrayList<String>();
		String tempString = " ";
		String space = " ";
		int n = 0;

		// initializing vars
		year1 = LongestDate.get(Calendar.YEAR);
		year2 = today.get(Calendar.YEAR);
		month1 = LongestDate.get(Calendar.MONTH);
		month2 = today.get(Calendar.MONTH);
		day1 = LongestDate.get(Calendar.DAY_OF_MONTH);
		day2 = today.get(Calendar.DAY_OF_MONTH);
		year = yearf.format(LongestDate.getTime());
		month = monthf.format(LongestDate.getTime());
		day = dayf.format(LongestDate.getTime());
		todayYear = yearf.format(today.getTime());


		// checks if the date was a year, month or days ago
		if (year2 > year1) {
			/*
			 * while loop that checks how many years are inthe timeline and adds
			 * each year to the array
			 */
			while (year1 <= year2) {
				year = Integer.toString(year1);
				yearArray.add(year);
				year1++;
			}

			// for loop to determine how the years will be spaced
			int arraySize = yearArray.size();
			n = 150 / arraySize;
			for (int n1 = 0; n1 <= n; n1++) {
				space += " ";
			}
			space = (String) space.subSequence(0, space.length() - 1);

			// for loop to format the arrayList
			for (String i : yearArray) {
				tempString += i + space;
			}
			tempString = (String) tempString.subSequence(0, tempString.length()
					- n);
			displayYear = tempString;

			// sets the year label
			this.year.setText(displayYear);
			// sets the month label
			this.month.setText(null);
			// sets the day label
			this.day.setText(null);
		}

		if ((month1 < month2) && (year1 == year2)) {
			// while loop to find out how many months
			while (month1 <= month2) {
				month = Integer.toString(month1);
				monthArray.add(month);
				month1++;
			}

			// for loop to determine how the months will be spaced
			int arraySize = monthArray.size();
			n = 150 / arraySize;
			for (int n1 = 0; n1 <= n; n1++) {
				space += " ";
			}
			space = (String) space.subSequence(0, space.length() - 1);

			// for loop to format the arrayList
			for (String i : monthArray) {
				tempString += i + space;
			}
			tempString = (String) tempString.subSequence(0, tempString.length()
					- n);

			displayMonth = tempString;
			// sets the year label
			this.year.setText(year);

			this.month.setText(displayMonth);

			this.day.setText("");

		}
		if ((day1 < day2) && (month1 == month2) && (year1 == year2)) {
			// finds out how many days
			while (day1 <= day2) {
				day = Integer.toString(day1);
				dayArray.add(day);
				day1++;
			}

			// for loop to determine how the months will be spaced
			int arraySize = dayArray.size();
			n = 150 / arraySize;
			for (int n1 = 0; n1 <= n; n1++) {
				space += " ";
			}
			space = (String) space.subSequence(0, space.length() - 1);

			// for loop to format the arrayList
			for (String i : dayArray) {
				tempString += i + space;
			}
			tempString = (String) tempString.subSequence(0, tempString.length()
					- n);

			displayDay = tempString;
			// sets the year label
			this.year.setText(year);

			// sets the month label
			this.month.setText(month);

			// sets the day label
			this.day.setText(day);

		}
	}

	public double checkBiggest() {

		double day1 = getDays(date1);
		double day2 = getDays(date2);
		double day3 = getDays(date3);
		double day4 = getDays(date4);
		double day5 = getDays(date5);
		double day6 = getDays(date6);
		double day7 = getDays(date7);
		double day8 = getDays(date8);
		double day9 = getDays(date9);
		double day10 = getDays(date10);
		double day11 = getDays(date11);
		double day12 = getDays(date12);
		double day13 = getDays(date13);
		double day14 = getDays(date14);
		double day15 = getDays(date15);

		Boolean flag = false;
		double biggest = 0;
		double all = day1 + day2 + day3 + day4 + day5 + day6 + day7 + day8
				+ day9 + day10 + day11 + day12 + day13 + day14 + day15;

		for (double i = all; flag == false; i--) {
			if ((i == day1) || (i == day2) || (i == day3) || (i == day4)
					|| (i == day5) || (i == day6) || (i == day7) || (i == day8)
					|| (i == day9) || (i == day10) || (i == day11)
					|| (i == day12) || (i == day13) || (i == day14)
					|| (i == day15)) {
				flag = true;
				biggest = i;
			} else {
				flag = false;
			}
		}
		return biggest;

	}

	public String checksDays(Calendar date) {
		Calendar today = new GregorianCalendar();
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/YYYY");
		String dates = null;
		if (date.before(today)) {
			dates = fd.format(date.getTime()) + " | ";
			System.out.println(dates);
		} else {
			dates = null;
		}
		return dates;
	}

	private String getPercent(double totalC, double onepercentC) {
		Integer percent = (int) (totalC / onepercentC);
		String text = percent + "%";
		return text;
	}

	public void showIllness(Label Condition, Label Condition1, Label Condition2) {

		Condition.setVisible(true);
		Condition1.setVisible(true);
		Condition2.setVisible(true);

	}

	public void checkVisible(Circle circle, Rectangle shape) {
		if (shape.getWidth() == 0) {
			circle.setVisible(false);
		}
	}

	public void getColour(Circle circle) {
		circle.setFill(Color.MEDIUMSEAGREEN);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(0.10);
		if (circle.getScaleX() >= 27) {
			circle.setFill(Color.INDIANRED);
			circle.setStroke(Color.BLACK);
			circle.setStrokeWidth(0.05);
		}
	}

	private double checkForColorectal(Label symptom, Rectangle r) {
		double percentage = 0;
	
		if (r.getWidth() >= 0) {
			if (symptom.getText().contentEquals("Change in bowel habit")) {
				percentage = 10 + getAgeC() + getGenderC();
			}
			if (symptom.getText().contentEquals("Blood in the stools")) {
				percentage = 10 + getAgeC() + getGenderC();
			}
			if (symptom.getText().contentEquals("Abdominal pain")) {
				percentage = 10 + getAgeC() + getGenderC();
			}
		}
		return percentage;
	}

	public double getGenderC() {

		double total = 0;

		if (p1.getSex().contains("Male")) {
			total = 11;
		}
		return total;
	}

	public double getGenderL() {
		double total = 0;

		if (p1.getSex().contains("Male")) {
			total = 24;
		}
		return total;
	}

	public double getAgeC() {
		double ageGroup = 0;
		double age = 2015 - p1.getYear();

		if (age >= 40 && age <= 49) {
			double percentageAge40 = 4;
			ageGroup = percentageAge40;
		}
		if (age >= 50 && age <= 59) {
			double percentageAge50 = 8;
			ageGroup = percentageAge50;
		}
		if (age >= 60 && age <= 69) {
			double percentageAge60 = 24;
			ageGroup = percentageAge60;
			System.out.println(ageGroup);
		}
		if (age >= 70 && age <= 79) {
			double percentageAge70 = 40;
			ageGroup = percentageAge70;
		}
		if (age >= 80) {
			double percentageAge80 = 24;
			ageGroup = percentageAge80;
		}
		return ageGroup;
	}

	public double getAgeL() {
		double ageGroup = 0;
		double age = 2015 - p1.getYear();

		if (age >= 40 && age <= 49) {
			int percentageAge40 = 4;
			ageGroup = percentageAge40;
		}
		if (age >= 50 && age <= 59) {
			int percentageAge50 = 16;
			ageGroup = percentageAge50;
		}
		if (age >= 60 && age <= 69) {
			int percentageAge60 = 27;
			ageGroup = percentageAge60;
		}
		if (age >= 70 && age <= 79) {
			int percentageAge70 = 32;
			ageGroup = percentageAge70;
		}
		if (age >= 80) {
			int percentageAge80 = 21;
			ageGroup = percentageAge80;
		}
		return ageGroup;
	}

	private double checkForLungCancer(Label symptom, Rectangle r) {
		double percentage = 0;

		if (r.getWidth() >= 0) {
			if (symptom.getText().contentEquals("Persistent cough")) {
				percentage = 10 + getAgeL() + getGenderL();
			}
			if (symptom.getText().contentEquals("Persistent tiredness")) {
				percentage = 10 + getAgeL() + getGenderL();
			}
			if (symptom.getText().contentEquals("Coughing up blood")) {
				percentage = 10 + getAgeL() + getGenderL();
			}
			if (symptom.getText().contentEquals("Persistent breathlessness")) {
				percentage = 10 + getAgeL() + getGenderL();
			}
		}
		return percentage;
	}

	private void getInfo(String Symptom, Circle circle, Calendar date,
			Label label) {
		circle.setFill(Color.BLUE);
		circle.setScaleX(4.0);
		circle.setScaleY(4.0);

		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/YYYY");
		label.setText(fd.format(date.getTime()));
	}

	private void Exit(Circle circle52, Label label) {
		label.setText(null);
		circle52.setFill(Color.BLACK);
		circle52.setScaleX(1.0);
		circle52.setScaleY(1.0);
	}

	/**
	 * Coverts date into a double
	 * 
	 * @param date
	 * @return
	 */
	public double getDays(Calendar date) {
		Date date1 = new Date();
		double day;
		Calendar cal2 = new GregorianCalendar();
		cal2.setTime(date1);
		day = daysBetween(date.getTime(), cal2.getTime());
		return day;
	}

	public static int daysBetween(java.util.Date date, java.util.Date date2) {
		return (int) ((date2.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
	}

	public double circleScale(double lenght, double onePercent) {
		double min = 0.54;
		double percent = lenght / onePercent;
		double scale = min * percent;
		return scale;
	}

}
