public class Animation {
	public static int tick;
	public static int waitTime;
	public static int waitCode;
	public static int inputUnderscoreTick = 1;
	public static int delay = -1;
	private static int image;
	private static int endX;
	private static int endY;
	public static int panSpeed = 130;
	
	public static boolean waiting;
	public static boolean panningLeft;
	public static boolean panningRight;
	public static boolean raisingItem;
	
	public static void animate() {
		tick++; // keeps track of refresh rate
		
		// reset tick
		if (tick > 2000)
			tick = 1;
		
		if (panningLeft || panningRight)
			pan();
		
		if (raisingItem)
			raiseItem();
	}
	
	public static void setWait(int t, int c) {
		//System.out.println("setWait()");
		tick = 0;
		waitTime = t;
		waitCode = c;
		waiting = true;
	}

	public static void setDelay() {
		tick = 0;
		delay = tick;
	}
	
	private static void pan() {
		if (panningLeft && ImagePanel.image1X < (0 - panSpeed)) {
			ImagePanel.image1X += panSpeed;
			ImagePanel.image2X += panSpeed;
			
			ImagePanel.imageOutgoing1X += panSpeed;
			ImagePanel.imageOutgoing2X += panSpeed;
		} else if (panningLeft) {
			panningLeft = false;
		
			ImagePanel.image1X = 0;
			ImagePanel.image2X = 0;
			
			ImagePanel.imageOutgoing1X = Gil.frameWidth;
			ImagePanel.imageOutgoing2X = Gil.frameWidth;

			Player.setBusy(false);
			Player.setDisableWalk(false);
			World.eventAfterPan();
		} else if (panningRight && ImagePanel.image1X > (0 + panSpeed)) {
			ImagePanel.image1X -= panSpeed;
			ImagePanel.image2X -= panSpeed;
			
			ImagePanel.imageOutgoing1X -= panSpeed;
			ImagePanel.imageOutgoing2X -= panSpeed;
			
		} else if (panningRight) {
			panningRight = false;
		
			ImagePanel.image1X = 0;
			
			ImagePanel.imageOutgoing1X = -Gil.frameWidth;
			ImagePanel.imageOutgoing2X = -Gil.frameWidth;
			
			Player.setBusy(false);
			Player.setDisableWalk(false);
			World.eventAfterPan();
		}
	}

	public static void fade() {
		
	}
	
	private static void raiseItem() {
		if (ImagePanel.itemY > 30) {
			ImagePanel.itemY -= 20;
		} else {
			ImagePanel.itemY = 0;
			raisingItem = false;
			Player.setBusy(false);
		}
	}
}