package factory;

import dao.*;
import dao.proxy.*;

public class DAOFactory {
	public static StuDAO getStuDAOInstance(){
		return new StuDAOProxy();
	}
	public static TeacherDAO getTeacherDAOInstance(){
		return new TeacherDAOProxy();
	}
	public static AppointmentDAO getAppointmentDAOInstance(){
		return new AppointmentDAOproxy();
	}
}
