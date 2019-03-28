package com.JH.member;

import java.util.Scanner;


public class MemberInput {
	private Scanner sc ;
	
	public MemberInput() {
		sc = new Scanner(System.in);
	}
	
	public Member memberLogin(Member[] members) {
		
		Member member = null;
		System.out.println("LOGIN");
		System.out.println("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.println("PW를 입력하세요 : ");
		String pw = sc.next();
		
		for(int i=0; i<members.length; i++) {
			if(id.equals(members[i].getId()) && pw.equals(members[i].getPw())) {
				member = members[i];		
				break;
			}
		}
		return member;
	}


	public Member memberJoin() {

		
		//id,pw,age,email,phone 입력
		//member 리턴
		
		Member member = new Member();
		

		System.out.println("ID 입력 : ");
		member.setId(sc.next());

		System.out.println("PW 입력 : ");
		member.setPw(sc.next());

		System.out.println("Age 입력 : ");
		member.setAge(sc.nextInt());

		System.out.println("Email 입력 : ");
		member.setEmail(sc.next());

		System.out.println("Phone 입력 : ");
		member.setPhone(sc.next());
		return member;
		
		
	}
}
