package com.blitz.market.repository;

import com.blitz.market.domain.Comment;
import com.blitz.market.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> getCommentByPostsOrderById(Posts posts);
}
