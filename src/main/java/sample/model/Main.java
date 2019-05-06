package sample.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controller.Controller;

public class Main extends Application{


    private static Board board;


    public static void main(String[] args) {

        board = new Board();

        board.displayBoard();

        System.out.println();

        board.initalizePossibleMoves();

        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/board.fxml"));
        primaryStage.setTitle("Chess");
        Scene scene = new Scene(root, 800,800);
        scene.getStylesheets().add(this.getClass().getResource("/css/squares.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();




    }


    public static Board getBoard(){
        return board;
    }

    public static boolean performMove(int xOrigin, int yOrigin, int xConclusion, int yConclusion){

        boolean returnValue = false;
        try {

            Pawn pawn = ((Pawn) (board.getSquare(xOrigin, yOrigin)));
            returnValue = pawn.performMove(new Move(xConclusion, yConclusion));

        }catch (Exception e){
            System.out.println("Unable to perform moves");
        }

            board.initalizePossibleMoves();
            board.displayBoard();

            return returnValue;
    }
}
