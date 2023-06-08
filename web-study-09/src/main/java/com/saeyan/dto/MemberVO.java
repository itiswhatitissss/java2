package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString //저장된 필드 값들을 출력해서 보기 쉽게 하기 위한 것.
public class MemberVO {
	private String name;
	private String userid;
	private String pwd;
	private String email;
	private String phone;
	private int admin;
}
