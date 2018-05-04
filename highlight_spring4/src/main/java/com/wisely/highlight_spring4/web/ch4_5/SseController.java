package com.wisely.highlight_spring4.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/5/4 11:30
 */
@Controller
public class SseController {

    /**
     * 使用输出的媒体类型为text/event-stream，这是服务器端SSE的支持
     * 本例演示每5秒钟向浏览器推送随机消息
     * @return
     */
    @RequestMapping(value = "/push", produces = "text/event-stream;charset=UTF-8") //
    public @ResponseBody String push() {
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + r.nextInt() + "\n\n";
    }
}
