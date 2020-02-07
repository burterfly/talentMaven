package com.talent.entity;

public class staff {
    private Integer sid;

    private String susername;

    private String spassword;

    private String sother;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername == null ? null : susername.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getSother() {
        return sother;
    }

    public void setSother(String sother) {
        this.sother = sother == null ? null : sother.trim();
    }
}