package com.talent.entity;

public class talent {
    private Integer tid;

    private String tusername;

    private String tpassword;

    private String tname;

    private Integer tage;

    private String tsex;

    private String tcer;

    private String tedu;

    private String tpro;

    private Integer tsco;

    private String twages;

    private String tother;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTusername() {
        return tusername;
    }

    public void setTusername(String tusername) {
        this.tusername = tusername == null ? null : tusername.trim();
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword == null ? null : tpassword.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex == null ? null : tsex.trim();
    }

    public String getTcer() {
        return tcer;
    }

    public void setTcer(String tcer) {
        this.tcer = tcer == null ? null : tcer.trim();
    }

    public String getTedu() {
        return tedu;
    }

    public void setTedu(String tedu) {
        this.tedu = tedu == null ? null : tedu.trim();
    }

    public String getTpro() {
        return tpro;
    }

    public void setTpro(String tpro) {
        this.tpro = tpro == null ? null : tpro.trim();
    }

    public Integer getTsco() {
        return tsco;
    }

    public void setTsco(Integer tsco) {
        this.tsco = tsco;
    }

    public String getTwages() {
        return twages;
    }

    public void setTwages(String twages) {
        this.twages = twages == null ? null : twages.trim();
    }

    public String getTother() {
        return tother;
    }

    public void setTother(String tother) {
        this.tother = tother == null ? null : tother.trim();
    }
}