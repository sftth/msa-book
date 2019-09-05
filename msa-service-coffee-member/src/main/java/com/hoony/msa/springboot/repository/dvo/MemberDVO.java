package com.hoony.msa.springboot.repository.dvo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberDVO {
	private int id;
	private String memberName; //회원명

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
