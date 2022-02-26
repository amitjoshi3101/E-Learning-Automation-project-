package study.Pojo;



public class createMeetingPojo {

	
    String topic="Trial_Meeting by api";
	
    int type=2;
	
    String startTime="2022-01-23T23:30:00Z"; 

    int duration=15;
	
    String scheduleFor="jeetugore06@gmail.com";

    String timezone="IN";
	
    String password="test";
	
    String agenda="To chek the create metting works or not";

    
    
	public createMeetingPojo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public createMeetingPojo(String topic, int type, String startTime, int duration, String scheduleFor, String timezone,
			String password, String agenda) {
		super();
		this.topic = topic;
		this.type = type;
		this.startTime = startTime;
		this.duration = duration;
		this.scheduleFor = scheduleFor;
		this.timezone = timezone;
		this.password = password;
		this.agenda = agenda;
	}



	public String getTopic() {
		return topic;
	}



	public void setTopic(String topic) {
		this.topic = topic;
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public String getStartTime() {
		return startTime;
	}



	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public String getScheduleFor() {
		return scheduleFor;
	}



	public void setScheduleFor(String scheduleFor) {
		this.scheduleFor = scheduleFor;
	}



	public String getTimezone() {
		return timezone;
	}



	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAgenda() {
		return agenda;
	}



	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}



	@Override
	public String toString() {
		return "meetingPojo { topic=" + topic + ", type=" + type + ", startTime=" + startTime + ", duration=" + duration
				+ ", scheduleFor=" + scheduleFor + ", timezone=" + timezone + ", password=" + password + ", agenda="
				+ agenda + "}";
	}
	
	
	
	
}
