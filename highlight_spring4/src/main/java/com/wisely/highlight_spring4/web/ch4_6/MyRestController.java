package com.wisely.highlight_spring4.web.ch4_6;

import com.wisely.highlight_spring4.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/5/4 15:26
 */
@Controller
public class MyRestController {

    @Autowired
    TestDemoService testDemoService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest() {
        return testDemoService.saySomething();
    }
}
