package com.dun.pojo;

import java.util.Date;

public class Articles {
    private Integer articleId;
    private Integer userId;
    private String articleTitle;
    private String articleContent;
    private Long articleView;
    private Integer articleCommentCount;
    private Date articleDate;
    private Date articleUpdate;
    private Long articleListCount;

    @Override
    public String toString() {
        return "Articles{" +
                "articleId=" + articleId +
                ", userId=" + userId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleView=" + articleView +
                ", articleCommentCount=" + articleCommentCount +
                ", articleDate=" + articleDate +
                ", articleUpdate=" + articleUpdate +
                ", articleListCount=" + articleListCount +
                '}';
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Long getArticleView() {
        return articleView;
    }

    public void setArticleView(Long articleView) {
        this.articleView = articleView;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public Date getArticleUpdate() {
        return articleUpdate;
    }

    public void setArticleUpdate(Date articleUpdate) {
        this.articleUpdate = articleUpdate;
    }

    public Long getArticleListCount() {
        return articleListCount;
    }

    public void setArticleListCount(Long articleListCount) {
        this.articleListCount = articleListCount;
    }

    public Articles(Integer articleId, Integer userId, String articleTitle, String articleContent, Long articleView, Integer articleCommentCount, Date articleDate, Date articleUpdate, Long articleListCount) {
        this.articleId = articleId;
        this.userId = userId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleView = articleView;
        this.articleCommentCount = articleCommentCount;
        this.articleDate = articleDate;
        this.articleUpdate = articleUpdate;
        this.articleListCount = articleListCount;
    }

    public Articles() {
    }
}
