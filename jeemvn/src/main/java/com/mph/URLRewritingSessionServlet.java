package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class URLRewritingSessionServlet
 */
@WebServlet("/URLRewritingSessionServlet")
public class URLRewritingSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public URLRewritingSessionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();
		 response.sendRedirect(request.getParameter("username"));
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();
			HttpSession hs = request.getSession();
		//doGet(request, response);
		 out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqq");
		 String uname=request.getParameter("username");
		 out.println(uname);
		 
		 response.sendRedirect("CookieSessionServlet?username="+uname+"&JSESSIONID="+hs.getId());
	}

}
