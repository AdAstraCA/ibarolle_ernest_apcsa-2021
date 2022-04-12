//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.lang.Math;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall();
		leftPaddle = new Paddle(5, 200, 10, 70, Color.ORANGE, 70);
		rightPaddle = new Paddle(770, 200, 10, 70, Color.YELLOW, 70);
		keys = new boolean[4];
		leftScore = 0;
		rightScore = 0;
    	setBackground(Color.WHITE);
		setVisible(true);
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if (ball.getX() < 10) {
				leftScore = leftScore + 1;
			}
			if (ball.getX() > 780) {
				rightScore = rightScore + 1;
			}
			ball.draw(graphToBack, Color.WHITE);
			ball = new SpeedUpBall();
			ball.setXSpeed((int)(Math.random() * 2) + 1);
			ball.setYSpeed((int)(Math.random() * 2) + 1);
			if ((int)(Math.random() * 2) == 1) {
				ball.setXSpeed(ball.getXSpeed() * -1);
			}
			if ((int)(Math.random() * 2) == 1) {
				ball.setYSpeed(ball.getYSpeed() * -1);
			}
		}
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=550))
		{
			ball.setYSpeed(ball.getYSpeed() * -1);
		}



		//see if the ball hits the left paddle
		
		if (ball.getX() >= leftPaddle.getX() && ball.getX() < leftPaddle.getX() + leftPaddle.getWidth() && ball.getY() >= leftPaddle.getY() && ball.getY() < leftPaddle.getY() + leftPaddle.getHeight()) {
			ball.setXSpeed(ball.getXSpeed() * -1);
		}
		
		//see if the ball hits the right paddle
		
		
		if (ball.getX() < rightPaddle.getX() && ball.getX() >= rightPaddle.getX() - rightPaddle.getWidth() && ball.getY() >= rightPaddle.getY() && ball.getY() < rightPaddle.getY() + rightPaddle.getHeight()) {
			ball.setXSpeed(ball.getXSpeed() * -1);
		}


		//see if the paddles need to be moved

		if(keys[0] == true)
		{
			if (leftPaddle.getY() >= 10) {
				leftPaddle.moveUpAndDraw(graphToBack);
			}
			keys[0] = false;
		}
		
		if(keys[1] == true)
		{
			if (leftPaddle.getY() <= 470) {
				leftPaddle.moveDownAndDraw(graphToBack);
			}
			keys[1] = false;
		}
		
		if(keys[2] == true)
		{
			if (rightPaddle.getY() >= 10) {
				rightPaddle.moveUpAndDraw(graphToBack);
			}
			keys[2] = false;
		}
		
		if(keys[3] == true)
		{
			if (rightPaddle.getY() <= 470) {
				rightPaddle.moveDownAndDraw(graphToBack);
			}
			keys[3] = false;
		}
		
		twoDGraph.drawString("Leftscore: " + leftScore, 360, 500);
		twoDGraph.drawString("Rightscore: " + rightScore, 360, 550);
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}