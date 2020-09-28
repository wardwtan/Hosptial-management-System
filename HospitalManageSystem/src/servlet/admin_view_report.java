package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.reportDao;

/**
 * Servlet implementation class admin_view_report
 */
@WebServlet("/admin_view_report")
public class admin_view_report extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admin_view_report() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
        	String name = request.getParameter("name");
            String email = request.getParameter("email");
            reportDao dao = new reportDao();
            ArrayList<String> reports = dao.getReports(name, email);
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("reports", reports);
            request.getRequestDispatcher("/view_report.jsp").forward(request, response);
        }
        catch(Exception e){
            e.printStackTrace();
        }
	}

}
