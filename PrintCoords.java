import java.io.*;

public class PrintCoords {
	public static void print(double x1, double y1, double x2, double y2) {
		try {
			File file = new File("print/coords.txt");	
			PrintWriter output = new PrintWriter(file);
				
			output.println("Mouse.x > " + x1 + " && Mouse.x < " + x2 + " && Mouse.y > " + y1 + " && Mouse.y < " + y2);
				
			output.close();
			
			System.out.println("Printed.");
		} catch (Exception ex) {
			System.out.println("Print unsuccessful.");
		}
	}
	

}