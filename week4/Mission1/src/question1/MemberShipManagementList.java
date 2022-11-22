package question1;

import membership.GRADE;
import membership.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberShipManagementList {
    private final List<Member> memberList;
    public final String Line = "===================";

    public MemberShipManagementList() {
        memberList = new ArrayList<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        memberList.add(new Member(id, name, grade));
    }

    public void showAllMember() {
        System.out.println(Line);
        for (Member m : memberList) {
            System.out.println(m.toString());
        }
        System.out.println(Line);

    }

    public boolean removeMember(int id) {
        for (Member m : memberList) {
            if (m.isEqualId(id)) {
                memberList.remove(m);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
