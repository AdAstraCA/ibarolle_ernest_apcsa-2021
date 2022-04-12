//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;
	private int width;
	private int height;
	private Color color;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
		if ((int)(Math.random() * 2) == 1) {
			xSpeed = -1 * xSpeed;
		}
		if ((int)(Math.random() * 2) == 1) {
			ySpeed = -1 * ySpeed;
		}
		width = 10;
		height = 10;
		setColor(Color.BLUE);
	}

	//add the other Ball constructors
	public Ball(int a, int b) {
		super(a, b);
		xSpeed = 10;
		ySpeed = 10;
		width = 10;
		height = 10;
		setColor(Color.BLUE);
	}

	public Ball(int a, int b, int w, int h) {
		super(a, b);
		width = w;
	   	height = h;
	   	setColor(Color.BLUE);
		xSpeed = 10;
	   	ySpeed = 10;
	}

	public Ball(int a, int b, int w, int h, Color color) {
		super(a, b);
	   	width = w;
	   	height = h;
	   	setColor(color);
	   	xSpeed = 10;
	   	ySpeed = 10;
	}

	public Ball(int a, int b, int w, int h, int x, int y) {
	   	super(a, b);
	   	width = w;
	   	height = h;
	   	setColor(Color.BLUE);
	   	xSpeed = x;
	   	ySpeed = y;
	}
   
	public Ball(int a, int b, int w, int h, Color color, int x, int y) {
		super(a, b);
		width = w;
		height = h;
		setColor(color);
		xSpeed = x;
		ySpeed = y;
	}
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	public void setXSpeed(int speed) {
		xSpeed = speed;
	}
	
	public void setYSpeed(int speed) {
		ySpeed = speed;	
	}

	public void moveAndDraw(Graphics window)
	{
		draw(window, Color.WHITE);
		setX(getX() + xSpeed);
	   	setY(getY() + ySpeed);  
	   	draw(window, getColor());
	}
   
	public boolean equals(Object obj)
	{
		if (this == obj) {
			return true;
		} else {
			return false;
		}
	}  
	
	public String toString() {
		return "xPos = " + getX() + ", yPos = " + getY() + ", width = " + width + ", height = " + height + ", color = " + getColor() + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
	}
}