package web.pizzeria.service;


import web.pizzeria.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    User find(Integer id);
    List<User> findAll() throws SQLException;
//    User findFlowUser() throws SQLException, CustomerNotIdentityException;
//    User findUser(User us) throws SQLException, CustomerNotFoundException;
//    User attemptAddCustomer(User us) throws SQLException, CustomerAlreadyExist;
    int save(User u);
}
