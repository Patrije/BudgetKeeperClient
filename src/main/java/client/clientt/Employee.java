package client.clientt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Employee {

	private Long id;
	private String name;
	private String surname;
	private String nickname;
	private String password;
	private String position;
	private double income;
	private double expenditure;
	
	
	public Employee() {
		super();
	}
	

	public Employee(Long id, String name, String surname, String nickname, String password, String position,
			double income, double expenditure) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
		this.password = password;
		this.position = position;
		this.income = income;
		this.expenditure = expenditure;
	}
	
	public Employee(String name, String surname, String nickname, String password, String position,
			double income, double expenditure) {
		super();
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
		this.password = password;
		this.position = position;
		this.income = income;
		this.expenditure = expenditure;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getExpenditure() {
		return expenditure;
	}
	public void setExpenditure(double expenditure) {
		this.expenditure = expenditure;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", nickname=" + nickname
				+ ", password=" + password + ", position=" + position + ", income=" + income + ", expenditure="
				+ expenditure + "]";
	}
	
}
