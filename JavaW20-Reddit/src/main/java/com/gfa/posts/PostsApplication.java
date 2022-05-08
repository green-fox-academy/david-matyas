package com.gfa.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class PostsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PostsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
