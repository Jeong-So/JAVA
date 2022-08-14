package ch10;

import java.util.ArrayList;
import java.util.Iterator;



public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		Iterator<Member> ir = arrayList.iterator();  // <>안에 반환받을 요소 작성 (미작성시 Object)
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}