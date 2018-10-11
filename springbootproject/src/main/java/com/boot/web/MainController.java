package com.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张明亮
 * @date 2018/10/9 14:56
 */
@RestController
public class MainController {
    @RequestMapping(value = "/")
    public String home() {
        return "Hello World!";
    }
}
