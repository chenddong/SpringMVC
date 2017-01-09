package com.tenX.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.tenX.entity.User;
import com.tenX.service.IUserService;
	  
	@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
	@ContextConfiguration(locations = {"classpath:spring-db.xml"})  
	  
	public class TestMybatis {  
	    private static Logger logger = Logger.getLogger(TestMybatis.class);  
	    private ApplicationContext ac = null;  
	    @Resource  
	    private IUserService userService = null;  
	  
	  @Before(value = "")  
	  public void before() {  
	      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
	      userService = (IUserService) ac.getBean("userService");  
	  }  
	  
	    @Test  
	    public void test1() {  
	        User user = userService.getUserById(1);  
	        System.out.println(user.getName());  
	        // logger.info("值："+user.getUserName());  
	      //  logger.info(JSON.toJSONString(user));  
	    }  
}  

