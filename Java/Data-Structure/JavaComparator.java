/*
Given an array of  Player objects, write a comparator sorts them in order of decreasing score; if  or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
*/

import java.util.*;

class Checker implements Comparator {
	public int compare(Object o1, Object o2) {
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		
		if (p1.score == p2.score) {
			return p1.name.compareTo(p2.name);
		}
		else if (p1.score < p2.score) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player player[] = new Player[n];
        Checker checker = new Checker();
        
        for(int i=0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}  
