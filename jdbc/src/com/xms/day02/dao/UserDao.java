package com.xms.day02.dao;

import com.xms.day02.domain.User;

import java.sql.Connection;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-10-上午 11:36
 */
public interface UserDao {
    void insert(Connection conn, User user);
    void deleteByid(Connection conn,int id);
    void update(Connection conn,User user);
    User getUser(Connection conn ,Object...objs);
    List<User> getAllUsers(Connection conn);
    Long getCount(Connection conn);
    int getMaxAge(Connection conn);
}
