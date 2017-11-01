package view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AcoesPaginaInicial;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.io.IOException;

import javax.swing.JLabel;

public class PaginaInicial {

	private JPanel painel;

	public  PaginaInicial(JFrame tela) throws IOException{
		tela.setBounds(100, 100, 710, 300);
		tela.setLocationRelativeTo(null);
		
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton botaoTeste1 = new JButton("Fluxo de Potência Fundamental");
		
		JButton botaoTeste2 = new JButton("Distorção Harmônica");
		
		JButton botaoTeste3 = new JButton("Fluxo de Potência Harmônico");
		
		JLabel titulo = new JLabel("Selecione a simulação desejada");
		GroupLayout gl_contentPane = new GroupLayout(painel);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(botaoTeste1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoTeste2, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoTeste3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(259)
					.addComponent(titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(226))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(titulo)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(botaoTeste1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(botaoTeste3, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(botaoTeste2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
					.addGap(77))
		);
		painel.setLayout(gl_contentPane);
		
		botaoTeste1.addActionListener(new AcoesPaginaInicial(painel, tela));
		botaoTeste2.addActionListener(new AcoesPaginaInicial(painel, tela));
		botaoTeste3.addActionListener(new AcoesPaginaInicial(painel, tela));
		
		tela.getContentPane().add(painel);
		
		tela.setVisible(true);
		
	}
}
