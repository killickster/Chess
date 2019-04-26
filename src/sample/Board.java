package sample;

public class Board {


    int size = 8;
    char board[][];

    public Board(){

        makeBoard();

    }

    private void makeBoard(){

        this.board = new char[this.size][this.size];

        for(int x = 0; x < this.size; x++){
            for(int y = 0; y < this.size; y++){

                    this.board[x][y] = 'x';

            }
        }
    }


    public void replaceCharacter(int x, int y, char ch){

        this.board[y-1][x-1] = ch;

    }



    public char boardCharacter(int x, int y){

        return this.board[y-1][x-1];

    }


    public void printBoard(){

        for(int y = size ; y > 0; y--){
            for (int x = 1; x <= size; x++){
                System.out.print(boardCharacter(x,y));
            }
            System.out.println();
        }
    }


}
