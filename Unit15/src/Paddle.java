//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   speed =5;
   }
   
   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x,y);
	   speed = 5;
   }

   public Paddle(int x, int y, int spd)
   {
	   super(x,y);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int width, int height)
   {
	   super(x,y,width,height);
	   speed = 5;
   }

   public Paddle(int x, int y, int width, int height, Color col)
   {
	   super(x,y,width,height,col);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int width, int height, int spd)
   {
	   super(x,y,width,height);
	   speed = spd;
   }
   public Paddle(int x, int y, int width, int height, Color col, int spd)
   {
	   super(x,y,width,height,col);
	   speed = spd;
   }
   public void setSpeed(int s)
   {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
//	   draw(window,Color.WHITE);
	   window.setColor(Color.WHITE);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
	   setY(getY() - speed);
	   
	   draw(window,getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   
	   setY(getY() + speed);
	   
	   draw(window,getColor());
   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString()
   {
	   return "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + 
			   "\n" + getColor() + " " + speed;
   }
}