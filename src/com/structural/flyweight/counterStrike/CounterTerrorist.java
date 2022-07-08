package com.structural.flyweight.counterStrike;

/**
 * The Flyweight class contains the portion of the original object’s state that can be shared between multiple objects. The same flyweight object can be used in many contexts. The state stored inside a flyweight is called intrinsic. The state passed to the flyweight’s methods is called extrinsic.
 */
// CounterTerrorist must have weapon and mission
public class CounterTerrorist implements Player{
    // Intrinsic Attribute
    private final String task;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist() {
        this.task = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        // Assign a weapon
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        //Work on the Mission
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + task);
    }

    @Override
    public String toString() {
        return "CounterTerrorist{" +
                "task='" + task + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
