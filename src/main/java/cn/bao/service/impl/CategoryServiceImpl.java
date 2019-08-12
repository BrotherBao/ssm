package cn.bao.service.impl;

import cn.bao.dao.CategoryDao;
import cn.bao.domain.Category;
import cn.bao.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findAll() {
        System.out.println("业务层 查询所有");
        return categoryDao.findAll();
    }

    public void saveCategory(Category category) {
        System.out.println("业务层 存储");
        categoryDao.saveCategory(category);
    }
}
