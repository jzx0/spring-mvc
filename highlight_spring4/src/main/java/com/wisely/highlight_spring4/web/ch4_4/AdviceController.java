package com.wisely.highlight_spring4.web.ch4_4;

import com.wisely.highlight_spring4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/5/3 14:48
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉，参数有误/来自@ModelAttribute：" + msg);
    }
}
