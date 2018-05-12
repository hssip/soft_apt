package dao;

import java.util.*;

//import bean.Stu;
import bean.*;

public interface TeacherDAO {
	//select
	public boolean findLogin(Teacher _teacher) throws Exception;
	public Teacher find_base_info(Teacher _teacher) throws Exception;
	public boolean update_base_info(Teacher _teacher) throws Exception;
	
	
	/**
	 * do appointment
	 */

	/**
	 * do teacher_free
	 */
	
	public boolean delete_free(
			ArrayList<String> key,			//
			ArrayList<String> value			//
			) throws Exception;
	public boolean update_free(
			ArrayList<String> old_key,
			ArrayList<String> old_value ,
			ArrayList<String> up_key,
			ArrayList<String> up_value
			) throws Exception;
	public boolean insert_free(
			Freetime _free
			) throws Exception;
	public ArrayList<Freetime> select_free(
			ArrayList<String> key,
			ArrayList<String> value
			) throws Exception;
}
