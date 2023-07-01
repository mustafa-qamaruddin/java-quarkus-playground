package com.qubits.todos;

import com.qubits.users.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
  String uuid;
  String title;
  String description;
  LocalDateTime dueDate;
  User assignee;
}
