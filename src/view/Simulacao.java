package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Simulacao {

	private JPanel simulacao;
	private JTextField txtAmplitude;
	private JTextField textAngulo;
	private JTextField textCorrente;

	public Simulacao(JFrame tela) {
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setBounds(100, 100, 650, 500);
		simulacao = new JPanel();
		simulacao.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.setContentPane(simulacao);
		
		JLabel lblAmplitude = new JLabel("Informe a amplitude:");
		
		txtAmplitude = new JTextField();
		txtAmplitude.setText("0.00");
		txtAmplitude.setColumns(10);
		
		JLabel lblAnguloDeFase = new JLabel("Angulo de fase da Tensão:");
		
		textAngulo = new JTextField();
		textAngulo.setText("0.00");
		textAngulo.setColumns(10);
		
		JLabel lblCorrente = new JLabel("Corrente:");
		
		textCorrente = new JTextField();
		textCorrente.setText("0.00");
		textCorrente.setColumns(10);
		
		JButton btnSimular = new JButton("Simular");
		GroupLayout gl_contentPane = new GroupLayout(simulacao);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(147)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCorrente)
						.addComponent(lblAnguloDeFase)
						.addComponent(lblAmplitude))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtAmplitude)
						.addComponent(textAngulo)
						.addComponent(textCorrente)
						.addComponent(btnSimular, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(173, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAmplitude)
						.addComponent(txtAmplitude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAnguloDeFase)
						.addComponent(textAngulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCorrente)
						.addComponent(textCorrente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(49)
					.addComponent(btnSimular)
					.addContainerGap(213, Short.MAX_VALUE))
		);
		simulacao.setLayout(gl_contentPane);
		simulacao.add(btnSimular);
		simulacao.add(lblCorrente);
		simulacao.add(lblAnguloDeFase);
		simulacao.add(lblAmplitude);
		simulacao.add(textAngulo);
		simulacao.add(txtAmplitude);
		simulacao.add(textCorrente);
		
		tela.getContentPane().add(simulacao);
		
		tela.setVisible(true);
		
	}
}
