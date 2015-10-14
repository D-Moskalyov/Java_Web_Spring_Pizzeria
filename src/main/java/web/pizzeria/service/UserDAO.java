package web.pizzeria.service;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.pizzeria.model.User;

import java.sql.SQLException;
import java.util.List;

@Repository(value = "userDAO")
@Transactional
public class UserDAO implements UserService, UserDetailsService {

    @Autowired
    @Qualifier(value = "sessionFactory")
    SessionFactory sf;

    public User find(Integer id) {
        return (User) sf.getCurrentSession().get(User.class, id);
    }

    public List<User> findAll() throws SQLException {
        return sf.getCurrentSession().createQuery("from User").list();
    }

    public int save(User u) {
        return (Integer) sf.getCurrentSession().save(u);
    }

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
