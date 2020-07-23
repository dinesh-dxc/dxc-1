package com.dxc.bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Account account = new Account();
		AccountDAO dao = new AccountDAO();
		try {
			int accno =dao.generateAccountNo();
			account.setAccountNo(accno);
			account.setFirstName(request.getParameter("firstName"));
			account.setLastName(request.getParameter("lastName"));
			account.setCity(request.getParameter("city"));
			account.setState(request.getParameter("state"));
			int amount = Integer.parseInt(request.getParameter("amount"));
			account.setAmount(amount);
			account.setCheqFacil(request.getParameter("cheqFacil"));
			account.setAccountType(request.getParameter("accountType"));
			PrintWriter out = response.getWriter(); 
			out.println(dao.createAccount(account));
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
