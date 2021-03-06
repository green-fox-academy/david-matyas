package com.example.mysqltodo;

import com.example.mysqltodo.model.Assignee;
import com.example.mysqltodo.model.Todo;
import com.example.mysqltodo.repository.AssigneeRepo;
import com.example.mysqltodo.repository.TodoRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class MySqlTodoApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(MySqlTodoApplication.class, args);
    }

    private final TodoRepos todorepos;
    private final AssigneeRepo assigneerepo;

    @Override
    public void run(String... args) throws Exception {
        Todo todo = new Todo();
        todo.setTitle("Make lunch");

        Todo todo1 = new Todo();
        todo1.setTitle("Make dinner");
        todo1.setDone(true);

        todorepos.save(todo);
        todorepos.save(todo1);

        Assignee assignee1= new Assignee();
        assignee1.setName("Petr");
        assignee1.setEmail("test@rest.cz");
        assigneerepo.save(assignee1);
    }
}
