package question1;

public class Question1 {
    public static void main(String[] args) {
        char[] character = new char[26];

        //문자 저장
        for(int i = 0; i < character.length; i++) {
            character[i] = (char) (i + 'A');
        }

        //문자 출력
        for (int i = 0; i < character.length; i++) {
            System.out.println(character[i]);
        }
    }
}
