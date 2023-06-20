package com.qubits.todos;

import com.qubits.users.User;

import java.time.LocalDateTime;

public class TODO {
  String uuid;
  String title;
  String description;
  LocalDateTime dueDate;
  User assignee;
}
