package com.example.mysqltodo.repository;

import com.example.mysqltodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepos extends JpaRepository <Todo, Long> {

}
