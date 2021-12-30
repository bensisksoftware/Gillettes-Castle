import java.io.*;
import java.util.Scanner;

public class Data {
	public static boolean showPosition;
	public static boolean ratioSame;
	public static boolean button2Pushed;
	
	public static double ratioWidth;
	public static double ratioHeight;
	public static double leftBorder;
	public static double rightBorder;
	// public static int gameWidth; // this is for maintaining proportions
	// public static int gameHeight; // this is for maintaining proportions
	
	public static double xCoord;
	public static double yCoord;
	
	public static void printData() {
		System.out.println("\n");
		System.out.println("x: " + Mouse.x + " y: " + Mouse.y + " " + Player.getOldPosition());
	}
	
	public static void setCoords() {
		xCoord = Mouse.x;
		yCoord = Mouse.y;
	}
	
	public static void setDimensions() {
		ratioWidth = (double)1920 / (double)Gil.frameWidth;
		ratioHeight = (double)1080 / (double)Gil.frameHeight;
		
		leftBorder = ratioWidth * (Gil.frameWidth / 4);
		rightBorder = ratioWidth * ((Gil.frameWidth / 4) * 3);
		
		// height ratio (int)(getWidth()*0.5625); this would be for maintaining proportions and not stretching
	}
	
	public static void askForStartingPoint() {
		System.out.println("Starting point?");
		
		Scanner scan = new Scanner(System.in);
		
		String startingPoint = scan.next();
		
		switch (startingPoint) {
			case "n":
			case "no":
			case "nvm":
			case "exit":
			case "quit":
				System.exit(0);
				break;
			case "l":
			case "last":
				loadLast();
				break;
			case "entry":
				Player.setPosition("entry_1s");
				break;
			case "hall":
				Player.setPosition("hall_1s");
				break;
			case "green":
				Player.setPosition("green_1s");
				break;
			case "wing":
				Player.setPosition("wing_1n");
				break;
			case "nook":
				Player.setPosition("nook_1e");
				break;
			case "bed":
				Player.setPosition("bed_2n");
				break;
			case "climb":
				Player.setPosition("climb_1w");
				break;
			case "gallery":
				Player.setPosition("gallery_1s");
				break;
			case "fam":
				Player.setPosition("fam_1e");
				break;
			case "stair":
				Player.setPosition("stair_1e");
				break;
			case "ground":
				Player.setPosition("ground_91s");
				break;
			case "tunnel":
				Player.setPosition("tunnel_1e");
				break;
			default:
				Player.setPosition(startingPoint);
				break;
		}
		
		ImagePanel.loadImage();
	}
	
	private static void loadLast() {
		try {
			File file = new File("print/last.txt");
			Scanner scan = new Scanner(file);
			
			String last = scan.nextLine();
		
			Player.setPosition(last);
			
			scan.close();
		} catch (Exception ex) {
			System.out.println("last unsuccessful.");
		}
	}
	
	public static void printLast() {
		try {
			File file = new File("print/last.txt");	
			PrintWriter output = new PrintWriter(file);
			
			output.println(Player.getPosition());
			
			output.close();
		} catch (Exception ex) {
			System.out.println("Print unsuccessful.");
		}
	}
	
	public static int getRandom(int max) {
		int random = (int)(Math.random() * max + 1);
		return random;
	}

	public static void cheat() {

	}
}