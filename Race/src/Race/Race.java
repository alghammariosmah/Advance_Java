package Race;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Ranking.Ranking;


public class Race {
	List<Ranking> rankings = new ArrayList<>();
	Time time;
	
	public void addRanking(Ranking r){
		rankings.add(r);
	}
	
	public void removeRank(Ranking r){
		rankings.remove(r);
	}
	
	public void sortTime(){
	rankings.sort(new comperator());
	}
	
	public void sortNames(){
		rankings.sort(new comperator2());
	}
	
	
	public String toString() {
		if (rankings == null){
			return "The list is empty";
		}
		while (rankings != null){
			return rankings.toString();
		}
		return null;
	}
	
}

class comperator implements Comparator<Ranking>{
	public int compare(Ranking r1, Ranking r2) {
		int res = r1.getHour() - r2.getHour();
		if (res !=0) return res;
		res = r1.getMinutes() - r2.getMinutes();
		if (res != 0) return res;
		return r1.getSeconds() - r2.getSeconds();
	}
}

class comperator2 implements Comparator<Ranking>{
	public int compare(Ranking r1, Ranking r2) {
		return r1.getName().compareToIgnoreCase(r2.getName());	
	}
}
