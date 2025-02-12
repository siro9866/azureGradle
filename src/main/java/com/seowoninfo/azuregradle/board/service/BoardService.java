package com.seowoninfo.azuregradle.board.service;

import com.seowoninfo.azuregradle.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FileName    : IntelliJ IDEA
 * Author      : Seowon
 * Date        : 2025-02-11
 * Description :
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardRepository boardRepository;

    public void boardList(){
        boardRepository.findAll();
    }
}
