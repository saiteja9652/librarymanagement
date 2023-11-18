package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookserachservlet")
public class bookserachservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public bookserachservlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

 		//get data from form page
 		String bookisbn=request.getParameter("bookisbn");
 		
 		//give data to dao
 		Userdao dao=new Userdao();
 		Bookinfo Bookinfo=dao.searchbybookisbn(bookisbn);
 		
 		//storing data into request object
 		request.setAttribute("Bookinfo", Bookinfo);
 		
 		//give response to jsp
 		RequestDispatcher dispatcher=request.getRequestDispatcher("Booksearch.jsp");
 		dispatcher.forward(request, response);
	}

}
