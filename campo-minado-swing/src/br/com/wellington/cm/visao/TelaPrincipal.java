package br.com.wellington.cm.visao;

import javax.swing.JFrame;

import br.com.wellington.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 5);
		add(new PainelTabuleiro(tabuleiro));
		setTitle("CAMPO MINADO");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}

}
