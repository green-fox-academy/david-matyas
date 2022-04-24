package com.gfa.todos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
    private long id;
    private String title;
    private boolean urgent = false;
    private boolean done = false;

}
