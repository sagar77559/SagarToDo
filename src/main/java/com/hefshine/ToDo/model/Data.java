package com.hefshine.ToDo.model;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String toDo;
	Date date;
	boolean mark;
	@Override
	public String toString() {
		return "Data [id=" + id + ", toDo=" + toDo + ", date=" + date + ", mark=" + mark + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToDo() {
		return toDo;
	}
	public void setToDo(String toDo) {
		this.toDo = toDo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isMark() {
		return mark;
	}
	public void setMark(boolean mark) {
		this.mark = mark;
	}
	public Data(int id, String toDo, Date date, boolean mark) {
		super();
		this.id = id;
		this.toDo = toDo;
		this.date = date;
		this.mark = mark;
	}
	public Data() {
		super();
	}
	
	
	
	
}
	
	