package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {
    //@Qualifier("testDao")
    //@Autowired(required=false)
    //效果是一样的,与Autowired一样可以装配bean
    //1,不支持Primary功能
    //2,不支持Autowired false
//    @Resource
//    @Qualifier("testDao")
    @Autowired
    private TestDao testDao1;

    public void println() {
        System.out.println(testDao1);
    }
}
