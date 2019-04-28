package sample.model;

import java.util.ArrayList;

public abstract class Square {


    private int x;
    private int y;
    private int team;
    private Color color;

    private ArrayList<Move> moves;

    public Square(int x, int y, int team){
        this.x = x;
        this.y = y;
        this.team = team;
        moves = new ArrayList<Move>();
        this.color = calculateSquareColor(x,y);
    }

    public Color calculateSquareColor(int x, int y){

        if(y%2==0 && x%2==0){
            return Color.WHITE;
        }else if(y%2 == 0 && x%2 == 1){
            return Color.BLACK;
        }else if(y%2 == 1&& x%2 == 0){
            return Color.BLACK;
        }else{
            return Color.WHITE;
        }


    }

    public abstract void calculateMoves();

    public abstract void displaySquare();


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

    public Color getColor() {
        return color;
    }



}
