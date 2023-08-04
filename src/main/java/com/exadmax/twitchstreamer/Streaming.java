import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.exadmax.twitchstreamer.service.StreamingService;

public class Streaming extends Application {
    @Inject
    private StreamingService streamingService;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Injector injector = Guice.createInjector(new AppModule());
        injector.injectMembers(this);

        Button startButton = new Button("Start Streaming");
        startButton.setOnAction(event -> startStreaming());

        Button stopButton = new Button("Stop Streaming");
        stopButton.setOnAction(event -> stopStreaming());

        StackPane root = new StackPane();
        root.getChildren().addAll(startButton, stopButton);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Twitch Streaming App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startStreaming() {
        String streamKey = "YOUR_TWITCH_STREAM_KEY";
        streamingService.startStreaming(streamKey);
    }

    private void stopStreaming() {
        streamingService.stopStreaming();
    }
}
