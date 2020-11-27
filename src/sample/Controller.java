package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    ImageView imageView;

    int action = 1;

    public void hello() {
        imageView.setVisible(false);
        if (action == 1) {
            textArea.appendText("Hello!\n");
        } else {
            textArea.setText("");
            textArea.appendText("Hello!\n");
            action = 1;
        }
    }

    public void date() {
        imageView.setVisible(false);
        Date date = new Date();
        textArea.setText("");
        textArea.appendText(date.toString());
        action = 2;
    }

    public void dice() throws IOException {
        imageView.setVisible(true);
        Random rand = new Random();
        int roll = rand.nextInt((6 - 1) + 1) + 1;
        textArea.setText("");
        textArea.appendText(String.valueOf(roll));
        switch (roll) {
            case 1 -> {
                //Passing FileInputStream object as a parameter
                FileInputStream inputstream = new FileInputStream("C:/Users/spile/IdeaProjects/Applikation_Med_Guide/src/sample/inverted-dice-1.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();
            }
            case 2 -> {
                //Passing FileInputStream object as a parameter
                FileInputStream inputstream = new FileInputStream("C:/Users/spile/IdeaProjects/Applikation_Med_Guide/src/sample/inverted-dice-2.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();
            }
            case 3 -> {
                //Passing FileInputStream object as a parameter
                FileInputStream inputstream = new FileInputStream("C:/Users/spile/IdeaProjects/Applikation_Med_Guide/src/sample/inverted-dice-3.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();
            }
            case 4 -> {
                //Passing FileInputStream object as a parameter
                FileInputStream inputstream = new FileInputStream("C:/Users/spile/IdeaProjects/Applikation_Med_Guide/src/sample/inverted-dice-4.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();
            }
            case 5 -> {
                //Passing FileInputStream object as a parameter
                FileInputStream inputstream = new FileInputStream("C:/Users/spile/IdeaProjects/Applikation_Med_Guide/src/sample/inverted-dice-5.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();
            }
            case 6 -> {
                //Passing FileInputStream object as a parameter
                FileInputStream inputstream = new FileInputStream("C:/Users/spile/IdeaProjects/Applikation_Med_Guide/src/sample/inverted-dice-6.png");
                Image diceImg = new Image(inputstream);
                imageView.setImage(diceImg);
                inputstream.close();
            }
        }
        action = 3;
    }

}
