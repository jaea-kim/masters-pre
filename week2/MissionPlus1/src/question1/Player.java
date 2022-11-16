package question1;

import java.util.Scanner;

public class Player {

    public static int playerNum;
    private String[] playerName;

    Player() { }
    Player(int playerNum) {
        this.playerNum = playerNum;
        playerName = new String[this.playerNum];
    }

    private void savePlayerName() {
        for(int i = 0; i < playerNum; i++) {
            System.out.print("참가자 이름을 입력해주세요. >>> ");
            playerName[i] = WordChainGame.scanner.next();
        }
    }

    public void savePlayerInfo() {
        System.out.print("게임에 참여하는 인원은 몇명입니까? >>> ");
        playerNum = WordChainGame.scanner.nextInt();

        playerName = new String[playerNum];
        savePlayerName();
    }

    public String getPlayerName(int num) {
        return playerName[num];
    }
}
