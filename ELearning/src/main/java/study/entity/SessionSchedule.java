package study.entity;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "session_schedule_table")
public class SessionSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "session_id")
	private int id;
	
	@Column(name = "session_details")
	private String sDetails;
	
	
	@ManyToOne
    @JoinColumn(name = "faculty_id", referencedColumnName = "faculty_id")
    private Faculty faculty;;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "module_id", referencedColumnName = "module_id")
	private Modules modId;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "zoom_id", referencedColumnName = "zoom_id")
	private ZoomAccount zoomId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "session_date")
	private Date sDate;

	@Column(name = "start_time")
	private int startTime;

	@Column(name = "end_time")
	private int endTime;
	
	@Column(name = "session_status")
	private String sStatus;
	
	@Column(name = "session_feedback")
	private String sFeedback;
	
	@Column(name = "session_attendance")
	private String sAttendance;
	
	@Column(name = "session_enableRecording")
	private boolean enableRecording;
	
	@Column(name = "session_invitation_details")
	private String sInviteDetails;
	
	@Column(name = "session_recording_link")
	private String sRecordLink;

	public SessionSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SessionSchedule(int id, String sDetails, Faculty faculty, Modules modId, ZoomAccount zoomId, Date sDate,
			int startTime, int endTime, String sStatus, String sFeedback, String sAttendance, boolean enableRecording,
			String sInviteDetails, String sRecordLink) {
		super();
		this.id = id;
		this.sDetails = sDetails;
		this.faculty = faculty;
		this.modId = modId;
		this.zoomId = zoomId;
		this.sDate = sDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.sStatus = sStatus;
		this.sFeedback = sFeedback;
		this.sAttendance = sAttendance;
		this.enableRecording = enableRecording;
		this.sInviteDetails = sInviteDetails;
		this.sRecordLink = sRecordLink;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsDetails() {
		return sDetails;
	}

	public void setsDetails(String sDetails) {
		this.sDetails = sDetails;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Modules getModId() {
		return modId;
	}

	public void setModId(Modules modId) {
		this.modId = modId;
	}

	public ZoomAccount getZoomId() {
		return zoomId;
	}

	public void setZoomId(ZoomAccount zoomId) {
		this.zoomId = zoomId;
	}

	public Date getsDate() {
		return sDate;
	}

	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public String getsStatus() {
		return sStatus;
	}

	public void setsStatus(String sStatus) {
		this.sStatus = sStatus;
	}

	public String getsFeedback() {
		return sFeedback;
	}

	public void setsFeedback(String sFeedback) {
		this.sFeedback = sFeedback;
	}

	public String getsAttendance() {
		return sAttendance;
	}

	public void setsAttendance(String sAttendance) {
		this.sAttendance = sAttendance;
	}

	public boolean isEnableRecording() {
		return enableRecording;
	}

	public void setEnableRecording(boolean enableRecording) {
		this.enableRecording = enableRecording;
	}

	public String getsInviteDetails() {
		return sInviteDetails;
	}

	public void setsInviteDetails(String sInviteDetails) {
		this.sInviteDetails = sInviteDetails;
	}

	public String getsRecordLink() {
		return sRecordLink;
	}

	public void setsRecordLink(String sRecordLink) {
		this.sRecordLink = sRecordLink;
	}

	@Override
	public String toString() {
		return "SessionSchedule [id=" + id + ", sDetails=" + sDetails + ", faculty=" + faculty + ", modId=" + modId
				+ ", zoomId=" + zoomId + ", sDate=" + sDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", sStatus=" + sStatus + ", sFeedback=" + sFeedback + ", sAttendance=" + sAttendance
				+ ", enableRecording=" + enableRecording + ", sInviteDetails=" + sInviteDetails + ", sRecordLink="
				+ sRecordLink + "]";
	}

}
