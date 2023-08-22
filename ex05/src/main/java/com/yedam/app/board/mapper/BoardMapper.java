package com.yedam.app.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.board.service.BoardVO;

public interface BoardMapper {
	// ���۴� spl���� ������ ���, ���� ����� �� ����impl�� �ֵ�
	// ��ü��ȸ
	public List<BoardVO> selectBoardAll();
	// �ܰ���ȸ
	public BoardVO selectBoardInfo(BoardVO boardVO);
	// ���
	public int insertBoardInfo(BoardVO boardVO);
	// ����
	public int updateBoardInfo(BoardVO boardVO);
	// ����
	public int deleteBoardInfo(@Param("no") int bno);
}
