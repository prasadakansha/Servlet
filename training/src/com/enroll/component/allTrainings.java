package com.enroll.component;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.enroll.dao.TrainingData;
import com.enroll.dao.DatabaseDAOImpl;


public class allTrainings extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try 
		{
			System.out.println("1");
			
			DatabaseDAOImpl dao = new DatabaseDAOImpl();
			System.out.println("servlet dao "+dao);
			List<TrainingData> list = dao.getAllCourses();
			
			out.print("<table><tr><th>TrainingId</th><th>TrainingName</th><th>AvailableSeats</th></tr>");
			for(int i = 0; i<list.size(); i++)
			{
				out.print("<tr>");
				out.print("<td>"+list.get(i).getTrainingId());
				out.print("<td>"+list.get(i).getTrainingName());
				out.print("<td>"+list.get(i).getSeats());
				out.print("<td><a href='ResponseServlet?tId="+list.get(i).getTrainingId()+"&Seats="+list.get(i).getSeats()+"'>Enroll</a></td>");
				out.print("</tr>");
			}
			
		} 
		catch (Exception e) 
		{
			out.print("Exception in All Trainings "+e.getMessage());
			System.out.println("exception in all trainings ===>"+e);
		}
	}

}
