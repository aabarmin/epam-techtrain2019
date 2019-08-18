package com.epam.trainogram.service.upload;

import java.time.LocalDate;

import com.epam.trainogram.domain.Picture;
import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.User;
import com.epam.trainogram.service.post.PostService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PublishingServiceImpl implements PublishingService {
  private final PostService postService;

  @Override
  public Post publishPost(User author, Picture picture) {
    Post newPost = new Post();
    newPost.setPicture(picture);
    newPost.setAuthor(author);
    newPost.setPublicationDate(LocalDate.now());

    return postService.save(newPost);
  }
}
