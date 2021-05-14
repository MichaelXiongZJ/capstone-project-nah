package actor;

import java.awt.Color;
import java.util.ArrayList;

import Enemy.Enemy;
import Projectile.Projectile;
import processing.core.PApplet;

public class Player extends Actor{
	
	private static int hp = 50;
	private double friction;
	
	public Player() {
		super();
	}
	
	public Player(double x, double y) {
		super(hp, x, y, 0, 0);
		setFill(Color.GREEN);
		friction = 0.75;
		setRadius(30);
	}
	
	public void draw(PApplet marker) {
        super.draw(marker);
        marker.circle((float)getX(),(float)getY(),(float)(getRadius()));
        marker.push();
        marker.translate((float)getX(), (float)getY());
        marker.rotate((float) getDir());
        marker.rect(0, -3, 30, 5, 5);
        marker.pop();

    }
	
	public void act(ArrayList<Actor> actors, PApplet surface, int time) {
		super.act(actors, surface, time);
		setvx(getvx()*friction);
		setvy(getvy()*friction);
		
		for(Actor a : actors) {
			if(intersects(a)) {
				if(!(a instanceof Projectile) && !(a == this)) {
					bounce();
					setBounce(true);
				}
				continue;
			}
			else {
				setBounce(false);
			}
		
		}
	}

	
	
	
	
	
	
	
	
}
