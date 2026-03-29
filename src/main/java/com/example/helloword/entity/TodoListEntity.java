package com.example.helloword.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "todo_list")
public class TodoListEntity {
    @Id
    private String id;
    private String title;
    private String status;
    private Boolean isActive;
}
