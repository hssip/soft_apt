package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Stu;
import factory.DAOFactory;

/**
 * Servlet implementation class StuLogin
 */
@WebServlet("/StuLoginController")

public class StuLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("stu_id");
		String pwd=request.getParameter("stu_password");
		//System.out.println(name);
		//System.out.println(pwd);
		String ok_path="s_mainshow_view.html";
		String no_path="login_view.jsp";
		Stu stu=new Stu(name,pwd);
		try {
			if(DAOFactory.getStuDAOInstance().findLogin(stu)){
				//request.setAttribute("flag", );
				
				request.getRequestDispatcher(ok_path).forward(request, response);
			}
			else{
				request.setAttribute("flag", "no");
				request.getRequestDispatcher(no_path).forward(request, response);
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
		doGet(request, response);
	}

}
