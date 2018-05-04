package com.wisely.highlight_spring4.web.ch4_5;

import com.wisely.highlight_spring4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/5/4 10:55
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
