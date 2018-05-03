package com.wisely.highlight_spring4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/4/24 17:13
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "index";
    }
}
