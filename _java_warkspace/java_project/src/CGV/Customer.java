package CGV;

import java.util.ArrayList;

public class Customer {

	private String grade;
	private String userPickDate;
	private String userPickMovie;

	public Customer() {
	}

	public Customer(String grade, String userPickDate, String userPickMovie) {

		this.grade = grade;
		this.userPickDate = userPickDate;
		this.userPickMovie = userPickMovie;
	}

	@Override
	public String toString() {
		return "Customer [grade=" + grade + ", userPickDate=" + userPickDate + ", userPickMovie=" + userPickMovie + "]";
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getUserPickDate() {
		return userPickDate;
	}

	public void setUserPickDate(String userPickDate) {
		this.userPickDate = userPickDate;
	}

	public String getUserPickMovie() {
		return userPickMovie;
	}

	public void setUserPickMovie(String userPickMovie) {
		this.userPickMovie = userPickMovie;
	}


}
