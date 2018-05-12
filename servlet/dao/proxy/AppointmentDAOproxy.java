package dao.proxy;

import java.util.ArrayList;

import bean.Appointment;
import dao.AppointmentDAO;
import dao.impl.AppointmentDAOImpl;
import dbc.DatabaseConnection;

public class AppointmentDAOproxy implements AppointmentDAO {
	
	private DatabaseConnection dbc=null;
	private AppointmentDAOImpl dao=null;
	public AppointmentDAOproxy(){
		try {
			this.dbc=new DatabaseConnection();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		this.dao=new AppointmentDAOImpl(dbc.getConnection());
	}
	
	@Override
	public ArrayList<Appointment> select_appointment(ArrayList<String> key, ArrayList<String> value) throws Exception {
		// TODO 自动生成的方法存根
		//boolean flag=false;
		ArrayList<Appointment> temp=new ArrayList<Appointment>();
		try{
			temp=this.dao.select_appointment(key, value);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return temp;
	}

	@Override
	public boolean delete_appointment(ArrayList<String> key, ArrayList<String> value) throws Exception {
		// TODO 自动生成的方法存根
		boolean flag=false;
		try{
			flag=this.dao.delete_appointment(key, value);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

}
