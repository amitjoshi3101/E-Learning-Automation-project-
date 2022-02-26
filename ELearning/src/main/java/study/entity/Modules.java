package study.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "module_table")
public class Modules {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "module_id")
	private int id;
	
	@Column(name = "module_name")
	private String name;
	
	@Column(name = "module_details")
	private String details;
	
	@Column(name = "module_houres")
	private String houres;

	public Modules() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modules(int id, String name, String details, String houres) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.houres = houres;
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getHoures() {
		return houres;
	}

	public void setHoures(String houres) {
		this.houres = houres;
	}

	@Override
	public String toString() {
		return "Modules [id=" + id + ", name=" + name + ", details=" + details + ", houres=" + houres + "]";
	}
	


	
	
	
}
