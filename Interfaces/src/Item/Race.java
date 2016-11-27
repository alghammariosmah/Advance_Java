package Item;

public class Race {
	private Node head;
	Ranking rankingTemp;
	int seconds = 0;
	public Race() {
		this.head = null;
	}
	
	public void addRanking(Ranking R) {
		Node person_Time = new Node();
		Node temp = head;
		bestRanking(R);
		person_Time.setValue(R);
		if (head == null) {
			head = person_Time;
			return;
		}
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(person_Time);	
	}
	
	private void bestRanking(Ranking R){
		StringBuffer sb = new StringBuffer();
		int secondTemp = secondConverter(R);
		if( seconds == 0){
			seconds = secondTemp;
			rankingTemp = R;
		}
		if( seconds > secondTemp){
			seconds = secondTemp;
			rankingTemp = R;
		}
		else return;
	}
	
	public String bestRanking(){
		try {
			return "Best rank is "+rankingTemp.getName()+" with ID:"+ rankingTemp.getID()+ " at the time "+ rankingTemp.time;
		} catch (Exception e) {
			return "The list it empty";
		}
	}
	
	private int secondConverter(Ranking R){
		int seconds = 0;
		seconds += R.getHour()*3600;
		seconds += (R.getMinute()*60)%3600;
		seconds += R.getSecond();
		return seconds;
	}
	
	
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("List of participants: [");
		Node n = head;
		while (n != null) {
			sb.append(n.getValue().getName()+" ID: "+n.getValue().getID()+" with the time: "+rankingTemp.time);
			if (n.getNext() != null)
				sb.append(",");
			n = n.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

}
