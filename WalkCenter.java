public class WalkCenter {
	public static void walk() {
		Player.setOldPosition(Player.getPosition());
		
		switch (Player.getPosition()) {
			case "entry_1n":
				Player.setPosition("ground_52n");
				break;
			case "entry_1s":
				Player.setPosition("entry_4s");
				break;
			case "entry_1e":
				Player.setPosition("entry_6e");
				break;
			case "entry_1w":
				Player.setPosition("entry_2w");
				break;
			case "entry_2s":
				Player.setPosition("entry_3s");
				break;
			case "entry_2e":
				Player.setPosition("entry_1e");
				break;
			case "entry_3e":
				Player.setPosition("entry_4e");
				break;
			case "entry_3n":
				Player.setPosition("entry_2n");
				break;
			case "entry_4e":
				Player.setPosition("entry_5e");
				break;
			case "entry_4n":
				Player.setPosition("entry_1n");
				break;
			case "entry_4w":
				Player.setPosition("entry_3w");
				break;
			case "entry_5n":
				Player.setPosition("entry_6n");
				break;
			case "entry_5w":
				Player.setPosition("entry_4w");
				break;
			case "entry_6s":
				Player.setPosition("entry_5s");
				break;
			case "entry_6w":
				Player.setPosition("entry_1w");
				break;
			case "entry_6e":
				Player.setPosition("entry_7e");
				break;
			case "entry_7s":
				Player.setPosition("entry_8s");
				break;
			case "entry_7w":
				Player.setPosition("entry_6w");
				break;
			case "entry_8w":
				Player.setPosition("entry_9w");
				break;
			case "entry_8n":
				Player.setPosition("entry_7n");
				break;
			case "entry_9s":
				Player.setPosition("hall_1s");
				break;
			case "entry_9e":
				Player.setPosition("entry_8e");
				break;
			case "entry_9w":
				Player.setPosition("entry_10w");
				break;
			case "entry_10e":
				Player.setPosition("entry_9e");
				break;
				
				
				
				
				
				
				
			case "hall_1n":
				Player.setPosition("entry_9n");
				break;
			case "hall_1s":
				Player.setPosition("hall_2s");
				break;
			case "hall_2n":
				Player.setPosition("hall_1n");
				break;
			case "hall_2w":
				Player.setPosition("hall_3w");
				break;
			case "hall_2s":
				Player.setPosition("hall_4s");
				break;
			case "hall_3e":
				Player.setPosition("hall_2e");
				break;
			case "hall_4n":
				Player.setPosition("hall_2n");
				break;
			case "hall_4e":
				Player.setPosition("hall_5e");
				break;
			case "hall_5w":
				Player.setPosition("hall_4w");
				break;
			case "hall_5e":
				Player.setPosition("hall_12e");
				break;
			case "hall_5s":
				Player.setPosition("hall_6s");
				break;
			case "hall_5se":
				Player.setPosition("hall_11s");
				break;
			case "hall_6n":
				if (Mouse.x > 1207) {
					Player.setPosition("hall_12n");
				} else {
					Player.setPosition("hall_5n");
				}
				break;
			case "hall_6ne":
				Player.setPosition("hall_12n");
				break;
			case "hall_6e":
				Player.setPosition("hall_11e");
				break;
			case "hall_6s":
				Player.setPosition("hall_7s");
				break;
			case "hall_7n":
				Player.setPosition("hall_6n");
				break;
			case "hall_7ne":
				Player.setPosition("hall_11e"); // or north depending on click
				break;
			case "hall_7s":
				Player.setPosition("hall_9s");
				break;
			case "hall_7w":
				Player.setPosition("hall_8w");
				break;
			case "hall_8e":
				Player.setPosition("hall_7e");
				break;
			case "hall_9n":
				Player.setPosition("hall_7n");
				break;
			case "hall_9e":
				Player.setPosition("hall_10e");
				break;
			case "hall_9s":
				if (Mouse.y > 548) {
					Player.setPosition("hall_9s_close");
				}
				break;
			case "hall_9s_close":
				if (Mouse.y > 690) {
					Item.playPianoWhite();
				} else {
					Item.playPianoBlack();
				}
				break;
			case "hall_9se":
				Player.setPosition("hall_10s");
				break;
			case "hall_10s":
				Player.setPosition("green_1s");
				break;
			case "hall_10nw":
				if (Mouse.x > 868) {
					Player.setPosition("hall_9n");
				} else {
					Player.setPosition("hall_7w");
				}
				break;
			case "hall_11n":
				Player.setPosition("hall_12n");
				break;
			case "hall_11nw":
				if (Mouse.x > Mouse.getCenter()) {
					Player.setPosition("hall_4n");
				} else {
					Player.setPosition("hall_5w");
				}
				break;
			case "hall_11e":
				Player.setPosition("wing_4e");
				break;
			case "hall_11sw":
				Player.setPosition("hall_7sw");
				break;
			case "hall_11w":
				Player.setPosition("hall_6w");
				break;
			case "hall_12s":
				Player.setPosition("hall_11s");
				break;
			case "hall_12sw":
				Player.setPosition("hall_6w");
				break;
			case "hall_12w":
				Player.setPosition("hall_5w");
				break;
			case "hall_12n":
				Player.setPosition("bed_2n");
				break;
				
				
				
				
				
				
				
				
				
			case "green_1n":
				Player.setPosition("hall_10n");
				break;
			case "green_1e":
				Player.setPosition("green_2e");
				break;
			case "green_2n":
				Player.setPosition("wing_1n");
				break;
			case "green_2w":
				Player.setPosition("green_1w");
				break;
				
				
				
				
			case "wing_1n":
				Player.setPosition("wing_2n");
				break;
			case "wing_1s":
				Player.setPosition("green_2s");
				break;
			case "wing_2n":
				Player.setPosition("wing_3n");
				break;
			case "wing_2e":
				Player.setPosition("nook_1e");
				break;
			case "wing_2s":
				Player.setPosition("wing_1s");
				break;
			case "wing_3n":
				Player.setPosition("wing_4n");
				break;
			case "wing_3s":
				Player.setPosition("wing_2s");
				break;
			case "wing_4n":
				Player.setPosition("wing_5n");
				break;
			case "wing_4s":
				Player.setPosition("wing_3s");
				break;
			case "wing_4w":
				Player.setPosition("hall_11w");
				break;
			case "wing_5n":
				Player.setPosition("wing_6n");
				break;
			case "wing_5s":
				Player.setPosition("wing_4s");
				break;
			case "wing_6s":
				Player.setPosition("wing_5s");
				break;
			case "wing_6n":
				Player.setPosition("wing_7n");
				break;
			case "wing_7s":
				Player.setPosition("wing_6s");
				break;
				
				
				
				
				
				
			case "nook_1e":
				Player.setPosition("nook_2e");
				break;
			case "nook_1w":
				Player.setPosition("wing_2w");
				break;
			case "nook_2e":
				Player.setPosition("nook_3e");
				break;
			case "nook_2w":
				Player.setPosition("nook_1w");
				break;
			case "nook_3e":
				// illegal
				// Player.setPosition("nook_4e");
				break;
			case "nook_3w":
				Player.setPosition("nook_2w");
				break;
			case "nook_4e":
				Player.setPosition("nook_5e");
				break;
			case "nook_4w":
				Player.setPosition("nook_3w");
				break;
			case "nook_5w":
				Player.setPosition("nook_4w");
				break;
					




					
			
			case "bed_2s":
				Player.setPosition("hall_12s");
				break;
			case "bed_2e":
				Player.setPosition("bed_3e");
				break;
			case "bed_3w":
				Player.setPosition("bed_2w");
				break;
			case "bed_3s":
				Player.setPosition("bed_4s");
				break;
			case "bed_4n":
				Player.setPosition("bed_3n");
				break;
			case "bed_4e":
				Player.setPosition("bed_5e");
				break;
			case "bed_5n":
				Player.setPosition("bed_13n");
				break;
			case "bed_5w":
				Player.setPosition("bed_4w");
				break;
			case "bed_5s":
				Player.setPosition("bed_6s");
				break;
			case "bed_6n":
				Player.setPosition("bed_5n");
				break;
			case "bed_6s":
				Player.setPosition("bed_9s");
				break;
			case "bed_6e":
				Player.setPosition("bed_7e");
				break;
			case "bed_7n":
				Player.setPosition("bed_8n");
				break;
			case "bed_7w":
				Player.setPosition("bed_6w");
				break;
			case "bed_8s":
				Player.setPosition("bed_7s");
				break;
			case "bed_9n":
				Player.setPosition("bed_6n");
				break;
			case "bed_9s":
				Player.setPosition("bed_10s");
				break;
			case "bed_10n":
				Player.setPosition("bed_9n");
				break;
			case "bed_10s":
				Player.setPosition("bed_12s");
				break;
			case "bed_10e":
				Player.setPosition("bed_11e");
				break;
			case "bed_11w":
				Player.setPosition("bed_10w");
				break;
			case "bed_12n":
				Player.setPosition("bed_10n");
				break;
			case "bed_13n":
				Player.setPosition("bed_14n");
				break;
			case "bed_13s":
				Player.setPosition("bed_5s");
				break;
			case "bed_14e":
				Player.setPosition("bed_15e");
				break;
			case "bed_14w":
				Player.setPosition("bed_17w");
				break;
			case "bed_14s":
				Player.setPosition("bed_13s");
				break;
			case "bed_15n":
				Player.setPosition("bed_16n");
				break;
			case "bed_15w":
				Player.setPosition("bed_14sw");
				break;
			case "bed_16s":
				Player.setPosition("bed_15s");
				break;
			case "bed_17w":
				Player.setPosition("bed_18w");
				break;
			case "bed_17e":
				Player.setPosition("bed_14e");
				break;
			case "bed_18n":
				Player.setPosition("bed_19n");
				break;
			case "bed_18w":
				Player.setPosition("bed_21w");
				break;
			case "bed_18e":
				Player.setPosition("bed_17e");
				break;
			case "bed_19s":
				Player.setPosition("bed_18s");
				break;
			case "bed_19e":
				// illegal
				// Player.setPosition("bed_20e");
				break;
			
			case "bed_20w":
				Player.setPosition("bed_19w");
				break;
			
			case "bed_21w":
				Player.setPosition("climb_1w");
				break;
			
			case "bed_21e":
				Player.setPosition("bed_18e");
				break;
			
			
			
			
			
			case "climb_1w":
				Player.setPosition("climb_2w");
				break;
			
			case "climb_1e":
				Player.setPosition("bed_21e");
				break;
			
			case "climb_2s":
				Player.setPosition("climb_3s");
				break;
			case "climb_2e":
				Player.setPosition("climb_1e");
				break;
			case "climb_3n":
				Player.setPosition("climb_2n");
				break;
			
			case "climb_3s":
				Player.setPosition("climb_4s");
				break;
			
			case "climb_4n":
				Player.setPosition("climb_3n");
				break;
			
			case "climb_4s":
				Player.setPosition("climb_5s");
				break;
			
			case "climb_5n":
				Player.setPosition("climb_4n");
				break;
			
			case "climb_5s":
				Player.setPosition("climb_6s");
				break;
			
			case "climb_6n":
				Player.setPosition("climb_5n");
				break;
			
			case "climb_6s":
				Player.setPosition("gallery_1s");
				break;
			
			
			
			
			
			
			case "gallery_1n":
				Player.setPosition("climb_6n");
				break;
			
			case "gallery_1s":
				Player.setPosition("gallery_6s");
				break;
			case "gallery_1e":
				Player.setPosition("gallery_2e");
				break;
			
			case "gallery_2w":
				Player.setPosition("gallery_1w");
				break;
			
			case "gallery_2e":
				Player.setPosition("gallery_3e");
				break;
			
			case "gallery_3w":
				Player.setPosition("gallery_2w");
				break;
			case "gallery_3s":
				Player.setPosition("gallery_4s");
				break;
			
			case "gallery_4n":
				Player.setPosition("gallery_3n");
				break;
			case "gallery_4w":
				Player.setPosition("gallery_5w");
				break;
			
			case "gallery_4e":
				Player.setPosition("fam_1e");
				break;
			
			case "gallery_5w":
				Player.setPosition("gallery_6w");
				break;
			
			case "gallery_5e":
				Player.setPosition("gallery_4e");
				break;
			case "gallery_6n":
				Player.setPosition("gallery_1n");
				break;
			
			case "gallery_6s":
				Player.setPosition("gallery_7s");
				break;
			case "gallery_6e":
				Player.setPosition("gallery_5e");
				break;
			case "gallery_7n":
				Player.setPosition("gallery_6n");
				break;
			
			case "gallery_7s":
				Player.setPosition("gallery_12s");
				break;
			case "gallery_7e":
				Player.setPosition("gallery_8e");
				break;
			
			case "gallery_8w":
				Player.setPosition("gallery_7w");
				break;
			
			case "gallery_8e":
				Player.setPosition("gallery_9e");
				break;
			
			case "gallery_9w":
				Player.setPosition("gallery_8w");
				break;
			case "gallery_9s":
				Player.setPosition("gallery_10s");
				break;
			
			case "gallery_10n":
				Player.setPosition("gallery_9n");
				break;
			case "gallery_10w":
				Player.setPosition("gallery_11w");
				break;
			
			
		
			case "gallery_11w":
				Player.setPosition("gallery_12w");
				break;
			
			case "gallery_11e":
				Player.setPosition("gallery_10e");
				break;
			case "gallery_12n":
				Player.setPosition("gallery_7n");
				break;
			
			case "gallery_12e":
				Player.setPosition("gallery_11e");
				break;
			
			
			
			
			
			
			
			case "fam_1n":
				Player.setPosition("fam_5n");
				break;
			
			case "fam_1w":
				Player.setPosition("gallery_4w"); 
				break;
			
			case "fam_1e":
				Player.setPosition("fam_2e");
				break;
			case "fam_2n":
				break;
			case "fam_2w":
				Player.setPosition("fam_1w");
				break;
			
			case "fam_2e":
				Player.setPosition("fam_3e");
				break;
			
			case "fam_3w":
				Player.setPosition("fam_2w");
				break;
			
			case "fam_3e":
				Player.setPosition("fam_4e");
				break;
			
			case "fam_4w":
				Player.setPosition("fam_3w");
				break;
			
			case "fam_4e":
				Player.setPosition("stair_1e");
				break;
			case "fam_5n":
				Player.setPosition("fam_6n");
				break;
			
			case "fam_5s":
				Player.setPosition("fam_1s");
				break;
			
			
			case "fam_6w":
				Player.setPosition("fam_7w");
				break;
			case "fam_6s":
				Player.setPosition("fam_5s");
				break;
			
			case "fam_7n":
				Player.setPosition("fam_12n");
				break;
			case "fam_7w":
				Player.setPosition("fam_8w");
				break;
			
			case "fam_7e":
				Player.setPosition("fam_6e");
				break;
			case "fam_8n":

				break;
			case "fam_8w":
				Player.setPosition("fam_9w");
				break;
			case "fam_8s":

				break;
			case "fam_8e":
				Player.setPosition("fam_7e");
				break;
			case "fam_9n":
				Player.setPosition("fam_10n");
				break;
			case "fam_9w":

				break;
			case "fam_9s":

				break;
			case "fam_9e":
				Player.setPosition("fam_8e");
				break;
			case "fam_10n":

				break;
			case "fam_10w":

				break;
			case "fam_10s":
				Player.setPosition("fam_9s");
				break;
			case "fam_10e":
				Player.setPosition("fam_11e");
				break;
			case "fam_11n":

				break;
			case "fam_11w":
				Player.setPosition("fam_10w");
				break;
			case "fam_11s":
				break;
			case "fam_11e":
				Player.setPosition("fam_12e");
				break;
			case "fam_12n":
				break;
			case "fam_12w":
				Player.setPosition("fam_11w");
				break;
			case "fam_12s":
				Player.setPosition("fam_7s");
				break;
			case "fam_12e":
				break;






			case "stair_1n":
				break;
			case "stair_1w":
				Player.setPosition("fam_4w");
				break;
			case "stair_1s":
				break;
			case "stair_1e":
				Player.setPosition("stair_2e");
				break;
			case "stair_2n":
				break;
			case "stair_2w":
				Player.setPosition("stair_1w");
				break;
			case "stair_2s":
				Player.setPosition("stair_3s");
				break;
			case "stair_2e":
				break;
			case "stair_3n":
				Player.setPosition("stair_2n");
				break;
			case "stair_3w":
				Player.setPosition("stair_4w");
				break;
			case "stair_3s":
				break;
			case "stair_3e":
				break;
			case "stair_4n":
				Player.setPosition("stair_5n");
				break;
			case "stair_4w":
				break;
			case "stair_4s":
				break;
			case "stair_4e":
				Player.setPosition("stair_3e");
				break;
			case "stair_5n":
				break;
			case "stair_5w":
				break;
			case "stair_5s":
				Player.setPosition("stair_4s");
				break;
			case "stair_5e":
				Player.setPosition("stair_6e");
				break;
			case "stair_6n":
				break;
			case "stair_6w":
				Player.setPosition("stair_5w");
				break;
			case "stair_6s":
				Player.setPosition("stair_7s");
				break;
			case "stair_6e":
				break;
			case "stair_7n":
				Player.setPosition("stair_6n");
				break;
			case "stair_7w":
				Player.setPosition("stair_8w");
				break;
			case "stair_7s":
				break;
			case "stair_7e":
				break;
			case "stair_8n":
				// illegal
				// Player.setPosition("stair_9n");
				break;
			case "stair_8w":
				break;
			case "stair_8s":
				Player.setPosition("ground_1s");
				break;
			case "stair_8e":
				Player.setPosition("stair_7e");
				break;
			case "stair_9n":
				break;
			case "stair_9w":
				break;
			case "stair_9s":
				Player.setPosition("stair_8s");
				break;
			case "stair_9e":
				break;


			
			
			
			
			
			
			case "ground_1n":
				Player.setPosition("stair_8n");
				break;
			case "ground_1w":
				break;
			case "ground_1s":
				Player.setPosition("ground_2s");
				break;
			case "ground_1e":
				break;
			case "ground_2n":
				Player.setPosition("ground_1n");
				break;
			case "ground_2w":
				Player.setPosition("ground_3w");
				break;
			case "ground_2s":
				Player.setPosition("ground_4s");
				break;
			case "ground_2e":
				break;
			case "ground_3n":
				break;
			case "ground_3w":
				Player.setPosition("ground_3w_window");
				break;
			case "ground_3s":
				Player.setPosition("ground_5s");
				break;
			case "ground_3e":
				Player.setPosition("ground_2e");
				break;
			case "ground_4n":
				Player.setPosition("ground_2n");
				break;
			case "ground_4w":
				Player.setPosition("ground_5w");
				break;
			case "ground_4s":
				break;
			case "ground_4e":
				Player.setPosition("ground_20e");
				break;
			case "ground_5n":
				if (Mouse.x > Mouse.getCenter()) {
					Player.setPosition("ground_3n");
				} else {
					Player.setPosition("ground_3w");
				}
				break;
			case "ground_5w":
				Player.setPosition("ground_6w");
				break;
			case "ground_5s":
				break;
			case "ground_5e":
				
				if (Mouse.x >= Gil.frameWidth/2) {
					Player.setPosition("ground_4e");
				} else {
					Player.setPosition("ground_2n");
				}
				break;
			case "ground_6n":
				break;
			case "ground_6w":
				if (Mouse.x >= Gil.frameWidth/2) {
					Player.setPosition("ground_19w");
				} else {
					Player.setPosition("ground_7w");
				}
				break;
			case "ground_6s":
				break;
			case "ground_6e":
				Player.setPosition("ground_5e");
				break;
			case "ground_7n":
				break;
			case "ground_7w":
				Player.setPosition("ground_8s");
				break;
			case "ground_7s":
				break;
			case "ground_7e":
				Player.setPosition("ground_6e");
				break;
			case "ground_8n":
				break;
			case "ground_8w":
				Player.setPosition("ground_9w");
				break;
			case "ground_8s":
				break;
			case "ground_8e":
				Player.setPosition("ground_7e");
				break;
			case "ground_9n":
				Player.setPosition("ground_10n");
				break;
			case "ground_9w":
				Player.setPosition("ground_9bw");
				break;
			case "ground_9s":
				break;
			case "ground_9e":
				if (Mouse.x >= Gil.frameWidth/2) {
					Player.setPosition("ground_8e");
				} else {
					Player.setPosition("ground_18e");
				}
				break;
			case "ground_9bn":
				Player.setPosition("ground_12n");
				break;
			case "ground_9bs":
				break;
			case "ground_9be":
				Player.setPosition("ground_9e");
				break;
			case "ground_9bw":
				Player.setPosition("ground_11w");
				break;
			case "ground_10n":
				Player.setPosition("ground_13n");
				break;
			case "ground_10w":
				Player.setPosition("ground_9bw");
				break;
			case "ground_10s":
				Player.setPosition("ground_9s");
				break;
			case "ground_10e":
				Player.setPosition("ground_18e");
				break;
			case "ground_11n":
				Player.setPosition("ground_12bn");
				break;
			case "ground_11ne":
				Player.setPosition("ground_12n");
				break;
			case "ground_11w":
				// Player.setPosition("ground_w");
				break;
			case "ground_11s":
				break;
			case "ground_11e":
				Player.setPosition("ground_9be");
				break;
			case "ground_12n":
				Player.setPosition("ground_70n");
				break;
			case "ground_12w":
				Player.setPosition("ground_12bw");
				break;
			case "ground_12sw":
				Player.setPosition("ground_11s");
				break;
			case "ground_12s":
				Player.setPosition("ground_9bs");
				break;
			case "ground_12e":
				Player.setPosition("ground_13e");
				break;
			case "ground_12bn":
				break;
			case "ground_12bw":
				break;
			case "ground_12bs":
				Player.setPosition("ground_11s");
				break;
			case "ground_12be":
				Player.setPosition("ground_12e");
				break;
			case "ground_13n":
				Player.setPosition("ground_15n");
				break;
			case "ground_13w":
				Player.setPosition("ground_12w");
				break;
			case "ground_13s":
				Player.setPosition("ground_10s");
				break;
			case "ground_13e":
				Player.setPosition("ground_14e");
				break;
			case "ground_14n":
				Player.setPosition("ground_14n_window");
				break;
			case "ground_14w":
				Player.setPosition("ground_13w");
				break;
			case "ground_14s":
				Player.setPosition("ground_18s");
				break;
			case "ground_14e":
				Player.setPosition("ground_14e_window");
				break;
			case "ground_15n":
				Player.setPosition("ground_16n");
				break;
			case "ground_15w":
				break;
			case "ground_15s":
				Player.setPosition("ground_13s");
				break;
			case "ground_15e":
				Player.setPosition("ground_15e_window");
				break;
			case "ground_16n":
				Player.setPosition("ground_17n");
				break;
			case "ground_16w":
				break;
			case "ground_16s":
				Player.setPosition("ground_15s");
				break;
			case "ground_16e":
				break;
			case "ground_17n":
				break;
			case "ground_17w":
				break;
			case "ground_17s":
				Player.setPosition("ground_16s");
				break;
			case "ground_17e":
				Player.setPosition("ground_17e_window");
				break;
			case "ground_18n":
				Player.setPosition("ground_14n");
				break;
			case "ground_18w":
				Player.setPosition("ground_10w");
				break;
			case "ground_18s":
				break;
			case "ground_18e":
				Player.setPosition("ground_19e");
				break;
			case "ground_19n":
				break;
			case "ground_19w":
				Player.setPosition("ground_18w");
				break;
			case "ground_19s":
				break;
			case "ground_19e":
				Player.setPosition("ground_6e");
				break;
			case "ground_20n":
				break;
			case "ground_20w":
				Player.setPosition("ground_4w");
				break;
			case "ground_20s":
				break;
			case "ground_20e":
				Player.setPosition("ground_21e");
				break;
			case "ground_21n":
				Player.setPosition("ground_22n");
				break;
			case "ground_21w":
				Player.setPosition("ground_20w");
				break;
			case "ground_21s":
				Player.setPosition("ground_29s");
				break;
			case "ground_21e":
				break;
			case "ground_22n":
				Player.setPosition("ground_39n");
				break;
			case "ground_22w":
				Player.setPosition("ground_34w");
				break;
			case "ground_22s":
				if (Mouse.x >= Gil.frameWidth/2) {
					Player.setPosition("ground_21s");
				} else {
					Player.setPosition("ground_23s");
				}
				break;
			case "ground_22e":
				Player.setPosition("ground_35e");
				break;
			case "ground_23n":
				Player.setPosition("ground_22n");
				break;
			case "ground_23w":
				break;
			case "ground_23s":
					Player.setPosition("ground_32s");
				break;
			case "ground_23e":
					Player.setPosition("ground_24e");
				break;
			case "ground_24n":
				break;
			case "ground_24w":
				Player.setPosition("ground_23w");
				break;
			case "ground_24s":
				Player.setPosition("ground_25s");
				break;
			case "ground_24e":
				break;
			case "ground_25n":
				Player.setPosition("ground_24n");
				break;
			case "ground_25w":
				break;
			case "ground_25s":
				break;
			case "ground_25e":
				Player.setPosition("ground_26e");
				break;
			case "ground_26n":
				break;
			case "ground_26w":
				Player.setPosition("ground_25w");
				break;
			case "ground_26s":
				break;
			case "ground_26e":
				Player.setPosition("ground_27e");
				break;
			case "ground_27n":
				break;
			case "ground_27w":
				Player.setPosition("ground_26w");
				break;
			case "ground_27s":
				break;
			case "ground_27e":
				Player.setPosition("ground_28e");
				break;
			case "ground_28n":
				break;
			case "ground_28w":
				Player.setPosition("ground_27w");
				break;
			case "ground_28s":
				break;
			case "ground_28e":
				break;
			case "ground_29n":
				Player.setPosition("ground_21n");
				break;
			case "ground_29w":
				break;
			case "ground_29s":
				Player.setPosition("ground_30s");
				break;
			case "ground_29e":
				break;
			case "ground_30n":
				Player.setPosition("ground_29n");
				break;
			case "ground_30w":
				break;
			case "ground_30s":
				break;
			case "ground_30e":
				Player.setPosition("ground_31e");
				break;
			case "ground_31n":
				Player.setPosition("ground_32n");
				break;
			case "ground_31w":
				Player.setPosition("ground_30w");
				break;
			case "ground_31s":
				break;
			case "ground_31e":
				break;
			case "ground_32n":
				Player.setPosition("ground_23n");
				break;
			case "ground_32w":
				break;
			case "ground_32s":
				Player.setPosition("ground_31s");
				break;
			case "ground_32e":
				break;
				// removed
			// case "ground_33n":
				// Player.setPosition("ground_39n");
				// break;
			// case "ground_33w":
				// Player.setPosition("ground_34w");
				// break;
			// case "ground_33s":
				// Player.setPosition("ground_22s");
				// break;
			// case "ground_33e":
				// Player.setPosition("ground_35e");
				// break;
			case "ground_34n":
				break;
			case "ground_34w":
				// Player.setPosition("tunnel_7w");
				break;
			case "ground_34s":
				break;
			case "ground_34e":
				Player.setPosition("ground_22e");
				break;
			case "ground_35n":
				Player.setPosition("ground_36n");
				break;
			case "ground_35w":
				Player.setPosition("ground_22w");
				break;
			case "ground_35s":
				break;
			case "ground_35e":
				break;
			case "ground_36n":
				Player.setPosition("ground_37n");
				break;
			case "ground_36w":
				break;
			case "ground_36s":
				Player.setPosition("ground_35s");
				break;
			case "ground_36e":
				break;
			case "ground_37n":
				break;
			case "ground_37w":
				Player.setPosition("ground_37bw");
				break;
			case "ground_37s":
				Player.setPosition("ground_36s");
				break;
			case "ground_37be":
				Player.setPosition("ground_37e");
				break;
			case "ground_37bs":
				Player.setPosition("ground_36s");
				break;
			case "ground_38n":
				Player.setPosition("ground_37bn");
				break;
			case "ground_38w":
				Player.setPosition("ground_39w");
				break;
			case "ground_38s":
				break;
			case "ground_38e":
				break;
			case "ground_39n":
				Player.setPosition("ground_40n");
				break;
			case "ground_39w":
				break;
			case "ground_39s":
				Player.setPosition("ground_22s");
				break;
			case "ground_39e":
				Player.setPosition("ground_38e");
				break;

			case "ground_40n":
				Player.setPosition("ground_44n");
				break;
			case "ground_40w":
				Player.setPosition("ground_41w");
				break;
			case "ground_40s":
				Player.setPosition("ground_39s");
				break;
			case "ground_40e":
				break;
			case "ground_41n":
				break;
			case "ground_41w":
				Player.setPosition("ground_42w");
				break;
			case "ground_41s":
				break;
			case "ground_41e":
				Player.setPosition("ground_40e");
				break;
			case "ground_42n":
				Player.setPosition("ground_43n");
				break;
			case "ground_42w":
				break;
			case "ground_42s":
				break;
			case "ground_42e":
				Player.setPosition("ground_41e");
				break;
			case "ground_43n":
				Player.setPosition("ground_46n");
				break;
			case "ground_43w":
				Player.setPosition("ground_43w_window");
				break;
			case "ground_43s":
				Player.setPosition("ground_42s");
				break;
			case "ground_43e":
				Player.setPosition("ground_44e");
				break;
			case "ground_44n":
				Player.setPosition("ground_45n");
				break;
			case "ground_44w":
				Player.setPosition("ground_43w");
				break;
			case "ground_44s":
				Player.setPosition("ground_40s");
				break;
			case "ground_44e":
				break;
			case "ground_45n":
				Player.setPosition("ground_47w");
				break;
			case "ground_45w":
				Player.setPosition("ground_46w");
				break;
			case "ground_45s":
				Player.setPosition("ground_44s");
				break;
			case "ground_45e":
				break;
			case "ground_46n":
				Player.setPosition("ground_48n");
				break;
			case "ground_46w":
				Player.setPosition("ground_50w");
				break;
			case "ground_46s":
				Player.setPosition("ground_43s");
				break;
			case "ground_46e":
				Player.setPosition("ground_45e");
				break;
			case "ground_47n":
				break;
			case "ground_47w":
				Player.setPosition("ground_48w");
				break;
			case "ground_47s":
				if (Mouse.x > Mouse.getCenter()) {
					Player.setPosition("ground_46s");
				} else {
					Player.setPosition("ground_45s");
				}
				break;
			case "ground_47e":
				// Player.setPosition("ground_e");
				break;
			case "ground_48n":
				break;
			case "ground_48w":
				Player.setPosition("ground_49w");
				break;
			case "ground_48s":
				// Player.setPosition("ground_s");
				break;
			case "ground_48e":
				if (Mouse.x > Mouse.getCenter()) {
					Player.setPosition("ground_47s");
				} else {
					Player.setPosition("ground_47e");
				}
				break;
			case "ground_49n":
				break;
			case "ground_49w":
				Player.setPosition("ground_77w");
				break;
			case "ground_49s":
				if (Mouse.x > 1094) {
					Player.setPosition("ground_75s");
				} else {
					Player.setPosition("ground_53s");
				}
				break;
			case "ground_49e":
				Player.setPosition("ground_48e");
				break;
			case "ground_50n":
				Player.setPosition("ground_48n");
				break;
			case "ground_50w":
				Player.setPosition("ground_51w");
				break;
			case "ground_50s":
				break;
			case "ground_50e":
				Player.setPosition("ground_46e");
				break;
			case "ground_51n":
				break;
			case "ground_51w":
				Player.setPosition("ground_52w");
				break;
			case "ground_51s":
				break;
			case "ground_51e":
				Player.setPosition("ground_50e");
				break;
			case "ground_52n":
				break;
			case "ground_52w":
				Player.setPosition("ground_53w");
				break;
			case "ground_52s":
				Player.setPosition("entry_1s");
				break;
			case "ground_52e":
				Player.setPosition("ground_51e");
				break;
			case "ground_53n":
				break;
			case "ground_53w":
				Player.setPosition("ground_75w");
				break;
			case "ground_53s":
				Player.setPosition("ground_99s");
				break;
			case "ground_53e":
				Player.setPosition("ground_52e");
				break;
			case "ground_54n":
				Player.setPosition("ground_n");
				break;
			case "ground_54w":
				Player.setPosition("ground_w");
				break;
			case "ground_54s":
				Player.setPosition("ground_s");
				break;
			case "ground_54e":
				Player.setPosition("ground_e");
				break;
			case "ground_55n":
				Player.setPosition("ground_n");
				break;
			case "ground_55w":
				Player.setPosition("ground_w");
				break;
			case "ground_55s":
				Player.setPosition("ground_s");
				break;
			case "ground_55e":
				Player.setPosition("ground_e");
				break;
			case "ground_56n":
				Player.setPosition("ground_n");
				break;
			case "ground_56w":
				Player.setPosition("ground_w");
				break;
			case "ground_56s":
				Player.setPosition("ground_s");
				break;
			case "ground_56e":
				Player.setPosition("ground_e");
				break;
			case "ground_57n":
				Player.setPosition("ground_n");
				break;
			case "ground_57w":
				Player.setPosition("ground_w");
				break;
			case "ground_57s":
				Player.setPosition("ground_s");
				break;
			case "ground_57e":
				Player.setPosition("ground_e");
				break;
			case "ground_58n":
				Player.setPosition("ground_n");
				break;
			case "ground_58w":
				Player.setPosition("ground_w");
				break;
			case "ground_58s":
				Player.setPosition("ground_s");
				break;
			case "ground_58e":
				Player.setPosition("ground_e");
				break;
			case "ground_59n":
				Player.setPosition("ground_n");
				break;
			case "ground_59w":
				Player.setPosition("ground_w");
				break;
			case "ground_59s":
				Player.setPosition("ground_s");
				break;
			case "ground_59e":
				Player.setPosition("ground_e");
				break;
			case "ground_60n":
				Player.setPosition("ground_n");
				break;
			case "ground_60w":
				Player.setPosition("ground_w");
				break;
			case "ground_60s":
				Player.setPosition("ground_s");
				break;
			case "ground_60e":
				Player.setPosition("ground_e");
				break;
			case "ground_61n":
				Player.setPosition("ground_n");
				break;
			case "ground_61w":
				Player.setPosition("ground_w");
				break;
			case "ground_61s":
				Player.setPosition("ground_s");
				break;
			case "ground_61e":
				Player.setPosition("ground_e");
				break;
			case "ground_62n":
				Player.setPosition("ground_n");
				break;
			case "ground_62w":
				Player.setPosition("ground_w");
				break;
			case "ground_62s":
				Player.setPosition("ground_s");
				break;
			case "ground_62e":
				Player.setPosition("ground_e");
				break;
			case "ground_63n":
				Player.setPosition("ground_n");
				break;
			case "ground_63w":
				Player.setPosition("ground_w");
				break;
			case "ground_63s":
				Player.setPosition("ground_s");
				break;
			case "ground_63e":
				Player.setPosition("ground_e");
				break;
			case "ground_64n":
				Player.setPosition("ground_n");
				break;
			case "ground_64w":
				Player.setPosition("ground_w");
				break;
			case "ground_64s":
				Player.setPosition("ground_s");
				break;
			case "ground_64e":
				Player.setPosition("ground_e");
				break;
			case "ground_65n":
				Player.setPosition("ground_n");
				break;
			case "ground_65w":
				Player.setPosition("ground_w");
				break;
			case "ground_65s":
				Player.setPosition("ground_s");
				break;
			case "ground_65e":
				Player.setPosition("ground_e");
				break;
			case "ground_66n":
				Player.setPosition("ground_n");
				break;
			case "ground_66w":
				Player.setPosition("ground_w");
				break;
			case "ground_66s":
				Player.setPosition("ground_s");
				break;
			case "ground_66e":
				Player.setPosition("ground_e");
				break;
			case "ground_67n":
				Player.setPosition("ground_n");
				break;
			case "ground_67w":
				Player.setPosition("ground_w");
				break;
			case "ground_67s":
				Player.setPosition("ground_s");
				break;
			case "ground_67e":
				Player.setPosition("ground_e");
				break;
			case "ground_68n":
				Player.setPosition("ground_n");
				break;
			case "ground_68w":
				Player.setPosition("ground_w");
				break;
			case "ground_68s":
				Player.setPosition("ground_s");
				break;
			case "ground_68e":
				Player.setPosition("ground_e");
				break;
			case "ground_69n":
				Player.setPosition("ground_n");
				break;
			case "ground_69w":
				Player.setPosition("ground_w");
				break;
			case "ground_69s":
				Player.setPosition("ground_s");
				break;
			case "ground_69e":
				Player.setPosition("ground_e");
				break;
			case "ground_70n":
				Player.setPosition("ground_71n");
				break;
			case "ground_70s":
				Player.setPosition("ground_12s");
				break;
			case "ground_70e":
				break;
			case "ground_71n":
				Player.setPosition("ground_72n");
				break;
			case "ground_71w":
				Player.setPosition("ground_102w");
				break;
			case "ground_71s":
				Player.setPosition("ground_70s");
				break;
			case "ground_71e":
				break;
			case "ground_72n":
				Player.setPosition("ground_73n");
				break;
			case "ground_72w":
				break;
			case "ground_72s":
				Player.setPosition("ground_71s");
				break;
			case "ground_72e":
				break;
			case "ground_73n":
				Player.setPosition("ground_75n");
				break;
			case "ground_73w":
				break;
			case "ground_73s":
				Player.setPosition("ground_72s");
				break;
			case "ground_73e":
				break;
			case "ground_75n":
				Player.setPosition("ground_49n");
				break;
			case "ground_75w":
				Player.setPosition("ground_76w");
				break;
			case "ground_75s":
				Player.setPosition("ground_73s");
				break;
			case "ground_75e":
				Player.setPosition("ground_53e");
				break;
			case "ground_76n":
				Player.setPosition("ground_49e");
				break;
			case "ground_76w":
				Player.setPosition("ground_77w");
				break;
			case "ground_76s":
				break;
			case "ground_76e":
				if (Mouse.x > 1362) {
					Player.setPosition("ground_75s");
				} else if (Mouse.x > 921) {
					Player.setPosition("ground_53s");
				} else {
					Player.setPosition("ground_75e");
				}
				break;
			case "ground_77n":
				Player.setPosition("ground_98n");
				break;
			case "ground_77w":
				Player.setPosition("ground_78w");
				break;
			case "ground_77s":
				break;
			case "ground_77e":
				if (Mouse.x > 791) {
					Player.setPosition("ground_76e");
				} else {
					Player.setPosition("ground_49e");
				}
				break;
			case "ground_78n":
				break;
			case "ground_78w":
				Player.setPosition("ground_79w");
				break;
			case "ground_78s":
				break;
			case "ground_78e":
				Player.setPosition("ground_77e");
				break;
			case "ground_79n":
				break;
			case "ground_79w":
				if (Mouse.x > 1009) {
					Player.setPosition("ground_80w");
				} else {
					Player.setPosition("ground_80s");
				}
				break;
			case "ground_79s":
				break;
			case "ground_79e":
				Player.setPosition("ground_78e");
				break;
			case "ground_80n":
				Player.setPosition("ground_90n");
				break;
			case "ground_80w":
				break;
			case "ground_80s":
				if (Mouse.x > Mouse.getCenter()) {
					Player.setPosition("ground_81w");
				} else {
					Player.setPosition("ground_81s");
				}
				break;
			case "ground_80sw":
				Player.setPosition("ground_81s");
				break;
			case "ground_80e":
				Player.setPosition("ground_79e");
				break;
			// case "ground_81n":
				// break;
			case "ground_81ne":
				Player.setPosition("ground_80e");
				break;
			case "ground_81w":
				break;
			case "ground_81s":
				Player.setPosition("ground_82s");
				break;
			case "ground_81e":
				Player.setPosition("ground_80ne");
				break;
			case "ground_82n":
				Player.setPosition("ground_81n");
				break;
			case "ground_82w":
				break;
			case "ground_82s":
				Player.setPosition("ground_83s");
				break;
			case "ground_82e":
				break;
			case "ground_83n":
				Player.setPosition("ground_82n");
				break;
			case "ground_83w":
				Player.setPosition("ground_84w");
				break;
			case "ground_83s":
				if (Mouse.x > 929) {
					Player.setPosition("ground_105s");
				} else {
					Player.setPosition("ground_105e");
				}
				break;
			case "ground_83e":
				break;
			case "ground_84n":
				break;
			case "ground_84w":
				break;
			case "ground_84s":
				Player.setPosition("ground_105s");
				break;
			case "ground_84e":
				Player.setPosition("ground_83e");
				break;
			// case "ground_85n":
				// Player.setPosition("ground_n");
				// break;
			// case "ground_85w":
				// Player.setPosition("ground_w");
				// break;
			// case "ground_85s":
				// Player.setPosition("ground_s");
				// break;
			// case "ground_85e":
				// Player.setPosition("ground_e");
				// break;
			// case "ground_86n":
				// Player.setPosition("ground_n");
				// break;
			// case "ground_86w":
				// Player.setPosition("ground_w");
				// break;
			// case "ground_86s":
				// Player.setPosition("ground_s");
				// break;
			// case "ground_86e":
				// Player.setPosition("ground_e");
				// break;
			// case "ground_87n":
				// Player.setPosition("ground_n");
				// break;
			// case "ground_87w":
				// Player.setPosition("ground_w");
				// break;
			// case "ground_87s":
				// Player.setPosition("ground_s");
				// break;
			// case "ground_87e":
				// Player.setPosition("ground_e");
				// break;
			// case "ground_88n":
				// Player.setPosition("ground_n");
				// break;
			// case "ground_88w":
				// Player.setPosition("ground_w");
				// break;
			// case "ground_88s":
				// Player.setPosition("ground_s");
				// break;
			// case "ground_88e":
				// Player.setPosition("ground_e");
				// break;
			// case "ground_89n":
				// Player.setPosition("ground_n");
				// break;
			// case "ground_89w":
				// Player.setPosition("ground_w");
				// break;
			// case "ground_89s":
				// Player.setPosition("ground_s");
				// break;
			// case "ground_89e":
				// Player.setPosition("ground_e");
				// break;
			case "ground_90n":
				if (Mouse.x > 1198) {
					Player.setPosition("ground_91e");
				} else {
					Player.setPosition("ground_91n");
				}
				break;
			case "ground_90w":
				break;
			case "ground_90s":
				if (Mouse.getSide().equals("right")) {
					Player.setPosition("ground_80s");
				} else if (Mouse.getSide().equals("left")) {
					Player.setPosition("ground_80e");
				} else {
					System.out.println("WalkCenter ground_90s error");
				}
				break;
			case "ground_90e":
				break;
			case "ground_91n":
				break;
			case "ground_91w":
				Player.setPosition("ground_90s");
				break;
			case "ground_91s":
				break;
			case "ground_91e":
				Player.setPosition("ground_92e");
				break;
			case "ground_92n":
				break;
			case "ground_92w":
				Player.setPosition("ground_91w");
				break;
			case "ground_92s":
				break;
			case "ground_92e":
				Player.setPosition("ground_93e");
				break;
			case "ground_93n":
				break;
			case "ground_93w":
				Player.setPosition("ground_92w");
				break;
			case "ground_93s":
				break;
			case "ground_93e":
				Player.setPosition("ground_94e");
				break;
			case "ground_94n":
				break;
			case "ground_94w":
				Player.setPosition("ground_93w");
				break;
			case "ground_94s":
				Player.setPosition("ground_95s");
				break;
			case "ground_94e":
				break;
			case "ground_95n":
				Player.setPosition("ground_94n");
				break;
			case "ground_95w":
				break;
			case "ground_95s":
				Player.setPosition("ground_96s");
				break;
			case "ground_95e":
				break;
			case "ground_96n":
				Player.setPosition("ground_95n");
				break;
			case "ground_96w":
				break;
			case "ground_96s":
				Player.setPosition("ground_97s");
				break;
			case "ground_96e":
				break;
			case "ground_97n":
				Player.setPosition("ground_96n");
				break;
			case "ground_97w":
				break;
			case "ground_97s":
				Player.setPosition("ground_98s");
				break;
			case "ground_98n":
				Player.setPosition("ground_97n");
				break;
			case "ground_98s":
				Player.setPosition("ground_77s");
				break;
			case "ground_97e":
				break;
			case "ground_99n":
				Player.setPosition("ground_53n");
				break;
			case "ground_99w":
				break;
			case "ground_99s":
				Player.setPosition("ground_100s");
				break;
			case "ground_99e":
				break;
			case "ground_100n":
				Player.setPosition("ground_99n");
				break;
			case "ground_100w":
				break;
			case "ground_100s":
				// Player.setPosition("tunnel_1e");
				break;
			case "ground_100e":
				break;
			case "ground_101n":
				Player.setPosition("ground_102n");
				break;
			case "ground_101w":
				break;
			case "ground_101s":
				break;
			case "ground_101e":
				break;
			case "ground_102n":
				break;
			case "ground_102w":
				Player.setPosition("ground_103w");
				break;
			case "ground_102s":
				Player.setPosition("ground_101s");
				break;
			case "ground_102e":
				Player.setPosition("ground_71e");
				break;
			case "ground_103n":
				break;
			case "ground_103w":
				Player.setPosition("ground_104w");
				break;
			case "ground_103s":
				break;
			case "ground_103e":
				Player.setPosition("ground_102e");
				break;
			case "ground_104n":
				break;
			case "ground_104w":
				if (Mouse.x > 833) {
					Player.setPosition("ground_105n");
				} else {
					Player.setPosition("ground_106w");
				}
				break;
			case "ground_104s":
				break;
			case "ground_104e":
				Player.setPosition("ground_103e");
				break;
			case "ground_105n":
				if (Mouse.x > Gil.frameWidth / 2) {
					Player.setPosition("ground_83n");
				} else {
					Player.setPosition("ground_84n");
				}
				break;
			case "ground_105w":
				break;
			case "ground_105s":
				break;
			case "ground_105e":
				Player.setPosition("ground_104e");
				break;
			case "ground_106n":
				break;
			case "ground_106w":
				Player.setPosition("ground_107w");
				break;
			case "ground_106s":
				break;
			case "ground_106e":
				Player.setPosition("ground_104e");
				break;
			case "ground_107n":
				break;
			case "ground_107w":
				Player.setPosition("ground_108w");
				break;
			case "ground_107s":
				break;
			case "ground_107e":
				Player.setPosition("ground_106e");
				break;
			case "ground_108n":
				break;
			case "ground_108w":
				Player.setPosition("ground_109w");
				break;
			case "ground_108s":
				break;
			case "ground_108e":
				Player.setPosition("ground_107e");
				break;
			case "ground_109n":
				break;
			case "ground_109w":
				Player.setPosition("ground_110w");
				break;
			case "ground_109s":
				break;
			case "ground_109e":
				Player.setPosition("ground_108e");
				break;
			case "ground_110n":
				break;
			case "ground_110w":
				break;
			case "ground_110s":
				break;
			case "ground_110e":
				Player.setPosition("ground_109e");
				break;

			
			
			
			
			
			
			
			
			
			case "tunnel_1w":
				Player.setPosition("ground_100n");
				break;
			
			case "tunnel_1e":
				Player.setPosition("tunnel_2e");
				break;
			
			case "tunnel_2w":
				Player.setPosition("tunnel_1w");
				break;
			
			case "tunnel_2e":
				Player.setPosition("tunnel_3e");
				break;
			
			case "tunnel_3w":
				Player.setPosition("tunnel_2w");
				break;
			
			case "tunnel_3e":
				Player.setPosition("tunnel_4e");
				break;
			
			case "tunnel_4w":
				Player.setPosition("tunnel_3w");
				break;
			
			case "tunnel_4e":
				Player.setPosition("tunnel_5e");
				break;
			
			case "tunnel_5w":
				Player.setPosition("tunnel_4w");
				break;
			
			case "tunnel_5e":
				Player.setPosition("tunnel_6e");
				break;
			
			case "tunnel_6w":
				Player.setPosition("tunnel_5w");
				break;
			
			case "tunnel_6e":
				Player.setPosition("tunnel_7e");
				break;
			
			case "tunnel_7w":
				Player.setPosition("tunnel_6w");
				break;
			
			case "tunnel_7e":
				Player.setPosition("ground_34e");
				break;



			default:
				System.out.println("WalkCenter error");
				break;
		}
	}
}