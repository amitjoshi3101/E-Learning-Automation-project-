package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "coordinator_table")
public class Coordinator {
	

	@Id
	@Column(name = "coordinator_id")
	private int id;
	@Column(name = "coordinator_fname")
	private String fname;
	@Column(name = "coordinator_lname")
	private String lname;
	@Column(name = "coordinator_username")
	private String username;
	@Column(name = "coordinator_password")
	private String password;
	@Column(name = "coordinator_isActive")
	private boolean isActive;
	@Column(columnDefinition = "varchar(255) default 'ROLE_COORDINATOR'")
	private String role;
	
	public Coordinator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coordinator(int id, String fname, String lname, String username, String password, boolean isActive) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.isActive = isActive;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Coordinator [id=" + id + ", fname=" + fname + ", lname=" + lname + ", username=" + username
				+ ", password=" + password + ", isActive=" + isActive + "]";
	}

}
