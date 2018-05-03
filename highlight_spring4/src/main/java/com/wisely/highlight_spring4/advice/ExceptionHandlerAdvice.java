package com.wisely.highlight_spring4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/5/3 14:35
 */
//声明一个控制器建言
@ControllerAdvice
public class ExceptionHandlerAdvice {

    //设置过滤拦截的条件为Exception.class
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }

    //使用@ModelAttribute注解将键值对添加到全局，所有注解的@RequestMapping的方法可获得此键值对
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息");
    }

    //通过@InitBinder注解定制WebDataBinder
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        //忽略request参数的id
        webDataBinder.setDisallowedFields("id");
    }
}
