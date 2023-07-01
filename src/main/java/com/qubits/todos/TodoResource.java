package com.qubits.todos;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/todos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {
  private TodoService todoService;

  public TodoResource(TodoService todoService) {
    this.todoService = todoService;
  }

  @GET
  @RolesAllowed("user")
  public List<Todo> getAllTodos() {
    return todoService.getTodos();
  }
}
