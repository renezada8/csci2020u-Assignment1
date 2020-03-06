package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Question 3: Dragging Points on a Circle");
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(100.0f);

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Circle dot1 = new Circle();
        dot1.setCenterX(400.0f);
        dot1.setCenterY(235.0f);
        dot1.setRadius(5.0f);
        dot1.setFill(Color.RED);
        dot1.setStroke(Color.RED);

        dot1.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Dragboard db = dot1.startDragAndDrop(TransferMode.ANY);

            }
        });

        Circle dot2 = new Circle();
        dot2.setCenterX(200.0f);
        dot2.setCenterY(35.0f);
        dot2.setRadius(5.0f);
        dot2.setFill(Color.RED);
        dot2.setStroke(Color.RED);

        Circle dot3 = new Circle();
        dot3.setCenterX(300.0f);
        dot3.setCenterY(235.0f);
        dot3.setRadius(5.0f);
        dot3.setFill(Color.RED);
        dot3.setStroke(Color.RED);

        double radius = circle.getRadius();


        Group group = new Group(circle, dot1, dot2, dot3);

        Scene scene = new Scene(group, 600, 300);


        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
