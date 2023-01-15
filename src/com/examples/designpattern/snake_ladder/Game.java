package com.examples.designpattern.snake_ladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        players.add(player1);
        players.add(player2);
    }

    public void startGame() {

        while (winner == null) {
            // check whose turn now
            Player playersTurn = findPlayerTurn();
            System.out.println("player turn is " + playersTurn.getId() + " current position is " + playersTurn.getCurrentPosition());

            //roll the dice
            int diceNumbers = dice.rollDice();

            int playersNewPosition = playersTurn.getCurrentPosition() + diceNumbers;
            playersNewPosition = jumpCheck(playersNewPosition);
            playersTurn.currentPosition = playersNewPosition;
            System.out.println("player turn is " + playersTurn.getId() + " current position is " + playersNewPosition);

            if (playersNewPosition >= board.cells.length * board.cells.length - 1) {
                winner = playersTurn;
            }
        }

        System.out.println("Winner is " + winner.id);
    }

    private int jumpCheck(int playersNewPosition) {
        if (playersNewPosition > board.cells.length * board.cells.length - 1) {
            return playersNewPosition;
        }
        Cell cell = board.getCell(playersNewPosition);
        if (cell.jump != null && cell.jump.start == playersNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end) ? "ladder" : "snake";
            System.out.println("Jump done by " + jumpBy);
            return cell.jump.end;
        }
        return playersNewPosition;
    }

    private Player findPlayerTurn() {
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }


}
