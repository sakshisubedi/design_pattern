package com.structural.flyweight.counterStrike;

import java.util.Random;

/**
 * The Client calculates or stores the extrinsic state of flyweights. From the client’s perspective, a flyweight is a template object which can be configured at runtime by passing some contextual data into parameters of its methods.
 *
 * The Flyweight pattern is merely an optimization.
 * Before applying it, make sure your program does have the RAM consumption problem related to having a massive number
 * of similar objects in memory at the same time.
 * Make sure that this problem can’t be solved in any other meaningful way.
 */
public class FlyweightPattern {
    private static Random random = new Random();

    // All player types and weapon (used by getRandPlayerType() and getRandWeapon()
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());
            player.assignWeapon(getRandomWeapon());
            player.mission();
        }
    }

    public static String getRandomPlayerType() {
        int randomInt = random.nextInt(playerType.length);
        return playerType[randomInt];
    }

    public static String getRandomWeapon() {
        int randomInt = random.nextInt(weapons.length);
        return weapons[randomInt];
    }
}
