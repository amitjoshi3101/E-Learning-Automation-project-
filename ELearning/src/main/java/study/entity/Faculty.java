package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "faculty_info_table")
public class Faculty {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "faculty_id")
	private int id;

	@Column(name = "faculty_fname")
	private String fname;
	
	@Column(name = "faculty_lname")
	private String lname;
	
	@Column(name = "faculty_education")
	private String education;
	
	@Column(name = "faculty_mobile_no")
	private String mobileno;
	
	@Column(name = "faculty_address")
	private String address;
	
	@Column(name = "faculty_city")
	private String city;

	@Column(name = "faculty_pincode")
	private int pincode;
	
	@Column(name = "faculty_username")
	private String username;
	
	@Column(name = "faculty_password")
	private String password;
	
	@Column(name = "faculty_experience_in_years")
	private int experience;
	
	@Column(columnDefinition = "varchar(255) default 'ROLE_FACULTY'")
	private String role;

	public Faculty() {
		super();

	}
	
	public Faculty(int id, String fname, String lname, String education, String mobileno, String address,
			String city, int pincode, String username, String password, int experience) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.education = education;
		this.mobileno = mobileno;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.username = username;
		this.password = password;
		this.experience = experience;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}


