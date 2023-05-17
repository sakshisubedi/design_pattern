package com.behavioral.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediators encapsulate relations between various components.
 * Concrete mediators often keep references to all components they manage and sometimes even manage their lifecycle
 */
public class Mediator implements IMediator{
    private List<IUser> users;

    public Mediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void registerUser(IUser user) {
        users.add(user);
    }

    @Override
    public void sendMessage(IUser user, String message) {
        for(IUser u: users) {
            if(u != user) {
                u.receiveMessage(message);
            }
        }
    }
}
