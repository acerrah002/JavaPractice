import java.util.Random;
//This is the child class of playerandenemy.java
public class fight extends playerandenemy {
    //The code uses 3 more variables move:which counts the amount of moves taken, damage:amount of health taken away, whostarts:
    //which randomly generates who starts the fight
    static int fight(int playerHealth, int enemyHealth){
        Random rand = new Random();
        int move=0;
        //damage is pre generated before the fight starts
        int damage = rand.nextInt(20)+1;
        int whostarts = rand.nextInt(2)+1;
        while (playerHealth>0&&enemyHealth>0){
            if(whostarts==1){
                //enemy takes damage at the start of the turn
                enemyHealth-=damage;
                System.out.println("Enemy Took Damage: "+damage);
                System.out.println("Enemy Health: "+enemyHealth + " Move: " + move);
                System.err.println("-----------------------");
                //damage gets re generated at the end of the turn
                damage = rand.nextInt(20)+1;
                move++;
                whostarts=2;
            }
            else{
                //player takes damage at the start of the turn
                playerHealth-=damage;
                System.out.println("Player Took Damage: "+damage);
                System.out.println("Player Health: "+playerHealth + " Move: " + move);
                System.err.println("-----------------------");
                damage = rand.nextInt(20)+1;
                move++;
                whostarts=1;
            }

        }
        //returns the health of both the player and enemy to the winner method to see who won
        return winner(playerHealth, enemyHealth);
    }
    //simple if else statement to see who won by checking if the player health is less or equal to 0(enemy wins) if not the player wins
    static int winner(int playerHealth, int enemyHealth){
        if(playerHealth<=0){
            System.out.println("Enemy Wins BOOM BOOM BOOM");
            return 2;}
        else{
            System.out.println("Player Wins BOOM BOOM BOOM");
            return 1;}
    }
    public static void main(String[] args) {
        fight(player(), enemy());
    }
}
