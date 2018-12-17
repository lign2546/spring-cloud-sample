package com.yupaits.client.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yupaits
 * @date 2018/12/17
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/index")
    public String index(@RequestParam(required = false) String code) {
        if (code != null) {
            return "redirect:/index";
        }
        return "index";
    }

    @GetMapping("/secured")
    public String securedPage() {
        return "securedPage";
    }
}
