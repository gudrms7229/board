package com.gudrms7229.board.controller;

import com.gudrms7229.board.dto.BoardDTO;
import com.gudrms7229.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor //필요한 도구(BoardService)를 자동으로 준비해 주는 역할을 함
public class BoardController {
    private final BoardService boardService; // 생성자를 통해 boardService가 자동으로 주입됨 (의존성 주입)

    @GetMapping("/save") //경로(/)에 대한 GET 요청을 처리
    public String save() {
        return "save"; // save.html로 이동
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        return "index";
    }
}
