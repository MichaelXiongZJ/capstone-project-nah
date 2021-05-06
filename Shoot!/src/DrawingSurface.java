import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import Enemy.Enemy;
import Projectile.Bullet;
import processing.core.PApplet;

public class DrawingSurface extends PApplet{
	private Bullet bullet;
	private Enemy enemy;
	

	/**
	 * Set up when first open
	 */
	public void setUp() {
		
	}
	
	/**
	 * draw the game with white background
	 */
	public void draw() {
		background(255);
	}
	
	/**
	 * Listens to the key inputs
	 * 
	 * @param e KeyEvent object to keep track of the keys
	 */
	public void keyReleased(KeyEvent e) {
		if (keyCode == KeyEvent.VK_W) {
			
		}
		if (keyCode == KeyEvent.VK_A) {
			
		}
		if (keyCode == KeyEvent.VK_S) {
			
		}
		if (keyCode == KeyEvent.VK_D) {
			
		}
	}
	
	/**
	 * Listens to mouse pressed inputs
	 * 
	 * @param e MouseEvent object to keep track of the pressing
	 */
	public void mousePressed(MouseEvent e) {
		
	}
	
	/**
	 * Listens to mouse clicked inputs
	 * 
	 * @param e MouseEvent object to keep track of the clicking
	 */
	public void mouseClicked(MouseEvent e) {
		
	}
	
}
