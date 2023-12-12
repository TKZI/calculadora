package br.com.tkzi.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
	/* o jButton defini os botoes da aplicação  sendo que a classe botao é do tipo botao*/
	
	public Botao(String texto, Color cor) {
		setText(texto);  //qual sera o texto do botao
		setFont(new Font("courier", Font.PLAIN, 25)); // a fonte do botao
		setOpaque(true);
		setBackground(cor); //a cor do botao
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//defini a cor da borda do botao
		
	}
	
	
	
	

}
