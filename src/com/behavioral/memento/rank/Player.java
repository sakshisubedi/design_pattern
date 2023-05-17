package com.behavioral.memento.rank;

import java.util.ArrayList;

//Originator class
/*
* The Originator class can produce snapshots of its own state,
* as well as restore its state from snapshots when needed.
* */
public class Player {
    private ArrayList<Rank> rankList;

    public Player() {
        rankList = new ArrayList<>();
    }

    public void addRank(Rank rank){
        rankList.add(rank);
    }

    public ArrayList<Rank> getRankList() {
        //used clone() method to prevent the referring to original object
        return (ArrayList<Rank>) rankList.clone();
    }

    //retuning current state to the care taker (RankHistory)
    public RankMemento saveRankToMemento(){
        return new RankMemento(getRankList());
    }

    public void revertRankFromMemento(RankMemento rankMemento){
        rankList = rankMemento.getRankList();
    }

    @Override
    public String toString() {
        return "Player{" +
                "rankList=" + rankList +
                '}';
    }

    // Memento
    /*
    * The Memento is a value object that acts as a snapshot of the originator’s state.
    * It’s a common practice to make the memento immutable and pass it the data only once, via the constructor.
    *
    * In this implementation, the memento class is nested inside the originator.
    * This lets the originator access the fields and methods of the memento, even though they’re declared private.
    * On the other hand, the caretaker has very limited access to the memento’s fields and methods,
    * which lets it store mementos in a stack but not tamper with their state.
    * */
    public static class RankMemento {
        private ArrayList<Rank> rankList;

        public RankMemento(ArrayList<Rank> players) {
            this.rankList = players;
        }

        private ArrayList<Rank> getRankList() {
            return rankList;
        }
    }
}
