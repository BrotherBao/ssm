package cn.bao.test;

import cn.bao.dao.CategoryDao;
import cn.bao.domain.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run1() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        CategoryDao dao = session.getMapper(CategoryDao.class);
        List<Category> all = dao.findAll();
        for(Category category:all){
            System.out.println(category);
        }
        session.close();
        in.close();
    }

    @Test
    public void run2() throws Exception {
        Category category = new Category();
        category.setCid("5");
        category.setCname("test");
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        CategoryDao dao = session.getMapper(CategoryDao.class);
        dao.saveCategory(category);
        session.commit();
        session.close();
        in.close();
    }
}
