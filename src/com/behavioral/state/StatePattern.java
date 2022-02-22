package com.behavioral.state;

/**
 * Both context and concrete states can set the next state of the context and
   perform the actual state transition by replacing the state object linked to the context.
 */
public class StatePattern {
    /**
     * Like/Dislike youtube video
     
     * State -> Initial, Like, Dislike
     * Operation -> like, dislike video
     * 
     * State          Initial         Like                        Dislike
       like           like++          like--                      like-- and dislike++   
       dislike        dislike++       dislike-- and like++        dislike--
     * 
     */


    public static void main(String[] args) {
        LikeDislikeContext youtubeVideo = new LikeDislikeContext(35, 4, new InitialState());

        // current state may have been changed by context or the state object itself
        youtubeVideo.like();
        System.out.println(youtubeVideo.getLikesCount() + " " + youtubeVideo.getDislikesCount());

        youtubeVideo.like();

        youtubeVideo.like();

        youtubeVideo.dislike();

        System.out.println(youtubeVideo.getLikesCount() + " " + youtubeVideo.getDislikesCount());
    }
}
