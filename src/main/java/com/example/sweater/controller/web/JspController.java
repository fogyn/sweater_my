package com.example.sweater.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class JspController {

    @GetMapping("/index")
    public String index(@RequestParam Map<String, Object> model) {

        model.put("name", "HAi");
        return "index";
    }
    @GetMapping(value = {"/welcome"})
    public String getIndex(Map<String, Object> model) {
        model.put("name", "You get on page Notebook!!!");
        model.put("uploadpath","test.jpg");
        return "index";
    }


}
