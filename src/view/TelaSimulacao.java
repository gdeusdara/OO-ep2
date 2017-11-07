package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AcoesSimulacao;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JSeparator;

public class TelaSimulacao {

	private JPanel simulador;
	private JTextField txtAmplitude;
	private JTextField textAngulo;
	private JTextField textCorrente;

	public TelaSimulacao(JFrame tela) {
		tela.setBounds(100, 100, 650, 500);
		tela.setLocationRelativeTo(null);
		
		simulador = new JPanel();
		simulador.setBorder(new EmptyBorder(5, 5, 5, 5));
		
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
		
		JButton btnVoltar = new JButton("Voltar");
		
		JSlider slider = new JSlider();
		
		JSlider slider_1 = new JSlider();
		
		JSlider slider_2 = new JSlider();
		GroupLayout gl_contentPane = new GroupLayout(simulador);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(113)
							.addComponent(btnVoltar, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
							.addGap(60)
							.addComponent(btnSimular, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(68))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblAnguloDeFase)
								.addComponent(lblAmplitude)
								.addComponent(lblCorrente))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textAngulo)
										.addComponent(txtAmplitude))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(slider_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textCorrente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(slider_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(108))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAmplitude)
							.addComponent(txtAmplitude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAnguloDeFase)
							.addComponent(textAngulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(slider_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCorrente)
							.addComponent(textCorrente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(slider_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVoltar)
						.addComponent(btnSimular))
					.addContainerGap(166, Short.MAX_VALUE))
		);
		simulador.setLayout(gl_contentPane);
		
		btnVoltar.addActionListener(new AcoesSimulacao(simulador, tela));
		
		tela.add(simulador);
		
		tela.setVisible(true);
		
	}
}
