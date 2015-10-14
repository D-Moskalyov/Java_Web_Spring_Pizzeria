package web.pizzeria.service;


import web.pizzeria.model.Category;
import web.pizzeria.model.Good;

import java.util.List;

public interface GoodService {
    public List<Good> getList(Integer id);
    public List<Category> getCategoryList();
    public Good find(Integer id);
    public Category findCategory(Integer id);
}
