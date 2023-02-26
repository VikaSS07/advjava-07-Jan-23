package edu.todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import edu.todo.dto.Task;

public class TaskModel {
	
	final String INSERT = "INSERT INTO task(title, status, scheduledOn) VALUES(?,?,?)";

	public boolean save(Task task) {
		boolean result = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava07jan","root","root");
			PreparedStatement stmt = con.prepareStatement(INSERT);
				stmt.setString(1, task.getTitle());
				stmt.setString(2, task.getStatus());
				stmt.setDate(3, new java.sql.Date(task.getScheduledOn().getTime()));
			int count = stmt.executeUpdate();
			result = count>0;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
