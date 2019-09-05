package com.hoony.msa.springboot.rest.rvo;

import lombok.Data;

@Data
public class MemberRVO {
	private int id;
	private String memberName;

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
