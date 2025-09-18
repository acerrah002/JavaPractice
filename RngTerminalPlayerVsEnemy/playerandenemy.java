import java.util.Random;
//This is the parent class for fight.java where the player and enemy health are generated between a number from 1 to 100

public class playerandenemy {
    static int player(){
        Random rand = new Random();
        final int Health = rand.nextInt(100)+1;
        System.out.println("Player Starter Health: "+Health);
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        return Health;
    }
    

    static int enemy(){
        Random rand = new Random();
        int Health = rand.nextInt(100)+1;
        System.out.println("Enemy Starter Health: "+Health);
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        return Health;
    }
    //this is just a test for the player and enemy health generation
    private static void main(String[] args) {
        player();
        enemy();
    }
}