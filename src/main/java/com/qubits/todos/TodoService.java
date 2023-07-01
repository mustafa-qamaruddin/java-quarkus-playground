package com.qubits.todos;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class TodoService {
  public List<Todo> getTodos() {
    return new ArrayList<>();
  }
}
