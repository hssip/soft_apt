package dao.impl;

import dao.*;

import java.sql.*;
import java.util.List;

import bean.Appointment;
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
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		
		return null;
	}

	@Override
	public boolean update_base_info(Stu _stu) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public Appointment select_appointment(Stu _stu, List<String> key, List<String> value) throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean updata_appointment(Stu _stu, Appointment appointment) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean delete_appointment(Stu _stu) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean insert_appointment(Stu _stu) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public List<String> select_free(Stu _stu, List<String> key, List<String> value) throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}
	
}
