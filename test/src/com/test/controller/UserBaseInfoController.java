package com.test.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.dao.UserBaseInfoDao;
import com.test.model.UserBaseInfo;





@Controller
@RequestMapping("/UserBaseInfo")
public class UserBaseInfoController {
	@Autowired
	public UserBaseInfoDao userBaseInfoDao;
	
    @ResponseBody
    @RequestMapping(value="/getUserList",method=RequestMethod.GET)
    public List<UserBaseInfo> getUserList(){
        List<UserBaseInfo> list=userBaseInfoDao.findALL();
        System.out.println("Hello,world");
        return list;
    }
    
    @ResponseBody
    @RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
    public int delect(@PathVariable int id){
        int a=userBaseInfoDao.delete(id);
        System.out.println("Hello,world");
        return a;
    }
    
}
