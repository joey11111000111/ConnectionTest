package test.the.connection;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by joey on 2015.10.22..
 */
public class FXEntry extends Application {

    private static final Logger LOG = LoggerFactory.getLogger(FXEntry.class);

    public static void main(String[] args) {
        NewStuffTest.test(value -> System.out.println(value + " OK."));
//        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        createSignInForm(primaryStage);
        signInFormAlone(primaryStage);
    }

    public void createSignInForm(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(5, 25, 5, 25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahome", FontWeight.NORMAL, 30));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);
//        grid.setGridLinesVisible(true);

        Button btn = new Button("Sing in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BASELINE_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4, 2, 1);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign in button pressed (" + (int)(Math.random() * 11) + ')');
            }
        });

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void signInFormAlone(Stage primaryStage) {
        primaryStage.setTitle("JavaFX - Sign in - page");

        GridPane grid = new GridPane();

        // Welcome message
        grid.setAlignment(Pos.CENTER);
        Text welcomeText = new Text("Welcome");
        welcomeText.setFont(Font.font("Tahome", FontWeight.BLACK, 22));
        welcomeText.setFill(Color.BLACK);
        grid.add(welcomeText, 0, 0, 2, 1);

        // user name
        Label userLabel = new Label("User name:");
        grid.add(userLabel, 0, 1);
        TextField userField = new TextField();
        grid.add(userField, 1, 1);

        // password
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pf = new PasswordField();
        grid.add(pf, 1, 2);

        // 'sign in' button
        Button btn = new Button("Sign in");
        HBox box = new HBox(10);
        box.setAlignment(Pos.BASELINE_RIGHT);
        box.getChildren().add(btn);
        grid.add(box, 0, 4, 2, 1);


        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}//class
