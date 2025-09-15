package org.example;

import java.util.Random;
public class bot {
    public static void main() {
       System.out.print(randomnum());
    }

    public static int randomnum(){
        Random random = new Random();
        int x = random.nextInt(3)+1;
        return x;
    }

}
