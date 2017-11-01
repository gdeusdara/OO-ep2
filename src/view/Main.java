package view;

import java.io.IOException;

import javax.swing.JFrame;

public class Main {
	public static void main(String [] args) throws IOException{
		JFrame telaInicial = new JFrame();
		telaInicial.setResizable(false);
		telaInicial.setTitle("Aprenda QEE");
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new PaginaInicial(telaInicial);
	}
}

