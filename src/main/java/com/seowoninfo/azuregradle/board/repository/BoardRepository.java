package com.seowoninfo.azuregradle.board.repository;

import com.seowoninfo.azuregradle.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * FileName    : IntelliJ IDEA
 * Author      : Seowon
 * Date        : 2025-02-11
 * Description :
 */
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}
