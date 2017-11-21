package juego.vista;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.vista.panel.PantallaJuego;
import juego.vista.panel.PantallaPrincipal;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display extends JFrame {

	private JPanel contentPane;
	private JPanel panelJuego ;
	public JPanel getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(JPanel panelJuego) {
		this.panelJuego = panelJuego;
	}

	private int ancho;
	private int alto;
	private String titulo;
	private Canvas canvas;
	private JButton btnPlay ;

	
	public Display(int ancho, int alto, String titulo) throws HeadlessException {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.titulo = titulo;
		init();
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}
	
	public void init() {
		setTitle(titulo);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Display.class.getResource("/Imagenes/cute-juegos-sonriente-pelota-pacman-icono-7066-48.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, ancho, alto);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.DARK_GRAY);
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		panelJuego = new JPanel();
		contentPane.add(panelJuego, BorderLayout.CENTER);
		panelJuego.setLayout(new CardLayout(0, 0));
		
		PantallaPrincipal inicio = new PantallaPrincipal();
		inicio.setBackground(Color.DARK_GRAY);
		panelJuego.add(inicio,"PACMAN");
		
		PantallaJuego pacman = new PantallaJuego();
		panelJuego.add(pacman,"PACMANJuego");
		
		btnPlay = new JButton("PLAY");
		btnPlay.setForeground(Color.DARK_GRAY);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout)panelJuego.getLayout();
				c.show(panelJuego, "PACMANJuego");
				pacman.setFocusable(true);
				btnPlay.setFocusable(false);
				btnPlay.setEnabled(false);
				btnPlay.setBackground(Color.DARK_GRAY);
				btnPlay.setText("");
			}
		});
		btnPlay.setBackground(Color.RED);
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlay.setActionCommand("play");
		//btnPlay.addActionListener(ctlBotones);
		panelBotones.add(btnPlay);
		
	}
	

}
