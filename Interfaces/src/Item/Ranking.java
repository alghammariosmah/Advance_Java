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
	
	
	@Override
	public int getID() {
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		
		return time.toString();
	}
	
}
