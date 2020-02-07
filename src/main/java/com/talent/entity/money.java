package com.talent.entity;

public class money {
    private Integer mid;

    private Integer tid;

    private Integer bid;

    private String mtime;

    private String mmoney;

    private String mother;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime == null ? null : mtime.trim();
    }

    public String getMmoney() {
        return mmoney;
    }

    public void setMmoney(String mmoney) {
        this.mmoney = mmoney == null ? null : mmoney.trim();
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother == null ? null : mother.trim();
    }
}