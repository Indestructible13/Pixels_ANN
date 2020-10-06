import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Main extends Application {
    private static Pane root = new Pane();
    private Label titleText = new Label("Simple JavaFX Application");
    private Label bodyText = new Label("Click the button to see something cool!");
    private Button simpleButton = new Button("Button");

    @Override
    public void start(Stage primaryStage) {
        titleText.setFont(Font.font("Broadway", 24));
        titleText.setTextFill(Color.RED);
        titleText.setLayoutX(10);
        titleText.setLayoutY(10);

        bodyText.setFont(Font.font("Times New Roman", 12));
        bodyText.setLayoutX(10);
        bodyText.setLayoutY(50);

        simpleButton.setFont(Font.font("Cooper Black", 11));
        simpleButton.setTextFill(Color.BLUE);
        simpleButton.setLayoutX(25);
        simpleButton.setLayoutY(100);
        simpleButton.setOnMouseClicked(e -> {
            teleportButton(simpleButton);
        });

        root.getChildren().addAll(titleText, bodyText, simpleButton);

        primaryStage.setTitle("Simple JavaFX Application");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    public static void teleportButton(Button b) {
        b.setLayoutX(Math.random() * (root.getWidth() - b.getWidth()));
        b.setLayoutY(Math.random() * (root.getHeight() - b.getHeight()));
    }
}
