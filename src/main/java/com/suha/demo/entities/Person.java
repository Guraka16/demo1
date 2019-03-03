package com.suha.demo.entities;

public class Person {

	private String firstName;
	private String lastName;
	private String city;
	private String country;
	
/*	public Person()
	{
		
	}
*/	
	
	public Person(String firstName, String lastName, String city, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	/*@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", country=" + country
				+ "]";
	}
	*/
}
