package com.dun.pojo;

import java.util.Date;

public class Comments {
    private Integer commentId;
    private Integer userId;
    private Integer articleId;
    private Long commentLikeCount;
    private Date commentDate;
    private String commentContent;
    private Integer parentCommentId;

    @Override
    public String toString() {
        return "Comments{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", articleId=" + articleId +
                ", commentLikeCount=" + commentLikeCount +
                ", commentDate=" + commentDate +
                ", commentContent='" + commentContent + '\'' +
                ", parentCommentId=" + parentCommentId +
                '}';
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Long getCommentLikeCount() {
        return commentLikeCount;
    }

    public void setCommentLikeCount(Long commentLikeCount) {
        this.commentLikeCount = commentLikeCount;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Integer parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public Comments(Integer commentId, Integer userId, Integer articleId, Long commentLikeCount, Date commentDate, String commentContent, Integer parentCommentId) {
        this.commentId = commentId;
        this.userId = userId;
        this.articleId = articleId;
        this.commentLikeCount = commentLikeCount;
        this.commentDate = commentDate;
        this.commentContent = commentContent;
        this.parentCommentId = parentCommentId;
    }

    public Comments() {
    }
}
