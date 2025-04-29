package mk.ukim.finki.lab.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.h2.engine.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class LogoutController {
    @GetMapping
    public String Logout(HttpServletRequest request, Model model){
        request.getSession().invalidate();
        return "redirect:/login";
    }
}
