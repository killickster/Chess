package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sample.model.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {





    Board board;

    @FXML
    private Button button25;

    @FXML
    private Button button24;

    @FXML
    private Button button27;

    @FXML
    private Button button26;

    @FXML
    private Button button21;

    @FXML
    private Button button20;

    @FXML
    private Button button23;

    @FXML
    private Button button22;

    @FXML
    private Button button29;

    @FXML
    private Button button28;

    @FXML
    private Button button61;

    @FXML
    private Button button60;

    @FXML
    private Button button63;

    @FXML
    private Button button62;

    @FXML
    private Button button4;

    @FXML
    private Button button14;

    @FXML
    private Button button58;

    @FXML
    private Button button5;

    @FXML
    private Button button13;

    @FXML
    private Button button57;

    @FXML
    private Button button2;

    @FXML
    private Button button16;

    @FXML
    private Button button3;

    @FXML
    private Button button15;

    @FXML
    private Button button59;

    @FXML
    private Button button8;

    @FXML
    private Button button10;

    @FXML
    private Button button54;

    @FXML
    private Button button9;

    @FXML
    private Button button53;

    @FXML
    private Button button6;

    @FXML
    private Button button12;

    @FXML
    private Button button56;

    @FXML
    private Button button7;

    @FXML
    private Button button11;

    @FXML
    private Button button55;

    @FXML
    private Button button18;

    @FXML
    private Button button17;

    @FXML
    private Button button19;

    @FXML
    private Button button50;

    @FXML
    private Button button52;

    @FXML
    private Button button51;

    @FXML
    private Button button47;

    @FXML
    private Button button46;

    @FXML
    private Button button49;

    @FXML
    private Button button48;

    @FXML
    private Button button43;

    @FXML
    private Button button42;

    @FXML
    private Button button45;

    @FXML
    private Button button44;

    @FXML
    private Button button41;

    @FXML
    private Button button40;

    @FXML
    private Pane pane;

    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button36;

    @FXML
    private Button button35;

    @FXML
    private Button button38;

    @FXML
    private Button button37;

    @FXML
    private Button button32;

    @FXML
    private Button button31;

    @FXML
    private Button button34;

    @FXML
    private Button button33;

    @FXML
    private Button button39;

    @FXML
    private Button button30;




    Button[] buttons;







    int currentMove, currentMoveOrigin, currentMoveConclusion;
    int startOfMove = 0;



    @Override
    public void initialize(URL location, ResourceBundle resources) {


        buttons = new Button[]{button0,  button1,  button2,  button3,  button4,  button5,  button6,  button7,  button8,  button9,  button10,  button11,  button12,  button13,  button14,  button15,  button16,  button17,  button18,  button19,  button20,  button21,  button22,  button23,  button24,  button25,  button26,  button27,  button28,  button29,  button30,  button31,  button32,  button33,  button34,  button35,  button36,  button37,  button38,  button39,  button40,  button41,  button42,  button43,  button44,  button45,  button46,  button47,  button48,  button49,  button50,  button51,  button52,  button53,  button54,  button55,  button56,  button57,  button58,  button59,  button60,  button61,  button62,  button63};

        this.board = Main.getBoard();

        renderBoard(this.board);

    }

    public void renderBoard(Board board){





        for(int i = 0; i < 8; i++){

            for(int j = 0; j < 8; j++){

                renderPiece(board.getSquare(i,j));

            }

        }

    }

    public void renderPiece(Square square){


        try{


            int x = ((Pawn) square).getX();
            int y = ((Pawn) square).getY();
            int xPrev = ((Pawn) square).getPreviousPositionX();
            int yPrev = ((Pawn) square).getPreviousPositionY();

            int num = x*8+y%8;

               ImageView  brownPawnImage = new ImageView("/images/BrownPawn.png");

               brownPawnImage.setFitHeight(20);
            brownPawnImage.setFitWidth(20);


            buttons[num].setGraphic(brownPawnImage);

            int numPrev = xPrev*8+yPrev%8;

            buttons[numPrev].setGraphic(null);








        }catch (Exception e){


        }


    }



    public void square(ActionEvent e){
        String name = ((Button) e.getSource()).getId();

        String newString = name.substring(6);

        System.out.print(newString);



        if(startOfMove%2 == 0){
           //start
            currentMoveOrigin = Integer.parseInt(newString);

        }else{
            //end
            currentMoveConclusion = Integer.parseInt(newString);
            performMove(currentMoveOrigin, currentMoveConclusion);

        }

        startOfMove++;

    }


    public void performMove(int idOrigin, int idConclusion){
        int xOrigin, yOrigin, yConclusion, xConclusion;

        yOrigin = idOrigin%8;
        xOrigin = (idOrigin %100-yOrigin)/8;

        yConclusion = idConclusion%8;
        xConclusion = (idConclusion%100-yConclusion)/8;




        System.out.println("Move from: "+ xOrigin + " " + yOrigin + " to " + xConclusion + " " + yConclusion);

        Main.performMove(xOrigin, yOrigin, xConclusion, yConclusion);



       renderBoard(this.board);


    }
}
