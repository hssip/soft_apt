package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
import bean.*;
import factory.DAOFactory;
/**
 * Servlet implementation class StuController
 */
@WebServlet("/StuController")
public class StuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String method=new String();
		String kind=new String();
		String content=request.getParameter("input_search");
		ArrayList<Freetime> temp=new ArrayList<Freetime>();
		
		ArrayList<String> key=new ArrayList<String>();
		ArrayList<String> value=new ArrayList<String>();
		key.add("teacherid");
		value.add(content);
		ArrayList<String> result=new ArrayList<String>();
		try {
			temp=DAOFactory.getStuDAOInstance().select_free(key, value);

			for(Freetime ft:temp){
				Teacher teacher=DAOFactory.
						getTeacherDAOInstance().
						find_base_info(new Teacher(
								ft.getTeacher_id()));
				String str=teacher.getId()+"-"+
								teacher.getName()+"-"+
						teacher.getRank()+"-"+ft.getWeek()+"-"+
								ft.getFree_time();
				result.add(str);
				//System.out.println(str);
			}
			//Teacher teacher = DAOFactory.getTeacherDAOInstance().find_base_info(_teacher)
//			JSONArray data=new JSONArray();
//			for(Freetime ft :temp){
//				JSONObject jo =new JSONObject();
//				Teacher teacher=new Teacher(ft.getTeacher_id());
//				teacher=DAOFactory.getTeacherDAOInstance().find_base_info(teacher);
//				jo.put("tid", ft.getTeacher_id());
//				jo.put("tname", teacher.getName());
//				jo.put("tjob",teacher.getRank());
//				jo.put("tdate",ft.getFree_time());
//				
//				data.add(jo);
//			}
//			System.out.println("dispatch");
//			request.setAttribute("data", data);
			//request.
			ServletContext application = getServletContext();
			application.setAttribute("result", result);
			request.getRequestDispatcher("s_mainshow_view.jsp").forward(request, response);
		
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String method=new String();
		if(method=="appointment"){
			
		}
		else if(method=="base"){
			
		}
	}

}
