package com.baize.service;

import com.baize.domain.User;

public interface IBackUserService {

    User checkBackLogin(String username, String password);
}
