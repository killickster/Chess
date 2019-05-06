package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import sample.model.Main;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    ArrayList<Button> boardButtons = new ArrayList<Button>();


    int currentMove, currentMoveOrigin, currentMoveConclusion;
    int startOfMove = 0;

    @FXML
    Pane board;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void square(ActionEvent e){
        String name = ((Button) e.getSource()).getId();

        String newString = name.substring(6);



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


        Main.performMove(xOrigin, yOrigin, xConclusion, yConclusion);

        System.out.println("Move from: "+ xOrigin + " " + yOrigin + " to " + xConclusion + " " + yConclusion);



    }
}
