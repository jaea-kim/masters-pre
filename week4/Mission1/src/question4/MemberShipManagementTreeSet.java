package question4;

import membership.GRADE;
import membership.Member;

import java.util.TreeSet;

public class MemberShipManagementTreeSet {
    private TreeSet<Member> memberTreeSet;
    private final String Line = "================================================";

    public MemberShipManagementTreeSet() {
        memberTreeSet = new TreeSet<Member>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        if(!memberTreeSet.add(new Member(id,name,grade))) {
            System.out.println("이미 있는 아이디" + id + "는 추가할 수 없습니다.");
        }
    }

    public void showAllMember() {
        for(Member m : memberTreeSet) {
            System.out.println(m.toString());
        }
    }
}
