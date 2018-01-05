package cn.kk.tr4_3.service;

import cn.kk.tr4.entity.WoUser;
import cn.kk.tr4_3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class MyService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserDao userDao;
    public String sayHi(){
        return "hello myService";
    }
    public List<WoUser> getUsersWithJdbc(){
        String sql = "select * from wo_user";
        List<WoUser> users = jdbcTemplate.query(sql, new RowMapper<WoUser>() {
            public WoUser mapRow(ResultSet resultSet, int i) throws SQLException {
                WoUser user = new WoUser();
                user.setUid(resultSet.getString("uid"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        });
        return users;
    }
    public List<WoUser> getUsersWithMybatis(){
        List<WoUser> users = userDao.getUsers();
        return users;
    }
}
