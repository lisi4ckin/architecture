package com.example.newsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userRoleTitle;

    @OneToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST
    }, fetch = FetchType.LAZY,
    mappedBy = "role")
    private Set<NewsUser> users;
}
