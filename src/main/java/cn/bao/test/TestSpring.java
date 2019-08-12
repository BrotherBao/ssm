package cn.bao.test;

import cn.bao.service.impl.CategoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CategoryServiceImpl categoryService = applicationContext.getBean("categoryService", CategoryServiceImpl.class);
        categoryService.findAll();
    }
}
