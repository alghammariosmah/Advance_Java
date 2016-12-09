import static org.junit.Assert.*;

import java.sql.Time;
import java.util.ArrayList;

import org.junit.Test;

import Item.Item;
import Item.Person;
import Race.Race;
import Ranking.Ranking;

public class RaceJUnitTest {
	@Test
	public void test(){
		testPerson();
		testRanking();
		testRace();
	}

		
	public void testPerson() {
		Item p1= new Person("Ben");
		assertEquals("Ben", p1.getName());
		assertEquals(1, p1.getID());
	}
	
	public void testRanking(){
		Item p1= new Person("Ben");
		@SuppressWarnings("deprecation")
		Time t1 = new Time(1,10,00);
		
		Ranking r1 = new Ranking(p1, t1);
		assertEquals(1, r1.getHour());
		assertEquals(10, r1.getMinutes());
		assertEquals(0, r1.getSeconds());
		assertEquals("Ben", r1.getName());
	}
	
	public void testRace(){
		Item p1= new Person("Ben");
		Item p2 = new Person("Sam");
		Item p3 = new Person ("Johannes");
		Item p4 = new Person ("Pramod");
		
		
		@SuppressWarnings("deprecation")
		Time t1 = new Time(1,10,00);
		@SuppressWarnings("deprecation")
		Time t2 = new Time(2,10,00);
		@SuppressWarnings("deprecation")
		Time t3 = new Time(3,10,00);
		@SuppressWarnings("deprecation")
		Time t4 = new Time(4,10,00);
		
		Ranking r1 = new Ranking(p1, t1);
		Ranking r2 = new Ranking(p2, t2);
		Ranking r3 = new Ranking(p3, t3);
		Ranking r4 = new Ranking(p4, t4);
		
		
		Race race = new Race();
		race.addRanking(r3);
		race.addRanking(r1);
		race.addRanking(r2);;
		race.addRanking(r4);
		
		ArrayList<Ranking> testing = new ArrayList<>();
		testing.add(r3);
		testing.add(r1);
		testing.add(r2);
		testing.add(r4);
		
		assertEquals(testing, race.rankings);
		
	}


}
