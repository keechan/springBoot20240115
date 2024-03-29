package com.rubypaper.project.board;

import java.util.List;

public interface BoardService {
   void insert(BoardVO  vo);
   void update(BoardVO  vo);
   void delete(BoardVO  vo);
   BoardVO getBoard(BoardVO  vo);
   List<BoardVO> getBoardList(BoardVO  vo);
}
