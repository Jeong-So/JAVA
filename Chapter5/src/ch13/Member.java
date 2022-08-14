package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {}  // implements Comparator<Member>  --> compare 구현  (이와 같이 작성 필요!)  
						// new Member()로 comparator 구현되어있음 그러므로 얘의 compare 함수를 불러서 비교를 해라
	
	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다" ;
	}


//	// implements Comparable<Member>  --> compareTo 구현  (매개변수 1개로 : 나랑 비교)
//	@Override
//	public int compareTo(Member member) {
//		
//		if (this.memberId > member.memberId)
//			return 1;
//		else if(this.memberId < member.memberId)
//			return -1;
//		else return 0;
//		// Compare해서 오름차순 정렬
//		
//		/* case 2
//		if (this.memberId > member.memberId)
//			return -1;
//		else if(this.memberId < member.memberId)
//			return 1;
//		else return 0;
//		Compare해서 내림차순 정렬
//		*/
//		
//		/* case 3
//		return (this.memberId - member.memberId);
//		Compare해서 오름차순 정렬
//		*/
//		
//		/* case 4
//		return (this.memberId - member.memberId)*(-1);
//		Compare해서 내림차순 정렬
//		*/
//		
//	}
	
	// implements Comparator<Member>  --> compare 구현  (매개변수 2개로 : 나랑 비교대상)
	@Override
	public int compare(Member member1, Member member2) {
		
		return (member1.memberId - member2.memberId);
	}

	
}
