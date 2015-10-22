package web.pizzeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.pizzeria.model.User;
import web.pizzeria.service.UserService;

import java.util.Map;

@Controller
@RequestMapping("/user")
@Transactional
@SessionAttributes("current")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String user(
            UsernamePasswordAuthenticationToken currentUser,
            @RequestParam(value = "id",required = true, defaultValue = "1")
            Integer id,
            Model model) {
        User u = userService.find(id);
        User current = (User) currentUser.getPrincipal();
        model.addAttribute("user", u);
        model.addAttribute("current", current);
        model.addAttribute("title", current.getName());
        return "user";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {

        return "login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
     public String registration(Map<String, Object> model) {
        //exit
        User userForm = new User();
        String passYet = new String();
        model.put("userForm", userForm);
        //model.put("passYet", passYet);
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User user,
                               //@ModelAttribute("passYet") String passYet,
                               Map<String, Object> model) {
        //check
        return "redirect:/shop";
    }
}
