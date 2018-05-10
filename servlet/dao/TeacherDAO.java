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
	 * 
	 * @param _teacher
	 * @param key
	 * @param value
	 * @param result_count
	 * @param key_count
	 * @return
	 * @throws Exception
	 */
	public Appointment select_appointment(
			Teacher _teacher,		//执行主体
			List<String> key,			//查询条件
			List<String> value,			//查询条件值
			int result_count,		//查询结果个数
			int key_count			//查询条件个数
			) throws Exception;
	/**
	 * 
	 * @param _teacher
	 * @param record
	 * @return
	 * @throws Exception
	 */
	public boolean insert_appointment(
			Teacher _teacher,
			//String record
			Appointment appointment
			) throws Exception;
	/**
	 * 
	 * @param _teacher
	 * @param key
	 * @param value
	 * @param key_count
	 * @return
	 * @throws Exception
	 */
	public boolean delete_appointment(
			Teacher _teacher,
			List<String> key,
			List<String> value
			//int key_count
			) throws Exception;
	/**
	 * 
	 * @param _teacher
	 * @param key
	 * @param value
	 * @param up_key
	 * @param up_value
	 * @return
	 * @throws Exception
	 */
	public boolean update_appointment(
			Teacher _teacher,
			List<String> old_key,
			List<String> old_value,
			List<String> up_key,
			List<String> up_value
			) throws Exception;
	
	/**
	 * do teacher_free
	 */
	
	public boolean delete_free(
			Teacher _teacher,
			List<String> key,			//
			List<String> value,			//
			int n
			) throws Exception;
	public boolean update_free(
			Teacher _teacher,
			List<String> old_key,
			List<String> old_value ,
			List<String> up_key,
			List<String> up_value,
			int n
			) throws Exception;
	public boolean insert_free(
			Teacher _teacher,
			String reacord
			) throws Exception;
	public List<String> select_free(
			Teacher _teacher,
			List<String> key,
			List<String> value
			) throws Exception;
}
