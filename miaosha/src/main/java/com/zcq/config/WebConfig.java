package com.zcq.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @Author: zcq
 * @Date: 2019/4/21 13:52
 */
@Configuration
public class WebConfig  extends WebMvcConfigurerAdapter {


    @Autowired
    UserArgumentResolver userArgumentResolver;

    //添加自定义参数解析器，通过自定义miaoshaUser参数，来获取信息，实现分布式session
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(userArgumentResolver);
    }
}
