//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(10,10);
		width = 10;
		height = 10;
		setColor(new Color(0,0,0));
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		setPos(x,y);
		width = 10;
		height = 10;
		setColor(new Color(0,0,0));
	}
	
	public Block(int x, int y, int w, int h)
	{
		setPos(x,y);
		width = w;
		height = h;
		setColor(new Color(0,0,0));
	}
	
	public Block(int x, int y, int w, int h, Color col)
	{
		setPos(x,y);
		width = w;
		height = h;
		setColor(col);
	}
	
   //add the other set methods

	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	public void setX(int x)
	{
		xPos = x;
	}
	
	public void setY(int y)
	{
		yPos = y;
	}
	
	public void setColor(Color col)
	{
		color = col;
	}

	public void draw(Graphics window)
	{
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col)
	{
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
   
	public boolean equals(Object obj)
	{
		Block compare = (Block)obj;
		if(this.xPos == compare.getX() && this.yPos == compare.getY() && this.width == compare.getWidth()
				&& this.height == compare.getHeight() && this.color == compare.getColor())
			return true;
		return false;
	}   

   //add the other get methods
    public int getX()
    {
    	return xPos;
    }

    public int getY()
    {
    	return yPos;
    }
    
    public int getWidth()
    {
    	return width;
    }
    
    public int getHeight()
    {
    	return height;
    }
    
    public Color getColor()
    {
    	return color;
    }
    
    //add a toString() method  - x , y , width, height, color
    public String toString()
    {
    	return "" + xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
}