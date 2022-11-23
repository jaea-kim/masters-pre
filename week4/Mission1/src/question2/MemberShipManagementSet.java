package question2;

import membership.GRADE;
import membership.Member;

import java.util.HashSet;

public class MemberShipManagementSet {
    private HashSet<Member> memberSet;
    private final String Line = "================================================";

    public MemberShipManagementSet() {
        memberSet = new HashSet<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        if(!memberSet.add(new Member(id, name, grade))) {
            System.out.println("이미 있는 아이디 " + id + "는 추가할 수 없습니다.");
        }
    }

    public void showAllMember() {
        System.out.println(Line);
        for (Member member : memberSet) {
            System.out.println(member);
        }
        System.out.println(Line);
    }

    public boolean removeMember(int id) {
        for (Member member : memberSet) {
            if(member.isEqualId(id)) {
                memberSet.remove(member);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}