package question2;

public class LibraryTest {
    public static void main(String[] args) {

        String[][] aBookList = {{"태백산맥", "조정래"}, {"이기적 유전자", "리처드 도킨즈"}, {"자전거 도둑", "박완서"},
                {"토지", "박경리"}, {"대변동", "제레드 다이아몬드"}};

        Library aLibrary = new Library(aBookList);
        Library a1Library = aLibrary; //얕은 복사
        Library bLibrary = Library.newInstance(aLibrary); //깊은 복사

        aLibrary.modifyBookList("자전거 도둑", "그 많던 싱아는 누가 다 먹었을까", "박완서");
        bLibrary.addBookList("사피엔스", "유발 하라리");

        System.out.println("===== A 도서관 목록 출력 =====");
        System.out.println(aLibrary.getLibraryInfo());

        System.out.println("===== A-1 도서관 목록 출력 =====");
        System.out.println(a1Library.getLibraryInfo());

        System.out.println("===== B 도서관 목록 출력 =====");
        System.out.println(bLibrary.getLibraryInfo());

    }
}
