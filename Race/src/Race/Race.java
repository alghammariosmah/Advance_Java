package Race;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Ranking.Ranking;

/**
 * 
 * 
 * @author Al-Ghammari
 *
 */
public class Race {
	/**
	 * using the built in Array list, made ad public for testing purposes.
	 */
	public List<Ranking> rankings = new ArrayList<>();
	Time time;

	/**
	 * Adding a new rank to the list
	 * 
	 * @param r
	 */
	public void addRanking(Ranking r) {
		rankings.add(r);
	}

	/**
	 * removing a specific item from the list
	 * 
	 * @param r
	 */
	public void removeRank(Ranking r) {
		rankings.remove(r);
	}

	/**
	 * sorting the list according to the earliest time using the operator class
	 */
	public void sortTime() {
		rankings.sort(new comperator());
	}

	/**
	 * sorting the list according to the alphabetical order using the operator
	 * class
	 */
	public void sortNames() {
		rankings.sort(new comperator2());
	}

	/**
	 * returning the all the added participants
	 */
	@Override
	public String toString() {
		if (rankings == null) {
			return "The list is empty";
		}
		while (rankings != null) {
			return rankings.toString();
		}
		return null;
	}

}

/*
 * a comparing class where it compares the timings of two added Rankings
 */
class comperator implements Comparator<Ranking> {
	@Override
	public int compare(Ranking r1, Ranking r2) {
		int res = r1.getHour() - r2.getHour();
		if (res != 0)
			return res;
		res = r1.getMinutes() - r2.getMinutes();
		if (res != 0)
			return res;
		return r1.getSeconds() - r2.getSeconds();
	}
}

/**
 * 
 * a comparing class where it compares two instances of Ranking objects and give
 * the priority according to the alphabetical order
 *
 */
class comperator2 implements Comparator<Ranking> {
	@Override
	public int compare(Ranking r1, Ranking r2) {
		return r1.getName().compareToIgnoreCase(r2.getName());
	}
}
