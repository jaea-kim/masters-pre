package question3;

import membership.GRADE;
import membership.Member;

import java.util.HashMap;

public class MemberShipManagementMap {
    private HashMap<Integer, Member> memberList;
    private final String Line = "================================================";

    public MemberShipManagementMap() {
        memberList = new HashMap<Integer, Member>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        if (memberList.containsKey(id)) {
            System.out.println("이미 있는 아이디 " + id + "의 값이 변경됩니다.");
        }
        memberList.put(id, new Member(id, name, grade));
    }

    public void showAllMember() {
        System.out.println(Line);
        for (int k : memberList.keySet()) {
            System.out.println(memberList.get(k).toString());
        }
        System.out.println(Line);
    }

    public boolean removeMember(int id) {
        for (int k : memberList.keySet()) {
            if (memberList.get(k).isEqualId(id)) {
                memberList.remove(k);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }
}
