	public static boolean t_insert_free(FreeTime _free)
	{
		String sql = "insert into teacher_free(teacherAccount,weekDay,freeTime,date) values('"+_free.getTeacher_id()+"',"+"'"+_free.getWeek()+"',"+"'"+_free.getFree_time()+"',"+"'"+_free.getDate()+"')";
		try {
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public static boolean t_delete_free(ArrayList<String> key,ArrayList<String> value)
	{
		StringBuffer stringBuffer =new StringBuffer("");
		stringBuffer.append(key.get(0)+" = '"+value.get(0)+"'");
		if(key.size()>1)
		{
			for(int i=1;i<key.size();++i)
			{
				stringBuffer.append(" and "+key.get(i)+" = '"+value.get(i)+"'");
			}
		}
		String sql="delete from teacher_free where " + stringBuffer;
		try {
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public static boolean t_update_free(ArrayList<String> old_key,ArrayList<String> old_value,ArrayList<String> up_key,ArrayList<String> up_value)
	{
		StringBuffer stringBuffer =new StringBuffer("");
		StringBuffer stringBuffer2=new StringBuffer("");
		stringBuffer.append(old_key.get(0)+" = '"+old_value.get(0)+"'");
		stringBuffer2.append(up_key.get(0)+" = '"+up_value.get(0)+"'");
		if(old_key.size()>1)
		{
			for(int i=1;i<old_key.size();++i)
			{
				stringBuffer.append(" and "+old_key.get(i)+" = '"+old_value.get(i)+"'");
			}
		}
		if(up_key.size()>1)
		{
			for(int i=1;i<up_key.size();++i)
			{
				stringBuffer2.append(" , "+up_key.get(i)+" = '"+up_value.get(i)+"'");
			}
		}
		String sql="update teacher_free set "+stringBuffer2+" where " + stringBuffer;
		try {
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public static ArrayList<FreeTime> s_select_free(ArrayList<String> key,ArrayList<String> value) throws SQLException
	{
		ArrayList<FreeTime> list = new ArrayList<FreeTime>();
		StringBuffer stringBuffer =new StringBuffer("");
		stringBuffer.append(key.get(0)+" = '"+value.get(0)+"'");
		if(key.size()>1)
		{
			for(int i=1;i<key.size();++i)
			{
				stringBuffer.append(" and "+key.get(i)+" = '"+value.get(i)+"'");
			}
		}
		String sql="select * from teacher_free where " + stringBuffer;
		ResultSet set=statement.executeQuery(sql);
		while(set.next())
		{
			FreeTime freeTime=new FreeTime();
			String teacherId,week_day,free_time,_date;
			teacherId=set.getString("teacherAccount");
			week_day=set.getString("weekDay");
			free_time=set.getString("freeTime");
			_date=set.getString("position");
			freeTime.setTeacher_id(teacherId);
			freeTime.setWeek(week_day);
			freeTime.setDate(_date);
			freeTime.setFree_time(free_time);
			list.add(freeTime);
		}
		return list;
	}
	
	
	public static boolean s_insert_appointment(Appointment _appointment)
	{
		Calendar c = Calendar.getInstance();  
		int year = c.get(Calendar.YEAR);  
		int month = c.get(Calendar.MONTH);   
		int date = c.get(Calendar.DATE);    
		int hour = c.get(Calendar.HOUR_OF_DAY);   
		int minute = c.get(Calendar.MINUTE);   
		int second = c.get(Calendar.SECOND); 
		String appoint_id=Integer.toString(year)+Integer.toString(month)+Integer.toString(date)+Integer.toString(hour)+Integer.toString(minute)+Integer.toString(second);
		String sql="insert into appointment(id,stu_id,teacher_id,position,time,state) values('"+appoint_id+"',"+"'"+_appointment.getStu_id()+"',"+"'"+_appointment.getTeacher_id()+"',"+"'"+_appointment.getPosition()+"',"+"'"+_appointment.getTime()+"',"+"'"+_appointment.getState()+"')";
		try {
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public static ArrayList<Appointment> select_appointment(ArrayList<String> key,ArrayList<String> value) throws SQLException
	{
		ArrayList<Appointment> list=new ArrayList<Appointment>();
		StringBuffer stringBuffer =new StringBuffer("");
		stringBuffer.append(key.get(0)+" = '"+value.get(0)+"'");
		if(key.size()>1)
		{
			for(int i=1;i<key.size();++i)
			{
				stringBuffer.append(" and "+key.get(i)+" = '"+value.get(i)+"'");
			}
		}
		String sql="select * from appointment where " + stringBuffer;
		ResultSet set=statement.executeQuery(sql);
		while(set.next())
		{
			Appointment appointment=new Appointment();
			String _id,studentID,teacherID,_position,_time,_state;
			_id=set.getString("id");
			studentID=set.getString("stu_id");
			teacherID=set.getString("teacher_id");
			_position=set.getString("position");
			_time=set.getString("time");
			_state=set.getString("state");
			appointment.setId(_id);
			appointment.setTeacher_id(teacherID);
			appointment.setPosition(_position);
			appointment.setTime(_time);
			list.add(appointment);
		}
		return list;
	}
	
	
	public static boolean delete_appointment(ArrayList<String> key,ArrayList<String> value)
	{
		StringBuffer stringBuffer =new StringBuffer("");
		stringBuffer.append(key.get(0)+" = '"+value.get(0)+"'");
		if(key.size()>1)
		{
			for(int i=1;i<key.size();++i)
			{
				stringBuffer.append(" and "+key.get(i)+" = '"+value.get(i)+"'");
			}
		}
		String sql="delete from appointment where " + stringBuffer;
		try {
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	