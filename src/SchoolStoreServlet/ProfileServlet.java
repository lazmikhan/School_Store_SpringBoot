package SchoolStoreServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
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
	String fullname= request.getParameter("fullname");
	String email= request.getParameter("email");
	String gender= request.getParameter("gender");
	String payment= request.getParameter("payment");
	String address= request.getParameter("address");
	String interests []= request.getParameterValues("interest");
	
 PrintWriter out = response.getWriter();
 out.write("<h1>Hello</h1>");
 HttpSession sess = request.getSession();
 sess.removeAttribute("phone_no");
 String user_name = (String) sess.getAttribute("user_name");
 out.write("<h1>User Name:</h1>"+ user_name);
 out.write("<h1>User Name:</h1>"+ payment);
 Cookie cookieAddr = new Cookie("address", address);
 response.addCookie(cookieAddr);
 for(int i=0; i<interests.length; i++)
 {
	 out.write("<h1>Interests:</h1>"+ interests[i]);
 }
 

	out.write("<form action='uniformOrder.html'><button type='submit'>Back to Order</button></form>");
	}
	

	

}
