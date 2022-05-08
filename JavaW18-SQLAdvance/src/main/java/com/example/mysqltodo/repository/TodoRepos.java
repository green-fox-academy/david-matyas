package com.example.mysqltodo.repository;

import com.example.mysqltodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TodoRepos extends JpaRepository<Todo, Long> {

    List<Todo> findAllByDoneEquals(Boolean done);
    List<Todo> findAllByTitleContaining(@Param("") String search);

}
