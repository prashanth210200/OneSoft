package collection_ArrayList;
import java.util.ArrayList;
public class Employee {
	private String name;
	private int id;
	private int salary;
	private String role;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(String name, int id, int salary, String role, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", role=" + role + ", gender=" + gender
				+ "]";
	}
	

}
