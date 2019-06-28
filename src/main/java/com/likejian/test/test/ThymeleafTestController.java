package com.likejian.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafTestController {

  @RequestMapping("index")
  public String test(Model model) {
    model.addAttribute("name", "likejian");
    List<String> list = new ArrayList<>();
    list.add("lisi");
    list.add("wangwu");
    model.addAttribute("list", list);
    return "index";
  }
}
