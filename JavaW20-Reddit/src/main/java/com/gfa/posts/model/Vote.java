package com.gfa.posts.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    @OneToOne(mappedBy = "vote")
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Post post;

}
