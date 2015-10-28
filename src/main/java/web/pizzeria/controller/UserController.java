package web.pizzeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import web.pizzeria.model.Good;
import web.pizzeria.model.User;
import web.pizzeria.service.EmailExistsException;
import web.pizzeria.service.UserDTO;
import web.pizzeria.service.UserService;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/user")
@Transactional
@SessionAttributes("current")
//@SpringBootApplication
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
    public String registration(Model model) {
        //exit
        //User userForm = new User();
        //String passYet = new String("sad");
        //model.put("userForm", userForm);
        //model.put("passYet", passYet);
        //return "registration";

        UserDTO userDTO = new UserDTO();
        model.addAttribute("userDTO", userDTO);
        //model.put("userDTO", userDTO);
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@Valid @ModelAttribute("userDTO") UserDTO userDTO,
                                BindingResult result, Errors errors) {
        User registered = null;
        if (!result.hasErrors()) {
            registered = createUserAccount(userDTO, result);
            if (registered == null) {
                result.rejectValue("email", "message.regError");
            }
        }
        if (result.hasErrors()) {
            return "registration";
            //return new ModelAndView("registration", "userDTO", userDTO);
        }
        else {
            return "redirect:/shop";
            //return new ModelAndView("login");
        }
        //return "redirect:/shop";
    }

//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public String registration(UserDTO userDTO) {
////        UserDTO userDTO = new UserDTO();
////        model.addAttribute("userDTO", userDTO);
////        //model.put("userDTO", userDTO);
//        return "registration";
//    }
//
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String registration(@Valid UserDTO userDTO, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//        return "redirect:/shop";
//    }

    private User createUserAccount(UserDTO userDTO, BindingResult result) {
        User registered = null;
        try {
            registered = userService.registerNewUserAccount(userDTO);
        } catch (EmailExistsException e) {
            return null;
        }
        return registered;
    }
}

