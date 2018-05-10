package dao.impl;

import dao.*;
import java.sql.*;
import java.util.List;

import bean.Appointment;
import bean.Teacher;


public class TeacherDAOImpl implements TeacherDAO{
	private Connection conn;
	
	
	public TeacherDAOImpl(Connection _conn){
		this.conn=_conn;
	}
	
	@Override
	public boolean findLogin(Teacher _teacher) throws Exception {
		// TODO 自动生成的方法存根
		return true;
	}

	@Override
	public Teacher find_base_info(Teacher _teacher) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean update_base_info(Teacher _teacher) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}


	@Override
	public Appointment select_appointment(Teacher _teacher, List<String> key, List<String> value, int result_count,
			int key_count) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean insert_appointment(Teacher _teacher, Appointment appointment) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean delete_appointment(Teacher _teacher, List<String> key, List<String> value) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean update_appointment(Teacher _teacher, List<String> old_key, List<String> old_value,
			List<String> up_key, List<String> up_value) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean delete_free(Teacher _teacher, List<String> key, List<String> value, int n) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean update_free(Teacher _teacher, List<String> old_key, List<String> old_value, List<String> up_key,
			List<String> up_value, int n) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean insert_free(Teacher _teacher, String reacord) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public List<String> select_free(Teacher _teacher, List<String> key, List<String> value) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

}
