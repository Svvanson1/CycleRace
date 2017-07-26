
public class Source {

	public static int movesLeft(int n, int x) {
		int totalMoves = 0;
		int modX = n % x;
		
		if(modX != x) {
			return n / x;
		}
		else{
			return 2147483647; //not possible
		}
	}
	
	public static int decision(int n) {
		int n1,n2,n3;
		
		n1 = movesLeft(n, 1);
		n2 = movesLeft(n, 2);
		n3 = movesLeft(n, 4);
		
		if(n1 < n2 && n1 < n3) {
			return 1;
		}
		else if(n2 < n1 && n2 < n3) {
			return 2;	
		}
		else {
			return 4;
		}
	}
	
	public static void main(String[] args) {
		int n = 30; //Number of KM in total
		String name1 = "JACK", name2 = "J2";
		String currentPlayer = name2;
		
		while(n >= 0) {
			
		}
		
		
	}
	
	

}
