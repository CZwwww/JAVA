package com.xms.day02.dao.impl;

import com.xms.day02.dao.UserDao;
import com.xms.day02.domain.User;

import java.sql.Connection;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-10-上午 11:39
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void insert(Connection conn, User user) {

    }

    @Override
    public void deleteByid(Connection conn, int id) {

    }

    @Override
    public void update(Connection conn, User user) {

    }

    @Override
    public User getUser(Connection conn, Object... objs) {
        return null;
    }

    @Override
    public List<User> getAllUsers(Connection conn) {
        return null;
    }

    @Override
    public Long getCount(Connection conn) {
        return null;
    }

    @Override
    public int getMaxAge(Connection conn) {
        return 0;
    }
}
