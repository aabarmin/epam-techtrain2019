package com.epam.tech.train.clean.code;

public class PageConfiguration {
  private boolean includeHeader;
  private boolean includeBody;
  private boolean includeFooter;

  public boolean isIncludeHeader() {
    return includeHeader;
  }

  public void setIncludeHeader(boolean includeHeader) {
    this.includeHeader = includeHeader;
  }

  public boolean isIncludeBody() {
    return includeBody;
  }

  public void setIncludeBody(boolean includeBody) {
    this.includeBody = includeBody;
  }

  public boolean isIncludeFooter() {
    return includeFooter;
  }

  public void setIncludeFooter(boolean includeFooter) {
    this.includeFooter = includeFooter;
  }
}
