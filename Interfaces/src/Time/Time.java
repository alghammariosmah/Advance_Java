package Time;

public interface Time {
	public int getHour();

	public int getMinute();

	public int getSecond();

	public void setHour(int h);

	public void setMinute(int m);

	public void setSecond(int s);

	public void set(int s);

	public void addSec(int sec);

	public void addMin(int min);

	public void addHour(int h);
}
