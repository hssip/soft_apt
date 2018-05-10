package servlet;

//import java.util.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Stu;
import bean.Teacher;
import factory.*;

/**
 * Servlet implementation class login
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//method to set form and get parameter
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String id=request.getParameter("user_id");
		String pwd=request.getParameter("user_password");
		String radio=request.getParameter("radio_kind");
		
		if(radio.equals("student")){
			Stu stu=new Stu(id,pwd);
			try{
				if(DAOFactory.getStuDAOInstance().findLogin(stu)){
					
					request.setAttribute("stu_uesr",stu);
					request.getRequestDispatcher("Stu.html").forward(request, response);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		else if(radio.equals("teacher")){
			Teacher teacher =new Teacher(id,pwd);
			try {
				if(DAOFactory.getTeacherDAOInstance().findLogin(teacher)){
					
				}
				
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		else if(radio.equals("manager")){
			
		}
		else{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
