package sample.Model;

import sample.Model.Move;

import java.util.ArrayList;

public abstract class Square {


    private int x;
    private int y;
    private int team;

    private ArrayList<Move> moves;

    public Square(int x, int y, int team){
        this.x = x;
        this.y = y;
    }

    public abstract void calculateMoves();


    public int getTeam(){
        return this.team;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return  y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }
}
