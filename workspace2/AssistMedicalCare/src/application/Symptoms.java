package application;

import java.util.Calendar;
import java.util.Date;

import javafx.scene.shape.Rectangle;

public class Symptoms {

	private String symptom;
	
	private Calendar date;
	
	private int NHSnumber;

	public Symptoms(String symptom, Calendar date, int nHSnumber) {
		super();
		this.symptom = symptom;
		this.date = date;
		NHSnumber = nHSnumber;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public int getNHSnumber() {
		return NHSnumber;
	}

	public void setNHSnumber(int nHSnumber) {
		NHSnumber = nHSnumber;
	}
	
	
	
}
