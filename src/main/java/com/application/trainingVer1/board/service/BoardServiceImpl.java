package com.application.trainingVer1.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.trainingVer1.board.dao.BoardDAO;
import com.application.trainingVer1.board.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void addBoard(BoardDTO boardDTO) {
		boardDAO.insertBoard(boardDTO);
	}
	
	
	
	
}
