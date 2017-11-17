package juego;

import juego.vista.Game;

public class Pacman {

	public static void main(String args[]) {
		Game ventana = new Game(700,500,"JUEGO");
		ventana.start();
	}

}
