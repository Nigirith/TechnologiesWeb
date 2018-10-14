package isep.lab1.bean;
import java.io.Serializable;

public class Person {
	private String firstName;
	private String lastName;
	private String birthDay;
	private String sex;
	
	public Person() {
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthday(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
