public class Player {
	private static boolean busy;
	private static boolean disableWalk;
	private static boolean holdingSpellBook;
	
	private static String position = "";
	private static String oldPosition = "";
	
	public static String getPosition() {
		return position;
	}
	
	public static String getOldPosition() {
		return oldPosition;
	}
	
	public static void setPosition(String s) {
		position = s;
	}
	
	public static void setOldPosition(String s) {
		oldPosition = s;
	}
	
	public static void setBusy(boolean b) {
		busy = b;
		
		if (b)
			disableWalk = b;
	}
	
	public static boolean getBusy() {
		return busy;
	}
	
	public static void setDisableWalk(boolean b) {
		disableWalk = b;
	}
	
	public static boolean getDisableWalk() {
		return disableWalk;
	}
	
	public static void setHoldingSpellBook(boolean b) {
		holdingSpellBook = b;
	}
	
	public static boolean getHoldingSpellBook() {
		return holdingSpellBook;
	}
}