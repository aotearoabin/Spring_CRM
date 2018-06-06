package com.test;

import com.domain.Account;
import com.service.MyService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTx {

    @Autowired
    private MyService myService;

    @Test
    public void testIoC(){
        org.hibernate.cfg.Configuration conf =  new org.hibernate.cfg.Configuration().configure();
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Account o1 = (Account)session.get(Account.class,"1");
        Account o2 = (Account)session.get( Account.class,"2");
        myService.trans(100,o1,o2);
    }


}
