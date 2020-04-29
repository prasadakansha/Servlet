package com.enroll.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface DatabaseDAO {

	// public Connection getConnection();
	
	public List<TrainingData> getAllCourses() throws SQLException, ClassNotFoundException;
}
