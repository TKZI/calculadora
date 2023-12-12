package br.com.tkzi.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	
	public Calculadora() {
		
		organizarLayout();
		setSize(232, 322); // seta o tamanho da janela 
		setLocationRelativeTo(null); // seta a localizão da janela (null é centro)
		setDefaultCloseOperation(EXIT_ON_CLOSE); // seta que ao fechar a janela encerra app
		setVisible(true); // faz a janela ficar visivel 
		
		
		
	}
	
	
	private void organizarLayout() {
	
		setLayout(new BorderLayout()); //vai setar a classe no layout 
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60)); //defini o tamanho do display
		add(display, BorderLayout.NORTH); //defini onde o display vai ficar 
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER); // defini onde o teclado vai ficar 
		
		
		
		
		
	}


	public static void main(String[] args) {
		
		new Calculadora();
		
		
	}

}
