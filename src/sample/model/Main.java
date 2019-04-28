package sample.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{


    private static Board board;


    public static void main(String[] args) {


        launch(args);

        board = new Board();

        board.displayBoard();

        System.out.println();

        board.initalizePossibleMoves();

    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/view/graphics.fxml"));
        primaryStage.setTitle("Chess");
        primaryStage.setScene(new Scene(root, 800,800));
        primaryStage.show();




    }


    public static Board getBoard(){
        return board;
    }
}
