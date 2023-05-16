package collection_ArrayList;

import java.util.ArrayList;
public class Student {
	private String name;
	private int  std;
	private int id;
	private String grade;
	private String gender;
	private String fatherName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int  std) {
		this.std = std;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGender() {
		return gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Student(String name, int std, int id, String grade, String gender, String fatherName) {
		super();
		this.name = name;
		this.std = std;
		this.id = id;
		this.grade = grade;
		this.gender = gender;
		this.fatherName = fatherName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", std=" + std + ", id=" + id + ", grade=" + grade + ", gender=" + gender
				+ ", fatherName=" + fatherName + "]";
	}
	
	

}
