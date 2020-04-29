package com.enroll.component;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.enroll.dao.DatabaseConnection;

/**
 * Servlet implementation class ResponseServlet
 */
public class ResponseServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	     PrintWriter out = response.getWriter();
	     
	     int tid = Integer.parseInt(request.getParameter("tId"));
	     int seats = Integer.parseInt(request.getParameter("Seats"));
	     
	     if(seats>0)
	     {
	    	 try {
				Connection con = DatabaseConnection.getConnection();
				String str = ("UPDATE trainings SET AvailableSeats="+(seats-1)+"where trainingId="+tid);
				PreparedStatement ps = con.prepareStatement(str);
				
				con.close();
			} 
	    	 catch (ClassNotFoundException | SQLException e) 
	    	 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	 out.print("<b>Hi you have successfully enrolled for "+tid+" Training.</b>");
	    	 out.print("</br></br><a href='index.html'>Enroll Again</a>");
	     } 
	    	 
	     else
	    {
	    	 out.print("<b>No Seats Are Available.</b>");
			 out.print("</br></br><a href='index.html'>Enroll Again</a>");
	    }
	     
	     
	  }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
