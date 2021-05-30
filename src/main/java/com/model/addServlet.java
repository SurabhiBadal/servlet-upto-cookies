package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		// getting response on console
		//System.out.println("The sum of the numbers="+k);
		
		//we want response on our client page to do so we use PrintWriter
		
		PrintWriter out=res.getWriter();
		out.println("The result is"+k);
		
	}
	

}
