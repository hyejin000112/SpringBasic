package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;


@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{

	private ArrayList<BoardVO> list = new ArrayList<>();
	
	@Override
	public void boardRegister(BoardVO vo) {
		list.add(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void boardDelete(int num) {
		// TODO Auto-generated method stub
		
	}

}
