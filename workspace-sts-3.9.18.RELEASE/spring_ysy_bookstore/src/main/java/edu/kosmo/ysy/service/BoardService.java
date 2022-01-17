package edu.kosmo.ysy.service;

import java.util.List;

import edu.kosmo.ysy.vo.BoardVO;

public interface BoardService {
   List<BoardVO> getList();
   BoardVO get(int bid);
   void register(BoardVO board);
   void registerReply(BoardVO board);
   void remove(int bid);
   void modify(BoardVO boardVO);
   void upHit(int bid);
   
   
}