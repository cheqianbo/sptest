package com.laowang.sptest.model;

import java.util.Date;

public class Data {
    private Integer id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer userid;

    private String cpu;

    private String memory;

    private String displaycard;

    private String mainboard;

    private String productyear;

    private String maxversion;

    private String rayversion;

    private Date maxrenderertime;

    private Date maxcreatetime;

    private String aeversion;

    private Date aeoutputtime;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu == null ? null : cpu.trim();
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory == null ? null : memory.trim();
    }

    public String getDisplaycard() {
        return displaycard;
    }

    public void setDisplaycard(String displaycard) {
        this.displaycard = displaycard == null ? null : displaycard.trim();
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard == null ? null : mainboard.trim();
    }

    public String getProductyear() {
        return productyear;
    }

    public void setProductyear(String productyear) {
        this.productyear = productyear == null ? null : productyear.trim();
    }

    public String getMaxversion() {
        return maxversion;
    }

    public void setMaxversion(String maxversion) {
        this.maxversion = maxversion == null ? null : maxversion.trim();
    }

    public String getRayversion() {
        return rayversion;
    }

    public void setRayversion(String rayversion) {
        this.rayversion = rayversion == null ? null : rayversion.trim();
    }

    public Date getMaxrenderertime() {
        return maxrenderertime;
    }

    public void setMaxrenderertime(Date maxrenderertime) {
        this.maxrenderertime = maxrenderertime;
    }

    public Date getMaxcreatetime() {
        return maxcreatetime;
    }

    public void setMaxcreatetime(Date maxcreatetime) {
        this.maxcreatetime = maxcreatetime;
    }

    public String getAeversion() {
        return aeversion;
    }

    public void setAeversion(String aeversion) {
        this.aeversion = aeversion == null ? null : aeversion.trim();
    }

    public Date getAeoutputtime() {
        return aeoutputtime;
    }

    public void setAeoutputtime(Date aeoutputtime) {
        this.aeoutputtime = aeoutputtime;
    }

    public String getExtendinfo() {
        return extendinfo;
    }

    public void setExtendinfo(String extendinfo) {
        this.extendinfo = extendinfo == null ? null : extendinfo.trim();
    }
}