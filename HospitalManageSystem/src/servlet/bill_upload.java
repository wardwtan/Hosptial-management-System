package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BillDao;
import dao.UserDao;
import dao.reportDao;

/**
 * Servlet implementation class report_upload
 */
@WebServlet("/bill_upload")
public class bill_upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bill_upload() {
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
            String type = request.getParameter("type");
            String price = request.getParameter("price");
            String detail = request.getParameter("detail");
            BillDao dao = new BillDao();
            dao.upload_bill(name, email, type, price, detail);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally {
        	response.sendRedirect("write_bill.jsp");
		}
	}

}
