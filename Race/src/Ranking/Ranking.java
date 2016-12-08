package Ranking;

import java.sql.Time;
import Item.Item;

public class Ranking{
	
	Item person;
	Time time;
	
	public Ranking(){
		person = null;
		time = null;
	}
	
	public Ranking(Item p, Time t){
		person = p;
		time = t;
	}
	
	@SuppressWarnings("deprecation")
	public int getHour(){
		return time.getHours();
	}
	
	@SuppressWarnings("deprecation")
	public int getMinutes(){
		return time.getMinutes();
	}
	
	@SuppressWarnings("deprecation")
	public int getSeconds(){
		return time.getSeconds();
	}
	
	public String getName(){
		return person.getName();
	}
	
	public String toString() {
		return person.getName()+" with ID: "+ person.getID()+ " at time: "+ time;
	}

	
}


