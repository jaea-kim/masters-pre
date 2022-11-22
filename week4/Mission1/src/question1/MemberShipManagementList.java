package question1;

import membership.GRADE;
import membership.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberShipManagementList {
    private List<Member> memberList;

    public MemberShipManagementList() {
        memberList = new ArrayList<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        memberList.add(new Member(id, name, grade));
    }

}
