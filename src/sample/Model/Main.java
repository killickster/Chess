package sample.Model;

import sample.Model.Board;

public class Main {



    public static void main(String[] args) {


        Board board = new Board();

        board.displayBoard();

        System.out.println();

        board.initalizePossibleMoves();

        Pawn pawn = ((Pawn) board.getSquare(1,1));

        System.out.println();

        pawn.performMove(pawn.getMoves().get(0));

        pawn.calculateMoves();

        System.out.println();

        board.displayBoard();




    }
}
