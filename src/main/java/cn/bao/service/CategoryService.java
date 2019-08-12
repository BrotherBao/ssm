package cn.bao.service;

import cn.bao.domain.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    void saveCategory(Category category);
}
