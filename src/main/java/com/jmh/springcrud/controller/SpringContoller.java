package com.jmh.springcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringContoller {

    @RequestMapping("/spring")
    public String spring() {
        return "spring";        /* 원시적으로 return값으로 /spring.html를 입력하지만, application.yml 설정 값
                                  요 suffix를 .html로 했기 때문에 전달받는 템플릿 html명만 리턴값으로 넣어도 된다 */
    }
}