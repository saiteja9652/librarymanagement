package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Bookdeleteservlet")
public class Bookdeleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Bookdeleteservlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String bookisbn=request.getParameter("bookisbn");
		
		
		//giving data to dao
		Userdao dao=new Userdao();
		int result=dao.bookdelete(bookisbn);
		
		//storing result in request object
		request.setAttribute("result",result);
		
		//giving response to jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("Bookdelete.jsp");
		dispatcher.forward(request, response);
	}

}
