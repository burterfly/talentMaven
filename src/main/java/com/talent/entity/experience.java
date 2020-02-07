package com.talent.entity;

public class experience {
    private Integer eid;

    private Integer tid;

    private Integer bid;

    private String ejob;

    private String etime;

    private Integer esco;

    private String eother;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
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

    public String getEjob() {
        return ejob;
    }

    public void setEjob(String ejob) {
        this.ejob = ejob == null ? null : ejob.trim();
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime == null ? null : etime.trim();
    }

    public Integer getEsco() {
        return esco;
    }

    public void setEsco(Integer esco) {
        this.esco = esco;
    }

    public String getEother() {
        return eother;
    }

    public void setEother(String eother) {
        this.eother = eother == null ? null : eother.trim();
    }
}