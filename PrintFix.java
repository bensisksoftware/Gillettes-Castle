import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PrintFix {
	private static int getFileSize(String fileName) {
		try {
			int lines = 0;

			BufferedReader reader = new BufferedReader(new FileReader("print/fix.txt"));

			while (reader.readLine() != null)
				lines++;

			reader.close();
			
			return lines;
		} catch (Exception e){
			return 0;
		}
	}
	
	public static void print() {
		int fileSize = getFileSize("print/fix.txt");
		ArrayList<String> list = new ArrayList<String>();
		
		try {
			File file = new File("print/fix.txt");
			Scanner scan = new Scanner(file);
		
			for (int i = 0; i < fileSize; i++) {
				list.add(scan.nextLine());
			}
			
			scan.close();
		} catch (Exception ex) {
			System.out.println("fix unsuccessful.");
		}
		
		try {
			File file = new File("print/fix.txt");	
			PrintWriter output = new PrintWriter(file);
			
			Collections.sort(list);

			for (int i = 0; i < fileSize; i++) {
				output.println(list.get(i));
			}
			
			if (!list.contains(Player.getPosition()))
				output.println(Player.getPosition());
			
			output.close();
			
			System.out.println("Printed.");
		} catch (Exception ex) {
			System.out.println("Print unsuccessful.");
		}
	}
}