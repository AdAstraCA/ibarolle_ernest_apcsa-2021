//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
	//instance variables
	private int speed;
	private Color color;
	
   	public Paddle()
   	{
		super(10, 10, 10, 10);
		setColor(Color.BLACK);
		speed = 5;
   	}


   	public Paddle(int x, int y) {
	   	super(x, y, 10, 10);
	  	setColor(Color.BLACK);
	  	speed = 5;
   	}


	public Paddle(int x, int y, int s) {
		super(x, y, 10, 10);
		setColor(Color.BLACK);
		speed = s;
	}


	public Paddle(int x, int y, int s, int w, int h) {
		super(x, y, w, h);
		setColor(Color.BLACK);
		speed = s;
	}


	public Paddle(int x, int y, int w, int h, Color color, int s) {
		super(x, y, w, h);
		setColor(color);
		speed = s;
	}

	public void moveUpAndDraw(Graphics window)
	{
		draw(window, Color.WHITE);
		setY(getY() - speed);
		draw(window, color);
	}

	public void moveDownAndDraw(Graphics window)
	{
		draw(window, Color.WHITE);
		setY(getY() + speed);
		draw(window, color);
	}

	public int getSpeed() {
		return speed;
	}
   
	public String toString() {
		return "xPos = " + getX() + ", yPos = " + getY() + ", width = " + getWidth() + ", height = " + getHeight() + ", color = " + getColor() + ", speed = " + speed;
	}
}