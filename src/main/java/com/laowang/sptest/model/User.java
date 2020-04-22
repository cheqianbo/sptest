package com.laowang.sptest.model;

import java.util.Date;

public class User {
    private Integer id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer appid;

    private String name;

    private Integer sex;

    private String address;

    private String phonenumber;

    private String email;

    private String working;

    private String softs;

    private String role;

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

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working == null ? null : working.trim();
    }

    public String getSofts() {
        return softs;
    }

    public void setSofts(String softs) {
        this.softs = softs == null ? null : softs.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getExtendinfo() {
        return extendinfo;
    }

    public void setExtendinfo(String extendinfo) {
        this.extendinfo = extendinfo == null ? null : extendinfo.trim();
    }
}