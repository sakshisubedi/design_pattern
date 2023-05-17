package com.behavioral.mediator.warzone;

import com.behavioral.mediator.chatroom.IUser;

/**
 * The Mediator interface declares methods of communication with components,
 * which usually include just a single notification method.
 * Components may pass any context as arguments of this method, including their own objects,
 * but only in such a way that no coupling occurs between a receiving component and the sender’s class.
 */
public interface IMediator {
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    public void setAttackStatus(boolean attackStatus);

    public boolean canAttack();

    public void startAttack(ArmedUnit armedUnit);

    public void ceaseAttack(ArmedUnit armedUnit);
}
