package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class MainWindow implements Initializable {

	@FXML
	private Canvas canvas;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		new Thread(() -> {
			while (true) {
				//Code
				pause(50);
			}
		}).start();
	}

	private void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
