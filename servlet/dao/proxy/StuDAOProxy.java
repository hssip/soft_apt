package dao.proxy;

import java.util.ArrayList;
import java.util.List;

import bean.Appointment;
import bean.Freetime;
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
		boolean flag=false;
		try{
			flag=this.dao.update_base_info(_stu);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public Stu find_base_info(Stu _stu) throws Exception {
		// TODO 自动生成的方法存根
		Stu stu=null;
		try{
			stu=this.dao.find_base_info(_stu);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return stu;
	}

	@Override
	public boolean insert_appointment(Appointment _appointment) throws Exception {
		// TODO 自动生成的方法存根
		boolean flag=false;
		try{
			flag=this.dao.insert_appointment(_appointment);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public ArrayList<Freetime> select_free(ArrayList<String> key, ArrayList<String> value) throws Exception {
		// TODO 自动生成的方法存根
		ArrayList<Freetime> a=new ArrayList<Freetime>();
		try{
			a=this.dao.select_free(key, value);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return a;
	}

}
