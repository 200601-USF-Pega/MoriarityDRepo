package com.revature.configcontextexample.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletOne() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		ServletConfig sc = this.getServletConfig();
		pw.write("<html>"
				+ "<body>");
		pw.write("<div>servlet one config</div>");
		pw.write("<div>" + sc.getInitParameter("config") + "</div>");
		pw.write("</br>");
		ServletContext context = this.getServletContext();
		pw.write("<div>context</div>");
		pw.write("<div>" + context.getInitParameter("context") + "</div>");
		pw.write( "</body>"
				+ "</html>");
		
	}

}
