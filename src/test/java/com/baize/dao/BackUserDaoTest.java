package com.baize.dao;

import com.baize.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"
        ,  "classpath:spring-context.xml","classpath:mybatis-config.xml"})
public class BackUserDaoTest {
    @Autowired
    private IBackUserDao backUserDao;
    @Test
    public void checkBackLoginTest(){
        User user = backUserDao.checkBackLogin("admin2", "admin2");
        System.out.println(user);
    }
}
