package com.example.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MastermindGame {
    int counter = 0;
    private boolean checked = false;
    List<Integer> yourGuess = new ArrayList();
    int equalColors =0;
    int equalPosition=0;
    int presscheckcount=0;
    @FXML
    private GridPane gridPane;
    @FXML
    private GridPane GrideLable;
    static int pick;

    // random colour
    public List<Integer> generateCode() {
        Random rand= new Random();
        List<Integer> secretColors = new ArrayList<>();
        for(int j=0;j<4;j++){
            pick=rand.nextInt(6);
            secretColors.add(pick);
        }
        return secretColors;
    }
    List<Integer> secretNums = generateCode();
    //  bottom of red
    @FXML
    public void pressBtn1(ActionEvent event) {
        if (counter == 0 || counter % 4 != 0 || checked) {
            Node node = gridPane.getChildren().stream().toList().get(counter);
            Circle c = (Circle) node;
            c.setFill(Color.RED);
            counter++;
            checked = false;
            yourGuess.add(0);
        } else {
            System.out.println("please press Check button");
        }
    }
//bottom of green
    @FXML
    public void pressBtn2(ActionEvent event) {
        if (counter == 0 || counter % 4 != 0 || checked) {
            Node node = gridPane.getChildren().stream().toList().get(counter);
            Circle c = (Circle) node;
            c.setFill(Color.GREEN);
            counter++;
            checked =false;
            yourGuess.add(1);
        } else {
            System.out.println("please press Check button");
        }

    }
//bottom of blue
    @FXML
    public void pressBtn3(ActionEvent event) {
        if (counter == 0 || counter % 4 != 0 || checked) {
            Node node = gridPane.getChildren().stream().toList().get(counter);
            Circle c = (Circle) node;
            c.setFill(Color.BLUE);
            counter++;
            checked = false;
            yourGuess.add(2);
        } else {
            System.out.println("please press Check button");
        }

    }
//bottom of purple
    @FXML
    public void pressBtn4(ActionEvent event) {
        if (counter == 0 || counter % 4 != 0 || checked) {
            Node node = gridPane.getChildren().stream().toList().get(counter);
            Circle c = (Circle) node;
            c.setFill(Color.PURPLE);
            counter++;
            checked = false;
            yourGuess.add(3);
        } else {
            System.out.println("please press Check button");
        }

    }
//bottom of orange
    @FXML
    public void pressBtn5(ActionEvent event) {
        if (counter == 0 || counter % 4 != 0 || checked) {
            Node node = gridPane.getChildren().stream().toList().get(counter);
            Circle c = (Circle) node;
            c.setFill(Color.ORANGE);
            counter++;
            checked = false;
            yourGuess.add(4);
        } else {
            System.out.println("please press Check button");
        }

    }
//bottom of yellow
    @FXML
    public void pressBtn6(ActionEvent event) {
        if (counter == 0 || counter % 4 != 0 || checked) {
            Node node = gridPane.getChildren().stream().toList().get(counter);
            Circle c = (Circle) node;
            c.setFill(Color.YELLOW);
            counter++;
            checked = false;
            yourGuess.add(5);
        } else {
            System.out.println("please press Check button");
        }

    }

//bottom of check
    @FXML
    public void pressCheckWin() {
        checked = true;
        if (presscheckcount != 10) {
            for (int i = 0; i < 4; i++)
                if (secretNums.get(i) == yourGuess.get(i)) {
                    equalColors++;
                }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (secretNums.get(i) == yourGuess.get(j)) {
                        equalPosition++;
                        break;
                    }
                }
            }
            equalPosition=equalPosition-equalColors;
            if(equalColors==4){
                System.out.println("you won:)");
            }

            // label a , b
            Node a = GrideLable.getChildren().stream().toList().get(2 * presscheckcount);
            Node b = GrideLable.getChildren().stream().toList().get(2 * presscheckcount + 1);
            Label v = (Label) a;
            Label w = (Label) b;
            v.setText("a=" + equalColors);
            w.setText("b=" + equalPosition);
            yourGuess.clear();
            equalColors=0;
            equalPosition=0;
            presscheckcount++;
        } else {
            System.out.println("Sorry, you lost! Try again.");
        }
    }
    //bottom of clear
    @FXML
    public void pressclearbottom(ActionEvent event) {
        if (counter % 5 != 0) {
            Node node = gridPane.getChildren().stream().toList().get(counter - 1);
            Circle c = (Circle) node;
            c.setFill(Paint.valueOf("#FFFFFF"));
            counter--;
        }
    }
//bottom of exit
@FXML
    public void pressExitBtn(ActionEvent event) {
        System.out.println("Button Exit Clicked");
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

}



