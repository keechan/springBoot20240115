package com.rubypaper.service;

import org.springframework.data.domain.Page;

import com.rubypaper.domain.Board;

public interface BoardService {
	Page<Board> boardList(Board vo);
}
