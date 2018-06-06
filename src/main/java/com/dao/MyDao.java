package com.dao;

import com.domain.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class MyDao extends JdbcDaoSupport{

    /*
    public void updateAccount(String id,int num){
        org.hibernate.cfg.Configuration conf =  new org.hibernate.cfg.Configuration().configure();
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Account o = (Account)session.get(Account.class,id);
        int pass = o.getPass();
        o.setPass(pass+num);
        session.update(o);
        session.close();
    }
    */

    public void updateAccounts(){
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        jdbcTemplate.update("insert into tx_test (id,user,pass) values(?,?,?)",22222,3,4);
    }}
