package ch12;

import java.util.HashSet;


public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");


		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		
		Member memberKing = new Member(1003, "세종대왕");
		memberHashSet.addMember(memberKing);
		memberHashSet.showAllMember();
	}

}
