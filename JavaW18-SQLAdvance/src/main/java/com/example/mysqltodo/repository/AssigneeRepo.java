package com.example.mysqltodo.repository;

import com.example.mysqltodo.model.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssigneeRepo extends JpaRepository<Assignee, Long>  {

}
