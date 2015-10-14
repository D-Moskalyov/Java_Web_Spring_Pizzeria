package web.pizzeria.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.pizzeria.model.Category;
import web.pizzeria.model.Good;
import web.pizzeria.service.GoodService;

import java.util.List;

@Controller
@RequestMapping("/shop")
@Transactional
public class ShopController {
    @Autowired
    GoodService srv;

    public ShopController(GoodService srv) {
        this.srv = srv;
    }

    public ShopController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public String categories(ModelMap model) {
        List<Category> cats = srv.getCategoryList();
        model.addAttribute("cats", cats);
        model.addAttribute("title", "Categories");

        return "categories";
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public String goods(
            @PathVariable(value = "id")
            Integer id,
            ModelMap model) {
        List<Good> goods = srv.getList(id);
        Category cat = srv.findCategory(id);
        model.addAttribute("goods", goods);
        model.addAttribute("title", cat.getName());

        return "goodlist";
    }
}
