package com.talent.entity;

public class business {
    private Integer bid;

    private String busername;

    private String bpassword;

    private String bname;

    private String baddress;

    private String btime;

    private String bservice;

    private String bphoto;

    private String bjob;

    private String bother;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBusername() {
        return busername;
    }

    public void setBusername(String busername) {
        this.busername = busername == null ? null : busername.trim();
    }

    public String getBpassword() {
        return bpassword;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword == null ? null : bpassword.trim();
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime == null ? null : btime.trim();
    }

    public String getBservice() {
        return bservice;
    }

    public void setBservice(String bservice) {
        this.bservice = bservice == null ? null : bservice.trim();
    }

    public String getBphoto() {
        return bphoto;
    }

    public void setBphoto(String bphoto) {
        this.bphoto = bphoto == null ? null : bphoto.trim();
    }

    public String getBjob() {
        return bjob;
    }

    public void setBjob(String bjob) {
        this.bjob = bjob == null ? null : bjob.trim();
    }

    public String getBother() {
        return bother;
    }

    public void setBother(String bother) {
        this.bother = bother == null ? null : bother.trim();
    }
}