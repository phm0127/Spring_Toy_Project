package com.min.web.board.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;



import org.springframework.stereotype.Service;



import com.min.web.board.dao.BoardDAO;

import com.min.web.board.model.BoardVO;



@Service

public class BoardServiceImpl implements BoardService{



	@Inject

	private BoardDAO boardDAO;

	

	public List<BoardVO> getBoardList() throws Exception {

		return boardDAO.getBoardList();

	}



	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);
	}



	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		boardDAO.updateViewCnt(bid);

		return boardDAO.getBoardContent(bid);
	}



	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		boardDAO.updateBoard(boardVO);
	}



	@Override
	public void deleteBoard(int bid) throws Exception {
		boardDAO.deleteBoard(bid);
	}



}



