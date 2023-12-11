package com.hashmapassignments;

import java.util.Objects;

public class CustomClassValue {
	
	String nickname;

	public CustomClassValue(String nickname) {
		super();
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "CustomClassKey2 [nickname=" + nickname + "]";
	}

	

}
