package com.mk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ilkServer")
public class ilkServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	String ad="", soyad="";
	
    public ilkServer() {
        super();

    }
public void kaydet (HttpServletRequest request, HttpServletResponse response) 
	
	 throws ServletException, IOException {
		 
		 response.setContentType("text/htmlUTF-8");
		 
		 try (PrintWriter prt = response.getWriter()) {
		 
			 
		 }
	 }
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   ad = request.getParameter("txtad");
soyad = request.getParameter("txtsoyad");
		doGet(request, response);
	}

}
