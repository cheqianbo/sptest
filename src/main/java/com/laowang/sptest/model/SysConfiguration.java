package com.laowang.sptest.model;

import java.util.Date;

public class SysConfiguration {
    private Integer id;

    private Date gmtCreate;

    private Date gmtModified;

    private String link;

    private String extendinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getExtendinfo() {
        return extendinfo;
    }

    public void setExtendinfo(String extendinfo) {
        this.extendinfo = extendinfo == null ? null : extendinfo.trim();
    }
}