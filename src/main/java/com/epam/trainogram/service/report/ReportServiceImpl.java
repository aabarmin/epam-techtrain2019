package com.epam.trainogram.service.report;

import java.util.List;
import java.util.stream.Collectors;

import com.epam.trainogram.domain.Post;
import com.epam.trainogram.domain.Report;
import com.epam.trainogram.domain.ReportLine;
import com.epam.trainogram.domain.User;
import com.epam.trainogram.service.post.PostService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {
  private final PostService postService;

  @Override
  public Report buildReport(User user) {
    return isSponsor(user) ?
        buildReport(postService.findSponsored(user)) :
        buildReport(postService.findAll(user));
  }

  private boolean isSponsor(User user) {
    return false;
  }

  private Report buildReport(List<Post> posts) {
    return new Report(posts.stream()
        .map(post -> new ReportLine(post, post.getLikesCount()))
        .collect(Collectors.toList()));
  }

  @Override
  public Report buildSponsoredReport(User user) {
    final List<ReportLine> reportLines = postService.findSponsored(user).stream()
        .map(post -> new ReportLine(post, post.getLikesCount()))
        .collect(Collectors.toList());

    return new Report(reportLines);
  }
}
