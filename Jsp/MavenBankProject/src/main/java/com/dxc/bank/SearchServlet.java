package com.dxc.bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		AccountDAO dao = new AccountDAO();
		PrintWriter out = response.getWriter();
		try {
			Account account = dao.searchAccount(accountNo);
			if (account!=null) {
				out.println("First Name  " +account.getFirstName() + "<br/>");
				out.println("Last Name  " +account.getLastName() + "<br/>");
				out.println("City   " +account.getCity() + "<br/>");
				out.println("State   " +account.getState() + "<br/>");
				out.println("Amount  " +account.getAmount() + "<br/>");
				out.println("Cheq Facil  " +account.getCheqFacil() + "<Br/>");
			} else {
				out.println("Account No Not Found...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
