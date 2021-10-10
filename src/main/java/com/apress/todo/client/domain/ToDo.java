package com.apress.todo.client.domain;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
public class ToDo {

    private String id;
    private String description;
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modified;
    boolean completed;
    public ToDo(){
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
    }
    public ToDo(String description){
        this();
        this.description = description;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getModified() {
		return modified;
	}
	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}