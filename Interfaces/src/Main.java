import Item.Item;
import Item.ItemCollection;
import Item.ItemList;
import Item.Person;
import Item.Ranking;
import Time.SimpleTime;
import Time.Time;

public class Main {
	public static void main(String[] args){
		Item p= new Person("Ben",0);
		Item p1 = new Person("Sam",1);
		Item p2 = new Person ("Johannes",2);
		
		ItemCollection il = new ItemList();
		il.add(p);
		il.add(p1);
		il.add(p2);
		
		
		Time t = new SimpleTime();
		t.set(5000);
		
		
//		Item r = new Ranking(p, t);
//		System.out.println(r);
		
	}
}







