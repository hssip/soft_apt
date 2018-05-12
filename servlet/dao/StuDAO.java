package dao;

import java.util.ArrayList;
import java.util.List;

import bean.*;

public interface StuDAO {
	public boolean findLogin(Stu _stu) throws Exception;
	public Stu find_base_info(Stu _stu) throws Exception;
	public boolean update_base_info(Stu _stu) throws Exception;
	
	/**
	 * do appointment
	 */	
	public boolean insert_appointment(
			Appointment _appointment
			) throws Exception;
	
	/**
	 * do free
	 */
	public ArrayList<Freetime> select_free(
			ArrayList<String> key,
			ArrayList<String> value
			) throws Exception;
	
}
