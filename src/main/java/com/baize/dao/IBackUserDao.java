package com.baize.dao;

import com.baize.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 黄高鹏
 *
 */
@Repository
public interface IBackUserDao {
    User checkBackLogin(@Param("username")String username, @Param("password")String password);
}
