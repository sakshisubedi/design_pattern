package com.behavioral.mediator.chatroom;

public class MediatorPattern {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();
        IUser user1 = new FreeUser(mediator, "ABC");
        IUser user2 = new PaidUser(mediator, "XYZ");
        IUser user3 = new FreeUser(mediator, "PQR");

        mediator.registerUser(user1);
        mediator.registerUser(user2);
        mediator.registerUser(user3);

        user1.sendMessage("Good morning!!");
        user2.sendMessage("Same to you");
        user3.sendMessage("Have a nice day");
    }
}
