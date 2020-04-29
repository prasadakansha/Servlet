package com.enroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDAOImpl implements DatabaseDAO 
{	
	
	  public static void main(String[] args) { try { DatabaseDAOImpl obj = new
	  DatabaseDAOImpl(); obj.getAllCourses(); } catch(Exception e) {
	  System.out.println(e.toString()); } }
	 
	
	@Override
	public List<TrainingData> getAllCourses() throws SQLException,ClassNotFoundException {
	
		Connection con = DatabaseConnection.getConnection();
		System.out.println(" ====>> inside DatabaseDAOImpl "+con);
		// code to get courses from Database
		List<TrainingData> fetchList = new ArrayList<>();
		
		String str = "select * from trainings";
		
		PreparedStatement ps = con.prepareStatement(str);
		System.out.println("=======>ps  "+ps);
		ResultSet rs = ps.executeQuery();
		//System.out.println("=======>rs "+rs.next());
		
		while(rs.next())
		{
			System.out.println(" inside while rs.next");
			TrainingData c = new TrainingData();
			
			System.out.println("1."+rs.getInt("trainingId"));
			c.setTrainingId(rs.getInt("trainingId"));
			c.setTrainingName(rs.getString("trainingName"));
			c.setSeats(rs.getInt("AvailableSeats"));
			
			fetchList.add(c);
		}
		System.out.println("before return "+fetchList.size());
		return fetchList;
	}
	
}
