package com.webapp.todod;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {

	
	private static	List<ToDo> todos = new ArrayList<ToDo>();
	static {
		todos.add(new ToDo("Learn Web Application", "Study"));
		todos.add(new ToDo("Learn Spring MVC", "Study"));
		todos.add(new ToDo("Learn Spring Rest API", "Study"));
		todos.add(new ToDo("Learn SpringBoot", "Study"));
	}
	
	public List<ToDo> retriveTodo(){
		return todos;
	}
	
	public void addTodo(ToDo todo) {
		todos.add(todo); 
	}
	
//	// We can write it this way alos
//	public void addTodo(String todo) {
//		todos.add(new ToDo(todo)); 
//	}
	
	public void deleteTodo(ToDo todo) {
		todos.remove(todo);
	}
	
}
