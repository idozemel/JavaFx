package View;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.Observable;
import java.util.Observer;

public class ViewController extends Observable {

    @FXML
    Canvas joystick;

    public void paint(){
        GraphicsContext gc = joystick.getGraphicsContext2D();
        double mx = joystick.getWidth()/2;
        double my = joystick.getHeight()/2;

        gc.strokeOval(mx-50,my-50,100,100);

    }


}
