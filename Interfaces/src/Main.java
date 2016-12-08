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
		t.set(1);
		Ranking r = new Ranking(p, t);
		
		Time t1 = new SimpleTime();
		t1.set(2);
		Ranking r1 = new Ranking(p1, t1);
		
		Time t2 = new SimpleTime();
		t2.set(3);
		Ranking r2 = new Ranking(p2, t2);
		
		Time t3 = new SimpleTime();
		t3.set(4);
		Ranking r3 = new Ranking(p3, t3);
		
		Race rankings = new Race();
		
		rankings.addRanking2(r3);
		rankings.addRanking2(r);
		rankings.addRanking2(r1);
		rankings.addRanking2(r2);


		System.out.println(rankings);
		
//		rankings.addRanking(r2);
//		rankings.addRanking(r1);
//		rankings.addRanking(r3);
//		rankings.addRanking(r);
		

		
//		t2.set(70002);
//		r2 = new Ranking(p2, t2);
//		rankings.addRanking(r2);
//		
//		System.out.println(rankings);
//		System.out.println(rankings.bestRanking());
//		
//		rankings.getOrdered();
		
		
		
	}
}







