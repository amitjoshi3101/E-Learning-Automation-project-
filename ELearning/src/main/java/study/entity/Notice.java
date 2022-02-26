package study.entity;


import java.sql.Date;
import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="notice_table")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="notice_id")
	private int id;
	@Column(name="notice_description")
	private String desc;
	@Column(name="notice_date")
	private Date date;
	@Lob
	@Column(name="notice_file")
	private byte [] file;
	@Column(name="notice_data")
	private String noticeData;
	@Column(name="notice_status")
	private String noticeStatus;
	
	
	public Notice(int id, String desc, Date date, byte[] file, String noticeData, String noticeStatus) {
		super();
		this.id = id;
		this.desc = desc;
		this.date = date;
		this.file = file;
		this.noticeData = noticeData;
		this.noticeStatus = noticeStatus;
	}
	
	
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	public String getNoticeData() {
		return noticeData;
	}
	public void setNoticeData(String noticeData) {
		this.noticeData = noticeData;
	}
	public String getNoticeStatus() {
		return noticeStatus;
	}
	public void setNoticeStatus(String noticeStatus) {
		this.noticeStatus = noticeStatus;
	}


	@Override
	public String toString() {
		return "id=" + id + ", desc=" + desc + ", date=" + date + ", file=" + Arrays.toString(file)
				+ ", noticeData=" + noticeData + ", noticeStatus=" + noticeStatus ;
	}
	
	
	
}
