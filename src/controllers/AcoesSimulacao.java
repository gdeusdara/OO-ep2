package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.PaginaInicial;

public class AcoesSimulacao  implements ActionListener{
	
	private JPanel painelInicial;
	private JFrame telaInicial;


	public AcoesSimulacao(JPanel painelInicial, JFrame telaInicial) {
		this.painelInicial=painelInicial;
		this.telaInicial=telaInicial;

	}

	

	public void actionPerformed(ActionEvent e){
			
		
		painelInicial.setVisible(false);
		try {
			new PaginaInicial(telaInicial);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}