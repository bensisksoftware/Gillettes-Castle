import java.util.ArrayList;
import java.util.Arrays;

public class World {
	public static ArrayList<String> catSpots = new ArrayList<String>(Arrays.asList("entry_9n","entry_9w","hall_1e","hall_12e","green_2s","wing_1w","wing_2w","nook_3s","wing_3e","wing_3w","wing_5e","bed_15e","bed_19n","bed_19w","bed_20n","bed_20e","climb_3e","climb_5e","gallery_7w","fam_6n","fam_6e","fam_9s","fam_10n"));
	
	public static boolean positionPannable() {
		switch (Player.getPosition()) {
			case "hall_9s_close":
			case "ground_3w_window":
			case "ground_14n_window":
			case "ground_14e_window":
			case "ground_15e_window":
			case "ground_17e_window":
			case "ground_43w_window":
				return false;
			default:
				return true;
		}
	}
	
	public static void eventAfterPan() {
		
	}
	
	public static void checkForCat() {
		if (catSpots.contains(Player.getPosition()) && Data.getRandom(10) == 10) {
			System.out.println("There's a cat here!");
		}
	}
	
	public static boolean legalLeftTurn() {
		switch (Player.getPosition()) {
			case "hall_9s_close":
				if (Mouse.y > 479) {
					return false;
				} else {
					return true;
				}
			default:
				return true;
		}
	}
	
	public static boolean legalRightTurn() {
		switch (Player.getPosition()) {
			case "hall_9s_close":
				if (Mouse.y > 483) {
					return false;
				} else {
					return true;
				}
			default:
				return true;
		}
	}
}