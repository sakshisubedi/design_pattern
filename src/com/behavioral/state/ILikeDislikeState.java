package com.behavioral.state;

/**
 * The State interface declares the state-specific methods. 
   These methods should make sense for all concrete states because you don’t want some of your states to have useless methods 
   that will never be called
 */
public interface ILikeDislikeState {
    void like(LikeDislikeContext context); //doThis()

    void dislike(LikeDislikeContext context); //doThat()
}
