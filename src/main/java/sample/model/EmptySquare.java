package sample.model;

public class EmptySquare extends Square {




    public EmptySquare(int x, int y, int team){

        super(x,y,team);
    }

    public void calculateMoves(){
    }

    public void displaySquare(){
        System.out.print('e');
    }


}
