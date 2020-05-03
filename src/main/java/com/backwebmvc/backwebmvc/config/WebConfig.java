package com.backwebmvc.backwebmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc 보통 설정안함
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/m/**")
                .addResourceLocations("classpath:/m/")// /로 끝나야
                .setCachePeriod(20);
    }
    //webjars? bootstrap 등등 jar파일로 추가할수 있다.
    //리소스 체이닝 리소스 핸들러 리소스 트랜스포머를 체이닝하는 기법 버전생략가능
}
