package com.epam.tech.train.clean.code;

public class FunctionExample {
  public String preparePage(Page page,
                            PageConfiguration configuration) {
    StringBuilder pageBuilder = new StringBuilder();
    if (configuration.isIncludeHeader()) {
      pageBuilder.append(page.getHeader());
    }
    if (configuration.isIncludeBody()) {
      pageBuilder.append(page.getBody());
    }
    if (configuration.isIncludeFooter()) {
      pageBuilder.append(page.getFooter());
    }
    return pageBuilder.toString();
  }

  public String preparePage2(Page page,
                             PageConfiguration configuration) {
    StringBuilder pageBuilder = new StringBuilder();
    pageBuilder.append(prepareHeader(page, configuration));
    pageBuilder.append(prepareBody(page, configuration));
    pageBuilder.append(prepareFooter(page, configuration));
    return pageBuilder.toString();
  }

  private String prepareFooter(Page page,
                               PageConfiguration configuration) {
    if (configuration.isIncludeFooter()) {
      return page.getFooter();
    }
    return "";
  }

  private String prepareBody(Page page, PageConfiguration configuration) {
    return null;
  }

  private String prepareHeader(Page page, PageConfiguration configuration) {
    return null;
  }
}
