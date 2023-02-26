package edu.todo.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.todo.dto.Task;
import edu.todo.model.TaskModel;

@WebServlet("/create-my-task")
public class CreateTask extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Get the data from the request
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String scheduledOn = request.getParameter("scheduledOn");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date=null;
		try {
			date = format.parse(scheduledOn);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// set the data into DTO
		Task task = new Task();
		task.setTitle(title);
		task.setStatus(status);
		task.setScheduledOn(date);
		// pass the data into Model class in form of DTO
		TaskModel model = new TaskModel();
		boolean result = model.save(task);
		String code = result ? "200" : "500";
		// redirect to a page (reponse)
		response.sendRedirect("create-task.jsp?c="+code);
	}
}




