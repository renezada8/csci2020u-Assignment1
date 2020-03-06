package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       primaryStage.setTitle("Question 1: Random card show.");

        FileInputStream input1 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\1.png");
        FileInputStream input2 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\2.png");
        FileInputStream input3 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\3.png");
        FileInputStream input4 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\4.png");
        FileInputStream input5 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\5.png");
        FileInputStream input6 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\6.png");
        FileInputStream input7 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\7.png");
        FileInputStream input8 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\8.png");
        FileInputStream input9 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\9.png");
        FileInputStream input10 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\10.png");
        FileInputStream input11 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\11.png");
        FileInputStream input12 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\12.png");
        FileInputStream input13 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\13.png");
        FileInputStream input14 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\14.png");
        FileInputStream input15 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\15.png");
        FileInputStream input16 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\16.png");
        FileInputStream input17 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\17.png");
        FileInputStream input18 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\18.png");
        FileInputStream input19 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\19.png");
        FileInputStream input20 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\20.png");
        FileInputStream input21 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\21.png");
        FileInputStream input22 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\22.png");
        FileInputStream input23 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\23.png");
        FileInputStream input24 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\24.png");
        FileInputStream input25 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\25.png");
        FileInputStream input26 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\26.png");
        FileInputStream input27 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\27.png");
        FileInputStream input28 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\28.png");
        FileInputStream input29 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\29.png");
        FileInputStream input30 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\30.png");
        FileInputStream input31 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\31.png");
        FileInputStream input32 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\32.png");
        FileInputStream input33 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\33.png");
        FileInputStream input34 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\34.png");
        FileInputStream input35 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\35.png");
        FileInputStream input36 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\36.png");
        FileInputStream input37 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\37.png");
        FileInputStream input38 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\38.png");
        FileInputStream input39 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\39.png");
        FileInputStream input40 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\40.png");
        FileInputStream input41 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\41.png");
        FileInputStream input42 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\42.png");
        FileInputStream input43 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\43.png");
        FileInputStream input44 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\44.png");
        FileInputStream input45 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\45.png");
        FileInputStream input46 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\46.png");
        FileInputStream input47 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\47.png");
        FileInputStream input48 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\48.png");
        FileInputStream input49 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\49.png");
        FileInputStream input50 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\50.png");
        FileInputStream input51 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\51.png");
        FileInputStream input52 = new FileInputStream("C:\\Users\\user\\Documents\\OnTech\\6th Semester\\Sorftware System Dev & Integ\\csci2020u\\Assignment 1\\Part 1\\src\\sample\\Playingcards\\52.png");



       double random1 = (int)(Math.random()*((51-1)+1)+1);
       double random2 = (int)(Math.random()*((51-1)+1)+1);
       double random3 = (int)(Math.random()*((51-1)+1)+1);


       FileInputStream[] totalInputs = new FileInputStream[]{input1,input2,input3,input4,input5, input6, input7,input8,
               input9,input10,input11,input12,input13,input14,input15,input16,input17,input18,input19,input20,input21,
               input22,input23,input24,input25, input26, input27,input28,input29,input30,input31,input32,input33,input34,
               input35, input36, input37,input38,input39,input40,input41,input42,input43,input44,input45, input46,
               input47,input48,input49,input50,input51,input52};
        System.out.println(random1);
       Image crd1 = new Image(totalInputs[(int)random1]);
       Image crd2 = new Image(totalInputs[(int)random2]);
       Image crd3 = new Image(totalInputs[(int)random3]);
       ImageView imageView1 = new ImageView(crd1);
       ImageView imageView2 = new ImageView(crd2);
       ImageView imageView3 = new ImageView(crd3);



       HBox hb = new HBox(imageView1, imageView2, imageView3);
        VBox vb = new VBox();
        vb.getChildren().add(hb);


       Scene scene = new Scene(vb,222,100);
       primaryStage.setScene(scene);
       primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
