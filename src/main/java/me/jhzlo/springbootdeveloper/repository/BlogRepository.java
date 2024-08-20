package me.jhzlo.springbootdeveloper.repository;

import me.jhzlo.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
