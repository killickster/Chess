package sample.model;


public class Board {


    private int size = 8;
    private Square board[][];

    public Board(){

        makeBoard();

    }

    public void makeBoard(){

        this.board = new Square[this.size][this.size];

        for(int x = 0; x < this.size; x++){
            for(int y = 0; y < this.size; y++){

                    if(y == 1){

                        Pawn pawn = new Pawn(x,y,this, 1);

                        updateSquare(pawn);

                    }else if(y == 6){

                        Pawn pawn = new Pawn(x,y, this, -1);

                        updateSquare(pawn);

                    }else{
                        updateSquare(new EmptySquare(x,y,0));
                    }
            }
        }
    }


    public void initalizePossibleMoves(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                board[i][j].calculateMoves();
            }
        }


    }



    public void displayBoard(){
        for(int y = 0; y < this.size; y++){
            for(int x = 0; x < this.size; x++){

                board[x][y].displaySquare();

            }

            System.out.println();
        }
    }




    public void updateSquare(Square square){



        board[square.getX()][square.getY()] = square;

    }


    public Square getSquare(int x, int y){
        return this.board[x][y];
    }



    public int getSize(){

        return this.size;

    }


}
