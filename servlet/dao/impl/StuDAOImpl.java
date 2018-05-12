package dao.impl;

import dao.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import bean.Appointment;
import bean.Freetime;
import bean.Stu;
import dbc.*;

public class StuDAOImpl implements StuDAO {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	
	public StuDAOImpl(Connection _conn){
		this.conn=_conn;
	}

	@Override
	public boolean findLogin(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		boolean flag=false;
		String sql="SELECT password from stu_login WHERE id=?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, _stu.getId());
		ResultSet rs=this.pstmt.executeQuery();
		if(rs.next()){
			if(_stu.getPwd().equals(rs.getString(1))){
				flag=true;
			}
		}
		
		return flag;
	}

	@Override
	public Stu find_base_info(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		String sql="SELECT * FROM stu where id=?";
		Stu temp_stu=new Stu();
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, _stu.getId());
		ResultSet rs=this.pstmt.executeQuery();
		while(rs.next()){
			temp_stu.setId(_stu.getId());
			temp_stu.setGroup_number(rs.getString("groupid"));
			temp_stu.setName(rs.getString("name"));
			temp_stu.setSex(rs.getString("sex"));
			temp_stu.setAge(rs.getInt("age"));
			temp_stu.setTel(rs.getString("tel"));
			temp_stu.setLevel(rs.getString("level"));
		}
		return temp_stu;
	}

	@Override
	public boolean update_base_info(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		String sql="UPDATE tel=? FROM stu WHERE id=?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, _stu.getTel());
		this.pstmt.setString(2, _stu.getId());
		int n=this.pstmt.executeUpdate();
		if(n==0){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public boolean insert_appointment(Appointment _appointment) throws Exception {
		// TODO 自动生成的方法存根
		String sql="insert into appointment(id,teacherid,stuid,position,time,state) values(?,?,?,?,?,?)";
		this.pstmt=this.conn.prepareStatement(sql);
		_appointment.setId();
		this.pstmt.setString(1, _appointment.getId());
		this.pstmt.setString(2, _appointment.getTeacher_id());
		this.pstmt.setString(3, _appointment.getStu_id());
		this.pstmt.setString(4, _appointment.getPosition());
		this.pstmt.setString(5, _appointment.getTime());
		this.pstmt.setString(6, _appointment.getState());
		int n=this.pstmt.executeUpdate();
		if(n==0){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public ArrayList<Freetime> select_free(ArrayList<String> key, ArrayList<String> value) throws Exception {
		// TODO 自动生成的方法存根
		ArrayList<Freetime> list = new ArrayList<Freetime>();
		StringBuffer stringBuffer =new StringBuffer("");
		stringBuffer.append(key.get(0)+" = '"+value.get(0)+"'");
		if(key.size()>1)
		{
			for(int i=1;i<key.size();++i)
			{
				stringBuffer.append(" and "+key.get(i)+" = '"+value.get(i)+"'");
			}
		}
		String sql="select * from teacher_free where " + stringBuffer;
		//String sql="select * from teacher_free";// where teacherid = '150720227'";
		//System.out.println(sql);
		this.pstmt=this.conn.prepareStatement(sql);
		ResultSet set=this.pstmt.executeQuery();
		while(set.next())
		{
			Freetime freeTime=new Freetime();
			String teacherId,week_day,free_time,position;
			teacherId=set.getString("teacherid");
			week_day=set.getString("weekday");
			free_time=set.getString("freetime");
			position=set.getString("position");
			freeTime.setTeacher_id(teacherId);
			freeTime.setWeek(week_day);
			//freeTime.setDate(_date);
			freeTime.setFree_time(free_time);
			freeTime.setPosition(position);
			list.add(freeTime);
		}
		return list;
	}
}
