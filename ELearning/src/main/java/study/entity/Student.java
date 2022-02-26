package study.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "student_info_table")
public class Student {
	
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int id;

	@Column(name = "student_fname")
	private String fname;
	
	@Column(name = "student_lname")
	private String lname;
	
	@Column(name = "student_date_of_birth")
	private Date dob;
	
	@Column(name = "student_gender")
	private String gender;
	
	@Column(name = "student_education")
	private String education;
	
	
	@Column(name = "student_mobile_no")
	private String mobileno;
	
	@Column(name = "student_address")
	private String address;
	
	@Column(name = "student_city")
	private String city;

	@Column(name = "student_pincode")
	private int pincode;
	
	@Column(name = "student_username")
	private String username;
	
	@Column(name = "student_password")
	private String password;
	
	@Column(name = "student_prn_no")
	private String prnno;
	
	@Column(columnDefinition = "varchar(255) default 'ROLE_STUDENT'")
	private String role;

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String fname, String lname, Date dob, String gender, String education, String mobileno,
			 String address, String city, int pincode, String username, String password, String prnno) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.gender = gender;
		this.education = education;
		this.mobileno = mobileno;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.username = username;
		this.password = password;
		this.prnno = prnno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrnno() {
		return prnno;
	}

	public void setPrnno(String prnno) {
		this.prnno = prnno;
	}
	
	public String getRole() {
		return role;
	}
	
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
