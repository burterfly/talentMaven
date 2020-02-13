package com.talent.entity;

public class tcontract {
    private Integer tcid;
    private String tcname;
    private String tccontent;
    private Integer tid;
    private String tcother;
    public Integer getTcid() {
        return tcid;
    }
    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }
    public String getTcname() {
        return tcname;
    }
    public void setTcname(String tcname) {
        this.tcname = tcname == null ? null : tcname.trim();
    }
    public String getTccontent() {
        return tccontent;
    }
    public void setTccontent(String tccontent) {
        this.tccontent = tccontent == null ? null : tccontent.trim();
    }
    public Integer getTid() {
        return tid;
    }
    public void setTid(Integer tid) {
        this.tid = tid;
    }
    public String getTcother() {
        return tcother;
    }
    public void setTcother(String tcother) {
        this.tcother = tcother == null ? null : tcother.trim();
    }
}