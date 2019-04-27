package sample.Model;

public class Board {


    private int size = 8;
    private Square board[][];

    public Board(){

        makeBoard();

    }

    private void makeBoard(){

        this.board = new Square[this.size][this.size];

        for(int x = 0; x < this.size; x++){
            for(int y = 0; y < this.size; y++){

                    if(y == 1){
                        updateSquare(new Pawn(x,y,this, -1));
                    }else if(y == 6){
                        updateSquare(new Pawn(x,y, this, 1));
                    }else{
                        updateSquare(new EmptySquare(x,y,0));
                    }
            }
        }
    }

    private void updateSquare(Square square){

        board[square.getY()][square.getY()] = square;

    }


    public Square getSquare(int x, int y){
        return this.board[y][x];
    }



    public int getSize(){

        return this.size;

    }


}
