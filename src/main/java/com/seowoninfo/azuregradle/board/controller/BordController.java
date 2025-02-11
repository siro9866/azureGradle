package com.seowoninfo.azuregradle.board.controller;

import com.seowoninfo.azuregradle.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName    : IntelliJ IDEA
 * Author      : Seowon
 * Date        : 2025-02-11
 * Description :
 */
@RestController
@RequiredArgsConstructor
public class BordController {

    private final BoardService boardService;

    @GetMapping("/sample")
    public String sample() {
        return "Hello World~~~~~";
    }

    @GetMapping("/board")
    public void boardList() {
        boardService.boardList();
    }

}
