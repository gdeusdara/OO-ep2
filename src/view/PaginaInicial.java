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
		tela.setTitle("Aprenda QEE");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setBounds(100, 100, 450, 300);
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton botaoTeste1 = new JButton("teste 1");
		
		JButton botaoTeste2 = new JButton("teste 2");
		
		JButton botaoTeste3 = new JButton("teste 3");
		
		JLabel titulo = new JLabel("Selecione a simulação desejada");
		GroupLayout gl_contentPane = new GroupLayout(painel);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(botaoTeste1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoTeste2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botaoTeste3, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(121, Short.MAX_VALUE)
					.addComponent(titulo)
					.addGap(118))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(titulo)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(botaoTeste2, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(botaoTeste3, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(botaoTeste1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
					.addGap(77))
		);
		painel.setLayout(gl_contentPane);
		
		botaoTeste1.addActionListener(new AcoesPaginaInicial(painel, tela));
		botaoTeste2.addActionListener(new AcoesPaginaInicial(painel, tela));
		botaoTeste3.addActionListener(new AcoesPaginaInicial(painel, tela));
	
		painel.add(botaoTeste1);
		painel.add(botaoTeste2);
		painel.add(botaoTeste3);
		painel.add(titulo);
		
		tela.add(painel);
		
		tela.setVisible(true);
		
	}
}
