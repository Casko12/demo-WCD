package com.example.demo.dao.impl;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CustomerDAOImpl implements CustomerDAO {
    EntityManager en;
    EntityTransaction tran;
    public CustomerDAOImpl() {
        en = PersistenceUtil.
    }

}
