package com.example.newsservice.repositories;
import com.example.newsservice.entity.NewsUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsUserRepository extends JpaRepository<NewsUser, Long> {
}
