package bean;

import java.util.Calendar;

import bean.*;


public class Appointment {
	//private Stu stu=null;
	//private Teacher teacher
	private String id=null;
	private String stu_id=null;
	private String teacher_id=null;
	private String position=null;
	private String time=null;
	private String state=null;
	
	
	//getter setter
	public void setId() {
		String temp=null;
		Calendar c = Calendar.getInstance();  
		int year = c.get(Calendar.YEAR);  
		int month = c.get(Calendar.MONTH);   
		int date = c.get(Calendar.DATE);    
		int hour = c.get(Calendar.HOUR_OF_DAY);   
		int minute = c.get(Calendar.MINUTE);   
		int second = c.get(Calendar.SECOND); 
		temp=Integer.toString(year)+Integer.toString(month)+Integer.toString(date)+Integer.toString(hour)+Integer.toString(minute)+Integer.toString(second);
		this.id = temp;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public String getStu_id() {
		return stu_id;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public String getPosition() {
		return position;
	}
	public String getTime() {
		return time;
	}
	public String getState() {
		return state;
	}
	

	
	
	
}
