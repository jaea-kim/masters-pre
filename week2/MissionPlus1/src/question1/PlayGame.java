package question1;

import java.util.Scanner;

public class PlayGame {
    static final String FIRST_WORD = "기러기";
    private String[] pastData = new String[2]; //(playerName, word)
    private String[] presentData = new String[2];
    private Player player;

    PlayGame(Player player) {
        this.player = player;
    }

    public boolean start(int playNum) {
        pastData = presentData.clone();
        inputWord(playNum);

        return resultGame();
    }

    public String loserInfo() {
        return presentData[0];
    }

    private void inputWord(int playNum) {
        if (pastData[1] == null) {
            pastData[0] = player.getPlayerName((playNum-1) % Player.playerNum);
            System.out.printf("%s >> ", pastData[0]);
            pastData[1] = WordChainGame.scanner.next();
        }
        presentData[0] = player.getPlayerName(playNum % Player.playerNum);
        System.out.printf("%s >> ", presentData[0]);
        presentData[1] = WordChainGame.scanner.next();
    }

    private boolean resultGame() {
        if(presentData[1].charAt(0) == pastData[1].charAt(pastData[1].length()-1)) return true;
        return false;
    }

}
