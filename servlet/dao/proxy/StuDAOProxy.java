package dao.proxy;

import java.util.List;

import bean.Appointment;
import bean.Stu;
import dao.StuDAO;
import dao.impl.*;
import dbc.*;


public class StuDAOProxy implements StuDAO {

	private DatabaseConnection dbc=null;
	private StuDAO dao=null;
	public StuDAOProxy(){
		try {
			this.dbc=new DatabaseConnection();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		this.dao=new StuDAOImpl(dbc.getConnection());
	}
	
	@Override
	public boolean findLogin(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		boolean flag=false;
		try{
			flag=this.dao.findLogin(_stu);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		
		return flag;
	}


	@Override
	public boolean update_base_info(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public Stu find_base_info(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Appointment select_appointment(Stu _stu, List<String> key, List<String> value) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean updata_appointment(Stu _stu, Appointment appointment) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean delete_appointment(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean insert_appointment(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public List<String> select_free(Stu _stu, List<String> key, List<String> value) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

}
