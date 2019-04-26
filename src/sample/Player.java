package sample;

public abstract class Player {


    private int x;
    private int y;
    private char character;

    public Player(int x, int y, char character){
        this.x = x;
        this.y = y;
        this.character = character;
    }


   public abstract boolean move(int x, int y);


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
}
