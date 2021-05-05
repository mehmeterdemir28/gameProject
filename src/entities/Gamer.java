package entities;

import java.util.Calendar;

public class Gamer {

	private int id;
	private String name;
	private String lastName;
	private Calendar dateTime;
	private String nationalityId;

	public Gamer(int id, String name, String lastName, Calendar dateTime, String nationalityId) {

		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateTime = dateTime;
		this.nationalityId = nationalityId;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getDateTime() {
		return dateTime;
	}

	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
