package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes({"loggedUser"})
public class AuthController {
    @GetMapping("/login")
    public String showLogin() {
        return "auth/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        Map<String, Member> fake_users = new HashMap<>();
        fake_users.put("johnd", new Member(
                1, "john", "doe", "johnd", "example", false
        ));

        Member member = Member.login(username, password, fake_users);

        if (member == null) {
            return "auth/login";
        }

        model.addAttribute("loggedUser", member);

        return "redirect:/movies";
    }

    @PostMapping("/logout")
    public String logout(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        System.out.println("Disconnected");

        return "redirect:/movies";
    }
}
