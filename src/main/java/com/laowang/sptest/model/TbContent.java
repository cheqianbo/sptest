package com.laowang.sptest.model;

import lombok.Data;

import java.util.Date;
@Data
public class TbContent {
    private Long id;

    private String categoryId;

    private String title;

    private String subTitle;

    private String titleDesc;

    private String url;

    private String pic;

    private String pic2;

    private Date created;

    private Date updated;

    private String content;
}