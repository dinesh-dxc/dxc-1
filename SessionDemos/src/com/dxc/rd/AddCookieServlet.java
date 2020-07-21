package com.dxc.rd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ckPrakash = new Cookie("Prakash", "88");
		ckPrakash.setMaxAge(24*60*60*1000);
		response.addCookie(ckPrakash);
		
		Cookie ckNikitha = new Cookie("Nikitha", "84");
		ckNikitha.setMaxAge(24*60*60*1000);
		response.addCookie(ckNikitha);
		
		Cookie ckSanil = new Cookie("Sanil", "89");
		ckNikitha.setMaxAge(24*60*60*1000);
		response.addCookie(ckSanil);
		
		PrintWriter out = response.getWriter();
		out.println("Cookie(s) Created...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
