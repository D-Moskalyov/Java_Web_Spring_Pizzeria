package web.pizzeria.service;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.pizzeria.model.Category;
import web.pizzeria.model.Good;

import java.util.List;

@Repository(value = "goodDAO")
@Transactional
public class GoodDAO implements GoodService {

    @Autowired
    @Qualifier(value = "sessionFactory")
    SessionFactory sf;

    public Good find(Integer id) {
        return (Good) sf.getCurrentSession().get(Good.class, id);
    }

    public Category findCategory(Integer id) {
        return (Category) sf.getCurrentSession().get(Category.class, id);
    }

    public List<Category> getCategoryList() {
        Query q = sf.getCurrentSession().createQuery("from Category");
        return q.list();
    }

    public List<Good> getList(Integer id) {
//        Query q = sf.getCurrentSession().createQuery("from Good g where g.category.id = :catId");
//        q.setInteger("catId", id);
        Query q = sf.getCurrentSession().createQuery("from Good");
        //q.setInteger("catId", id);
        return q.list();
    }
}
