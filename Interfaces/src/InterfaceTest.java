import static org.junit.Assert.*;

import org.junit.Test;

import Item.Item;
import Item.ItemCollection;
import Item.ItemList;
import Item.Person;
import Time.SimpleTime;
import Time.Time;

public class InterfaceTest {


	public void testPerson(){
		String input = "Sam";
		int idInput = 1;
		
		Item person = new Person("Sam",1);
		int id = person.getID();
		String person1 = person.getName();
		try {
			assertEquals(input, person1);
			assertEquals(idInput, id);
		} catch (Exception e) {
			e.getMessage();
			System.out.println("The input name and Id are not the same");
		}
		
	}
	
	@Test
	public void testList(){
		Item p= new Person("Ben",0);
		Item p1 = new Person("Sam",1);
		Item p2 = new Person ("Johannes",2);
		Item p3 = new Person ("Pramod",3);
		
		ItemCollection il = new ItemList();
		il.add(p);
		il.add(p1);
		il.add(p2);
		il.add(p3);
		try {
			assertTrue("[Ben,Sam,Johannes,Pramod]".equals(il.toString()));
		} catch (Exception e) {
			e.getMessage();
			System.out.println("The list is not the same");
		}
	}
	
	public void testTime(){
		Time t = new SimpleTime();
		t.set(5000);
	}

}
