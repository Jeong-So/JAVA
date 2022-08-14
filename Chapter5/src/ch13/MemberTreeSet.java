package ch13;

import java.util.TreeSet;
import java.util.Iterator;



public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
//		treeSet = new TreeSet<>();   // implements Comparable<Member>  --> compareTo 구현 (이렇게 작성해도 됨)
		treeSet = new TreeSet<Member>(new Member());  // implements Comparator<Member>  --> compare 구현  (이와 같이 작성 필요!)  new Member()로 comparator 구현되어있음
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		
		Iterator<Member> ir = treeSet.iterator();  // <>안에 반환받을 요소 작성 (미작성시 Object)
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				treeSet.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}