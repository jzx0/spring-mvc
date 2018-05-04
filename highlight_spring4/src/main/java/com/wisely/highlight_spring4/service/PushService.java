package com.wisely.highlight_spring4.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 定时任务
 * 定时更新deferredResult
 *
 * @author jiang.zhenxiong
 * created on 2018/5/4 14:18
 */
@Service
public class PushService {

    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate() {
        deferredResult = new DeferredResult<>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void refresh() {
        if (deferredResult != null) {
            deferredResult.setResult(Long.toString(System.currentTimeMillis()));
        }
    }
}
