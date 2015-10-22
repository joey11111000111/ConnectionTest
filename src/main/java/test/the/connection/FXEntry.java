package test.the.connection;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by joey on 2015.10.22..
 */
public class FXEntry extends Application {

    private static final Logger LOG = LoggerFactory.getLogger(FXEntry.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        LOG.info("Application is starting");
        primaryStage.setTitle("First javaFX");
        Button btn = new Button("Say Hello World");
        LOG.info("Button is ready in {}", 12);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}//class
