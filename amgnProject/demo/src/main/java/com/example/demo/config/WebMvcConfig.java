package com.example.demo.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 기본적인 서블릿 설정을 하는 클래스

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        MustacheViewResolver resolver = new MustacheViewResolver();

        resolver.setCharset("UTF-8"); // 인코딩
        resolver.setContentType("text/html;charset=UTF-8"); // UTF-8로 된 html 파일이라는 것을 명시
        resolver.setPrefix("classpath:/templates/"); // classpath: 지금 사용하는 프로젝트
        resolver.setSuffix(".html"); // .html 파일을 만들어도 .mustach로 인식

        registry.viewResolver(resolver); // registry로 viewResolve 등록
    }
}