package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene mainScene; // guardando refer�ncia nesse atributo para usar depois
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// int�ncia e n�o � m�todo est�tico para manipular a tela antes de carregar
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollPane = loader.load();
			
			// deixar o scrollPane ajustado a tela
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);

			
			mainScene = new Scene(scrollPane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// m�todo para reaproveitar com encapsulamento em outros lugares
	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
