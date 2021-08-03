package ru.alikka.posts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alikka.posts.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
