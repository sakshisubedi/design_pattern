package com.structural.flyweight.counterStrike;

import java.util.HashMap;
import java.util.Map;

/**
 * The Flyweight Factory manages a pool of existing flyweights. With the factory, clients don’t create flyweights directly. Instead, they call the factory, passing it bits of the intrinsic state of the desired flyweight. The factory looks over previously created flyweights and either returns an existing one that matches search criteria or creates a new one if nothing is found.
 */

// Class used to get a player using HashMap (Returns an existing player if a player of given type exists.)
// Else creates a new player and returns it.
public class PlayerFactory {
    /* HashMap stores the reference to the object of Terrorist(TS) or CounterTerrorist(CT).  */
    private static Map<String, Player> cache = new HashMap<>();

    public static Player getPlayer(String playerType) {
        Player player = null;
        if (cache.containsKey(playerType)) {
            player = cache.get(playerType);
        } else {
            switch (playerType) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;

                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;

                default :
                    System.out.println("Unreachable code!");
            }

            cache.put(playerType, player);
        }

        return player;
    }
}
