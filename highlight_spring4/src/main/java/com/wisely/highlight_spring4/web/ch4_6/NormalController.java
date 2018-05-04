package com.wisely.highlight_spring4.web.ch4_6;

import com.wisely.highlight_spring4.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/5/4 15:23
 */
@Controller
public class NormalController {

    @Autowired
    private TestDemoService testDemoService;

    @RequestMapping("/normal")
    public String testPage(Model model) {
        model.addAttribute("msg", testDemoService.saySomething());
        return "page";
    }
}
