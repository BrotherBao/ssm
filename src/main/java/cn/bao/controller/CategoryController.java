package cn.bao.controller;

import cn.bao.domain.Category;
import cn.bao.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层 查询所有");
        List<Category> all = categoryService.findAll();
        model.addAttribute("list",all);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Category category, HttpServletResponse response, HttpServletRequest request) throws IOException {
        categoryService.saveCategory(category);
        response.sendRedirect(request.getContextPath()+"/category/findAll");
        return;
    }
}
