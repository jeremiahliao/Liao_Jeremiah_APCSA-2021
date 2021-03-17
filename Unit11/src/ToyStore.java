//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		ArrayList stringList = new ArrayList<String>();
		ArrayList intList = new ArrayList<Integer>();
		String[] splitted = toys.split(" ");
		for(String toy : splitted)
		{
			if(!stringList.contains(toy))
			{
				stringList.add(toy);
				intList.add(1);
			}
			else
			{
				int index = stringList.indexOf(toy);
				intList.set(index,(Integer)(intList.get(index))+1);
			}
		}
		for(int i = 0; i < stringList.size(); i++)
		{
			toyList.add(new Toy((String)stringList.get(i)));
			toyList.get(i).setCount((Integer)intList.get(i));
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		Toy toy = new Toy();
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			if(nm.equals(toyList.get(i).getName()))
  			{
  				toy = toyList.get(i);
  			}
  		}
  		return toy;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int greatestCount = 0;
  		Toy greatest = new Toy();
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			if(toyList.get(i).getCount() > greatestCount)
  			{
  				greatestCount = toyList.get(i).getCount();
  				greatest = toyList.get(i);
  			}
  		}
  		return "" + greatest.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList temp = new ArrayList<Toy>();
  		while(toyList.size() != 0)
  		{
	  		for(int i = 0; i < toyList.size();i++)
	  		{
	  			if(getMostFrequentToy().equals(toyList.get(i).getName()))
	  			{
	  				temp.add(toyList.get(i));
	  				toyList.remove(i);
	  			}
	  		}
  		}
  		toyList = temp;
  	}  
  	  
	public String toString()
	{
		String str = "" + toyList + "\nMost frequent toy : " + getMostFrequentToy() +
				   "\nList after sorting : ";
		sortToysByCount();
		str = str + toyList;
		return str;
	}
}