package com.epam.trainogram.service;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;
import com.epam.trainogram.service.post.PostDao;
import com.epam.trainogram.service.post.PostServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PostServiceImplTest {
  @Mock
  User currentUser;

  @Mock
  Post userPost;

  @Mock
  Post commenterPost;

  @Mock
  Comment comment;

  @Mock
  User commentAuthor;

  @Mock
  PostDao postDao;

  List<Post> userPosts;

  List<Comment> comments;

  List<Post> commenterPosts;

  @InjectMocks
  PostServiceImpl unitUnderTest;

  @BeforeEach
  void setup() {
    userPosts = Arrays.asList(
        userPost
    );
    comments = Arrays.asList(
      comment
    );
    commenterPosts = Arrays.asList(
        commenterPost
    );
  }

  @Test
  void findSuggestions_tryFind() {
    when(comment.getAuthor()).thenReturn(commentAuthor);
    doReturn(commenterPosts).when(postDao).findAll(commentAuthor);
    doReturn(userPosts).when(postDao).findAll(currentUser);
    when(userPost.getComments()).thenReturn(comments);

    List<Post> suggestions = unitUnderTest.findRecommendations(currentUser);
    assertAll(
        () -> assertNotNull(suggestions),
        () -> assertEquals(1, suggestions.size())
    );
  }
}
