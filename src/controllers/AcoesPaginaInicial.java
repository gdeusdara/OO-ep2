package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.Simulacao;

public class AcoesPaginaInicial  implements ActionListener{
	
	private JPanel painelInicial;
	private JFrame telaInicial;


	public AcoesPaginaInicial(JPanel painelInicial, JFrame telaInicial) {
		this.painelInicial=painelInicial;
		this.telaInicial=telaInicial;

	}

	

	public void actionPerformed(ActionEvent e){
			
		
		painelInicial.setVisible(false);
		new Simulacao(telaInicial);
	}
}
