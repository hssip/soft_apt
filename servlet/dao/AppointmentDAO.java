package dao;

import java.util.ArrayList;

import bean.*;


public interface AppointmentDAO {
	public ArrayList<Appointment>select_appointment(
			ArrayList<String> key,
			ArrayList<String> value
			) throws Exception;
	public boolean delete_appointment(
			ArrayList<String> key,
			ArrayList<String> value
			) throws Exception;
}
