package de.aittr.MVCdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String getAllUsers(Model model){
     List<User> users = service.getAllUsers();
     model.addAttribute("users", users);
     return "users_view";
    }

}
