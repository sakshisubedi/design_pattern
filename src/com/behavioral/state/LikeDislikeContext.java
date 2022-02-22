package com.behavioral.state;

/**
 * Context stores a reference to one of the concrete state objects and delegates to it all state-specific work. 
   The context communicates with the state object via the state interface. 
   The context exposes a setter for passing it a new state object.
 */
public class LikeDislikeContext {
    private Integer likesCount;
    private Integer dislikesCount;
    private ILikeDislikeState currentState;

    public LikeDislikeContext() {
        likesCount = 0;
        dislikesCount = 0;
        currentState = new InitialState();
    }

    public LikeDislikeContext(Integer likesCount, Integer dislikesCount, ILikeDislikeState currentState) {
        this.likesCount = likesCount;
        this.dislikesCount = dislikesCount;
        this.currentState = currentState;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public Integer getDislikesCount() {
        return dislikesCount;
    }

    public void incrementLikes() {
        likesCount++;
    }

    public void decrementLikes() {
        likesCount--;
    }

    public void incrementDislikes() {
        dislikesCount++;
    }

    public void decrementDislikes() {
        dislikesCount--;
    }

    public void changeState(ILikeDislikeState state) { //changeState(state)
        currentState = state;
    }

    public void like() { // doThis()
        currentState.like(this);
    }

    public void dislike() { // doThat()
        currentState.dislike(this);
    }
}
