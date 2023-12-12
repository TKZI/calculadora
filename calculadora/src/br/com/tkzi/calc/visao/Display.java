package br.com.tkzi.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.tkzi.calc.modelo.Memoria;
import br.com.tkzi.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	/* jPanel é um conjunto de botoes na tela */
	
	private final JLabel label;
	
	
	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50)); //defini a cor do display
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE); // cor da fonte 
		label.setFont(new Font("courier", Font.PLAIN, 30)); // escolhe a fonte e seu tamanho
		
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
//defini no layout do display onde vai ficar o label e a distancia horizontal e vertical
		
		add(label); // não pode esquecer de adicionar 
		
		
	}
	
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}
