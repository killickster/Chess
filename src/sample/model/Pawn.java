package sample.model;

public class Pawn extends Square {

    private Board board;
    private int directionalIncrement;


    public Pawn(int x, int y, Board board, int directionalIncrement){

        super(x,y,directionalIncrement);
        this.board = board;
        this.directionalIncrement = directionalIncrement;

    }


    @Override
    public void calculateMoves() {
       this.straightMove();
       this.diagonalPosX();
       this.diagonalNegX();
    }


    public void testAndAddMove(int x, int y, int team){

         if(x < board.getSize() && y < board.getSize() && x >= 0 && y >= 0){

            if(board.getSquare(x,y).getTeam() == team){

                if(team != 0){

                    super.getMoves().add(new Move(x,y));

                }else if(team == 0){

                    super.getMoves().add(new Move(x,y));

                }

            }

        }

    }

    public void displaySquare(){
        if(directionalIncrement == -1) {
            System.out.print('p');
        }else {
            System.out.print('b');
        }
    }

    public void performMove(Move move){

        int previousPositionX = this.getX();
        int previousPositionY = this.getY();

        this.setX(move.x);
        this.setY(move.y);

        this.board.updateSquare(this);
        this.board.updateSquare(new EmptySquare(previousPositionX, previousPositionY, 0));

    }



    public void straightMove(){

        int newY = this.getY() + directionalIncrement;
        int newX = this.getX();

        testAndAddMove(newX, newY, 0);

    }

    public void diagonalPosX(){

        int newY = this.getY() + directionalIncrement;
        int newX = this.getX() + 1;

        testAndAddMove(newX, newY, -this.directionalIncrement);

    }


    public void diagonalNegX(){

        int newY = this.getY() + directionalIncrement;
        int newX = this.getX() - 1;

        testAndAddMove(newX, newY, -this.directionalIncrement);

    }


}
