package application;

public class Patient {

	private String surname;

	private String firstname;

	private int Year;

	private int NHSNumber;

	private int streetNumber;

	private String streetName;

	private String postcode;

	private String sex;

	public Patient() {

	}

	/*
	 * INSERT INTO Patient (NHSNumber, Forename, Surname, DOB, StreetNumber,
	 * Address, Postcode, Sex) VALUES (400667279, 'Paul', 'King', 1952, 11,
	 * 'School Road, Lisburn', 'BT27 4BH', 'Male');
	 */

	public Patient(int nHSNumber, String firstname, String surname, int Year,
			int streetNumber, String streetName, String postcode, String sex) {
		super();
		this.surname = surname;
		this.firstname = firstname;
		NHSNumber = nHSNumber;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.postcode = postcode;
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getNHSNumber() {
		return NHSNumber;
	}

	public void setNHSNumber(int nHSNumber) {
		NHSNumber = nHSNumber;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

}
