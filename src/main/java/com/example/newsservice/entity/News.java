package com.example.newsservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String newsTitle;
    private String description;

    @ManyToMany(mappedBy = "userNews")
    private Set<NewsUser> creatorsUser;
}
