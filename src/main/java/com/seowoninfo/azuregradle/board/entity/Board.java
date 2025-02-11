package com.seowoninfo.azuregradle.board.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

/**
 * FileName    : IntelliJ IDEA
 * Author      : Seowon
 * Date        : 2025-02-11
 * Description :
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BOARD")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_SEQ", nullable = false)
    private Long boardSeq;

    @Column(name = "BOARD_TITLE", nullable = false, length = 200)
    private String boardTitle;

    @Comment("게시글내용")
    @Column(name = "BOARD_CONTENTS", nullable = false, columnDefinition = "LONGTEXT")
    private String boardContents;

}
