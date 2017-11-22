package juego.vista.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class PantallaJuego extends JPanel {

	private static nivel nivelJuego;
	
	public PantallaJuego() {
		init();
	}
	
	public void init() {
		setLayout(new BorderLayout(0, 0));
	/*	
		nivelJuego=new nivel();
		Cell[][] cells=nivelJuego.getCells();
		
		*/
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.GRAY);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panelFlechas = new JPanel();
		panelFlechas.setBackground(Color.GRAY);
		panel.add(panelFlechas, BorderLayout.EAST);
		panelFlechas.setLayout(new BorderLayout(0, 0));
		
		JButton btnArriba = new JButton("");
		btnArriba.setIcon(new ImageIcon(PantallaJuego.class.getResource("/Imagenes/flechaArriba.png")));
		panelFlechas.add(btnArriba, BorderLayout.NORTH);
		
		JButton btnIzquierda = new JButton("");
		btnIzquierda.setIcon(new ImageIcon(PantallaJuego.class.getResource("/Imagenes/flechaIzquierda.png")));
		panelFlechas.add(btnIzquierda, BorderLayout.WEST);
		
		JButton btnDerecha = new JButton("");
		btnDerecha.setIcon(new ImageIcon(PantallaJuego.class.getResource("/Imagenes/flechaDerecha.png")));
		panelFlechas.add(btnDerecha, BorderLayout.EAST);
		
		JButton btnAbajo = new JButton("");
		btnAbajo.setIcon(new ImageIcon(PantallaJuego.class.getResource("/Imagenes/flechaAbajo.png")));
		panelFlechas.add(btnAbajo, BorderLayout.SOUTH);
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBackground(Color.GRAY);
		panel.add(panelOpciones, BorderLayout.WEST);
		panelOpciones.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnPlay = new JButton("");
		btnPlay.setIcon(new ImageIcon(PantallaJuego.class.getResource("/Imagenes/boton-verde-de-reproduccion-icono-4806-32.png")));
		panelOpciones.add(btnPlay);
		
		JButton btnPause = new JButton("");
		panelOpciones.add(btnPause);
		btnPause.setIcon(new ImageIcon(PantallaJuego.class.getResource("/Imagenes/boton-verde-para-hacer-una-pausa-icono-9394-32.png")));
		
		JPanel panelJuego = new JPanel();
		panelJuego.setBackground(Color.BLACK);
		panel.add(panelJuego);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelJuego.add(panel_1);

	}

}
