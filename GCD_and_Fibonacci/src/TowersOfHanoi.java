/**
 * Created by Al-Ghammari on 11/10/2016.
 */
public class TowersOfHanoi {
    public TowersOfHanoi(int n){
        noDisks = n;
    }
    public void solve(){
        solve(noDisks,"a","c","b");// from disk a to disk c
    }

    private void solve(int no,String from, String to, String aux){
        if (no ==1) move(1,from,to);

        else {
            solve(no-1, from, aux, to);
            move(no, from, to);
            solve(no-1, aux, to, from);
        }
    }

    private void move(int disk, String from, String to){
        System.out.println(from+"->("+disk+")->"+to);
    }

    int noDisks;
}
