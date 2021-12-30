public class Mouse {
	public static double x;
	public static double y;
	public static int clicks;
	
	public static void checkHUD() {
		if (y < 146 || y > 950) {
			ImagePanel.hudVisible = true;
		} else {
			ImagePanel.hudVisible = false;
		}
	}
	
	public static void setX(int i) {
		x = (double)(i * Data.ratioWidth);
	}
	
	public static void setY(int i) {
		y = (double)(i * Data.ratioHeight);
	}
	
	public static double getCenter() {
		return Gil.frameWidth / 2;
	}
	
	public static String getSide() {
		if (x > getCenter()) {
			return "right";
		} else if ( x <= getCenter()) {
			return "left";
		} else {
			System.out.println("Mouse.getSide error");
			return null;
		}
	}
	
	public static void processAction(String s) {
		if (s.equals("mouse")) {
			if (x < Data.leftBorder) {
				if (World.legalLeftTurn()) {
					processClick("left");
				} else {
					processClick("center");
				}
			}
			
			if (x > Data.rightBorder) {
				if (World.legalLeftTurn()) {
					processClick("right");
				} else {
					processClick("center");
				}
			}
			
			if (x >= Data.leftBorder && x <= Data.rightBorder) {
				processClick("center");
			}
		} else {
			processClick(s); // player used arrow keys
		}
	}
	
	public static void processClick(String s) {
		if (!ImagePanel.hudVisible && !Player.getDisableWalk()){
			if (s.equals("left")) {
				// TURN LEFT
				// if (Animation.isPanning())
					// Animation.skipPan();
				
				Player.setOldPosition(Player.getPosition());
				
				ImagePanel.loadOldImage();
			
				// Prepare pan
				if (World.positionPannable()) {
					//Player.setBusy(true);
					Animation.panningLeft = true;
					ImagePanel.image1X = -Gil.frameWidth;
					// ImagePanel.image2X = -Gil.frameWidth;
					
					ImagePanel.imageOutgoing1X = 0;
					// ImagePanel.imageOutgoing2X = 0;
				}
				
				WalkLeft.walk();
				
				World.checkForCat();
				
				ImagePanel.loadImage();
			} else if (s.equals("right")) {
				// TURN RIGHT
				Player.setOldPosition(Player.getPosition());
				
				ImagePanel.loadOldImage();
			
				// Prepare pan
				if (World.positionPannable()) {
					//Player.setBusy(true);
					Animation.panningRight = true;
					ImagePanel.image1X = Gil.frameWidth;
					// ImagePanel.image2X = 544;
					
					ImagePanel.imageOutgoing1X = 0;
					// ImagePanel.imageOutgoing2X = 0;
				}
				
				WalkRight.walk();
				
				World.checkForCat();
				
				ImagePanel.loadImage();
			} else if (s.equals("center")) {
			// CLICK CENTER
			WalkCenter.walk();
			
			ImagePanel.loadImage();
			} else {
				System.out.println("Mouse.processClick error");
			}
		}
		
		// CLICK SPELL BOOK FROM HAND
		// MUST COME BEFORE CLICK SPELL BOOK FROM HUD
		if (ImagePanel.displayingSpellBook1) {
			ImagePanel.displayingSpellBook1 = false;
			ImagePanel.displayingSpellBook2 = true;
		}

		// CLICK SPELL BOOK FROM HUD
		if (ImagePanel.hudVisible && x > 924 && x < 1042) {
			Player.setBusy(true);
			// Animation.fade();
			ImagePanel.itemY = Gil.frameHeight;
			Player.setHoldingSpellBook(true);
			ImagePanel.displayingSpellBook1 = true;
			Animation.raisingItem = true;
		}
		
		
		Data.printData();
	}
}