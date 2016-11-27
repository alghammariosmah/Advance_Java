package Item;

import Time.SimpleTime;
import Time.Time;

public class Ranking implements Time,Item {
	private int hour, minute, second;
	Item person;
	Time time;
	
	public Ranking(){
		person = null;
		time = null;
	}
	public Ranking(Item p, Time t){
		person = p;
		time = t;
	}
		
	public int getID() {
		return person.getID();
	}

	public String getName() {
		return person.getName();
	}
	
	public int getHour(){
		return time.getHour();
	}
	
	public int getMinute(){
		return time.getMinute();
	}
	
	public int getSecond(){
		return time.getSecond();
	}

	public void setHour(int h) {
		if (h < 0 || h > 31) throw new IllegalArgumentException();
        hour = h;	
	}

	public void setMinute(int m) {
        if (m < 0 || m > 59) throw new  IllegalArgumentException();
        minute = m;
	}

	public void setSecond(int s) {
        if (s < 0 ) throw new  IllegalArgumentException();
        second = s;	
	}
	

	public void set(int s) {
        hour = s / 3600;
        minute = (s % 3600) / 60;
        second = s % 60;
	}

	public void addSec(int sec) {
        if (sec <= 59 && sec >= 0){
            second += sec % 60;
            if (hour > 24){
                second -= sec % 60;
                System.out.println("Sorry, the seconds exceeds 24 hours");
            }
        }else if(sec > 59 && sec <= 3600){
            second += sec % 60;
            minute += (sec % 3600) / 60;
            if (hour > 24){
                minute -= (sec % 3600) / 60;
                System.out.println("Sorry, the seconds exceeds 24 hours");
            }
        }else if (sec > 3600 ){
            second += sec % 60;
            minute += (sec % 3600) / 60;
            hour += sec / 3600;
            if (hour > 24){
                hour -= sec / 3600;
                System.out.println("Sorry, the seconds exceeds 24 hours");
            }
        }else {
            System.out.println("Please Enter a positive integer");
        }	
	}
	
	public void addMin(int min) {
        if (min <= 59 && min >= 0){
            minute += min % 60;
            if (hour > 24){
                minute -= min % 60;
                System.out.println("Sorry, the minutes exceeds 24 hours");
            }

        }else if(min > 59 && min <= 1440){
            minute += min;
            hour += (minute % 3600) / 60;
            if (hour > 24){
                hour -= (minute % 3600) / 60;
                System.out.println("Sorry, the minutes exceeds 24 hours");
            }
            minute = minute % 60;
        }else {
            System.out.println("Please Enter a positive integer and it must be less than 1440 minutes");
        }	
	}

	public void addHour(int h) {
		if (h <= 24 && h >= 0){
            hour += h % 60;
            if (hour > 24){
                hour -= h % 60;
                System.out.println("Sorry, the hours exceeds 24 hours");
            }

        }else if( h > 24){
        	h += hour;
        	hour = h % 24;
        }
        else{
            System.out.println("Please Enter a positive integer and it must be less than 24 hours");
        }
	}
	
}
