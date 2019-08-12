package cn.bao.dao;

import cn.bao.domain.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {


    //查询所有
    @Select("select * from category")
    List<Category> findAll();

    //保存
    @Insert("insert into category (cid,cname) values (#{cid},#{cname})")
    void saveCategory(Category category);
}
