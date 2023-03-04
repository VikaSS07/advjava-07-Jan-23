package edu.todo.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.todo.dto.Task;
import edu.todo.model.TaskModel;

@WebServlet("/update-my-task")
public class UpdateTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String schedule = request.getParameter("scheduledOn");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date=null;
		try {
			date = format.parse(schedule);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Task task = new Task();
		task.setId(Integer.parseInt(id));
		task.setTitle(title);
		task.setStatus(status);
		task.setScheduledOn(date);
		
		TaskModel model = new TaskModel();
		model.updateTaskById(task);
		
		response.sendRedirect("show-my-task");
	}

}
