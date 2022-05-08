package com.gfa.posts.service;

import com.gfa.posts.model.Post;
import com.gfa.posts.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
