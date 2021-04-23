//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.Callable;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(400,300);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int width, int height)
	{
		super(x,y,width,height);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int width, int height, Color col)
	{
		super(x,y,width,height,col);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y,int width, int height, int xSpd, int ySpd)
	{
		super(x,y,width,height);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	public Ball(int x, int y,int width, int height, Color col, int xSpd, int ySpd)
	{
		super(x,y,width,height,col);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
   //add the set methods
   public void setXSpeed(int xSpd)
   {
	   xSpeed = xSpd;
   }

   public void setYSpeed(int ySpd)
   {
	   ySpeed = ySpd;
   }
   
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
//	   window.setColor(Color.WHITE);
//	   window.fillRect(getX(), getY(), getXSpeed(), getYSpeed());
	   draw(window,Color.WHITE);
	   //setX
	   setX(getX()+xSpeed);
	   
		//setY
	   setY(getY()+ySpeed);
	   
		//draw the ball at its new location
	  draw(window,getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball compare = (Ball)obj;
		if(this.getX() == compare.getX() && this.getY() == compare.getY() && this.getWidth() == compare.getWidth()
				&& this.getHeight() == compare.getHeight() && this.getXSpeed() == compare.getXSpeed()
			&& this.getYSpeed() == compare.getYSpeed() && this.getColor() == compare.getColor())
			return true;
		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	//collidable methods
	public boolean didCollideLeft(Object obj)
	{
		Block compare = (Block)obj;
		if(this.getX() <= compare.getX() + compare.getWidth() + Math.abs(this.getXSpeed())
		&& (this.getY() >= compare.getY() 
		&& this.getY() <= compare.getY() + compare.getHeight()
		|| this.getY() + this.getHeight() >= compare.getY()
		&& this.getY() + this.getHeight() < compare.getHeight() + compare.getY()))
			return true;
		return false;
	}
	
	public boolean didCollideRight(Object obj)
	{
		Block compare = (Block)obj;
		if(this.getX() >= compare.getX() - Math.abs(this.getXSpeed())
		&& (this.getY() >= compare.getY() 
		&& this.getY() <= compare.getY() + compare.getHeight()
		|| this.getY() + this.getHeight() >= compare.getY()
		&& this.getY() + this.getHeight() < compare.getHeight() + compare.getY()))
			return true;
		return false;
	}
	
	public boolean didCollideUp(Object obj)
	{
		Block compare = (Block)obj;
		if(this.getY() <= compare.getY() + compare.getHeight() - Math.abs(this.getYSpeed()))
			return true;
		return false;
	}
	
	public boolean didCollideDown(Object obj)
	{
		Block compare = (Block)obj;
		if(this.getY() >= compare.getY() - Math.abs(this.getYSpeed()))
			return true;
		return false;
	}
	//add a toString() method
	public String toString()
	{
		return "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + xSpeed + " " + ySpeed;
	}
	
}