package view;

import java.io.IOException;

import javax.swing.JFrame;

public class Main {
	public static void main(String [] args) throws IOException{
		JFrame telaInicial = new JFrame();
		telaInicial.setLocationRelativeTo(null);
		telaInicial.setResizable(false);
		new PaginaInicial(telaInicial);
	}
}

