package com.yedam.app.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.board.service.BoardVO;

public interface BoardMapper {
	// 맵퍼는 spl문을 실행한 결과, 실제 기능은 다 서비스impl에 있디
	// 전체조회
	public List<BoardVO> selectBoardAll();
	// 단건조회
	public BoardVO selectBoardInfo(BoardVO boardVO);
	// 등록
	public int insertBoardInfo(BoardVO boardVO);
	// 수정
	public int updateBoardInfo(BoardVO boardVO);
	// 삭제
	public int deleteBoardInfo(@Param("no") int bno);
}
