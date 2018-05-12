package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.*;
import factory.DAOFactory;

/**
 * Servlet implementation class Teacher_Login
 */
@WebServlet("/TeacherLoginController")
public class TeacherLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("teacher_id");
		String pwd=request.getParameter("teacher_pwd");
		String ok_path="t_mainshow_view.html";
		String no_path="login_view.jsp";
		
		Teacher teacher=new Teacher(id,pwd);
		try {
			if(DAOFactory.getTeacherDAOInstance().findLogin(teacher)){
				teacher=DAOFactory.getTeacherDAOInstance().find_base_info(teacher);
				request.setAttribute("tname", teacher.getName());
				request.setAttribute("tage", teacher.getAge());
				request.setAttribute("tsex", teacher.getSex());
				request.setAttribute("tid", teacher.getId());
				request.setAttribute("tdep", teacher.getDep_number());
				request.setAttribute("ttel", teacher.getTel());
				request.setAttribute("tjob", teacher.getRank());
				request.getRequestDispatcher(ok_path).forward(request, response);
			}
			else{
				request.setAttribute("flag", "no");
				request.getRequestDispatcher(no_path).forward(request,response);
			}
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
	}

}
