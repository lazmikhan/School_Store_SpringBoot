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
 * Servlet implementation class ProcessOrder
 */
@WebServlet("/ProcessOrder")
public class ProcessOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessOrder() {
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
	String size1= request.getParameter("set1SizeOption");
	String size2= request.getParameter("set2SizeOption");
	String size3= request.getParameter("set3SizeOption");
	int quantity1= Integer.parseInt(request.getParameter("set1OrderQuantity"));
	int quantity2= Integer.parseInt(request.getParameter("set2OrderQuantity"));
	int quantity3= Integer.parseInt(request.getParameter("set3OrderQuantity"));
	String checkbox1 = request.getParameter("Set1Checkbox");
	String checkbox2 = request.getParameter("Set2Checkbox");
	String checkbox3 = request.getParameter("Set3Checkbox");
	double price1=0;
	double price2=0;
	double price3=0;
	if(checkbox1!=null)
	{
		if(size1.equals("S"))
		price1= 30*quantity1;
		else if (size1.equals("M"))
		price1= 31*quantity1;
		else if (size1.equals("L"))
	    price1= 32*quantity1;
		else  if (size1.equals("XL"))
		price1= 33*quantity1;
		
		
	}
	if(checkbox2!=null)
	{
		if(size2.equals("S"))
		price2= 40*quantity2;
		else if (size2.equals("M"))
		price2= 42*quantity2;
		else if (size2.equals("L"))
	    price2= 44*quantity2;
		else  if (size2.equals("XL"))
		price2= 46*quantity2;
		
		
	}
	if(checkbox3!=null)
	{
		if(size3.equals("30"))
		price3= 20*quantity3;
		else if (size3.equals("32"))
		price3= 21*quantity3;
		else if (size3.equals("34"))
	    price3= 22*quantity3;
		else  if (size3.equals("36"))
		price3= 23*quantity3;
		
		
	}
	double total = price1+price2+price3;
	HttpSession sess = request.getSession();
	String sessionUser = (String) sess.getAttribute("user_name");
	PrintWriter out = response.getWriter();
	out.write("<table> <tr>   <th>SIze</th>  <th>Quantity</th>  <th>Price</th></tr> ");
	out.write("Currenr User:"+ sessionUser);
	if(checkbox1!=null)
	{
		out.write("<tr> <td> "+ size1
				+ " </td> <td>"+ quantity1+" </td> <td>"+price1+"</td> </tr>");
			      
	}
	if(checkbox2!=null)
	{
		out.write("<tr> <td> "+ size2
				+ " </td> <td>"+ quantity2+" </td> <td>"+price2+"</td> </tr>");
			      
	}
	if(checkbox3!=null)
	{
		out.write("<tr> <td> "+ size3
				+ " </td> <td>"+ quantity3+" </td> <td>"+price3+"</td> </tr>");
			      
	}
			out.write("</table>");
	
	out.write("total"+total);
	
	Cookie [] cookie = request.getCookies();
	for(int i=0;i<cookie.length;i++)
		if(cookie[i].getName().equals("address"))
		out.write("Address:"+  cookie[i].getValue());
	
	}


}
