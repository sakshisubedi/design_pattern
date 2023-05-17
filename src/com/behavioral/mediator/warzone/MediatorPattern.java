package com.behavioral.mediator.warzone;

public class MediatorPattern {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();

        ArmedUnit soldierUnit = new SoldierUnit(mediator);
        ArmedUnit tankUnit = new TankUnit(mediator);

        mediator.registerArmedUnits(soldierUnit, tankUnit);

        mediator.startAttack(soldierUnit);
        mediator.startAttack(tankUnit);
        mediator.ceaseAttack(soldierUnit);
        mediator.startAttack(tankUnit);
    }
}
