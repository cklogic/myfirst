package com.test.action;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.dao.UserDao;
import com.test.model.User;





@Controller
@RequestMapping("/User")
public class UserInfoAction {
	@Autowired
	public UserDao userDao;
	
    @ResponseBody
    @RequestMapping(value="/getUserList",method=RequestMethod.GET)
    public List<User> getUserList(){
        List<User> list=userDao.findALL();
        System.out.println("Hello,world");
        return list;
    }
    
    @ResponseBody
    @RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
    public int delect(@PathVariable int id){
        int a=userDao.delete(id);
        System.out.println("Hello,world");
        return a;
    }
    
}
