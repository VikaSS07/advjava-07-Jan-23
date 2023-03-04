package edu.todo.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.todo.dto.Task;
public class TaskModel {
	final String INSERT 
	= "INSERT INTO task(title, status, scheduledOn) VALUES(?,?,?)";
	
	final String SELECT_All = "select * from task";
	
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
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public List<Task> getAllTask() {
		ArrayList<Task> list = new ArrayList<Task>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava07jan","root","root");
			PreparedStatement stmt = con.prepareStatement(SELECT_All);
			ResultSet rs = stmt.executeQuery();	
			while(rs.next()) {
				Task task = new Task();
					task.setId(rs.getInt("id"));
					task.setTitle(rs.getString("title"));
					task.setStatus(rs.getString("status"));
					task.setScheduledOn(rs.getDate("scheduledOn"));
					task.setUpdatedOn(rs.getDate("updatedOn"));
				list.add(task);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Task getTaskById(int id) {
		Task task = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava07jan","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM task where id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();	
			if(rs.next()) {
				task = new Task();
				task.setId(rs.getInt("id"));
				task.setTitle(rs.getString("title"));
				task.setStatus(rs.getString("status"));
				task.setScheduledOn(rs.getDate("scheduledOn"));
				task.setUpdatedOn(rs.getDate("updatedOn"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return task;
	}
	
	public boolean updateTaskById(Task task) {
		boolean result = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava07jan","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE task SET title=?, status=?, scheduledOn=?,  updatedOn=now() WHERE id=?");
				stmt.setString(1, task.getTitle());
				stmt.setString(2, task.getStatus());
				stmt.setDate(3, new java.sql.Date(task.getScheduledOn().getTime()));
				stmt.setInt(4, task.getId());
			int count = stmt.executeUpdate();
			result = count>0;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
