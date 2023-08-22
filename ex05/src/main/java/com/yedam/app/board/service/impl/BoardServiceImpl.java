package com.yedam.app.board.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.board.mapper.BoardMapper;
import com.yedam.app.board.service.BoardService;
import com.yedam.app.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getBoardList() {
		return boardMapper.selectBoardAll();
	}

	@Override
	public BoardVO getBoard(BoardVO boardVO) {
		return boardMapper.selectBoardInfo(boardVO); 
	}

	@Override
	public int insertBoard(BoardVO boardVO) {
		int result = boardMapper.insertBoardInfo(boardVO);
		
		if(result == 1) {
			return boardVO.getBno(); // <selectKey />
		} else {
			return -1;
		}
	}

	@Override
	public Map<String, Object> updateBoard(BoardVO boardVO) {
		boolean result = false;
		int count = boardMapper.updateBoardInfo(boardVO);
		
		Map<String, Object> datas = new HashMap<>();
		
		if(count == 1) {
			result = true;
		}
		
		datas.put("Result", result);
		datas.put("Target Bno", boardVO.getBno());
		
		return datas;
	}

	@Override
	public Map<String, Object> deleteBoard(List<Integer> boardList) {
		boolean result = false;
		List<Integer> successList = new ArrayList<>();
		int count = 0;
		
		for(Integer bno : boardList) {
			int res = boardMapper.deleteBoardInfo(bno);
			if(res == 1) {
				count += 1;
				successList.add(bno);
			};
		}
		if(count > 0) {
			result = true;
		}
		
		Map<String, Object> datas = new HashMap<>();
		
		
		datas.put("Result", result); // 성공여부
		datas.put("Target Bnos", boardList); // 전체 대상
		datas.put("Success List", successList); // 성공 목록
		
		return datas;
	}

}
