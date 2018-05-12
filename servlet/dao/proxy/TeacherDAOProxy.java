package dao.proxy;

import java.util.ArrayList;
import java.util.List;

import bean.Appointment;
import bean.Freetime;
import bean.Teacher;
import dao.TeacherDAO;
import dao.impl.*;
import dbc.*;

public class TeacherDAOProxy implements TeacherDAO {

	private DatabaseConnection dbc=null;
	private TeacherDAO dao=null;
	public TeacherDAOProxy(){
		try {
			this.dbc=new DatabaseConnection();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		this.dao=new TeacherDAOImpl(dbc.getConnection());
	}
	
	
	@Override
	public boolean findLogin(Teacher _teacher) throws Exception {
		// TODO �Զ����ɵķ������
		boolean flag=false;
		try{
			flag=this.dao.findLogin(_teacher);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}


	@Override
	public Teacher find_base_info(Teacher _teacher) throws Exception {
		// TODO �Զ����ɵķ������
		Teacher teacher=new Teacher();
		try{
			teacher=this.dao.find_base_info(_teacher);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return teacher;
	}


	@Override
	public boolean update_base_info(Teacher _teacher) throws Exception {
		// TODO �Զ����ɵķ������
		boolean flag=false;
		try{
			flag=this.dao.update_base_info(_teacher);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}


	@Override
	public boolean delete_free(
			ArrayList<String> key, 
			ArrayList<String> value
			) throws Exception {
		// TODO �Զ����ɵķ������
		boolean flag=false;
		try{
			flag=this.dao.delete_free(key, value);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}


	@Override
	public boolean update_free(
			ArrayList<String> old_key, 
			ArrayList<String> old_value, 
			ArrayList<String> up_key,
			ArrayList<String> up_value
			) throws Exception{
		// TODO �Զ����ɵķ������
		boolean flag=false;
		try{
			flag=this.dao.update_free(old_key, old_value, up_key, up_value);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}


	@Override
	public boolean insert_free(Freetime _free) throws Exception {
		// TODO �Զ����ɵķ������
		boolean flag=false;
		try{
			flag=this.dao.insert_free(_free);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}


	@Override
	public ArrayList<Freetime> select_free(ArrayList<String> key, ArrayList<String> value) throws Exception {
		// TODO �Զ����ɵķ������
		ArrayList<Freetime> temp=new ArrayList<Freetime>();
		try{
			temp=this.dao.select_free(key, value);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return temp;
	}

}
