package ch12;

import java.util.HashSet;
import java.util.Iterator;



public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>(); 
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		
		Iterator<Member> ir = hashSet.iterator();  // <>안에 반환받을 요소 작성 (미작성시 Object)
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				hashSet.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}