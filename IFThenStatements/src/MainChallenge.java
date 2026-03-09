public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100 ;
        int highScore =0;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Frst highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 100 ;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Second highScore is " + highScore);
   }
    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score ;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
