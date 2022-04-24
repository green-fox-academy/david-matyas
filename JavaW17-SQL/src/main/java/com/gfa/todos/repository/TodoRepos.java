package com.gfa.todos.repository;

import com.gfa.todos.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepos extends JpaRepository<Todo, Long> {
    List<Todo> findAll();
}
