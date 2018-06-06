package com.service;

import com.dao.MyDao;
import com.domain.Account;

public class MyService implements Servicess {
    private MyDao myDao;

    public MyDao getMyDao() {
        return myDao;
    }
    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }

    public void trans(int num, Account from, Account target){
//        myDao.updateAccount(from.getId(),num);
//        myDao.updateAccount(target.getId(),-num);

    }
    public void aspectJ(){
        System.out.println("原方法调用");
        myDao.updateAccounts();
    }
}
