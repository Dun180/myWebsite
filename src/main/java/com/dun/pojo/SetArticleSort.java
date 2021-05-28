package com.dun.pojo;

public class SetArticleSort {
    private Integer articleId;
    private Integer sortId;

    @Override
    public String toString() {
        return "SetArticleSort{" +
                "articleId=" + articleId +
                ", sortId=" + sortId +
                '}';
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public SetArticleSort(Integer articleId, Integer sortId) {
        this.articleId = articleId;
        this.sortId = sortId;
    }

    public SetArticleSort() {
    }
}
