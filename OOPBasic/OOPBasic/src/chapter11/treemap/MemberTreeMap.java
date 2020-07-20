package chapter11.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		//treeMap.values();//value를 콜렉션으로 반환
		Iterator<Integer> ir = treeMap.keySet().iterator(); //모든 Key를 Set타입으로 반환
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}
}

