package com.oldold.gua.config;

import com.oldold.gua.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @auther panwang1
 * @create 2019-02-18 14:35
 */

@Configuration

public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/**").excludePathPatterns("/api/**");
    }

    @Bean
    LoginInterceptor loginInterceptor() {

        return new LoginInterceptor();
    }


}
