package com.wisely.highlight_spring4;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * Web配置
 *
 * @author jiang.zhenxiong
 * created on 2018/4/24 17:05
 */
// WebApplicationInitializer是Spring提供用来配置Servlet 3.0+配置的接口，从而实现了替代web.xml的位置。
// 实现此接口将会自动被SpringServletContainerInitializer（用来启动Servlet 3.0容器）获取到。
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext);

        //注册Spring MVC的DispatcherServlet
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        //开启异步方法支持
        servlet.setAsyncSupported(true);
    }
}
