public class Main {
    private static EnhancedPlayer enp;

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health : " + player.healthRemaining());
//        player.health=200;
//        player.loseHealth(11);
//        System.out.println("Remaining health : " + player.healthRemaining());
        EnhancedPlayer enp = new EnhancedPlayer("Tim");
        System.out.println("initial health is " + enp.healthRemaining());

        EnhancedPlayer enp1 = new EnhancedPlayer("Tim1", 200, "Sword1");
        System.out.println("initial health is " +enp1.healthRemaining());

    }
}
