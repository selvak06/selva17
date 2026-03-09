public class MainChallenge2 {
    public static void main(String[] args) {
        String player1, player2 , player3, player4, player5 ;
        int highScorePosition =0;

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("player1", highScorePosition);

        highScorePosition= calculateHighScorePosition(1000);
        displayHighScorePosition("player2", highScorePosition);

        highScorePosition= calculateHighScorePosition(500);
        displayHighScorePosition("player3", highScorePosition);

        highScorePosition= calculateHighScorePosition(100);
        displayHighScorePosition("player4", highScorePosition);

        highScorePosition= calculateHighScorePosition(25);
        displayHighScorePosition("player5", highScorePosition);

    }

    private static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into postion " + scorePosition + " on the high score list");
    }

    private static int calculateHighScorePosition(int score) {
        int result = 0;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500 && score < 1000) {
            result = 2;
        } else if (score >= 100 && score < 500) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }

}
