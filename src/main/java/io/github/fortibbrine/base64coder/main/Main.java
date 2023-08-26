package io.github.fortibbrine.base64coder.main;

import io.github.fortibbrine.base64coder.utils.Base64Util;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.Getter;

@Getter
public class Main extends Application {

    private Base64Util base64Util = new Base64Util();
    private final Text labelText = new Text("Введіть текст");
    private final TextField text = new TextField();
    private final Text resultText = new Text("Результат:");
    private final TextField result = new TextField();
    private final Button encodeButton = new Button("Зашифрувати");
    private final Button decodeButton = new Button("Розшифрувати");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.setPadding(new Insets(20));

        Font textFont = new Font(20);

        encodeButton.setStyle("-fx-background-color: white");
        decodeButton.setStyle("-fx-background-color: white");

        encodeButton.setOnMouseClicked(event -> result.setText(base64Util.encode(text.getText())));
        decodeButton.setOnMouseClicked(event -> result.setText(base64Util.decode(text.getText())));

        labelText.setFont(textFont);
        text.setFont(textFont);
        resultText.setFont(textFont);
        result.setFont(textFont);
        encodeButton.setFont(textFont);
        decodeButton.setFont(textFont);

        root.getChildren().add(labelText);
        root.getChildren().add(text);
        root.getChildren().add(resultText);
        root.getChildren().add(result);
        root.getChildren().add(encodeButton);
        root.getChildren().add(decodeButton);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Base64");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(400);
        primaryStage.show();

    }
}
