package Item;

import Time.SimpleTime;
import Time.Time;

public class Ranking implements Item {
	Item person;
	SimpleTime time;
	
	public Ranking(){
		person = null;
		time = null;
	}
	public Ranking(Item p, Time t){
		person = p;
		time = (SimpleTime) t;
	}
		
	public int getID() {
		return person.getID();
	}

	public String getName() {
		return person.getName();
	}
	
	public String toString() {
		return person.toString();
	}
	
}
