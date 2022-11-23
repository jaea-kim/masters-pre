package membership;

import java.util.Objects;

public class Member {
    private int id;
    private String name;
    private GRADE grade;

    public Member(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + "님의 아이디는 " + id + "이고 등급은 " + grade + "입니다";
    }

    public boolean isEqualId(int id) {
        if (id == this.id) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) return true;
        return true;
    }
}
