package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.Bill;
import dao.BillDao;
import dao.UserDao;

/**
 * Servlet implementation class plogin
 */
@WebServlet("/plogin")
public class plogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public plogin() {
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
            
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            String type = request.getParameter("type");
            HttpSession ses = request.getSession();
            UserDao dao = new UserDao();
            if(dao.find_user(email, pass,type)){
            	BillDao billDao = new BillDao();
            	ArrayList<Bill> bills = billDao.getBills("", email);
            	request.setAttribute("bills", bills);
            	if(type.equals("In_patient") )
            		request.getRequestDispatcher("/inpatient_home.jsp").forward(request, response);
            	else if(type.equals("Out_patient"))
            		request.getRequestDispatcher("/outpatient_home.jsp").forward(request, response);
            }else{
                response.sendRedirect("patient_login.jsp");
            }
        }
        catch(Exception e){
        	System.out.println(e);
            e.printStackTrace();
        }
	}

}
