package blog.controllers;

import blog.models.LoginForm;
import blog.services.NotificationService;
import blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    NotificationService notifyService;

    @RequestMapping("/login")
    public String login(LoginForm loginForm) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notifyService.addErrorMessage("Please fill the form correctly.");
            return "login";
        }
        if (!userService.authenticate(loginForm.getUsername(), loginForm.getPassword())) {
            notifyService.addErrorMessage("Invalid login!");
            return "login";
        }

        notifyService.addInfoMessage("Login successful");
        return "redirect:/";

    }
}
