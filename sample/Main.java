package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Random rand = new Random();

        Integer rand1 = 0;
        Integer rand2 = 0;
        Integer rand3 = 0;

        rand1 = rand.nextInt(54) + 1;

        do{
            rand2 = rand.nextInt(54) + 1;
        }while(rand2 == rand1);

        do{
            rand3 = rand.nextInt(54) + 1;
        }while(rand3 == rand1 || rand3 == rand2);


        String url1 = "/Cards/" + rand1.toString() + ".png";
        String url2 = "/Cards/" + rand2.toString() + ".png";
        String url3 = "/Cards/" + rand3.toString() + ".png";


        Image image1 = new Image(url1);
        ImageView img1 = new ImageView(image1);

        Image image2 = new Image(url2);
        ImageView img2 = new ImageView(image2);

        Image image3 = new Image(url3);
        ImageView img3 = new ImageView(image3);

        //System.out.println(rand1.toString() + ", " + rand2.toString() + ", " + rand3.toString());

        HBox box = new HBox(5);
        box.getChildren().add(img1);
        box.getChildren().add(img2);
        box.getChildren().add(img3);

        Scene scene = new Scene(box, 226, 96);
        primaryStage.setTitle("3 Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
