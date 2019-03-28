package com.JH.view;

import com.JH.member.Member;

public class MemberView {
	//멤버의 한명 정보를 출력하는 메소드
	public void view(Member member) {

		System.out.println("ID : " + member.getId());
		System.out.println("PW : " + member.getPw());
		System.out.println("AGE : " + member.getAge());
		System.out.println("EMAIL : " +member.getEmail());
		System.out.println("PHONE : " + member.getPhone());
		System.out.println("=======================");
	}
	//멤버 여러명 정보 출력 배열
	public void view(Member[] member) {
		Member [] members = member;
		for(int i =0; i <members.length; i++) {
//			Member member = members[i];
			System.out.println("ID : " + members[i].getId());
			System.out.println("PW : " + members[i].getPw());
			System.out.println("AGE : " + members[i].getAge());
			System.out.println("EMAIL : " + members[i].getEmail());
			System.out.println("PHONE : " + members[i].getPhone());
			System.out.println("=======================");
		}

	}
}
