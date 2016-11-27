import Item.Item;
import Item.ItemCollection;
import Item.ItemList;
import Item.Person;
import Item.Race;
import Item.Ranking;
import Time.SimpleTime;
import Time.Time;

public class Main {
	public static void main(String[] args){
		Item p= new Person("Ben",0);
		Item p1 = new Person("Sam",1);
		Item p2 = new Person ("Johannes",2);
		Item p3 = new Person ("Pramod",3);
		
		ItemCollection il = new ItemList();
		il.add(p);
		il.add(p1);
		il.add(p2);
		il.add(p3);
		
		Time t = new SimpleTime();
		t.set(5000);
		Ranking r = new Ranking(p, t);
		
		Time t1 = new SimpleTime();
		t1.set(3000);
		Ranking r1 = new Ranking(p1, t1);
		
		Time t2 = new SimpleTime();
		t2.set(1000);
		Ranking r2 = new Ranking(p2, t2);
		
		Time t3 = new SimpleTime();
		t3.set(6000);
		Ranking r3 = new Ranking(p3, t3);
		
		Race rankings = new Race();
		
		
		rankings.addRanking(r2);
		rankings.addRanking(r1);
		rankings.addRanking(r3);
		rankings.addRanking(r);
		
		System.out.println(rankings);
		System.out.println(rankings.bestRanking());
		
		
		
	}
}







