package dao.impl;

import java.sql.*;
import java.util.ArrayList;


import bean.Appointment;
import dao.AppointmentDAO;

public class AppointmentDAOImpl implements AppointmentDAO {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	
	public AppointmentDAOImpl(Connection _conn){
		this.conn=_conn;
	}
	
	@Override
	public ArrayList<Appointment> select_appointment(
			ArrayList<String> key, 
			ArrayList<String> value
			) throws Exception {
		// TODO 自动生成的方法存根
		ArrayList<Appointment> list=new ArrayList<Appointment>();
		StringBuffer stringBuffer =new StringBuffer("");
		stringBuffer.append(key.get(0)+" = '"+value.get(0)+"'");
		if(key.size()>1)
		{
			for(int i=1;i<key.size();++i)
			{
				stringBuffer.append(" and "+key.get(i)+" = '"+value.get(i)+"'");
			}
		}
		String sql="select * from appointment where " + stringBuffer;
		this.pstmt=this.conn.prepareStatement(sql);
		ResultSet set=this.pstmt.executeQuery();
		while(set.next())
		{
			Appointment appointment=new Appointment();
			String _id,studentID,teacherID,_position,_time,_state;
			_id=set.getString("id");
			studentID=set.getString("stu_id");
			teacherID=set.getString("teacher_id");
			_position=set.getString("position");
			_time=set.getString("time");
			_state=set.getString("state");
			appointment.setId();
			appointment.setTeacher_id(teacherID);
			appointment.setStu_id(studentID);
			appointment.setPosition(_position);
			appointment.setTime(_time);
			list.add(appointment);
		}
		return list;
	}

	@Override
	public boolean delete_appointment(ArrayList<String> key, ArrayList<String> value) throws Exception {
		// TODO 自动生成的方法存根
		StringBuffer stringBuffer =new StringBuffer("");
		stringBuffer.append(key.get(0)+" = '"+value.get(0)+"'");
		if(key.size()>1)
		{
			for(int i=1;i<key.size();++i)
			{
				stringBuffer.append(" and "+key.get(i)+" = '"+value.get(i)+"'");
			}
		}
		String sql="delete from appointment where " + stringBuffer;
		this.pstmt=this.conn.prepareStatement(sql);
		int n=this.pstmt.executeUpdate();
		if(n==0){
			return false;
		}
		else{
			return true;
		}
	}

}
