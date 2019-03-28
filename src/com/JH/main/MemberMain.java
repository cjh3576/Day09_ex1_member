package com.JH.main;


import com.JH.member.Member;
import com.JH.member.MemberInput;
import com.JH.view.MemberView;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberView mv = new MemberView();
		MemberInput mi = new MemberInput();
		Member[] mem = new Member[1];
		
		for(int i=0; i<mem.length; i++) {
			Member m =mi.memberJoin();
			mem[i] = m;
		}
		Member m =mi.memberJoin();
		mv.view(m);
		mi.memberLogin(mem);
		

	}

}
