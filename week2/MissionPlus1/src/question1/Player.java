package question1;

import java.util.Scanner;

public class Player {
    private int playerNum;
    private String[] playerName;

    Player() { }
    Player(int playerNum) {
        this.playerNum = playerNum;
        playerName = new String[this.playerNum];
    }

    private void savePlayerName(Scanner scanner) {
        for(int i = 0; i < playerNum; i++) {
            System.out.print("참가자 이름을 입력해주세요. >>> ");
            playerName[i] = scanner.next();
        }
    }

    public void savePlayerInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("게임에 참여하는 인원은 몇명입니까? >>> ");
        playerNum = scanner.nextInt();

        playerName = new String[playerNum];
        savePlayerName(scanner);
    }

    public String getPlayerName(int num) {
        return playerName[num];
    }
}
