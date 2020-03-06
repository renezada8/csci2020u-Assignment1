package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    public TextField invsAmField = new TextField();
    public TextField yearsField = new TextField();
    public TextField airField = new TextField();
    public Label futValAns = new Label("?");
    public double total;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Question 2: Investment-Value Calculator");


        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(1);

        Label invsAm = new Label("Investment Amount");
        grid.add(invsAm, 0, 0);


        grid.add(invsAmField, 1, 0);

        Label years = new Label("Years");
        grid.add(years, 0, 1);


        grid.add(yearsField, 1, 1);

        Label air = new Label("Annual Interest Rate");
        grid.add(air, 0, 3);


        grid.add(airField, 1, 3);

        Label futVal = new Label("Future Value");
        grid.add(futVal, 0, 4);

        futValAns.setAlignment(Pos.CENTER_RIGHT);
        grid.add(futValAns, 1, 4);


        Button calculate = new Button("Calculate");
        grid.add(calculate, 1, 5);

        calculate.setOnAction(e -> calculateFutureVal());


        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    void calculateFutureVal() {
        double usrInvsAm = Double.parseDouble(invsAmField.getText());
        int usrYears = Integer.parseInt(yearsField.getText());
        double usrAir = Double.parseDouble(airField.getText());

        total = usrInvsAm * Math.pow(1 + (usrAir / 1200), usrYears * 12);


        futValAns.setText(String.format("$%.2f", total));

    }

    public static void main(String[] args) {
        launch(args);
    }
}