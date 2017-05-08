package com.test.dao;



import java.util.List;

import com.test.model.UserBaseInfo;

public interface UserBaseInfoDao {

	public  List<UserBaseInfo> findALL();
	public int delete(int id);
    
}
