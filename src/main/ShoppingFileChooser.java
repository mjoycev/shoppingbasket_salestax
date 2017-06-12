package main;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ShoppingFileChooser extends JFrame {

	public ShoppingFileChooser() {
	}

	public String getFilePath() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.dispose();

		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Choose a file");

		int option = fileChooser.showDialog(null, "Open File");
		try {
			if (option == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				// txt files only
				if (file.getName().endsWith("txt")) {
					return file.getCanonicalPath();
				}
			}
		} catch (IOException e) {
		}

		return "";
	}
}
