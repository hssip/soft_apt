package dao;

import java.util.List;

import bean.*;

public interface StuDAO {
	public boolean findLogin(Stu _stu) throws Exception;
	public Stu find_base_info(Stu _stu) throws Exception;
	public boolean update_base_info(Stu _stu) throws Exception;
	
	/**
	 * do appointment
	 */
	public Appointment select_appointment(
			Stu _stu,
			List<String> key,
			List<String> value
			) throws Exception;
	public boolean updata_appointment(
			Stu _stu,
			Appointment appointment
			) throws Exception;
	
	public boolean delete_appointment(
			Stu _stu
			) throws Exception;
	
	public boolean insert_appointment(
			Stu _stu
			) throws Exception;
	
	/**
	 * do free
	 */
	public List<String> select_free(
			Stu _stu,
			List<String> key,
			List<String> value
			) throws Exception;
	
}
