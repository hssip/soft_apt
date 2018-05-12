package dao.impl;

import dao.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.Appointment;
import bean.Freetime;
import bean.Stu;
import bean.Teacher;


public class TeacherDAOImpl implements TeacherDAO{
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	
	
	public TeacherDAOImpl(Connection _conn){
		this.conn=_conn;
	}
	
	@Override
	public boolean findLogin(Teacher _teacher) throws Exception {
		// TODO 自动生成的方法存根
		boolean flag=false;
		String sql="SELECT password from teacher_login WHERE id=?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, _teacher.getId());
		ResultSet rs=this.pstmt.executeQuery();
		if(rs.next()){
			if(_teacher.getPwd().equals(rs.getString(1))){
				flag=true;
			}
		}
		
		return flag;
	}

	@Override
	public Teacher find_base_info(Teacher _teacher) throws Exception {
		// TODO 自动生成的方法存根
		Teacher teacher=new Teacher();
		String sql="SELECT * FROM teacher where id=?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, _teacher.getId());
		ResultSet rs=this.pstmt.executeQuery();
		while(rs.next()){
			teacher.setId(_teacher.getId());
			teacher.setDep_number(rs.getString("depid"));
			teacher.setName(rs.getString("name"));
			teacher.setSex(rs.getString("sex"));
			teacher.setAge(rs.getInt("age"));
			teacher.setTel(rs.getString("tel"));
			teacher.setRank(rs.getString("rank"));
		}
		return teacher;
	}

	@Override
	public boolean update_base_info(Teacher _teacher) throws Exception {
		// TODO 自动生成的方法存根
		String sql="UPDATE tel=? FROM teacher WHERE id=?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, _teacher.getTel());
		this.pstmt.setString(2, _teacher.getId());
		int n=this.pstmt.executeUpdate();
		if(n==0){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public boolean delete_free(ArrayList<String> key, ArrayList<String> value) throws Exception {
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
		String sql="delete from teacher_free where " + stringBuffer;
		this.pstmt=this.conn.prepareStatement(sql);
		int n=this.pstmt.executeUpdate();
		if(n==0){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public boolean update_free(
			ArrayList<String> old_key, 
			ArrayList<String> old_value, 
			ArrayList<String> up_key,
			ArrayList<String> up_value)throws Exception{
		// TODO 自动生成的方法存根
		StringBuffer stringBuffer =new StringBuffer("");
		StringBuffer stringBuffer2=new StringBuffer("");
		stringBuffer.append(old_key.get(0)+" = '"+old_value.get(0)+"'");
		stringBuffer2.append(up_key.get(0)+" = '"+up_value.get(0)+"'");
		if(old_key.size()>1)
		{
			for(int i=1;i<old_key.size();++i)
			{
				stringBuffer.append(" and "+old_key.get(i)+" = '"+old_value.get(i)+"'");
			}
		}
		if(up_key.size()>1)
		{
			for(int i=1;i<up_key.size();++i)
			{
				stringBuffer2.append(" , "+up_key.get(i)+" = '"+up_value.get(i)+"'");
			}
		}
		String sql="update teacher_free set "+stringBuffer2+" where " + stringBuffer;
		this.pstmt=this.conn.prepareStatement(sql);
		int n=this.pstmt.executeUpdate();
		if(n==0){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public boolean insert_free(Freetime _free) throws Exception {
		// TODO 自动生成的方法存根
		//boolean flag=false;
		String sql="insert into teacher_free(teacherid,weekday,freeTime,position) values(?,?,?,?)";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, _free.getTeacher_id());
		this.pstmt.setString(2, _free.getWeek());
		this.pstmt.setString(3, _free.getFree_time());
		this.pstmt.setString(4, _free.getPosition());
		int a=this.pstmt.executeUpdate();
		if(a==0){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public ArrayList<Freetime> select_free(
			ArrayList<String> key, 
			ArrayList<String> value
			) throws Exception {
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
		this.pstmt=this.conn.prepareStatement(sql);
		ResultSet set=this.pstmt.executeQuery(sql);
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
