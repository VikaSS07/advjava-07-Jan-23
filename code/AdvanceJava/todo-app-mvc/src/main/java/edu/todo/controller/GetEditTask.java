package edu.todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.todo.dto.Task;
import edu.todo.model.TaskModel;

@WebServlet("/get-task-for-edit")
public class GetEditTask extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		TaskModel model = new TaskModel();
		Task task = model.getTaskById(Integer.parseInt(id));
		
		request.setAttribute("taskDetails", task);
		RequestDispatcher dis = request.getRequestDispatcher("update-task.jsp");
		dis.forward(request, response);
		
	}

}
