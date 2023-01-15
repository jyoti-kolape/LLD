package com.examples.designpattern.snake_ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;
    int boardSize;
    Board(int boardSize, int noOfSnake, int noOfLadder) {
        initializeCells(boardSize);
        this.boardSize = boardSize;
        addSnakesLadder(cells, noOfSnake, noOfLadder);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;

            }
        }
    }


    private void addSnakesLadder(Cell[][] cells, int noOfSnake, int noOfLadder) {

        while (noOfSnake > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if (snakeTail >= snakeHead) {
                continue;
            }
            Jump snakeObj = new Jump(snakeHead, snakeTail);
            Cell cell = getCell(snakeHead);
            cell.setJump(snakeObj);
            noOfSnake--;
        }

        while(noOfLadder > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (ladderStart >= ladderEnd) {
                continue;
            }
            Jump ladderObj = new Jump(ladderStart, ladderEnd);
            Cell cell = getCell(ladderStart);
            cell.setJump(ladderObj);
            noOfLadder--;
        }
    }

    public Cell getCell(int snakeHead) {
        int i = snakeHead / boardSize;
        int j = snakeHead % boardSize;
        return cells[i][j];
    }


}
