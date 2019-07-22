package com.baize.service.impl;

import com.baize.dao.IBackUserDao;
import com.baize.domain.User;
import com.baize.service.IBackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackUserServiceImpl implements IBackUserService {
    @Autowired
    private IBackUserDao backUserDao;
    @Override
    public User checkBackLogin(String username, String password) {
        return backUserDao.checkBackLogin(username,password);
    }
}
