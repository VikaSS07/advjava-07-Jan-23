package edu.todo.dto;
import java.util.Date;
public class Task {
	private int id;
	private String title;
	private String status;
	private Date scheduledOn;
	private Date updatedOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getScheduledOn() {
		return scheduledOn;
	}

	public void setScheduledOn(Date scheduledOn) {
		this.scheduledOn = scheduledOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}


}
