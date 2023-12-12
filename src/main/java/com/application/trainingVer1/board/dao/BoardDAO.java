package com.application.trainingVer1.board.dao;

import java.util.List;

import com.application.trainingVer1.board.dto.BoardDTO;

public interface BoardDAO {

	public void insertBoard(BoardDTO boardDTO);
	public List<BoardDTO> selectListBoard();
	public BoardDTO selectOneBoard(long boardId);
	public String selectOnePasswd(long boardId);
	
	
}
