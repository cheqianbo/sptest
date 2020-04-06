package com.laowang.sptest.service;

import com.laowang.sptest.dao.TbContentMapper;
import com.laowang.sptest.model.TbContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestImpl implements Test {
    @Autowired
    TbContentMapper tbContentMapper;
    public void save(String  query) {
        TbContent tb =new TbContent();
        tb.setCategoryId("1");
        tb.setPic(query);
        tbContentMapper.insert(tb);
    }
}
