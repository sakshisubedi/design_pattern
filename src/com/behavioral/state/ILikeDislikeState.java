package com.behavioral.state;

/**
 * The State interface declares the state-specific methods.
 * The methods map directly to actions that could happen to the application
   These methods should make sense for all concrete states because you don’t want some of your states to have
   useless methods that will never be called

 * Then take each state in our design and encapsulate it in a class that implements the State interface.
 */
public interface ILikeDislikeState {
    void like(LikeDislikeContext context); //doThis()

    void dislike(LikeDislikeContext context); //doThat()
}
