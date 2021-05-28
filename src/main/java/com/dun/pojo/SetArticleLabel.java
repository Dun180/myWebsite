package com.dun.pojo;

public class SetArticleLabel {
    private Integer articleId;
    private Integer labelId;

    @Override
    public String toString() {
        return "SetArticleLabel{" +
                "articleId=" + articleId +
                ", labelId=" + labelId +
                '}';
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public SetArticleLabel(Integer articleId, Integer labelId) {
        this.articleId = articleId;
        this.labelId = labelId;
    }

    public SetArticleLabel() {
    }
}
