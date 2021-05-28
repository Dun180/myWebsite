package com.dun.pojo;

public class Labels {
    private Integer labelId;
    private String labelName;
    private String labelAlias;
    private String labelDescription;

    @Override
    public String toString() {
        return "Labels{" +
                "labelId=" + labelId +
                ", labelName='" + labelName + '\'' +
                ", labelAlias='" + labelAlias + '\'' +
                ", labelDescription='" + labelDescription + '\'' +
                '}';
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelAlias() {
        return labelAlias;
    }

    public void setLabelAlias(String labelAlias) {
        this.labelAlias = labelAlias;
    }

    public String getLabelDescription() {
        return labelDescription;
    }

    public void setLabelDescription(String labelDescription) {
        this.labelDescription = labelDescription;
    }

    public Labels(Integer labelId, String labelName, String labelAlias, String labelDescription) {
        this.labelId = labelId;
        this.labelName = labelName;
        this.labelAlias = labelAlias;
        this.labelDescription = labelDescription;
    }

    public Labels() {
    }
}
