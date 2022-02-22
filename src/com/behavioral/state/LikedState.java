package com.behavioral.state;

/**
 * Concrete States provide their own implementations for the state-specific methods. 
   To avoid duplication of similar code across multiple states, 
   you may provide intermediate abstract classes that encapsulate some common behavior.

 * State objects may store a backreference to the context object. 
   Through this reference, the state can fetch any required info from the context object, 
   as well as initiate state transitions.
 */
public class LikedState implements ILikeDislikeState {
    // Can set context inside setContext method rather than in doThis() or doThat() method
    /**
     * field member --> context 
     
     * field method --> setContext(context) { context.changeState(<any state>); }
     */


    @Override
    public void like(LikeDislikeContext context) { // doThis()
        context.decrementLikes();
        context.changeState(new InitialState());
    }

    @Override
    public void dislike(LikeDislikeContext context) { // doThat()
        context.decrementLikes();
        context.incrementDislikes();
        context.changeState(new DislikedState());
    }
}
