import java.io.*;
import java.util.Scanner;

public class PrintLoadImage {
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
		String direction = "n";
		int loop = 1;
		
		try {
			File file = new File("print/load " + zone + ".txt");	
			PrintWriter output = new PrintWriter(file);

			for (int i = 1; i <= totalPositions*4; i++) {
				switch (loop) {
					case 1:
						direction = "n";
						break;
					case 2:
						direction = "s";
						break;
					case 3:
						direction = "e";
						break;
					case 4:
						direction = "w";
						break;
					default:
						System.out.println("error");
						break;
				}
				
				output.println("\t\t\tcase \"" 
								+ zone + "_" + currentPosition + direction 
								+ "\":\n\t\t\t\tcurrentPositionImage = new ImageIcon(\"resources/images/" 
								+ zone + "/" + zone + "_" + currentPosition + direction 
								+ ".jpg\").getImage();\n\t\t\t\tbreak;");
				
				if (loop == 4) {
					loop = 1;
				} else {
					loop++;
				}
				
				if (i % 4 == 0)
					currentPosition++;
			}
			
			output.close();
			
			System.out.println("Printed.");
		} catch (Exception ex) {
			System.out.println("Print unsuccessful.");
		}
	}
}