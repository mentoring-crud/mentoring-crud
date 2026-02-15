package com.example.mentoring_crud.repository;

import com.example.mentoring_crud.entity.Board;
import com.example.mentoring_crud.dto.BoardListResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<BoardListResponseDto> findAllByOrderByModifiedAtDesc();
}