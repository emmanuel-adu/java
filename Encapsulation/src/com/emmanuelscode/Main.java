package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {

//        // How you update object without constructor created
//        Player player = new Player();
//        player.name = "Emmanuel";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 11;
//        player.health = 300;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.heathRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Emmanuel", 50, "Gun");
        System.out.println("Initial Health is = " + enhancedPlayer.getHealth());
    }
}