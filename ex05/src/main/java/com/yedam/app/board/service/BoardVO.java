package com.yedam.app.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private Integer bno;     // null이 들어와야하면 int 말고 Integer 쓰셔
	private	String title;
	private String content;
	private String writer;
	// java.util.Date      : (Default) yyyy/MM/dd
	// <input type="date"> : (Default) yyyy-MM-dd
	@DateTimeFormat(pattern = "yyyy-MM-dd") // 값을 '입력'하는 경우 포맷, 출력이랑은 상관없슈 m=몇분 M=몇월ㅏㄹ
	private Date regdate; // String 으로 가져오는게 나을때도 있숨
	private Date updatedate;
	private int replycnt;
	
}
