package com.JH.main;

import java.util.Scanner;

import com.JH.member.Member;
import com.JH.member.MemberAdd;
import com.JH.member.MemberInput;
import com.JH.view.MemberView;


public class MemberController {
	private Member [] members;
	private Scanner sc;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberView mv;

	public MemberController() {
		sc = new Scanner(System.in);
		members = new Member[0];
		mi = new MemberInput();
		ma = new MemberAdd();
		mv = new MemberView();
	}

	public void Start() {
		//1. 회원가입
		//2. 로그인
		//3. 회원정보 전체출력
		//4. 프로그램 종료

		boolean check = true;



		while(check) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 회원가입" + "2. 로그인 " + " 3. 회원정보 전체 출력 " + "4. 프로그램 종료");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("1. 회원가입"	);
				Member m = mi.memberJoin();
				members =ma.add(members, m);
				break;
			case 2:
				System.out.println(" 2. 로그인");
				Member member =mi.memberLogin(members);
				if (member != null) {
					System.out.println(member.getId() + member.getPw());
				}
				else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println("3. 회원정보 전체 출력");
				mv.view(members);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				check = !check;
				break;
			case 5:
				System.out.println("잘못된 선택입니다.");
				break;


			}


		}
	}
}
