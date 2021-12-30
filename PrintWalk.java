import java.io.*;
import java.util.Scanner;

public class PrintWalk {
	private static String directionToTurn;
	private static String zone;
	private static int totalPositions;
	private static int currentPosition = 1;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What zone?");
		
		zone = scan.next();
		
		System.out.println("How many positions?");
		
		totalPositions = scan.nextInt();
		
		print();
	}
	
	private static void print() {
		String direction1 = "n";
		String direction2 = "w";
	
		try {
			File file = new File("print/walk " + " " + zone + ".txt");	
			PrintWriter output = new PrintWriter(file);

			for (int i = 1; i <= totalPositions*4; i++) {
				switch (direction1) {
					case "n":
						direction2 = "w";
						break;
					case "s":
						direction2 = "e";
						break;
					case "e":
						direction2 = "n";
						break;
					case "w":
						direction2 = "s";
						break;
					default:
						System.out.println("error");
						break;
				}
				
				output.println("\t\t\tcase \"" + zone + "_" + currentPosition + direction1 + "\":\n\t\t\t\tPlayer.position = \"" + zone + "_" + direction1 + "\";\n\t\t\t\tbreak;");
				
				direction1 = direction2;
				
				if (i % 4 == 0)
					currentPosition++;
			}
			
			output.close();
			
			System.out.println("Printed.");
		} catch (Exception ex) {
			System.out.println("Save unsuccessful.");
		}
	}
	

}