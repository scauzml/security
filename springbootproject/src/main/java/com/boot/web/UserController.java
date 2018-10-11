package com.boot.web;

import com.boot.domain.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张明亮
 * @date 2018/10/9 16:27
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/do")
    public String getIndex(Model model){
        User user = userService.selectUserById(1);
        model.addAttribute("user", user);
        return "index";
    }

    }
