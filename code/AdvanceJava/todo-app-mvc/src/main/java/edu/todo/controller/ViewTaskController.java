package edu.todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.todo.dto.Task;
import edu.todo.model.TaskModel;

@WebServlet("/show-my-task")
public class ViewTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaskModel model = new TaskModel();
		List<Task> list = model.getAllTask();
		
		request.setAttribute("myTasks", list);
		RequestDispatcher dis = request.getRequestDispatcher("view-task.jsp");
		dis.forward(request, response);
	}

}
