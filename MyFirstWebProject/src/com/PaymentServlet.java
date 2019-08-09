package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentServlet
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String gn=(String) session.getAttribute("uname");
		PrintWriter out=response.getWriter();
		int total=0;
		int count=0;
		out.println("<html> <body>");
		out.println(gn+" You have selected products below \n");
		String selectedproducts[]=request.getParameterValues("product");
		if(selectedproducts ==null)
		{
			out.println("no shopping <a href=Product.html> go to products</a>");
		}
		
		else
		{
			for (String product:selectedproducts)
			{++count;
				total+=10;
				out.println("Product:" +count+"-----" +product);
				
			}
		}
	session.setAttribute("totalAmount", total);	
	out.println("<hr><a href=LastPage>Payment</a>");
	out.println("</body></html> ");	
	}

}
