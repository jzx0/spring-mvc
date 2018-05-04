package com.wisely.highlight_spring4.web.ch4_5;

import com.wisely.highlight_spring4.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/5/4 14:16
 */
@Controller
public class AsyncController {

    @Autowired
    private PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall() {
        return pushService.getAsyncUpdate();
    }
}
