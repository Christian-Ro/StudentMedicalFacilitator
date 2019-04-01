package com.studentmedicalfacilitator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = {"/", "home"})
    public String home(){
        return "Home";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Admin";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/403")
    public String error403(){
        return "Error 403";
    }
}
