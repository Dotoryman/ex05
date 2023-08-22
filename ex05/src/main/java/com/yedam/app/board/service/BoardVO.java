package com.yedam.app.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private Integer bno;     // null�� ���;��ϸ� int ���� Integer ����
	private	String title;
	private String content;
	private String writer;
	// java.util.Date      : (Default) yyyy/MM/dd
	// <input type="date"> : (Default) yyyy-MM-dd
	@DateTimeFormat(pattern = "yyyy-MM-dd") // ���� '�Է�'�ϴ� ��� ����, ����̶��� ������� m=��� M=�������
	private Date regdate; // String ���� �������°� �������� �ּ�
	private Date updatedate;
	private int replycnt;
	
}
