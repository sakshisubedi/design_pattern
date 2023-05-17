package com.behavioral.mediator.warzone;

/**
 * Concrete Mediators encapsulate relations between various components.
 * Concrete mediators often keep references to all components they manage and sometimes even manage their lifecycle
 */
public class Mediator implements IMediator {
    ArmedUnit soldierUnit, tankUnit;
    boolean attackStatus = true;

    @Override
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
        this.soldierUnit = soldierUnit;
        this.tankUnit = tankUnit;
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.attack();
    }

    @Override
    public void ceaseAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}
