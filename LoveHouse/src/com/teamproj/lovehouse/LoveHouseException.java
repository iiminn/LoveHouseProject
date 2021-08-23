package com.teamproj.lovehouse;

public class LoveHouseException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public LoveHouseException() {
		super("데이타를 처리 중 오류 발생");
	}
	public LoveHouseException(String msg) {
		super(msg);
	}
	
}
