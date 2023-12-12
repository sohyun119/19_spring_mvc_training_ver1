package com.application.trainingVer1.board.service;

import java.util.List;

import com.application.trainingVer1.board.dto.BoardDTO;

public interface BoardService {

	public void addBoard(BoardDTO boardDTO);
	public List<BoardDTO> getBoardList();
	public BoardDTO getBoardDetail(long boardId);
	public boolean checkAuthorizedUser(BoardDTO boardDTO);
	
	
}
