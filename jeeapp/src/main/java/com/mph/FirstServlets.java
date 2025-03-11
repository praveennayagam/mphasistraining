package com.mph;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlets
 */
public class FirstServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfig sc;
	ServletContext 	scontext;
	public void init(ServletConfig config) {
		sc=config;
		System.out.println("From Init...");
	}
	
	public void destroy() {
		System.out.println("from destroyyyyyyyyyy....");
	}

    /**
     * Default constructor. 
     */
    public FirstServlets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		scontext=sc.getServletContext();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 style ='color:blue'> "+request.getContentLength()+"</h1>");
		out.println(request.getMethod());
		out.println("<h1 style ='color:red'>"+request.getQueryString()+"</h1>");
		out.println("<h4 style='color:brown'>"+request.getRequestURI()+"</h4>");
		out.println("<a href ='SecondServlet'>click");
		out.println(request.getServletPath());
		out.println(request.getHeaderNames());
		
		out.println("</body>");
		out.println("</html>");
		String cname=request.getParameter("custname");
		String cpwd=request.getParameter("custpwd");
		out.println("welcome "+cname+"with custid:"+cpwd);
		

		String uname = sc.getInitParameter("un");
		String passwd  = sc.getInitParameter("pwd");
		out.println(" Config  Name from Ist serv : "+uname + passwd);
		String name = scontext.getInitParameter("dbun");
		out.println(" Context Name from Ist serv : "+name);
//		String name=scontext.getInitParameter("dbun");
//		out.println("context  Name from @nd Servlet:")
		if(cname.equals(uname) && cpwd.equals(passwd)) {
//			RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
//			rd.include(request, response);
			out.println("<a href='http://www.google.com'>Heelo</a>");
		}
		else {
			out.println("<a href ='http://www.google.com'>Google</a>");
		}
		
		
		Enumeration params=request.getParameterNames();
		while(params.hasMoreElements()) {
			String pnames=(String)params.nextElement();
			out.println(pnames+"--"+request.getParameter(pnames));
		}
//		Enumeration attributes =request.getAttributeNames();
//		while(attributes.hasMoreElements()) {
//			String atti=(String)attributes.nextElement();
//			out.println(atti);
//		}
		
		//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
