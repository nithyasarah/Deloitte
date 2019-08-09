package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome1
 */
public class Welcome1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println(" Service of Welcome Servlet");
	
	String gn=request.getParameter("guestname");
	if(gn.equals("Nithya"))
	{
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("ValidServlet");
		dispatcher.forward(request, response);
	}
		
	else
		
	{
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("InValidServlet");
		dispatcher.forward(request, response);
	}	
		
	}

}
