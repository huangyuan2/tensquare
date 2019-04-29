package com.pojo;

public class Paper {
    private long paperId;

    private String name;

    private Integer number;

    private String detail;

    public Paper() {
    }

    public Paper(long paperId, String name, Integer number, String detail) {
        this.paperId = paperId;
        this.name = name;
        this.number = number;
        this.detail = detail;
    }

    public long getPaperId() {
        return paperId;
    }

    public void setPaperId(long paperId) {
        this.paperId = paperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "paperId=" + paperId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", detail='" + detail + '\'' +
                '}';
    }
}
