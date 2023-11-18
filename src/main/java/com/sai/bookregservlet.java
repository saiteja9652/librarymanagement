package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bookregservlet
 */
@WebServlet("/bookregservlet")
public class bookregservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public bookregservlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookisbn=request.getParameter("bookisbn");
		String bookname=request.getParameter("bookname");
		String bookauthor=request.getParameter("bookauthor");
		String bookprice=request.getParameter("bookprice");
		
		//give the data to dao layer
		
				Userdao dao = new Userdao();
				int result=dao.bookregi(bookisbn,bookname,bookauthor,bookprice);
				
					
				
				//storing the result in request object
				request.setAttribute("result",result);
				
				//to send response to jsp
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("Bookreg.jsp");
				dispatcher.forward(request, response);
				

	}

}
