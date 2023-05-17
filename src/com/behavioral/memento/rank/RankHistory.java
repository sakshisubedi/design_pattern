package com.behavioral.memento.rank;

import java.util.Stack;


// Caretaker
// Responsible to keep track on “RankMemento” class
/*
* The Caretaker knows not only “when” and “why” to capture the originator’s state,
* but also when the state should be restored.

A caretaker can keep track of the originator’s history by storing a stack of mementos.
* When the originator has to travel back in history,
* the caretaker fetches the topmost memento from the stack and passes it to the originator’s restoration method.
* */
public class RankHistory {
    private Stack<Player.RankMemento> rankHistory; // mementoList

    public RankHistory() {
        this.rankHistory = new Stack<>();
    }

    public void saveRank(Player player) {
        rankHistory.push(player.saveRankToMemento());
    }

    public void revertRank(Player player) {
        if(!rankHistory.isEmpty()) {
            player.revertRankFromMemento(rankHistory.pop());
        } else {
            System.out.println("Nothing left to Undo");
        }
    }
}
