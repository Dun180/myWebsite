package com.dun.pojo;

public class Sorts {
    private Integer sortId;
    private String sortName;
    private String sortAlias;
    private String sortDescription;
    private Integer parentSortId;

    @Override
    public String toString() {
        return "Sorts{" +
                "sortId=" + sortId +
                ", sortName='" + sortName + '\'' +
                ", sortAlias='" + sortAlias + '\'' +
                ", sortDescription='" + sortDescription + '\'' +
                ", parentSortId=" + parentSortId +
                '}';
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortAlias() {
        return sortAlias;
    }

    public void setSortAlias(String sortAlias) {
        this.sortAlias = sortAlias;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    public Integer getParentSortId() {
        return parentSortId;
    }

    public void setParentSortId(Integer parentSortId) {
        this.parentSortId = parentSortId;
    }

    public Sorts(Integer sortId, String sortName, String sortAlias, String sortDescription, Integer parentSortId) {
        this.sortId = sortId;
        this.sortName = sortName;
        this.sortAlias = sortAlias;
        this.sortDescription = sortDescription;
        this.parentSortId = parentSortId;
    }

    public Sorts() {
    }
}
