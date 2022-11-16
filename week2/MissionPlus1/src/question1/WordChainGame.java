package question1;

import java.util.Scanner;

public class WordChainGame {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Player player = new Player();
        PlayGame playGame = new PlayGame(player);

        int playNum = 1; //round1부터 시작

        System.out.println("끝말잇기 게임을 시작합니다!!");
        player.savePlayerInfo();

        System.out.println("시작 단어는 \"" + PlayGame.FIRST_WORD + "\"입니다.");
        while(playGame.start(playNum)) {
            playNum++;
        }

        System.out.println(playGame.loserInfo() + "이 졌습니다.");
    }
}
