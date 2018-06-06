package com.test;

import com.service.MyService;
import com.service.Servicess;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
public class TestXML {

  //  @Autowired
    private Servicess myService;

    @Test
    public void testIoC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Servicess myService = (Servicess)applicationContext.getBean("service");
        myService.aspectJ();
        //this.myService.aspectJ();


    }
}
