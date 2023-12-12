package com.application.trainingVer1.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.trainingVer1.board.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertBoard(BoardDTO boardDTO) {
		sqlSession.insert("boardMapper.insertBoard" , boardDTO);
	}

	@Override
	public List<BoardDTO> selectListBoard() {
		return sqlSession.selectList("boardMapper.selectListBoard");
	}

	@Override
	public BoardDTO selectOneBoard(long boardId) {
		return sqlSession.selectOne("boardMapper.selectOneBoard" , boardId);
	}

	@Override
	public String selectOnePasswd(long boardId) {
		return sqlSession.selectOne("boardMapper.selectOnePasswd",boardId);
	}

	@Override
	public void updateBoard(BoardDTO boardDTO) {
		sqlSession.update("boardMapper.updateBoard", boardDTO);
	}

	@Override
	public void deleteBoard(long boardId) {
		sqlSession.delete("boardMapper.deleteBoard", boardId);
	}

	@Override
	public void updateReadCount(long boardId) {
		sqlSession.update("boardMapper.updateReadCount", boardId);
	}
	
	
	
	
}
