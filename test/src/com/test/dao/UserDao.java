package com.test.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.model.User;

public class UserDao {
    public JdbcTemplate jdbcTemplate;
    

    public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public  List<User> findALL() {
        String sql = "select * from userinfo";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        Iterator<Map<String,Object>> iterator = list.iterator();
        List<User> users= new ArrayList<User>();
        while (iterator.hasNext()) {
            Map<String,Object> map4dept = iterator.next();
            User user = new User();
            user.setId((int)map4dept.get("id"));
            user.setUsername((String)map4dept.get("username"));
            user.setPassword((String)map4dept.get("password"));
            users.add(user);
        }
		return users;
    }
	public int delete(int id){
		String sql = "delete from userinfo where id=?";
		return jdbcTemplate.update(sql, id);
	}
    
}
