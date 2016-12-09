package Ranking;

import java.sql.Time;

import Item.Item;

/**
 * 
 * @author Al-Ghammari Ranking class where we get the person along with his/her
 *         timings
 */
public class Ranking {
	/*
	 * Item object is defined in our written code. Time is Java predefined
	 * class.
	 */
	Item person;
	Time time;

	/**
	 * An empty constructor for un-given parameters
	 */
	public Ranking() {
		person = null;
		time = null;
	}

	/**
	 * a constructor for two given parameters
	 * 
	 * @param p
	 *            for a given person
	 * @param t
	 *            for the given time
	 */
	public Ranking(Item p, Time t) {
		person = p;
		time = t;
	}

	/**
	 * a function returning an integer number for the hours
	 * 
	 * @return the hours
	 */
	@SuppressWarnings("deprecation")
	public int getHour() {
		return time.getHours();
	}

	/**
	 * a function which returns an integer number for the minutes
	 * 
	 * @return the minutes
	 */
	@SuppressWarnings("deprecation")
	public int getMinutes() {
		return time.getMinutes();
	}

	/**
	 * a function which returns an integer number for the seconds
	 * 
	 * @return the seocnds
	 */
	@SuppressWarnings("deprecation")
	public int getSeconds() {
		return time.getSeconds();
	}

	/**
	 * a function which returns the specified person's name
	 * 
	 * @return string of his/her name
	 */
	public String getName() {
		return person.getName();
	}

	/**
	 * a function returning a string with all the variables needed in this class
	 */
	@Override
	public String toString() {
		return person.getName() + " with ID: " + person.getID() + " at time: " + time;
	}

}
