package com.gudrms7229.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨트롤러임을 나타냄
public class HomeController {

    @GetMapping("/") //경로(/)에 대한 GET 요청을 처리
    public String index() {
        return "index"; //index.html을 띄우겠다,
    }

}
