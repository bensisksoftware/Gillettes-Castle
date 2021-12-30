import java.io.*;

public class PrintX {
	public static void main(String[] args) {
		print();
	}
	
	private static void print() {
		try {
			File file = new File("print/print x.txt");	
			PrintWriter output = new PrintWriter(file);
			
			for (int i = 1; i <= 52; i++) {
				output.println("case " + i + ":\n\tkey_" + i + ".close();\n\tloadKey" + i + "();\n\tkey_" + i + ".start();\n\tbreak;");
			}
			
			output.close();
			
			System.out.println("Printed.");
		} catch (Exception ex) {
			System.out.println("Print unsuccessful.");
		}
	}
}