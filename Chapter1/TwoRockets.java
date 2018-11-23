package Exercises;

public class TwoRockets{
	
	public static void main(String[] args) {
		top();
		body();
		middle();
		body();
		top();	
	}
	
	public static void top() {
		System.out.println("   /\\"  +  "      /\\");
		System.out.println("  /  \\" +  "    /  \\");
		System.out.println(" /    \\"+  "  /    \\");
	}
		
	public static void middle() {	
		System.out.println("|Russia|" + "|Russia|");
		System.out.println("|      |" + "|      |");	
	}
	
	public static void body() {
		System.out.println("+------+" + "+------+");
		System.out.println("|      |" + "|      |");
		System.out.println("|      |" + "|      |");
		System.out.println("+------+" + "+------+");
	}
	
}