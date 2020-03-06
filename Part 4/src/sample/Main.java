package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Question 4: Histogram");


        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.getData().add(new XYChart.Data("A", 0));
        dataSeries1.getData().add(new XYChart.Data("B", 0));
        dataSeries1.getData().add(new XYChart.Data("C", 0));
        dataSeries1.getData().add(new XYChart.Data("D", 0));
        dataSeries1.getData().add(new XYChart.Data("E", 0));
        dataSeries1.getData().add(new XYChart.Data("F", 0));
        dataSeries1.getData().add(new XYChart.Data("G", 0));
        dataSeries1.getData().add(new XYChart.Data("H", 0));
        dataSeries1.getData().add(new XYChart.Data("I", 0));
        dataSeries1.getData().add(new XYChart.Data("K", 0));
        dataSeries1.getData().add(new XYChart.Data("K", 0));
        dataSeries1.getData().add(new XYChart.Data("L", 0));
        dataSeries1.getData().add(new XYChart.Data("M", 0));
        dataSeries1.getData().add(new XYChart.Data("N", 0));
        dataSeries1.getData().add(new XYChart.Data("O", 0));
        dataSeries1.getData().add(new XYChart.Data("P", 0));
        dataSeries1.getData().add(new XYChart.Data("Q", 0));
        dataSeries1.getData().add(new XYChart.Data("R", 0));
        dataSeries1.getData().add(new XYChart.Data("S", 0));
        dataSeries1.getData().add(new XYChart.Data("T", 0));
        dataSeries1.getData().add(new XYChart.Data("U", 0));
        dataSeries1.getData().add(new XYChart.Data("V", 0));
        dataSeries1.getData().add(new XYChart.Data("W", 0));
        dataSeries1.getData().add(new XYChart.Data("X", 0));
        dataSeries1.getData().add(new XYChart.Data("Y", 0));
        dataSeries1.getData().add(new XYChart.Data("Z", 0));


        Button view = new Button("View");
        Label filenameLabel = new Label("Filename");
        TextField text = new TextField();
        text.getText();


        int[] freqs = new int[26];


        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String fileNameString = text.getText();
                try (BufferedReader in = new BufferedReader(new FileReader(fileNameString))) {
                    String line;
                    while ((line = in.readLine()) != null) {
                        line = line.toUpperCase();
                        for (char ch : line.toCharArray()) {
                            if (Character.isLetter(ch)) {
                                freqs[ch - 'A']++;
                            }
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                dataSeries1.getData().add(new XYChart.Data("A", freqs[0]));
                dataSeries1.getData().add(new XYChart.Data("B", freqs[1]));
                dataSeries1.getData().add(new XYChart.Data("C", freqs[2]));
                dataSeries1.getData().add(new XYChart.Data("D", freqs[3]));
                dataSeries1.getData().add(new XYChart.Data("E", freqs[4]));
                dataSeries1.getData().add(new XYChart.Data("F", freqs[5]));
                dataSeries1.getData().add(new XYChart.Data("G", freqs[6]));
                dataSeries1.getData().add(new XYChart.Data("H", freqs[7]));
                dataSeries1.getData().add(new XYChart.Data("I", freqs[8]));
                dataSeries1.getData().add(new XYChart.Data("K", freqs[9]));
                dataSeries1.getData().add(new XYChart.Data("K", freqs[10]));
                dataSeries1.getData().add(new XYChart.Data("L", freqs[11]));
                dataSeries1.getData().add(new XYChart.Data("M", freqs[12]));
                dataSeries1.getData().add(new XYChart.Data("N", freqs[13]));
                dataSeries1.getData().add(new XYChart.Data("O", freqs[14]));
                dataSeries1.getData().add(new XYChart.Data("P", freqs[15]));
                dataSeries1.getData().add(new XYChart.Data("Q", freqs[16]));
                dataSeries1.getData().add(new XYChart.Data("R", freqs[17]));
                dataSeries1.getData().add(new XYChart.Data("S", freqs[18]));
                dataSeries1.getData().add(new XYChart.Data("T", freqs[19]));
                dataSeries1.getData().add(new XYChart.Data("U", freqs[20]));
                dataSeries1.getData().add(new XYChart.Data("V", freqs[21]));
                dataSeries1.getData().add(new XYChart.Data("W", freqs[22]));
                dataSeries1.getData().add(new XYChart.Data("X", freqs[23]));
                dataSeries1.getData().add(new XYChart.Data("Y", freqs[24]));
                dataSeries1.getData().add(new XYChart.Data("Z", freqs[25]));

                barChart.getData().add(dataSeries1);

                for (int ii = 0; ii < 26; ii++) {
                    freqs[ii] = 0;
                }

            }
        };
        view.setOnAction(event);


        GridPane grid = new GridPane();

        grid.add(barChart, 3, 0);
        grid.add(filenameLabel, 0, 1);
        grid.add(text, 1, 1);
        grid.add(view, 1, 2);

        Scene scene = new Scene(grid, 800, 500);

        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
