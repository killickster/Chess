package sample;

public class Pawn extends Player{

    static char character = 'p';

    public Pawn(int x, int y){

        super(x,y,this.character);

    }

    @Override
    public boolean move(int x, int y) {
        if(x == 0 && y == 1){
            return true;
        }
        return false;
    }
}
