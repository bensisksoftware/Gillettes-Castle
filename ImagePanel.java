import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.Graphics2D;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel implements ActionListener {
	Timer timer = new Timer(22, this); // Draws image every x miliseconds. 5 is good
	
	public static boolean hudVisible;
	public static boolean displayingSpellBook1;
	public static boolean displayingSpellBook2;
	
	public static int itemX;
	public static int itemY;
	public static int image1X;
	public static int image1Y;
	public static int image2X;
	public static int image2Y;
	public static int imageOutgoing1X;
	public static int imageOutgoing1Y;
	public static int imageOutgoing2X;
	public static int imageOutgoing2Y;
	
	public static Image hud = new ImageIcon("resources/hud/hud.png").getImage();;
	public static Image spellBook1 = new ImageIcon("resources/item/spellBook1.png").getImage();;
	public static Image spellBook2 = new ImageIcon("resources/item/spellBook2.png").getImage();;
	public static Image currentPositionImage;
	public static Image oldPositionImage;
	
	public ImagePanel() {
		timer.start();
	}
	
	public static void loadImage() {
		switch (Player.getPosition()) {
			case "entry_1n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_1n.jpg").getImage();
				break;
			case "entry_1s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_1s.jpg").getImage();
				break;
			case "entry_1e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_1e.jpg").getImage();
				break;
			case "entry_1w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_1w.jpg").getImage();
				break;
			case "entry_2n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_2n.jpg").getImage();
				break;
			case "entry_2s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_2s.jpg").getImage();
				break;
			case "entry_2e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_2e.jpg").getImage();
				break;
			case "entry_2w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_2w.jpg").getImage();
				break;
			case "entry_3n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_3n.jpg").getImage();
				break;
			case "entry_3s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_3s.jpg").getImage();
				break;
			case "entry_3e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_3e.jpg").getImage();
				break;
			case "entry_3w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_3w.jpg").getImage();
				break;
			case "entry_4n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_4n.jpg").getImage();
				break;
			case "entry_4s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_4s.jpg").getImage();
				break;
			case "entry_4e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_4e.jpg").getImage();
				break;
			case "entry_4w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_4w.jpg").getImage();
				break;
			case "entry_5n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_5n.jpg").getImage();
				break;
			case "entry_5s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_5s.jpg").getImage();
				break;
			case "entry_5e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_5e.jpg").getImage();
				break;
			case "entry_5w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_5w.jpg").getImage();
				break;
			case "entry_6n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_6n.jpg").getImage();
				break;
			case "entry_6s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_6s.jpg").getImage();
				break;
			case "entry_6e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_6e.jpg").getImage();
				break;
			case "entry_6w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_6w.jpg").getImage();
				break;
			case "entry_7n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_7n.jpg").getImage();
				break;
			case "entry_7s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_7s.jpg").getImage();
				break;
			case "entry_7e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_7e.jpg").getImage();
				break;
			case "entry_7w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_7w.jpg").getImage();
				break;
			case "entry_8n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_8n.jpg").getImage();
				break;
			case "entry_8s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_8s.jpg").getImage();
				break;
			case "entry_8e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_8e.jpg").getImage();
				break;
			case "entry_8w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_8w.jpg").getImage();
				break;
			case "entry_9n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_9n.jpg").getImage();
				break;
			case "entry_9s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_9s.jpg").getImage();
				break;
			case "entry_9e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_9e.jpg").getImage();
				break;
			case "entry_9w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_9w.jpg").getImage();
				break;
			case "entry_10n":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_10n.jpg").getImage();
				break;
			case "entry_10s":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_10s.jpg").getImage();
				break;
			case "entry_10e":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_10e.jpg").getImage();
				break;
			case "entry_10w":
				currentPositionImage = new ImageIcon("resources/images/entry/entry_10w.jpg").getImage();
				break;
			case "hall_1n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_1n.jpg").getImage();
				break;
			case "hall_1s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_1s.jpg").getImage();
				break;
			case "hall_1e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_1e.jpg").getImage();
				break;
			case "hall_1w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_1w.jpg").getImage();
				break;
			case "hall_2n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_2n.jpg").getImage();
				break;
			case "hall_2s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_2s.jpg").getImage();
				break;
			case "hall_2e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_2e.jpg").getImage();
				break;
			case "hall_2w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_2w.jpg").getImage();
				break;
			case "hall_3n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_3n.jpg").getImage();
				break;
			case "hall_3s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_3s.jpg").getImage();
				break;
			case "hall_3e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_3e.jpg").getImage();
				break;
			case "hall_3w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_3w.jpg").getImage();
				break;
			case "hall_4n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_4n.jpg").getImage();
				break;
			case "hall_4s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_4s.jpg").getImage();
				break;
			case "hall_4e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_4e.jpg").getImage();
				break;
			case "hall_4w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_4w.jpg").getImage();
				break;
			case "hall_5n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_5n.jpg").getImage();
				break;
			case "hall_5s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_5s.jpg").getImage();
				break;
			case "hall_5e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_5e.jpg").getImage();
				break;
			case "hall_5w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_5w.jpg").getImage();
				break;
			case "hall_6n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_6n.jpg").getImage();
				break;
			case "hall_6s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_6s.jpg").getImage();
				break;
			case "hall_6e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_6e.jpg").getImage();
				break;
			case "hall_6w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_6w.jpg").getImage();
				break;
			case "hall_7n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_7n.jpg").getImage();
				break;
			case "hall_7s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_7s.jpg").getImage();
				break;
			case "hall_7sw":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_7sw.jpg").getImage();
				break;
			case "hall_7e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_7e.jpg").getImage();
				break;
			case "hall_7w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_7w.jpg").getImage();
				break;
			case "hall_8n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_8n.jpg").getImage();
				break;
			case "hall_8s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_8s.jpg").getImage();
				break;
			case "hall_8e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_8e.jpg").getImage();
				break;
			case "hall_8w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_8w.jpg").getImage();
				break;
			case "hall_9n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_9n.jpg").getImage();
				break;
			case "hall_9s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_9s.jpg").getImage();
				break;
			case "hall_9s_close":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_9s_close.jpg").getImage();
				break;
			case "hall_9se":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_9se.jpg").getImage();
				break;
			case "hall_9e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_9e.jpg").getImage();
				break;
			case "hall_9w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_9w.jpg").getImage();
				break;
			case "hall_10n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_10n.jpg").getImage();
				break;
			case "hall_10nw":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_10nw.jpg").getImage();
				break;
			case "hall_10s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_10s.jpg").getImage();
				break;
			case "hall_10e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_10e.jpg").getImage();
				break;
			case "hall_10w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_10w.jpg").getImage();
				break;
			case "hall_11n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_11n.jpg").getImage();
				break;
			case "hall_11s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_11s.jpg").getImage();
				break;
			case "hall_11sw":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_11sw.jpg").getImage();
				break;
			case "hall_11nw":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_11nw.jpg").getImage();
				break;
			case "hall_11e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_11e.jpg").getImage();
				break;
			case "hall_11w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_11w.jpg").getImage();
				break;
			case "hall_12n":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_12n.jpg").getImage();
				break;
			case "hall_12s":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_12s.jpg").getImage();
				break;
			case "hall_12e":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_12e.jpg").getImage();
				break;
			case "hall_12w":
				currentPositionImage = new ImageIcon("resources/images/hall/hall_12w.jpg").getImage();
				break;
			case "green_1n":
				currentPositionImage = new ImageIcon("resources/images/green/green_1n.jpg").getImage();
				break;
			case "green_1s":
				currentPositionImage = new ImageIcon("resources/images/green/green_1s.jpg").getImage();
				break;
			case "green_1e":
				currentPositionImage = new ImageIcon("resources/images/green/green_1e.jpg").getImage();
				break;
			case "green_1w":
				currentPositionImage = new ImageIcon("resources/images/green/green_1w.jpg").getImage();
				break;
			case "green_2n":
				currentPositionImage = new ImageIcon("resources/images/green/green_2n.jpg").getImage();
				break;
			case "green_2s":
				currentPositionImage = new ImageIcon("resources/images/green/green_2s.jpg").getImage();
				break;
			case "green_2e":
				currentPositionImage = new ImageIcon("resources/images/green/green_2e.jpg").getImage();
				break;
			case "green_2w":
				currentPositionImage = new ImageIcon("resources/images/green/green_2w.jpg").getImage();
				break;
			case "wing_1n":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_1n.jpg").getImage();
				break;
			case "wing_1s":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_1s.jpg").getImage();
				break;
			case "wing_1e":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_1e.jpg").getImage();
				break;
			case "wing_1w":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_1w.jpg").getImage();
				break;
			case "wing_2n":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_2n.jpg").getImage();
				break;
			case "wing_2s":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_2s.jpg").getImage();
				break;
			case "wing_2e":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_2e.jpg").getImage();
				break;
			case "wing_2w":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_2w.jpg").getImage();
				break;
			case "wing_3n":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_3n.jpg").getImage();
				break;
			case "wing_3s":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_3s.jpg").getImage();
				break;
			case "wing_3e":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_3e.jpg").getImage();
				break;
			case "wing_3w":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_3w.jpg").getImage();
				break;
			case "wing_4n":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_4n.jpg").getImage();
				break;
			case "wing_4s":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_4s.jpg").getImage();
				break;
			case "wing_4e":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_4e.jpg").getImage();
				break;
			case "wing_4w":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_4w.jpg").getImage();
				break;
			case "wing_5n":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_5n.jpg").getImage();
				break;
			case "wing_5s":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_5s.jpg").getImage();
				break;
			case "wing_5e":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_5e.jpg").getImage();
				break;
			case "wing_5w":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_5w.jpg").getImage();
				break;
			case "wing_6n":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_6n.jpg").getImage();
				break;
			case "wing_6s":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_6s.jpg").getImage();
				break;
			case "wing_6e":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_6e.jpg").getImage();
				break;
			case "wing_6w":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_6w.jpg").getImage();
				break;
			case "wing_7n":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_7n.jpg").getImage();
				break;
			case "wing_7s":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_7s.jpg").getImage();
				break;
			case "wing_7e":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_7e.jpg").getImage();
				break;
			case "wing_7w":
				currentPositionImage = new ImageIcon("resources/images/wing/wing_7w.jpg").getImage();
				break;
			case "nook_1n":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_1n.jpg").getImage();
				break;
			case "nook_1s":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_1s.jpg").getImage();
				break;
			case "nook_1e":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_1e.jpg").getImage();
				break;
			case "nook_1w":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_1w.jpg").getImage();
				break;
			case "nook_2n":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_2n.jpg").getImage();
				break;
			case "nook_2s":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_2s.jpg").getImage();
				break;
			case "nook_2e":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_2e.jpg").getImage();
				break;
			case "nook_2w":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_2w.jpg").getImage();
				break;
			case "nook_3n":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_3n.jpg").getImage();
				break;
			case "nook_3s":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_3s.jpg").getImage();
				break;
			case "nook_3e":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_3e.jpg").getImage();
				break;
			case "nook_3w":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_3w.jpg").getImage();
				break;
			case "nook_4n":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_4n.jpg").getImage();
				break;
			case "nook_4s":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_4s.jpg").getImage();
				break;
			case "nook_4e":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_4e.jpg").getImage();
				break;
			case "nook_4w":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_4w.jpg").getImage();
				break;
			case "nook_5n":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_5n.jpg").getImage();
				break;
			case "nook_5s":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_5s.jpg").getImage();
				break;
			case "nook_5e":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_5e.jpg").getImage();
				break;
			case "nook_5w":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_5w.jpg").getImage();
				break;
			case "nook_6n":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_6n.jpg").getImage();
				break;
			case "nook_6s":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_6s.jpg").getImage();
				break;
			case "nook_6e":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_6e.jpg").getImage();
				break;
			case "nook_6w":
				currentPositionImage = new ImageIcon("resources/images/nook/nook_6w.jpg").getImage();
				break;
			case "bed_1n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_1n.jpg").getImage();
				break;
			case "bed_1s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_1s.jpg").getImage();
				break;
			case "bed_1e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_1e.jpg").getImage();
				break;
			case "bed_1w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_1w.jpg").getImage();
				break;
			case "bed_2n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_2n.jpg").getImage();
				break;
			case "bed_2s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_2s.jpg").getImage();
				break;
			case "bed_2e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_2e.jpg").getImage();
				break;
			case "bed_2w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_2w.jpg").getImage();
				break;
			case "bed_3n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_3n.jpg").getImage();
				break;
			case "bed_3s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_3s.jpg").getImage();
				break;
			case "bed_3e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_3e.jpg").getImage();
				break;
			case "bed_3w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_3w.jpg").getImage();
				break;
			case "bed_4n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_4n.jpg").getImage();
				break;
			case "bed_4s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_4s.jpg").getImage();
				break;
			case "bed_4e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_4e.jpg").getImage();
				break;
			case "bed_4w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_4w.jpg").getImage();
				break;
			case "bed_5n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_5n.jpg").getImage();
				break;
			case "bed_5s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_5s.jpg").getImage();
				break;
			case "bed_5e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_5e.jpg").getImage();
				break;
			case "bed_5w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_5w.jpg").getImage();
				break;
			case "bed_6n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_6n.jpg").getImage();
				break;
			case "bed_6s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_6s.jpg").getImage();
				break;
			case "bed_6e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_6e.jpg").getImage();
				break;
			case "bed_6w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_6w.jpg").getImage();
				break;
			case "bed_7n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_7n.jpg").getImage();
				break;
			case "bed_7s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_7s.jpg").getImage();
				break;
			case "bed_7e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_7e.jpg").getImage();
				break;
			case "bed_7w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_7w.jpg").getImage();
				break;
			case "bed_8n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_8n.jpg").getImage();
				break;
			case "bed_8s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_8s.jpg").getImage();
				break;
			case "bed_8e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_8e.jpg").getImage();
				break;
			case "bed_8w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_8w.jpg").getImage();
				break;
			case "bed_9n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_9n.jpg").getImage();
				break;
			case "bed_9s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_9s.jpg").getImage();
				break;
			case "bed_9e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_9e.jpg").getImage();
				break;
			case "bed_9w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_9w.jpg").getImage();
				break;
			case "bed_10n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_10n.jpg").getImage();
				break;
			case "bed_10s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_10s.jpg").getImage();
				break;
			case "bed_10e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_10e.jpg").getImage();
				break;
			case "bed_10w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_10w.jpg").getImage();
				break;
			case "bed_11n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_11n.jpg").getImage();
				break;
			case "bed_11s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_11s.jpg").getImage();
				break;
			case "bed_11e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_11e.jpg").getImage();
				break;
			case "bed_11w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_11w.jpg").getImage();
				break;
			case "bed_12n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_12n.jpg").getImage();
				break;
			case "bed_12s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_12s.jpg").getImage();
				break;
			case "bed_12e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_12e.jpg").getImage();
				break;
			case "bed_12w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_12w.jpg").getImage();
				break;
			case "bed_13n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_13n.jpg").getImage();
				break;
			case "bed_13s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_13s.jpg").getImage();
				break;
			case "bed_13e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_13e.jpg").getImage();
				break;
			case "bed_13w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_13w.jpg").getImage();
				break;
			case "bed_14n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_14n.jpg").getImage();
				break;
			case "bed_14ne":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_14ne.jpg").getImage();
				break;
			case "bed_14s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_14s.jpg").getImage();
				break;
			case "bed_14sw":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_14sw.jpg").getImage();
				break;
			case "bed_14e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_14e.jpg").getImage();
				break;
			case "bed_14w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_14w.jpg").getImage();
				break;
			case "bed_15n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_15n.jpg").getImage();
				break;
			case "bed_15s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_15s.jpg").getImage();
				break;
			case "bed_15sw":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_15sw.jpg").getImage();
				break;
			case "bed_15e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_15e.jpg").getImage();
				break;
			case "bed_15w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_15w.jpg").getImage();
				break;
			case "bed_16n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_16n.jpg").getImage();
				break;
			case "bed_16s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_16s.jpg").getImage();
				break;
			case "bed_16e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_16e.jpg").getImage();
				break;
			case "bed_16w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_16w.jpg").getImage();
				break;
			case "bed_17n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_17n.jpg").getImage();
				break;
			case "bed_17s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_17s.jpg").getImage();
				break;
			case "bed_17e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_17e.jpg").getImage();
				break;
			case "bed_17w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_17w.jpg").getImage();
				break;
			case "bed_18n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_18n.jpg").getImage();
				break;
			case "bed_18s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_18s.jpg").getImage();
				break;
			case "bed_18e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_18e.jpg").getImage();
				break;
			case "bed_18w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_18w.jpg").getImage();
				break;
			case "bed_19n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_19n.jpg").getImage();
				break;
			case "bed_19s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_19s.jpg").getImage();
				break;
			case "bed_19e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_19e.jpg").getImage();
				break;
			case "bed_19w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_19w.jpg").getImage();
				break;
			case "bed_20n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_20n.jpg").getImage();
				break;
			case "bed_20s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_20s.jpg").getImage();
				break;
			case "bed_20e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_20e.jpg").getImage();
				break;
			case "bed_20w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_20w.jpg").getImage();
				break;
			case "bed_21n":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_21n.jpg").getImage();
				break;
			case "bed_21s":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_21s.jpg").getImage();
				break;
			case "bed_21e":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_21e.jpg").getImage();
				break;
			case "bed_21w":
				currentPositionImage = new ImageIcon("resources/images/bed/bed_21w.jpg").getImage();
				break;
			case "climb_1n":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_1n.jpg").getImage();
				break;
			case "climb_1s":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_1s.jpg").getImage();
				break;
			case "climb_1e":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_1e.jpg").getImage();
				break;
			case "climb_1w":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_1w.jpg").getImage();
				break;
			case "climb_2n":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_2n.jpg").getImage();
				break;
			case "climb_2s":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_2s.jpg").getImage();
				break;
			case "climb_2e":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_2e.jpg").getImage();
				break;
			case "climb_2w":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_2w.jpg").getImage();
				break;
			case "climb_3n":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_3n.jpg").getImage();
				break;
			case "climb_3s":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_3s.jpg").getImage();
				break;
			case "climb_3e":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_3e.jpg").getImage();
				break;
			case "climb_3w":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_3w.jpg").getImage();
				break;
			case "climb_4n":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_4n.jpg").getImage();
				break;
			case "climb_4s":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_4s.jpg").getImage();
				break;
			case "climb_4e":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_4e.jpg").getImage();
				break;
			case "climb_4w":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_4w.jpg").getImage();
				break;
			case "climb_5n":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_5n.jpg").getImage();
				break;
			case "climb_5s":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_5s.jpg").getImage();
				break;
			case "climb_5e":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_5e.jpg").getImage();
				break;
			case "climb_5w":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_5w.jpg").getImage();
				break;
			case "climb_6n":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_6n.jpg").getImage();
				break;
			case "climb_6s":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_6s.jpg").getImage();
				break;
			case "climb_6e":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_6e.jpg").getImage();
				break;
			case "climb_6w":
				currentPositionImage = new ImageIcon("resources/images/climb/climb_6w.jpg").getImage();
				break;
			case "gallery_1n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_1n.jpg").getImage();
				break;
			case "gallery_1s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_1s.jpg").getImage();
				break;
			case "gallery_1e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_1e.jpg").getImage();
				break;
			case "gallery_1w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_1w.jpg").getImage();
				break;
			case "gallery_2n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_2n.jpg").getImage();
				break;
			case "gallery_2s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_2s.jpg").getImage();
				break;
			case "gallery_2e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_2e.jpg").getImage();
				break;
			case "gallery_2w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_2w.jpg").getImage();
				break;
			case "gallery_3n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_3n.jpg").getImage();
				break;
			case "gallery_3s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_3s.jpg").getImage();
				break;
			case "gallery_3e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_3e.jpg").getImage();
				break;
			case "gallery_3w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_3w.jpg").getImage();
				break;
			case "gallery_4n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_4n.jpg").getImage();
				break;
			case "gallery_4s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_4s.jpg").getImage();
				break;
			case "gallery_4e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_4e.jpg").getImage();
				break;
			case "gallery_4w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_4w.jpg").getImage();
				break;
			case "gallery_5n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_5n.jpg").getImage();
				break;
			case "gallery_5s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_5s.jpg").getImage();
				break;
			case "gallery_5e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_5e.jpg").getImage();
				break;
			case "gallery_5w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_5w.jpg").getImage();
				break;
			case "gallery_6n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_6n.jpg").getImage();
				break;
			case "gallery_6s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_6s.jpg").getImage();
				break;
			case "gallery_6e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_6e.jpg").getImage();
				break;
			case "gallery_6w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_6w.jpg").getImage();
				break;
			case "gallery_7n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_7n.jpg").getImage();
				break;
			case "gallery_7s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_7s.jpg").getImage();
				break;
			case "gallery_7e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_7e.jpg").getImage();
				break;
			case "gallery_7w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_7w.jpg").getImage();
				break;
			case "gallery_8n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_8n.jpg").getImage();
				break;
			case "gallery_8s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_8s.jpg").getImage();
				break;
			case "gallery_8e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_8e.jpg").getImage();
				break;
			case "gallery_8w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_8w.jpg").getImage();
				break;
			case "gallery_9n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_9n.jpg").getImage();
				break;
			case "gallery_9s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_9s.jpg").getImage();
				break;
			case "gallery_9e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_9e.jpg").getImage();
				break;
			case "gallery_9w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_9w.jpg").getImage();
				break;
			case "gallery_10n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_10n.jpg").getImage();
				break;
			case "gallery_10s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_10s.jpg").getImage();
				break;
			case "gallery_10e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_10e.jpg").getImage();
				break;
			case "gallery_10w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_10w.jpg").getImage();
				break;
			case "gallery_11n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_11n.jpg").getImage();
				break;
			case "gallery_11s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_11s.jpg").getImage();
				break;
			case "gallery_11e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_11e.jpg").getImage();
				break;
			case "gallery_11w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_11w.jpg").getImage();
				break;
			case "gallery_12n":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_12n.jpg").getImage();
				break;
			case "gallery_12s":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_12s.jpg").getImage();
				break;
			case "gallery_12e":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_12e.jpg").getImage();
				break;
			case "gallery_12w":
				currentPositionImage = new ImageIcon("resources/images/gallery/gallery_12w.jpg").getImage();
				break;
			case "fam_1n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_1n.jpg").getImage();
				break;
			case "fam_1s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_1s.jpg").getImage();
				break;
			case "fam_1e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_1e.jpg").getImage();
				break;
			case "fam_1w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_1w.jpg").getImage();
				break;
			case "fam_2n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_2n.jpg").getImage();
				break;
			case "fam_2s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_2s.jpg").getImage();
				break;
			case "fam_2e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_2e.jpg").getImage();
				break;
			case "fam_2w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_2w.jpg").getImage();
				break;
			case "fam_3n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_3n.jpg").getImage();
				break;
			case "fam_3s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_3s.jpg").getImage();
				break;
			case "fam_3e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_3e.jpg").getImage();
				break;
			case "fam_3w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_3w.jpg").getImage();
				break;
			case "fam_4n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_4n.jpg").getImage();
				break;
			case "fam_4s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_4s.jpg").getImage();
				break;
			case "fam_4e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_4e.jpg").getImage();
				break;
			case "fam_4w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_4w.jpg").getImage();
				break;
			case "fam_5n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_5n.jpg").getImage();
				break;
			case "fam_5s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_5s.jpg").getImage();
				break;
			case "fam_5e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_5e.jpg").getImage();
				break;
			case "fam_5w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_5w.jpg").getImage();
				break;
			case "fam_6n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_6n.jpg").getImage();
				break;
			case "fam_6s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_6s.jpg").getImage();
				break;
			case "fam_6e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_6e.jpg").getImage();
				break;
			case "fam_6w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_6w.jpg").getImage();
				break;
			case "fam_7n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_7n.jpg").getImage();
				break;
			case "fam_7s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_7s.jpg").getImage();
				break;
			case "fam_7e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_7e.jpg").getImage();
				break;
			case "fam_7w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_7w.jpg").getImage();
				break;
			case "fam_8n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_8n.jpg").getImage();
				break;
			case "fam_8s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_8s.jpg").getImage();
				break;
			case "fam_8e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_8e.jpg").getImage();
				break;
			case "fam_8w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_8w.jpg").getImage();
				break;
			case "fam_9n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_9n.jpg").getImage();
				break;
			case "fam_9s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_9s.jpg").getImage();
				break;
			case "fam_9e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_9e.jpg").getImage();
				break;
			case "fam_9w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_9w.jpg").getImage();
				break;
			case "fam_10n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_10n.jpg").getImage();
				break;
			case "fam_10s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_10s.jpg").getImage();
				break;
			case "fam_10e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_10e.jpg").getImage();
				break;
			case "fam_10w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_10w.jpg").getImage();
				break;
			case "fam_11n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_11n.jpg").getImage();
				break;
			case "fam_11s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_11s.jpg").getImage();
				break;
			case "fam_11e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_11e.jpg").getImage();
				break;
			case "fam_11w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_11w.jpg").getImage();
				break;
			case "fam_12n":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_12n.jpg").getImage();
				break;
			case "fam_12s":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_12s.jpg").getImage();
				break;
			case "fam_12e":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_12e.jpg").getImage();
				break;
			case "fam_12w":
				currentPositionImage = new ImageIcon("resources/images/fam/fam_12w.jpg").getImage();
				break;
			case "stair_1n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_1n.jpg").getImage();
				break;
			case "stair_1s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_1s.jpg").getImage();
				break;
			case "stair_1e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_1e.jpg").getImage();
				break;
			case "stair_1w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_1w.jpg").getImage();
				break;
			case "stair_2n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_2n.jpg").getImage();
				break;
			case "stair_2s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_2s.jpg").getImage();
				break;
			case "stair_2e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_2e.jpg").getImage();
				break;
			case "stair_2w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_2w.jpg").getImage();
				break;
			case "stair_3n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_3n.jpg").getImage();
				break;
			case "stair_3s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_3s.jpg").getImage();
				break;
			case "stair_3e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_3e.jpg").getImage();
				break;
			case "stair_3w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_3w.jpg").getImage();
				break;
			case "stair_4n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_4n.jpg").getImage();
				break;
			case "stair_4s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_4s.jpg").getImage();
				break;
			case "stair_4e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_4e.jpg").getImage();
				break;
			case "stair_4w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_4w.jpg").getImage();
				break;
			case "stair_5n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_5n.jpg").getImage();
				break;
			case "stair_5s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_5s.jpg").getImage();
				break;
			case "stair_5e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_5e.jpg").getImage();
				break;
			case "stair_5w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_5w.jpg").getImage();
				break;
			case "stair_6n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_6n.jpg").getImage();
				break;
			case "stair_6s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_6s.jpg").getImage();
				break;
			case "stair_6e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_6e.jpg").getImage();
				break;
			case "stair_6w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_6w.jpg").getImage();
				break;
			case "stair_7n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_7n.jpg").getImage();
				break;
			case "stair_7s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_7s.jpg").getImage();
				break;
			case "stair_7e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_7e.jpg").getImage();
				break;
			case "stair_7w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_7w.jpg").getImage();
				break;
			case "stair_8n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_8n.jpg").getImage();
				break;
			case "stair_8s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_8s.jpg").getImage();
				break;
			case "stair_8e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_8e.jpg").getImage();
				break;
			case "stair_8w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_8w.jpg").getImage();
				break;
			case "stair_9n":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_9n.jpg").getImage();
				break;
			case "stair_9s":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_9s.jpg").getImage();
				break;
			case "stair_9e":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_9e.jpg").getImage();
				break;
			case "stair_9w":
				currentPositionImage = new ImageIcon("resources/images/stair/stair_9w.jpg").getImage();
				break;
			case "ground_1n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_1n.jpg").getImage();
				break;
			case "ground_1s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_1s.jpg").getImage();
				break;
			case "ground_1e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_1e.jpg").getImage();
				break;
			case "ground_1w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_1w.jpg").getImage();
				break;
			case "ground_2n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_2n.jpg").getImage();
				break;
			case "ground_2s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_2s.jpg").getImage();
				break;
			case "ground_2e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_2e.jpg").getImage();
				break;
			case "ground_2w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_2w.jpg").getImage();
				break;
			case "ground_3n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_3n.jpg").getImage();
				break;
			case "ground_3s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_3s.jpg").getImage();
				break;
			case "ground_3e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_3e.jpg").getImage();
				break;
			case "ground_3w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_3w.jpg").getImage();
				break;
			case "ground_3w_window":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_3w_window.jpg").getImage();
				break;
			case "ground_4n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_4n.jpg").getImage();
				break;
			case "ground_4s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_4s.jpg").getImage();
				break;
			case "ground_4e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_4e.jpg").getImage();
				break;
			case "ground_4w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_4w.jpg").getImage();
				break;
			case "ground_5n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_5n.jpg").getImage();
				break;
			case "ground_5s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_5s.jpg").getImage();
				break;
			case "ground_5e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_5e.jpg").getImage();
				break;
			case "ground_5w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_5w.jpg").getImage();
				break;
			case "ground_6n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_6n.jpg").getImage();
				break;
			case "ground_6s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_6s.jpg").getImage();
				break;
			case "ground_6e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_6e.jpg").getImage();
				break;
			case "ground_6w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_6w.jpg").getImage();
				break;
			case "ground_7n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_7n.jpg").getImage();
				break;
			case "ground_7s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_7s.jpg").getImage();
				break;
			case "ground_7e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_7e.jpg").getImage();
				break;
			case "ground_7w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_7w.jpg").getImage();
				break;
			case "ground_8n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_8n.jpg").getImage();
				break;
			case "ground_8s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_8s.jpg").getImage();
				break;
			case "ground_8e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_8e.jpg").getImage();
				break;
			case "ground_8w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_8w.jpg").getImage();
				break;
			case "ground_9n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9n.jpg").getImage();
				break;
			case "ground_9s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9s.jpg").getImage();
				break;
			case "ground_9e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9e.jpg").getImage();
				break;
			case "ground_9bn":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9bn.jpg").getImage();
				break;
			case "ground_9bs":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9bs.jpg").getImage();
				break;
			case "ground_9be":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9be.jpg").getImage();
				break;
			case "ground_9bw":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9bw.jpg").getImage();
				break;
			case "ground_9w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_9w.jpg").getImage();
				break;
			case "ground_10n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_10n.jpg").getImage();
				break;
			case "ground_10s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_10s.jpg").getImage();
				break;
			case "ground_10e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_10e.jpg").getImage();
				break;
			case "ground_10w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_10w.jpg").getImage();
				break;
			case "ground_11n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_11n.jpg").getImage();
				break;
			case "ground_11s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_11s.jpg").getImage();
				break;
			case "ground_11e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_11e.jpg").getImage();
				break;
			case "ground_11w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_11w.jpg").getImage();
				break;
			case "ground_12n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_12n.jpg").getImage();
				break;
			case "ground_12s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_12s.jpg").getImage();
				break;
			case "ground_12e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_12e.jpg").getImage();
				break;
			case "ground_12w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_12w.jpg").getImage();
				break;
			case "ground_13n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_13n.jpg").getImage();
				break;
			case "ground_13s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_13s.jpg").getImage();
				break;
			case "ground_13e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_13e.jpg").getImage();
				break;
			case "ground_13w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_13w.jpg").getImage();
				break;
			case "ground_14n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_14n.jpg").getImage();
				break;
			case "ground_14n_window":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_14n_window.jpg").getImage();
				break;
			case "ground_14s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_14s.jpg").getImage();
				break;
			case "ground_14e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_14e.jpg").getImage();
				break;
			case "ground_14e_window":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_14e_window.jpg").getImage();
				break;
			case "ground_14w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_14w.jpg").getImage();
				break;
			case "ground_15n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_15n.jpg").getImage();
				break;
			case "ground_15s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_15s.jpg").getImage();
				break;
			case "ground_15e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_15e.jpg").getImage();
				break;
			case "ground_15e_window":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_15e_window.jpg").getImage();
				break;
			case "ground_15w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_15w.jpg").getImage();
				break;
			case "ground_16n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_16n.jpg").getImage();
				break;
			case "ground_16s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_16s.jpg").getImage();
				break;
			case "ground_16e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_16e.jpg").getImage();
				break;
			case "ground_16w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_16w.jpg").getImage();
				break;
			case "ground_17n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_17n.jpg").getImage();
				break;
			case "ground_17s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_17s.jpg").getImage();
				break;
			case "ground_17e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_17e.jpg").getImage();
				break;
			case "ground_17e_window":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_17e_window.jpg").getImage();
				break;
			case "ground_17w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_17w.jpg").getImage();
				break;
			case "ground_18n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_18n.jpg").getImage();
				break;
			case "ground_18s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_18s.jpg").getImage();
				break;
			case "ground_18e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_18e.jpg").getImage();
				break;
			case "ground_18w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_18w.jpg").getImage();
				break;
			case "ground_19n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_19n.jpg").getImage();
				break;
			case "ground_19s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_19s.jpg").getImage();
				break;
			case "ground_19e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_19e.jpg").getImage();
				break;
			case "ground_19w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_19w.jpg").getImage();
				break;
			case "ground_20n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_20n.jpg").getImage();
				break;
			case "ground_20s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_20s.jpg").getImage();
				break;
			case "ground_20e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_20e.jpg").getImage();
				break;
			case "ground_20w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_20w.jpg").getImage();
				break;
			case "ground_21n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_21n.jpg").getImage();
				break;
			case "ground_21s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_21s.jpg").getImage();
				break;
			case "ground_21e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_21e.jpg").getImage();
				break;
			case "ground_21w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_21w.jpg").getImage();
				break;
			case "ground_22n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_22n.jpg").getImage();
				break;
			case "ground_22s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_22s.jpg").getImage();
				break;
			case "ground_22e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_22e.jpg").getImage();
				break;
			case "ground_22w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_22w.jpg").getImage();
				break;
			case "ground_23n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_23n.jpg").getImage();
				break;
			case "ground_23s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_23s.jpg").getImage();
				break;
			case "ground_23e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_23e.jpg").getImage();
				break;
			case "ground_23w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_23w.jpg").getImage();
				break;
			case "ground_24n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_24n.jpg").getImage();
				break;
			case "ground_24s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_24s.jpg").getImage();
				break;
			case "ground_24e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_24e.jpg").getImage();
				break;
			case "ground_24w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_24w.jpg").getImage();
				break;
			case "ground_25n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_25n.jpg").getImage();
				break;
			case "ground_25s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_25s.jpg").getImage();
				break;
			case "ground_25e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_25e.jpg").getImage();
				break;
			case "ground_25w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_25w.jpg").getImage();
				break;
			case "ground_26n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_26n.jpg").getImage();
				break;
			case "ground_26s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_26s.jpg").getImage();
				break;
			case "ground_26e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_26e.jpg").getImage();
				break;
			case "ground_26w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_26w.jpg").getImage();
				break;
			case "ground_27n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_27n.jpg").getImage();
				break;
			case "ground_27s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_27s.jpg").getImage();
				break;
			case "ground_27e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_27e.jpg").getImage();
				break;
			case "ground_27w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_27w.jpg").getImage();
				break;
			case "ground_28n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_28n.jpg").getImage();
				break;
			case "ground_28s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_28s.jpg").getImage();
				break;
			case "ground_28e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_28e.jpg").getImage();
				break;
			case "ground_28w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_28w.jpg").getImage();
				break;
			case "ground_29n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_29n.jpg").getImage();
				break;
			case "ground_29s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_29s.jpg").getImage();
				break;
			case "ground_29e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_29e.jpg").getImage();
				break;
			case "ground_29w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_29w.jpg").getImage();
				break;
			case "ground_30n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_30n.jpg").getImage();
				break;
			case "ground_30s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_30s.jpg").getImage();
				break;
			case "ground_30e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_30e.jpg").getImage();
				break;
			case "ground_30w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_30w.jpg").getImage();
				break;
			case "ground_31n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_31n.jpg").getImage();
				break;
			case "ground_31s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_31s.jpg").getImage();
				break;
			case "ground_31e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_31e.jpg").getImage();
				break;
			case "ground_31w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_31w.jpg").getImage();
				break;
			case "ground_32n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_32n.jpg").getImage();
				break;
			case "ground_32s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_32s.jpg").getImage();
				break;
			case "ground_32e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_32e.jpg").getImage();
				break;
			case "ground_32w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_32w.jpg").getImage();
				break;
			case "ground_33n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_33n.jpg").getImage();
				break;
			case "ground_33s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_33s.jpg").getImage();
				break;
			case "ground_33e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_33e.jpg").getImage();
				break;
			case "ground_33w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_33w.jpg").getImage();
				break;
			case "ground_34n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_34n.jpg").getImage();
				break;
			case "ground_34s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_34s.jpg").getImage();
				break;
			case "ground_34e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_34e.jpg").getImage();
				break;
			case "ground_34w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_34w.jpg").getImage();
				break;
			case "ground_35n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_35n.jpg").getImage();
				break;
			case "ground_35s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_35s.jpg").getImage();
				break;
			case "ground_35e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_35e.jpg").getImage();
				break;
			case "ground_35w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_35w.jpg").getImage();
				break;
			case "ground_36n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_36n.jpg").getImage();
				break;
			case "ground_36s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_36s.jpg").getImage();
				break;
			case "ground_36e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_36e.jpg").getImage();
				break;
			case "ground_36w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_36w.jpg").getImage();
				break;
			case "ground_37n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37n.jpg").getImage();
				break;
			case "ground_37s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37s.jpg").getImage();
				break;
			case "ground_37e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37e.jpg").getImage();
				break;
			case "ground_37w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37w.jpg").getImage();
				break;
			case "ground_37bn":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37bn.jpg").getImage();
				break;
			case "ground_37bs":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37bs.jpg").getImage();
				break;
			case "ground_37be":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37be.jpg").getImage();
				break;
			case "ground_37bw":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_37bw.jpg").getImage();
				break;
			case "ground_38n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_38n.jpg").getImage();
				break;
			case "ground_38s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_38s.jpg").getImage();
				break;
			case "ground_38e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_38e.jpg").getImage();
				break;
			case "ground_38w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_38w.jpg").getImage();
				break;
			case "ground_39n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_39n.jpg").getImage();
				break;
			case "ground_39s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_39s.jpg").getImage();
				break;
			case "ground_39e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_39e.jpg").getImage();
				break;
			case "ground_39w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_39w.jpg").getImage();
				break;
			case "ground_40n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_40n.jpg").getImage();
				break;
			case "ground_40s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_40s.jpg").getImage();
				break;
			case "ground_40e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_40e.jpg").getImage();
				break;
			case "ground_40w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_40w.jpg").getImage();
				break;
			case "ground_41n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_41n.jpg").getImage();
				break;
			case "ground_41s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_41s.jpg").getImage();
				break;
			case "ground_41e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_41e.jpg").getImage();
				break;
			case "ground_41w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_41w.jpg").getImage();
				break;
			case "ground_42n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_42n.jpg").getImage();
				break;
			case "ground_42s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_42s.jpg").getImage();
				break;
			case "ground_42e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_42e.jpg").getImage();
				break;
			case "ground_42w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_42w.jpg").getImage();
				break;
			case "ground_43n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_43n.jpg").getImage();
				break;
			case "ground_43s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_43s.jpg").getImage();
				break;
			case "ground_43e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_43e.jpg").getImage();
				break;
			case "ground_43w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_43w.jpg").getImage();
				break;
			case "ground_43w_window":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_43w_window.jpg").getImage();
				break;
			case "ground_44n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_44n.jpg").getImage();
				break;
			case "ground_44s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_44s.jpg").getImage();
				break;
			case "ground_44e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_44e.jpg").getImage();
				break;
			case "ground_44w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_44w.jpg").getImage();
				break;
			case "ground_45n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_45n.jpg").getImage();
				break;
			case "ground_45s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_45s.jpg").getImage();
				break;
			case "ground_45e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_45e.jpg").getImage();
				break;
			case "ground_45w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_45w.jpg").getImage();
				break;
			case "ground_46n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_46n.jpg").getImage();
				break;
			case "ground_46s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_46s.jpg").getImage();
				break;
			case "ground_46e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_46e.jpg").getImage();
				break;
			case "ground_46w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_46w.jpg").getImage();
				break;
			case "ground_47n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_47n.jpg").getImage();
				break;
			case "ground_47s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_47s.jpg").getImage();
				break;
			case "ground_47e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_47e.jpg").getImage();
				break;
			case "ground_47w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_47w.jpg").getImage();
				break;
			case "ground_48n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_48n.jpg").getImage();
				break;
			case "ground_48s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_48s.jpg").getImage();
				break;
			case "ground_48e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_48e.jpg").getImage();
				break;
			case "ground_48w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_48w.jpg").getImage();
				break;
			case "ground_49n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_49n.jpg").getImage();
				break;
			case "ground_49s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_49s.jpg").getImage();
				break;
			case "ground_49e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_49e.jpg").getImage();
				break;
			case "ground_49w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_49w.jpg").getImage();
				break;
			case "ground_50n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_50n.jpg").getImage();
				break;
			case "ground_50s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_50s.jpg").getImage();
				break;
			case "ground_50e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_50e.jpg").getImage();
				break;
			case "ground_50w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_50w.jpg").getImage();
				break;
			case "ground_51n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_51n.jpg").getImage();
				break;
			case "ground_51s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_51s.jpg").getImage();
				break;
			case "ground_51e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_51e.jpg").getImage();
				break;
			case "ground_51w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_51w.jpg").getImage();
				break;
			case "ground_52n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_52n.jpg").getImage();
				break;
			case "ground_52s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_52s.jpg").getImage();
				break;
			case "ground_52e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_52e.jpg").getImage();
				break;
			case "ground_52w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_52w.jpg").getImage();
				break;
			case "ground_53n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_53n.jpg").getImage();
				break;
			case "ground_53s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_53s.jpg").getImage();
				break;
			case "ground_53e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_53e.jpg").getImage();
				break;
			case "ground_53w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_53w.jpg").getImage();
				break;
			case "ground_54n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_54n.jpg").getImage();
				break;
			case "ground_54s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_54s.jpg").getImage();
				break;
			case "ground_54e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_54e.jpg").getImage();
				break;
			case "ground_54w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_54w.jpg").getImage();
				break;
			case "ground_55n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_55n.jpg").getImage();
				break;
			case "ground_55s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_55s.jpg").getImage();
				break;
			case "ground_55e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_55e.jpg").getImage();
				break;
			case "ground_55w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_55w.jpg").getImage();
				break;
			case "ground_56n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_56n.jpg").getImage();
				break;
			case "ground_56s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_56s.jpg").getImage();
				break;
			case "ground_56e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_56e.jpg").getImage();
				break;
			case "ground_56w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_56w.jpg").getImage();
				break;
			case "ground_57n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_57n.jpg").getImage();
				break;
			case "ground_57s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_57s.jpg").getImage();
				break;
			case "ground_57e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_57e.jpg").getImage();
				break;
			case "ground_57w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_57w.jpg").getImage();
				break;
			case "ground_58n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_58n.jpg").getImage();
				break;
			case "ground_58s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_58s.jpg").getImage();
				break;
			case "ground_58e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_58e.jpg").getImage();
				break;
			case "ground_58w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_58w.jpg").getImage();
				break;
			case "ground_59n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_59n.jpg").getImage();
				break;
			case "ground_59s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_59s.jpg").getImage();
				break;
			case "ground_59e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_59e.jpg").getImage();
				break;
			case "ground_59w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_59w.jpg").getImage();
				break;
			case "ground_60n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_60n.jpg").getImage();
				break;
			case "ground_60s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_60s.jpg").getImage();
				break;
			case "ground_60e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_60e.jpg").getImage();
				break;
			case "ground_60w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_60w.jpg").getImage();
				break;
			case "ground_61n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_61n.jpg").getImage();
				break;
			case "ground_61s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_61s.jpg").getImage();
				break;
			case "ground_61e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_61e.jpg").getImage();
				break;
			case "ground_61w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_61w.jpg").getImage();
				break;
			case "ground_62n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_62n.jpg").getImage();
				break;
			case "ground_62s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_62s.jpg").getImage();
				break;
			case "ground_62e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_62e.jpg").getImage();
				break;
			case "ground_62w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_62w.jpg").getImage();
				break;
			case "ground_63n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_63n.jpg").getImage();
				break;
			case "ground_63s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_63s.jpg").getImage();
				break;
			case "ground_63e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_63e.jpg").getImage();
				break;
			case "ground_63w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_63w.jpg").getImage();
				break;
			case "ground_64n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_64n.jpg").getImage();
				break;
			case "ground_64s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_64s.jpg").getImage();
				break;
			case "ground_64e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_64e.jpg").getImage();
				break;
			case "ground_64w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_64w.jpg").getImage();
				break;
			case "ground_65n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_65n.jpg").getImage();
				break;
			case "ground_65s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_65s.jpg").getImage();
				break;
			case "ground_65e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_65e.jpg").getImage();
				break;
			case "ground_65w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_65w.jpg").getImage();
				break;
			case "ground_66n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_66n.jpg").getImage();
				break;
			case "ground_66s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_66s.jpg").getImage();
				break;
			case "ground_66e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_66e.jpg").getImage();
				break;
			case "ground_66w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_66w.jpg").getImage();
				break;
			case "ground_67n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_67n.jpg").getImage();
				break;
			case "ground_67s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_67s.jpg").getImage();
				break;
			case "ground_67e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_67e.jpg").getImage();
				break;
			case "ground_67w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_67w.jpg").getImage();
				break;
			case "ground_68n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_68n.jpg").getImage();
				break;
			case "ground_68s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_68s.jpg").getImage();
				break;
			case "ground_68e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_68e.jpg").getImage();
				break;
			case "ground_68w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_68w.jpg").getImage();
				break;
			case "ground_69n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_69n.jpg").getImage();
				break;
			case "ground_69s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_69s.jpg").getImage();
				break;
			case "ground_69e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_69e.jpg").getImage();
				break;
			case "ground_69w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_69w.jpg").getImage();
				break;
			case "ground_70n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_70n.jpg").getImage();
				break;
			case "ground_70s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_70s.jpg").getImage();
				break;
			case "ground_70e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_70e.jpg").getImage();
				break;
			case "ground_70w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_70w.jpg").getImage();
				break;
			case "ground_71n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_71n.jpg").getImage();
				break;
			case "ground_71s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_71s.jpg").getImage();
				break;
			case "ground_71e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_71e.jpg").getImage();
				break;
			case "ground_71w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_71w.jpg").getImage();
				break;
			case "ground_72n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_72n.jpg").getImage();
				break;
			case "ground_72s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_72s.jpg").getImage();
				break;
			case "ground_72e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_72e.jpg").getImage();
				break;
			case "ground_72w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_72w.jpg").getImage();
				break;
			case "ground_73n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_73n.jpg").getImage();
				break;
			case "ground_73s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_73s.jpg").getImage();
				break;
			case "ground_73e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_73e.jpg").getImage();
				break;
			case "ground_73w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_73w.jpg").getImage();
				break;
			case "ground_74n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_74n.jpg").getImage();
				break;
			case "ground_74s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_74s.jpg").getImage();
				break;
			case "ground_74e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_74e.jpg").getImage();
				break;
			case "ground_74w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_74w.jpg").getImage();
				break;
			case "ground_75n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_75n.jpg").getImage();
				break;
			case "ground_75s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_75s.jpg").getImage();
				break;
			case "ground_75e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_75e.jpg").getImage();
				break;
			case "ground_75w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_75w.jpg").getImage();
				break;
			case "ground_76n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_76n.jpg").getImage();
				break;
			case "ground_76s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_76s.jpg").getImage();
				break;
			case "ground_76e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_76e.jpg").getImage();
				break;
			case "ground_76w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_76w.jpg").getImage();
				break;
			case "ground_77n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_77n.jpg").getImage();
				break;
			case "ground_77s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_77s.jpg").getImage();
				break;
			case "ground_77e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_77e.jpg").getImage();
				break;
			case "ground_77w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_77w.jpg").getImage();
				break;
			case "ground_78n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_78n.jpg").getImage();
				break;
			case "ground_78s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_78s.jpg").getImage();
				break;
			case "ground_78e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_78e.jpg").getImage();
				break;
			case "ground_78w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_78w.jpg").getImage();
				break;
			case "ground_79n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_79n.jpg").getImage();
				break;
			case "ground_79s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_79s.jpg").getImage();
				break;
			case "ground_79e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_79e.jpg").getImage();
				break;
			case "ground_79w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_79w.jpg").getImage();
				break;
			case "ground_80n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_80n.jpg").getImage();
				break;
			case "ground_80ne":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_80ne.jpg").getImage();
				break;
			case "ground_80s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_80s.jpg").getImage();
				break;
			case "ground_80sw":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_80sw.jpg").getImage();
				break;
			case "ground_80e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_80e.jpg").getImage();
				break;
			case "ground_80w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_80w.jpg").getImage();
				break;
			case "ground_81n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_81n.jpg").getImage();
				break;
			case "ground_81ne":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_81ne.jpg").getImage();
				break;
			case "ground_81s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_81s.jpg").getImage();
				break;
			case "ground_81e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_81e.jpg").getImage();
				break;
			case "ground_81w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_81w.jpg").getImage();
				break;
			case "ground_82n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_82n.jpg").getImage();
				break;
			case "ground_82s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_82s.jpg").getImage();
				break;
			case "ground_82e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_82e.jpg").getImage();
				break;
			case "ground_82w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_82w.jpg").getImage();
				break;
			case "ground_83n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_83n.jpg").getImage();
				break;
			case "ground_83s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_83s.jpg").getImage();
				break;
			case "ground_83e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_83e.jpg").getImage();
				break;
			case "ground_83w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_83w.jpg").getImage();
				break;
			case "ground_84n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_84n.jpg").getImage();
				break;
			case "ground_84s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_84s.jpg").getImage();
				break;
			case "ground_84e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_84e.jpg").getImage();
				break;
			case "ground_84w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_84w.jpg").getImage();
				break;
			case "ground_85n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_85n.jpg").getImage();
				break;
			case "ground_85s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_85s.jpg").getImage();
				break;
			case "ground_85e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_85e.jpg").getImage();
				break;
			case "ground_85w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_85w.jpg").getImage();
				break;
			case "ground_86n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_86n.jpg").getImage();
				break;
			case "ground_86s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_86s.jpg").getImage();
				break;
			case "ground_86e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_86e.jpg").getImage();
				break;
			case "ground_86w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_86w.jpg").getImage();
				break;
			case "ground_87n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_87n.jpg").getImage();
				break;
			case "ground_87s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_87s.jpg").getImage();
				break;
			case "ground_87e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_87e.jpg").getImage();
				break;
			case "ground_87w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_87w.jpg").getImage();
				break;
			case "ground_88n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_88n.jpg").getImage();
				break;
			case "ground_88s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_88s.jpg").getImage();
				break;
			case "ground_88e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_88e.jpg").getImage();
				break;
			case "ground_88w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_88w.jpg").getImage();
				break;
			case "ground_89n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_89n.jpg").getImage();
				break;
			case "ground_89s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_89s.jpg").getImage();
				break;
			case "ground_89e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_89e.jpg").getImage();
				break;
			case "ground_89w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_89w.jpg").getImage();
				break;
			case "ground_90n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_90n.jpg").getImage();
				break;
			case "ground_90s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_90s.jpg").getImage();
				break;
			case "ground_90e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_90e.jpg").getImage();
				break;
			case "ground_90w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_90w.jpg").getImage();
				break;
			case "ground_91n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_91n.jpg").getImage();
				break;
			case "ground_91s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_91s.jpg").getImage();
				break;
			case "ground_91e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_91e.jpg").getImage();
				break;
			case "ground_91w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_91w.jpg").getImage();
				break;
			case "ground_92n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_92n.jpg").getImage();
				break;
			case "ground_92s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_92s.jpg").getImage();
				break;
			case "ground_92e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_92e.jpg").getImage();
				break;
			case "ground_92w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_92w.jpg").getImage();
				break;
			case "ground_93n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_93n.jpg").getImage();
				break;
			case "ground_93s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_93s.jpg").getImage();
				break;
			case "ground_93e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_93e.jpg").getImage();
				break;
			case "ground_93w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_93w.jpg").getImage();
				break;
			case "ground_94n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_94n.jpg").getImage();
				break;
			case "ground_94s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_94s.jpg").getImage();
				break;
			case "ground_94e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_94e.jpg").getImage();
				break;
			case "ground_94w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_94w.jpg").getImage();
				break;
			case "ground_95n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_95n.jpg").getImage();
				break;
			case "ground_95s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_95s.jpg").getImage();
				break;
			case "ground_95e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_95e.jpg").getImage();
				break;
			case "ground_95w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_95w.jpg").getImage();
				break;
			case "ground_96n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_96n.jpg").getImage();
				break;
			case "ground_96s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_96s.jpg").getImage();
				break;
			case "ground_96e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_96e.jpg").getImage();
				break;
			case "ground_96w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_96w.jpg").getImage();
				break;
			case "ground_97n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_97n.jpg").getImage();
				break;
			case "ground_97s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_97s.jpg").getImage();
				break;
			case "ground_97e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_97e.jpg").getImage();
				break;
			case "ground_97w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_97w.jpg").getImage();
				break;
			case "ground_98n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_98n.jpg").getImage();
				break;
			case "ground_98s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_98s.jpg").getImage();
				break;
			case "ground_98e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_98e.jpg").getImage();
				break;
			case "ground_98w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_98w.jpg").getImage();
				break;
			case "ground_99n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_99n.jpg").getImage();
				break;
			case "ground_99s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_99s.jpg").getImage();
				break;
			case "ground_99e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_99e.jpg").getImage();
				break;
			case "ground_99w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_99w.jpg").getImage();
				break;
			case "ground_100n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_100n.jpg").getImage();
				break;
			case "ground_100s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_100s.jpg").getImage();
				break;
			case "ground_100e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_100e.jpg").getImage();
				break;
			case "ground_100w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_100w.jpg").getImage();
				break;
			case "ground_101n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_101n.jpg").getImage();
				break;
			case "ground_101s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_101s.jpg").getImage();
				break;
			case "ground_101e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_101e.jpg").getImage();
				break;
			case "ground_101w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_101w.jpg").getImage();
				break;
			case "ground_102n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_102n.jpg").getImage();
				break;
			case "ground_102s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_102s.jpg").getImage();
				break;
			case "ground_102e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_102e.jpg").getImage();
				break;
			case "ground_102w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_102w.jpg").getImage();
				break;
			case "ground_103n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_103n.jpg").getImage();
				break;
			case "ground_103s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_103s.jpg").getImage();
				break;
			case "ground_103e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_103e.jpg").getImage();
				break;
			case "ground_103w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_103w.jpg").getImage();
				break;
			case "ground_104n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_104n.jpg").getImage();
				break;
			case "ground_104s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_104s.jpg").getImage();
				break;
			case "ground_104e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_104e.jpg").getImage();
				break;
			case "ground_104w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_104w.jpg").getImage();
				break;
			case "ground_105n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_105n.jpg").getImage();
				break;
			case "ground_105s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_105s.jpg").getImage();
				break;
			case "ground_105e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_105e.jpg").getImage();
				break;
			case "ground_105w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_105w.jpg").getImage();
				break;
			case "ground_106n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_106n.jpg").getImage();
				break;
			case "ground_106s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_106s.jpg").getImage();
				break;
			case "ground_106e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_106e.jpg").getImage();
				break;
			case "ground_106w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_106w.jpg").getImage();
				break;
			case "ground_107n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_107n.jpg").getImage();
				break;
			case "ground_107s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_107s.jpg").getImage();
				break;
			case "ground_107e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_107e.jpg").getImage();
				break;
			case "ground_107w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_107w.jpg").getImage();
				break;
			case "ground_108n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_108n.jpg").getImage();
				break;
			case "ground_108s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_108s.jpg").getImage();
				break;
			case "ground_108e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_108e.jpg").getImage();
				break;
			case "ground_108w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_108w.jpg").getImage();
				break;
			case "ground_109n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_109n.jpg").getImage();
				break;
			case "ground_109s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_109s.jpg").getImage();
				break;
			case "ground_109e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_109e.jpg").getImage();
				break;
			case "ground_109w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_109w.jpg").getImage();
				break;
			case "ground_110n":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_110n.jpg").getImage();
				break;
			case "ground_110s":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_110s.jpg").getImage();
				break;
			case "ground_110e":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_110e.jpg").getImage();
				break;
			case "ground_110w":
				currentPositionImage = new ImageIcon("resources/images/ground/ground_110w.jpg").getImage();
				break;
			case "tunnel_1n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1n.jpg").getImage();
				break;
			case "tunnel_1s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1s.jpg").getImage();
				break;
			case "tunnel_1e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1e.jpg").getImage();
				break;
			case "tunnel_1w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1w.jpg").getImage();
				break;
			case "tunnel_2n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2n.jpg").getImage();
				break;
			case "tunnel_2s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2s.jpg").getImage();
				break;
			case "tunnel_2e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2e.jpg").getImage();
				break;
			case "tunnel_2w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2w.jpg").getImage();
				break;
			case "tunnel_3n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3n.jpg").getImage();
				break;
			case "tunnel_3s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3s.jpg").getImage();
				break;
			case "tunnel_3e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3e.jpg").getImage();
				break;
			case "tunnel_3w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3w.jpg").getImage();
				break;
			case "tunnel_4n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4n.jpg").getImage();
				break;
			case "tunnel_4s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4s.jpg").getImage();
				break;
			case "tunnel_4e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4e.jpg").getImage();
				break;
			case "tunnel_4w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4w.jpg").getImage();
				break;
			case "tunnel_5n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5n.jpg").getImage();
				break;
			case "tunnel_5s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5s.jpg").getImage();
				break;
			case "tunnel_5e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5e.jpg").getImage();
				break;
			case "tunnel_5w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5w.jpg").getImage();
				break;
			case "tunnel_6n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6n.jpg").getImage();
				break;
			case "tunnel_6s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6s.jpg").getImage();
				break;
			case "tunnel_6e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6e.jpg").getImage();
				break;
			case "tunnel_6w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6w.jpg").getImage();
				break;
			case "tunnel_7n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7n.jpg").getImage();
				break;
			case "tunnel_7s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7s.jpg").getImage();
				break;
			case "tunnel_7e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7e.jpg").getImage();
				break;
			case "tunnel_7w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7w.jpg").getImage();
				break;
			case "tunnel_8n":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8n.jpg").getImage();
				break;
			case "tunnel_8s":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8s.jpg").getImage();
				break;
			case "tunnel_8e":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8e.jpg").getImage();
				break;
			case "tunnel_8w":
				currentPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8w.jpg").getImage();
				break;
			default:
				break;
		}
	}
		
	public static void loadOldImage() {
		switch (Player.getOldPosition()) {
			case "entry_1n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_1n.jpg").getImage();
				break;
			case "entry_1s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_1s.jpg").getImage();
				break;
			case "entry_1e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_1e.jpg").getImage();
				break;
			case "entry_1w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_1w.jpg").getImage();
				break;
			case "entry_2n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_2n.jpg").getImage();
				break;
			case "entry_2s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_2s.jpg").getImage();
				break;
			case "entry_2e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_2e.jpg").getImage();
				break;
			case "entry_2w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_2w.jpg").getImage();
				break;
			case "entry_3n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_3n.jpg").getImage();
				break;
			case "entry_3s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_3s.jpg").getImage();
				break;
			case "entry_3e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_3e.jpg").getImage();
				break;
			case "entry_3w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_3w.jpg").getImage();
				break;
			case "entry_4n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_4n.jpg").getImage();
				break;
			case "entry_4s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_4s.jpg").getImage();
				break;
			case "entry_4e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_4e.jpg").getImage();
				break;
			case "entry_4w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_4w.jpg").getImage();
				break;
			case "entry_5n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_5n.jpg").getImage();
				break;
			case "entry_5s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_5s.jpg").getImage();
				break;
			case "entry_5e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_5e.jpg").getImage();
				break;
			case "entry_5w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_5w.jpg").getImage();
				break;
			case "entry_6n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_6n.jpg").getImage();
				break;
			case "entry_6s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_6s.jpg").getImage();
				break;
			case "entry_6e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_6e.jpg").getImage();
				break;
			case "entry_6w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_6w.jpg").getImage();
				break;
			case "entry_7n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_7n.jpg").getImage();
				break;
			case "entry_7s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_7s.jpg").getImage();
				break;
			case "entry_7e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_7e.jpg").getImage();
				break;
			case "entry_7w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_7w.jpg").getImage();
				break;
			case "entry_8n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_8n.jpg").getImage();
				break;
			case "entry_8s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_8s.jpg").getImage();
				break;
			case "entry_8e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_8e.jpg").getImage();
				break;
			case "entry_8w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_8w.jpg").getImage();
				break;
			case "entry_9n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_9n.jpg").getImage();
				break;
			case "entry_9s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_9s.jpg").getImage();
				break;
			case "entry_9e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_9e.jpg").getImage();
				break;
			case "entry_9w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_9w.jpg").getImage();
				break;
			case "entry_10n":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_10n.jpg").getImage();
				break;
			case "entry_10s":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_10s.jpg").getImage();
				break;
			case "entry_10e":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_10e.jpg").getImage();
				break;
			case "entry_10w":
				oldPositionImage = new ImageIcon("resources/images/entry/entry_10w.jpg").getImage();
				break;
			case "hall_1n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_1n.jpg").getImage();
				break;
			case "hall_1s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_1s.jpg").getImage();
				break;
			case "hall_1e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_1e.jpg").getImage();
				break;
			case "hall_1w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_1w.jpg").getImage();
				break;
			case "hall_2n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_2n.jpg").getImage();
				break;
			case "hall_2s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_2s.jpg").getImage();
				break;
			case "hall_2e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_2e.jpg").getImage();
				break;
			case "hall_2w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_2w.jpg").getImage();
				break;
			case "hall_3n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_3n.jpg").getImage();
				break;
			case "hall_3s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_3s.jpg").getImage();
				break;
			case "hall_3e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_3e.jpg").getImage();
				break;
			case "hall_3w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_3w.jpg").getImage();
				break;
			case "hall_4n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_4n.jpg").getImage();
				break;
			case "hall_4s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_4s.jpg").getImage();
				break;
			case "hall_4e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_4e.jpg").getImage();
				break;
			case "hall_4w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_4w.jpg").getImage();
				break;
			case "hall_5n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_5n.jpg").getImage();
				break;
			case "hall_5s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_5s.jpg").getImage();
				break;
			case "hall_5e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_5e.jpg").getImage();
				break;
			case "hall_5w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_5w.jpg").getImage();
				break;
			case "hall_6n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_6n.jpg").getImage();
				break;
			case "hall_6s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_6s.jpg").getImage();
				break;
			case "hall_6e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_6e.jpg").getImage();
				break;
			case "hall_6w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_6w.jpg").getImage();
				break;
			case "hall_7n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_7n.jpg").getImage();
				break;
			case "hall_7s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_7s.jpg").getImage();
				break;
			case "hall_7sw":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_7sw.jpg").getImage();
				break;
			case "hall_7e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_7e.jpg").getImage();
				break;
			case "hall_7w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_7w.jpg").getImage();
				break;
			case "hall_8n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_8n.jpg").getImage();
				break;
			case "hall_8s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_8s.jpg").getImage();
				break;
			case "hall_8e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_8e.jpg").getImage();
				break;
			case "hall_8w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_8w.jpg").getImage();
				break;
			case "hall_9n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_9n.jpg").getImage();
				break;
			case "hall_9s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_9s.jpg").getImage();
				break;
			case "hall_9se":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_9se.jpg").getImage();
				break;
			case "hall_9e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_9e.jpg").getImage();
				break;
			case "hall_9w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_9w.jpg").getImage();
				break;
			case "hall_10n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_10n.jpg").getImage();
				break;
			case "hall_10s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_10s.jpg").getImage();
				break;
			case "hall_10e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_10e.jpg").getImage();
				break;
			case "hall_10nw":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_10nw.jpg").getImage();
				break;
			case "hall_10w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_10w.jpg").getImage();
				break;
			case "hall_11n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_11n.jpg").getImage();
				break;
			case "hall_11s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_11s.jpg").getImage();
				break;
			case "hall_11sw":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_11sw.jpg").getImage();
				break;
			case "hall_11nw":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_11nw.jpg").getImage();
				break;
			case "hall_11e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_11e.jpg").getImage();
				break;
			case "hall_11w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_11w.jpg").getImage();
				break;
			case "hall_12n":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_12n.jpg").getImage();
				break;
			case "hall_12s":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_12s.jpg").getImage();
				break;
			case "hall_12e":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_12e.jpg").getImage();
				break;
			case "hall_12w":
				oldPositionImage = new ImageIcon("resources/images/hall/hall_12w.jpg").getImage();
				break;
			case "green_1n":
				oldPositionImage = new ImageIcon("resources/images/green/green_1n.jpg").getImage();
				break;
			case "green_1s":
				oldPositionImage = new ImageIcon("resources/images/green/green_1s.jpg").getImage();
				break;
			case "green_1e":
				oldPositionImage = new ImageIcon("resources/images/green/green_1e.jpg").getImage();
				break;
			case "green_1w":
				oldPositionImage = new ImageIcon("resources/images/green/green_1w.jpg").getImage();
				break;
			case "green_2n":
				oldPositionImage = new ImageIcon("resources/images/green/green_2n.jpg").getImage();
				break;
			case "green_2s":
				oldPositionImage = new ImageIcon("resources/images/green/green_2s.jpg").getImage();
				break;
			case "green_2e":
				oldPositionImage = new ImageIcon("resources/images/green/green_2e.jpg").getImage();
				break;
			case "green_2w":
				oldPositionImage = new ImageIcon("resources/images/green/green_2w.jpg").getImage();
				break;
			case "wing_1n":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_1n.jpg").getImage();
				break;
			case "wing_1s":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_1s.jpg").getImage();
				break;
			case "wing_1e":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_1e.jpg").getImage();
				break;
			case "wing_1w":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_1w.jpg").getImage();
				break;
			case "wing_2n":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_2n.jpg").getImage();
				break;
			case "wing_2s":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_2s.jpg").getImage();
				break;
			case "wing_2e":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_2e.jpg").getImage();
				break;
			case "wing_2w":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_2w.jpg").getImage();
				break;
			case "wing_3n":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_3n.jpg").getImage();
				break;
			case "wing_3s":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_3s.jpg").getImage();
				break;
			case "wing_3e":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_3e.jpg").getImage();
				break;
			case "wing_3w":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_3w.jpg").getImage();
				break;
			case "wing_4n":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_4n.jpg").getImage();
				break;
			case "wing_4s":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_4s.jpg").getImage();
				break;
			case "wing_4e":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_4e.jpg").getImage();
				break;
			case "wing_4w":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_4w.jpg").getImage();
				break;
			case "wing_5n":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_5n.jpg").getImage();
				break;
			case "wing_5s":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_5s.jpg").getImage();
				break;
			case "wing_5e":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_5e.jpg").getImage();
				break;
			case "wing_5w":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_5w.jpg").getImage();
				break;
			case "wing_6n":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_6n.jpg").getImage();
				break;
			case "wing_6s":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_6s.jpg").getImage();
				break;
			case "wing_6e":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_6e.jpg").getImage();
				break;
			case "wing_6w":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_6w.jpg").getImage();
				break;
			case "wing_7n":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_7n.jpg").getImage();
				break;
			case "wing_7s":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_7s.jpg").getImage();
				break;
			case "wing_7e":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_7e.jpg").getImage();
				break;
			case "wing_7w":
				oldPositionImage = new ImageIcon("resources/images/wing/wing_7w.jpg").getImage();
				break;
			case "nook_1n":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_1n.jpg").getImage();
				break;
			case "nook_1s":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_1s.jpg").getImage();
				break;
			case "nook_1e":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_1e.jpg").getImage();
				break;
			case "nook_1w":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_1w.jpg").getImage();
				break;
			case "nook_2n":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_2n.jpg").getImage();
				break;
			case "nook_2s":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_2s.jpg").getImage();
				break;
			case "nook_2e":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_2e.jpg").getImage();
				break;
			case "nook_2w":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_2w.jpg").getImage();
				break;
			case "nook_3n":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_3n.jpg").getImage();
				break;
			case "nook_3s":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_3s.jpg").getImage();
				break;
			case "nook_3e":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_3e.jpg").getImage();
				break;
			case "nook_3w":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_3w.jpg").getImage();
				break;
			case "nook_4n":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_4n.jpg").getImage();
				break;
			case "nook_4s":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_4s.jpg").getImage();
				break;
			case "nook_4e":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_4e.jpg").getImage();
				break;
			case "nook_4w":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_4w.jpg").getImage();
				break;
			case "nook_5n":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_5n.jpg").getImage();
				break;
			case "nook_5s":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_5s.jpg").getImage();
				break;
			case "nook_5e":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_5e.jpg").getImage();
				break;
			case "nook_5w":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_5w.jpg").getImage();
				break;
			case "nook_6n":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_6n.jpg").getImage();
				break;
			case "nook_6s":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_6s.jpg").getImage();
				break;
			case "nook_6e":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_6e.jpg").getImage();
				break;
			case "nook_6w":
				oldPositionImage = new ImageIcon("resources/images/nook/nook_6w.jpg").getImage();
				break;
			case "bed_1n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_1n.jpg").getImage();
				break;
			case "bed_1s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_1s.jpg").getImage();
				break;
			case "bed_1e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_1e.jpg").getImage();
				break;
			case "bed_1w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_1w.jpg").getImage();
				break;
			case "bed_2n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_2n.jpg").getImage();
				break;
			case "bed_2s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_2s.jpg").getImage();
				break;
			case "bed_2e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_2e.jpg").getImage();
				break;
			case "bed_2w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_2w.jpg").getImage();
				break;
			case "bed_3n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_3n.jpg").getImage();
				break;
			case "bed_3s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_3s.jpg").getImage();
				break;
			case "bed_3e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_3e.jpg").getImage();
				break;
			case "bed_3w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_3w.jpg").getImage();
				break;
			case "bed_4n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_4n.jpg").getImage();
				break;
			case "bed_4s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_4s.jpg").getImage();
				break;
			case "bed_4e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_4e.jpg").getImage();
				break;
			case "bed_4w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_4w.jpg").getImage();
				break;
			case "bed_5n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_5n.jpg").getImage();
				break;
			case "bed_5s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_5s.jpg").getImage();
				break;
			case "bed_5e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_5e.jpg").getImage();
				break;
			case "bed_5w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_5w.jpg").getImage();
				break;
			case "bed_6n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_6n.jpg").getImage();
				break;
			case "bed_6s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_6s.jpg").getImage();
				break;
			case "bed_6e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_6e.jpg").getImage();
				break;
			case "bed_6w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_6w.jpg").getImage();
				break;
			case "bed_7n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_7n.jpg").getImage();
				break;
			case "bed_7s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_7s.jpg").getImage();
				break;
			case "bed_7e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_7e.jpg").getImage();
				break;
			case "bed_7w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_7w.jpg").getImage();
				break;
			case "bed_8n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_8n.jpg").getImage();
				break;
			case "bed_8s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_8s.jpg").getImage();
				break;
			case "bed_8e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_8e.jpg").getImage();
				break;
			case "bed_8w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_8w.jpg").getImage();
				break;
			case "bed_9n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_9n.jpg").getImage();
				break;
			case "bed_9s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_9s.jpg").getImage();
				break;
			case "bed_9e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_9e.jpg").getImage();
				break;
			case "bed_9w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_9w.jpg").getImage();
				break;
			case "bed_10n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_10n.jpg").getImage();
				break;
			case "bed_10s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_10s.jpg").getImage();
				break;
			case "bed_10e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_10e.jpg").getImage();
				break;
			case "bed_10w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_10w.jpg").getImage();
				break;
			case "bed_11n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_11n.jpg").getImage();
				break;
			case "bed_11s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_11s.jpg").getImage();
				break;
			case "bed_11e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_11e.jpg").getImage();
				break;
			case "bed_11w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_11w.jpg").getImage();
				break;
			case "bed_12n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_12n.jpg").getImage();
				break;
			case "bed_12s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_12s.jpg").getImage();
				break;
			case "bed_12e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_12e.jpg").getImage();
				break;
			case "bed_12w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_12w.jpg").getImage();
				break;
			case "bed_13n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_13n.jpg").getImage();
				break;
			case "bed_13s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_13s.jpg").getImage();
				break;
			case "bed_13e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_13e.jpg").getImage();
				break;
			case "bed_13w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_13w.jpg").getImage();
				break;
			case "bed_14n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_14n.jpg").getImage();
				break;
			case "bed_14ne":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_14ne.jpg").getImage();
				break;
			case "bed_14s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_14s.jpg").getImage();
				break;
			case "bed_14e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_14e.jpg").getImage();
				break;
			case "bed_14w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_14w.jpg").getImage();
				break;
			case "bed_14sw":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_14sw.jpg").getImage();
				break;
			case "bed_15n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_15n.jpg").getImage();
				break;
			case "bed_15s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_15s.jpg").getImage();
				break;
			case "bed_15sw":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_15sw.jpg").getImage();
				break;
			case "bed_15e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_15e.jpg").getImage();
				break;
			case "bed_15w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_15w.jpg").getImage();
				break;
			case "bed_16n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_16n.jpg").getImage();
				break;
			case "bed_16s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_16s.jpg").getImage();
				break;
			case "bed_16e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_16e.jpg").getImage();
				break;
			case "bed_16w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_16w.jpg").getImage();
				break;
			case "bed_17n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_17n.jpg").getImage();
				break;
			case "bed_17s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_17s.jpg").getImage();
				break;
			case "bed_17e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_17e.jpg").getImage();
				break;
			case "bed_17w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_17w.jpg").getImage();
				break;
			case "bed_18n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_18n.jpg").getImage();
				break;
			case "bed_18s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_18s.jpg").getImage();
				break;
			case "bed_18e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_18e.jpg").getImage();
				break;
			case "bed_18w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_18w.jpg").getImage();
				break;
			case "bed_19n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_19n.jpg").getImage();
				break;
			case "bed_19s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_19s.jpg").getImage();
				break;
			case "bed_19e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_19e.jpg").getImage();
				break;
			case "bed_19w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_19w.jpg").getImage();
				break;
			case "bed_20n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_20n.jpg").getImage();
				break;
			case "bed_20s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_20s.jpg").getImage();
				break;
			case "bed_20e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_20e.jpg").getImage();
				break;
			case "bed_20w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_20w.jpg").getImage();
				break;
			case "bed_21n":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_21n.jpg").getImage();
				break;
			case "bed_21s":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_21s.jpg").getImage();
				break;
			case "bed_21e":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_21e.jpg").getImage();
				break;
			case "bed_21w":
				oldPositionImage = new ImageIcon("resources/images/bed/bed_21w.jpg").getImage();
				break;
			case "climb_1n":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_1n.jpg").getImage();
				break;
			case "climb_1s":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_1s.jpg").getImage();
				break;
			case "climb_1e":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_1e.jpg").getImage();
				break;
			case "climb_1w":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_1w.jpg").getImage();
				break;
			case "climb_2n":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_2n.jpg").getImage();
				break;
			case "climb_2s":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_2s.jpg").getImage();
				break;
			case "climb_2e":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_2e.jpg").getImage();
				break;
			case "climb_2w":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_2w.jpg").getImage();
				break;
			case "climb_3n":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_3n.jpg").getImage();
				break;
			case "climb_3s":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_3s.jpg").getImage();
				break;
			case "climb_3e":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_3e.jpg").getImage();
				break;
			case "climb_3w":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_3w.jpg").getImage();
				break;
			case "climb_4n":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_4n.jpg").getImage();
				break;
			case "climb_4s":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_4s.jpg").getImage();
				break;
			case "climb_4e":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_4e.jpg").getImage();
				break;
			case "climb_4w":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_4w.jpg").getImage();
				break;
			case "climb_5n":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_5n.jpg").getImage();
				break;
			case "climb_5s":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_5s.jpg").getImage();
				break;
			case "climb_5e":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_5e.jpg").getImage();
				break;
			case "climb_5w":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_5w.jpg").getImage();
				break;
			case "climb_6n":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_6n.jpg").getImage();
				break;
			case "climb_6s":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_6s.jpg").getImage();
				break;
			case "climb_6e":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_6e.jpg").getImage();
				break;
			case "climb_6w":
				oldPositionImage = new ImageIcon("resources/images/climb/climb_6w.jpg").getImage();
				break;
			case "gallery_1n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_1n.jpg").getImage();
				break;
			case "gallery_1s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_1s.jpg").getImage();
				break;
			case "gallery_1e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_1e.jpg").getImage();
				break;
			case "gallery_1w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_1w.jpg").getImage();
				break;
			case "gallery_2n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_2n.jpg").getImage();
				break;
			case "gallery_2s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_2s.jpg").getImage();
				break;
			case "gallery_2e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_2e.jpg").getImage();
				break;
			case "gallery_2w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_2w.jpg").getImage();
				break;
			case "gallery_3n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_3n.jpg").getImage();
				break;
			case "gallery_3s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_3s.jpg").getImage();
				break;
			case "gallery_3e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_3e.jpg").getImage();
				break;
			case "gallery_3w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_3w.jpg").getImage();
				break;
			case "gallery_4n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_4n.jpg").getImage();
				break;
			case "gallery_4s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_4s.jpg").getImage();
				break;
			case "gallery_4e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_4e.jpg").getImage();
				break;
			case "gallery_4w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_4w.jpg").getImage();
				break;
			case "gallery_5n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_5n.jpg").getImage();
				break;
			case "gallery_5s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_5s.jpg").getImage();
				break;
			case "gallery_5e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_5e.jpg").getImage();
				break;
			case "gallery_5w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_5w.jpg").getImage();
				break;
			case "gallery_6n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_6n.jpg").getImage();
				break;
			case "gallery_6s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_6s.jpg").getImage();
				break;
			case "gallery_6e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_6e.jpg").getImage();
				break;
			case "gallery_6w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_6w.jpg").getImage();
				break;
			case "gallery_7n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_7n.jpg").getImage();
				break;
			case "gallery_7s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_7s.jpg").getImage();
				break;
			case "gallery_7e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_7e.jpg").getImage();
				break;
			case "gallery_7w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_7w.jpg").getImage();
				break;
			case "gallery_8n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_8n.jpg").getImage();
				break;
			case "gallery_8s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_8s.jpg").getImage();
				break;
			case "gallery_8e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_8e.jpg").getImage();
				break;
			case "gallery_8w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_8w.jpg").getImage();
				break;
			case "gallery_9n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_9n.jpg").getImage();
				break;
			case "gallery_9s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_9s.jpg").getImage();
				break;
			case "gallery_9e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_9e.jpg").getImage();
				break;
			case "gallery_9w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_9w.jpg").getImage();
				break;
			case "gallery_10n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_10n.jpg").getImage();
				break;
			case "gallery_10s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_10s.jpg").getImage();
				break;
			case "gallery_10e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_10e.jpg").getImage();
				break;
			case "gallery_10w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_10w.jpg").getImage();
				break;
			case "gallery_11n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_11n.jpg").getImage();
				break;
			case "gallery_11s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_11s.jpg").getImage();
				break;
			case "gallery_11e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_11e.jpg").getImage();
				break;
			case "gallery_11w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_11w.jpg").getImage();
				break;
			case "gallery_12n":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_12n.jpg").getImage();
				break;
			case "gallery_12s":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_12s.jpg").getImage();
				break;
			case "gallery_12e":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_12e.jpg").getImage();
				break;
			case "gallery_12w":
				oldPositionImage = new ImageIcon("resources/images/gallery/gallery_12w.jpg").getImage();
				break;
			case "fam_1n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_1n.jpg").getImage();
				break;
			case "fam_1s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_1s.jpg").getImage();
				break;
			case "fam_1e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_1e.jpg").getImage();
				break;
			case "fam_1w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_1w.jpg").getImage();
				break;
			case "fam_2n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_2n.jpg").getImage();
				break;
			case "fam_2s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_2s.jpg").getImage();
				break;
			case "fam_2e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_2e.jpg").getImage();
				break;
			case "fam_2w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_2w.jpg").getImage();
				break;
			case "fam_3n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_3n.jpg").getImage();
				break;
			case "fam_3s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_3s.jpg").getImage();
				break;
			case "fam_3e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_3e.jpg").getImage();
				break;
			case "fam_3w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_3w.jpg").getImage();
				break;
			case "fam_4n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_4n.jpg").getImage();
				break;
			case "fam_4s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_4s.jpg").getImage();
				break;
			case "fam_4e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_4e.jpg").getImage();
				break;
			case "fam_4w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_4w.jpg").getImage();
				break;
			case "fam_5n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_5n.jpg").getImage();
				break;
			case "fam_5s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_5s.jpg").getImage();
				break;
			case "fam_5e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_5e.jpg").getImage();
				break;
			case "fam_5w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_5w.jpg").getImage();
				break;
			case "fam_6n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_6n.jpg").getImage();
				break;
			case "fam_6s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_6s.jpg").getImage();
				break;
			case "fam_6e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_6e.jpg").getImage();
				break;
			case "fam_6w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_6w.jpg").getImage();
				break;
			case "fam_7n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_7n.jpg").getImage();
				break;
			case "fam_7s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_7s.jpg").getImage();
				break;
			case "fam_7e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_7e.jpg").getImage();
				break;
			case "fam_7w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_7w.jpg").getImage();
				break;
			case "fam_8n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_8n.jpg").getImage();
				break;
			case "fam_8s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_8s.jpg").getImage();
				break;
			case "fam_8e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_8e.jpg").getImage();
				break;
			case "fam_8w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_8w.jpg").getImage();
				break;
			case "fam_9n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_9n.jpg").getImage();
				break;
			case "fam_9s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_9s.jpg").getImage();
				break;
			case "fam_9e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_9e.jpg").getImage();
				break;
			case "fam_9w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_9w.jpg").getImage();
				break;
			case "fam_10n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_10n.jpg").getImage();
				break;
			case "fam_10s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_10s.jpg").getImage();
				break;
			case "fam_10e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_10e.jpg").getImage();
				break;
			case "fam_10w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_10w.jpg").getImage();
				break;
			case "fam_11n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_11n.jpg").getImage();
				break;
			case "fam_11s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_11s.jpg").getImage();
				break;
			case "fam_11e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_11e.jpg").getImage();
				break;
			case "fam_11w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_11w.jpg").getImage();
				break;
			case "fam_12n":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_12n.jpg").getImage();
				break;
			case "fam_12s":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_12s.jpg").getImage();
				break;
			case "fam_12e":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_12e.jpg").getImage();
				break;
			case "fam_12w":
				oldPositionImage = new ImageIcon("resources/images/fam/fam_12w.jpg").getImage();
				break;
			case "stair_1n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_1n.jpg").getImage();
				break;
			case "stair_1s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_1s.jpg").getImage();
				break;
			case "stair_1e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_1e.jpg").getImage();
				break;
			case "stair_1w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_1w.jpg").getImage();
				break;
			case "stair_2n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_2n.jpg").getImage();
				break;
			case "stair_2s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_2s.jpg").getImage();
				break;
			case "stair_2e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_2e.jpg").getImage();
				break;
			case "stair_2w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_2w.jpg").getImage();
				break;
			case "stair_3n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_3n.jpg").getImage();
				break;
			case "stair_3s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_3s.jpg").getImage();
				break;
			case "stair_3e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_3e.jpg").getImage();
				break;
			case "stair_3w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_3w.jpg").getImage();
				break;
			case "stair_4n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_4n.jpg").getImage();
				break;
			case "stair_4s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_4s.jpg").getImage();
				break;
			case "stair_4e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_4e.jpg").getImage();
				break;
			case "stair_4w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_4w.jpg").getImage();
				break;
			case "stair_5n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_5n.jpg").getImage();
				break;
			case "stair_5s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_5s.jpg").getImage();
				break;
			case "stair_5e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_5e.jpg").getImage();
				break;
			case "stair_5w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_5w.jpg").getImage();
				break;
			case "stair_6n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_6n.jpg").getImage();
				break;
			case "stair_6s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_6s.jpg").getImage();
				break;
			case "stair_6e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_6e.jpg").getImage();
				break;
			case "stair_6w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_6w.jpg").getImage();
				break;
			case "stair_7n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_7n.jpg").getImage();
				break;
			case "stair_7s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_7s.jpg").getImage();
				break;
			case "stair_7e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_7e.jpg").getImage();
				break;
			case "stair_7w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_7w.jpg").getImage();
				break;
			case "stair_8n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_8n.jpg").getImage();
				break;
			case "stair_8s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_8s.jpg").getImage();
				break;
			case "stair_8e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_8e.jpg").getImage();
				break;
			case "stair_8w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_8w.jpg").getImage();
				break;
			case "stair_9n":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_9n.jpg").getImage();
				break;
			case "stair_9s":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_9s.jpg").getImage();
				break;
			case "stair_9e":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_9e.jpg").getImage();
				break;
			case "stair_9w":
				oldPositionImage = new ImageIcon("resources/images/stair/stair_9w.jpg").getImage();
				break;
			case "ground_1n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_1n.jpg").getImage();
				break;
			case "ground_1s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_1s.jpg").getImage();
				break;
			case "ground_1e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_1e.jpg").getImage();
				break;
			case "ground_1w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_1w.jpg").getImage();
				break;
			case "ground_2n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_2n.jpg").getImage();
				break;
			case "ground_2s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_2s.jpg").getImage();
				break;
			case "ground_2e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_2e.jpg").getImage();
				break;
			case "ground_2w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_2w.jpg").getImage();
				break;
			case "ground_3n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_3n.jpg").getImage();
				break;
			case "ground_3s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_3s.jpg").getImage();
				break;
			case "ground_3e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_3e.jpg").getImage();
				break;
			case "ground_3w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_3w.jpg").getImage();
				break;
			case "ground_4n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_4n.jpg").getImage();
				break;
			case "ground_4s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_4s.jpg").getImage();
				break;
			case "ground_4e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_4e.jpg").getImage();
				break;
			case "ground_4w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_4w.jpg").getImage();
				break;
			case "ground_5n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_5n.jpg").getImage();
				break;
			case "ground_5s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_5s.jpg").getImage();
				break;
			case "ground_5e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_5e.jpg").getImage();
				break;
			case "ground_5w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_5w.jpg").getImage();
				break;
			case "ground_6n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_6n.jpg").getImage();
				break;
			case "ground_6s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_6s.jpg").getImage();
				break;
			case "ground_6e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_6e.jpg").getImage();
				break;
			case "ground_6w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_6w.jpg").getImage();
				break;
			case "ground_7n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_7n.jpg").getImage();
				break;
			case "ground_7s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_7s.jpg").getImage();
				break;
			case "ground_7e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_7e.jpg").getImage();
				break;
			case "ground_7w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_7w.jpg").getImage();
				break;
			case "ground_8n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_8n.jpg").getImage();
				break;
			case "ground_8s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_8s.jpg").getImage();
				break;
			case "ground_8e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_8e.jpg").getImage();
				break;
			case "ground_8w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_8w.jpg").getImage();
				break;
			case "ground_9n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9n.jpg").getImage();
				break;
			case "ground_9s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9s.jpg").getImage();
				break;
			case "ground_9e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9e.jpg").getImage();
				break;
			case "ground_9w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9w.jpg").getImage();
				break;
			case "ground_9bn":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9bn.jpg").getImage();
				break;
			case "ground_9bs":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9bs.jpg").getImage();
				break;
			case "ground_9be":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9be.jpg").getImage();
				break;
			case "ground_9bw":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_9bw.jpg").getImage();
				break;
			case "ground_10n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_10n.jpg").getImage();
				break;
			case "ground_10s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_10s.jpg").getImage();
				break;
			case "ground_10e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_10e.jpg").getImage();
				break;
			case "ground_10w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_10w.jpg").getImage();
				break;
			case "ground_11n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_11n.jpg").getImage();
				break;
			case "ground_11s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_11s.jpg").getImage();
				break;
			case "ground_11e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_11e.jpg").getImage();
				break;
			case "ground_11w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_11w.jpg").getImage();
				break;
			case "ground_12n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_12n.jpg").getImage();
				break;
			case "ground_12s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_12s.jpg").getImage();
				break;
			case "ground_12e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_12e.jpg").getImage();
				break;
			case "ground_12w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_12w.jpg").getImage();
				break;
			case "ground_13n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_13n.jpg").getImage();
				break;
			case "ground_13s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_13s.jpg").getImage();
				break;
			case "ground_13e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_13e.jpg").getImage();
				break;
			case "ground_13w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_13w.jpg").getImage();
				break;
			case "ground_14n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_14n.jpg").getImage();
				break;
			case "ground_14s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_14s.jpg").getImage();
				break;
			case "ground_14e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_14e.jpg").getImage();
				break;
			case "ground_14w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_14w.jpg").getImage();
				break;
			case "ground_15n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_15n.jpg").getImage();
				break;
			case "ground_15s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_15s.jpg").getImage();
				break;
			case "ground_15e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_15e.jpg").getImage();
				break;
			case "ground_15w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_15w.jpg").getImage();
				break;
			case "ground_16n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_16n.jpg").getImage();
				break;
			case "ground_16s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_16s.jpg").getImage();
				break;
			case "ground_16e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_16e.jpg").getImage();
				break;
			case "ground_16w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_16w.jpg").getImage();
				break;
			case "ground_17n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_17n.jpg").getImage();
				break;
			case "ground_17s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_17s.jpg").getImage();
				break;
			case "ground_17e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_17e.jpg").getImage();
				break;
			case "ground_17w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_17w.jpg").getImage();
				break;
			case "ground_18n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_18n.jpg").getImage();
				break;
			case "ground_18s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_18s.jpg").getImage();
				break;
			case "ground_18e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_18e.jpg").getImage();
				break;
			case "ground_18w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_18w.jpg").getImage();
				break;
			case "ground_19n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_19n.jpg").getImage();
				break;
			case "ground_19s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_19s.jpg").getImage();
				break;
			case "ground_19e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_19e.jpg").getImage();
				break;
			case "ground_19w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_19w.jpg").getImage();
				break;
			case "ground_20n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_20n.jpg").getImage();
				break;
			case "ground_20s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_20s.jpg").getImage();
				break;
			case "ground_20e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_20e.jpg").getImage();
				break;
			case "ground_20w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_20w.jpg").getImage();
				break;
			case "ground_21n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_21n.jpg").getImage();
				break;
			case "ground_21s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_21s.jpg").getImage();
				break;
			case "ground_21e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_21e.jpg").getImage();
				break;
			case "ground_21w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_21w.jpg").getImage();
				break;
			case "ground_22n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_22n.jpg").getImage();
				break;
			case "ground_22s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_22s.jpg").getImage();
				break;
			case "ground_22e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_22e.jpg").getImage();
				break;
			case "ground_22w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_22w.jpg").getImage();
				break;
			case "ground_23n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_23n.jpg").getImage();
				break;
			case "ground_23s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_23s.jpg").getImage();
				break;
			case "ground_23e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_23e.jpg").getImage();
				break;
			case "ground_23w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_23w.jpg").getImage();
				break;
			case "ground_24n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_24n.jpg").getImage();
				break;
			case "ground_24s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_24s.jpg").getImage();
				break;
			case "ground_24e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_24e.jpg").getImage();
				break;
			case "ground_24w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_24w.jpg").getImage();
				break;
			case "ground_25n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_25n.jpg").getImage();
				break;
			case "ground_25s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_25s.jpg").getImage();
				break;
			case "ground_25e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_25e.jpg").getImage();
				break;
			case "ground_25w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_25w.jpg").getImage();
				break;
			case "ground_26n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_26n.jpg").getImage();
				break;
			case "ground_26s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_26s.jpg").getImage();
				break;
			case "ground_26e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_26e.jpg").getImage();
				break;
			case "ground_26w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_26w.jpg").getImage();
				break;
			case "ground_27n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_27n.jpg").getImage();
				break;
			case "ground_27s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_27s.jpg").getImage();
				break;
			case "ground_27e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_27e.jpg").getImage();
				break;
			case "ground_27w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_27w.jpg").getImage();
				break;
			case "ground_28n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_28n.jpg").getImage();
				break;
			case "ground_28s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_28s.jpg").getImage();
				break;
			case "ground_28e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_28e.jpg").getImage();
				break;
			case "ground_28w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_28w.jpg").getImage();
				break;
			case "ground_29n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_29n.jpg").getImage();
				break;
			case "ground_29s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_29s.jpg").getImage();
				break;
			case "ground_29e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_29e.jpg").getImage();
				break;
			case "ground_29w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_29w.jpg").getImage();
				break;
			case "ground_30n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_30n.jpg").getImage();
				break;
			case "ground_30s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_30s.jpg").getImage();
				break;
			case "ground_30e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_30e.jpg").getImage();
				break;
			case "ground_30w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_30w.jpg").getImage();
				break;
			case "ground_31n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_31n.jpg").getImage();
				break;
			case "ground_31s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_31s.jpg").getImage();
				break;
			case "ground_31e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_31e.jpg").getImage();
				break;
			case "ground_31w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_31w.jpg").getImage();
				break;
			case "ground_32n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_32n.jpg").getImage();
				break;
			case "ground_32s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_32s.jpg").getImage();
				break;
			case "ground_32e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_32e.jpg").getImage();
				break;
			case "ground_32w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_32w.jpg").getImage();
				break;
			case "ground_33n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_33n.jpg").getImage();
				break;
			case "ground_33s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_33s.jpg").getImage();
				break;
			case "ground_33e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_33e.jpg").getImage();
				break;
			case "ground_33w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_33w.jpg").getImage();
				break;
			case "ground_34n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_34n.jpg").getImage();
				break;
			case "ground_34s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_34s.jpg").getImage();
				break;
			case "ground_34e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_34e.jpg").getImage();
				break;
			case "ground_34w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_34w.jpg").getImage();
				break;
			case "ground_35n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_35n.jpg").getImage();
				break;
			case "ground_35s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_35s.jpg").getImage();
				break;
			case "ground_35e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_35e.jpg").getImage();
				break;
			case "ground_35w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_35w.jpg").getImage();
				break;
			case "ground_36n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_36n.jpg").getImage();
				break;
			case "ground_36s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_36s.jpg").getImage();
				break;
			case "ground_36e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_36e.jpg").getImage();
				break;
			case "ground_36w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_36w.jpg").getImage();
				break;
			case "ground_37n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37n.jpg").getImage();
				break;
			case "ground_37s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37s.jpg").getImage();
				break;
			case "ground_37e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37e.jpg").getImage();
				break;
			case "ground_37w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37w.jpg").getImage();
				break;
			case "ground_37bn":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37bn.jpg").getImage();
				break;
			case "ground_37bs":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37bs.jpg").getImage();
				break;
			case "ground_37be":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37be.jpg").getImage();
				break;
			case "ground_37bw":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_37bw.jpg").getImage();
				break;
			case "ground_38n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_38n.jpg").getImage();
				break;
			case "ground_38s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_38s.jpg").getImage();
				break;
			case "ground_38e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_38e.jpg").getImage();
				break;
			case "ground_38w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_38w.jpg").getImage();
				break;
			case "ground_39n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_39n.jpg").getImage();
				break;
			case "ground_39s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_39s.jpg").getImage();
				break;
			case "ground_39e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_39e.jpg").getImage();
				break;
			case "ground_39w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_39w.jpg").getImage();
				break;
			case "ground_40n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_40n.jpg").getImage();
				break;
			case "ground_40s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_40s.jpg").getImage();
				break;
			case "ground_40e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_40e.jpg").getImage();
				break;
			case "ground_40w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_40w.jpg").getImage();
				break;
			case "ground_41n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_41n.jpg").getImage();
				break;
			case "ground_41s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_41s.jpg").getImage();
				break;
			case "ground_41e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_41e.jpg").getImage();
				break;
			case "ground_41w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_41w.jpg").getImage();
				break;
			case "ground_42n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_42n.jpg").getImage();
				break;
			case "ground_42s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_42s.jpg").getImage();
				break;
			case "ground_42e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_42e.jpg").getImage();
				break;
			case "ground_42w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_42w.jpg").getImage();
				break;
			case "ground_43n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_43n.jpg").getImage();
				break;
			case "ground_43s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_43s.jpg").getImage();
				break;
			case "ground_43e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_43e.jpg").getImage();
				break;
			case "ground_43w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_43w.jpg").getImage();
				break;
			case "ground_44n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_44n.jpg").getImage();
				break;
			case "ground_44s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_44s.jpg").getImage();
				break;
			case "ground_44e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_44e.jpg").getImage();
				break;
			case "ground_44w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_44w.jpg").getImage();
				break;
			case "ground_45n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_45n.jpg").getImage();
				break;
			case "ground_45s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_45s.jpg").getImage();
				break;
			case "ground_45e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_45e.jpg").getImage();
				break;
			case "ground_45w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_45w.jpg").getImage();
				break;
			case "ground_46n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_46n.jpg").getImage();
				break;
			case "ground_46s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_46s.jpg").getImage();
				break;
			case "ground_46e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_46e.jpg").getImage();
				break;
			case "ground_46w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_46w.jpg").getImage();
				break;
			case "ground_47n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_47n.jpg").getImage();
				break;
			case "ground_47s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_47s.jpg").getImage();
				break;
			case "ground_47e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_47e.jpg").getImage();
				break;
			case "ground_47w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_47w.jpg").getImage();
				break;
			case "ground_48n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_48n.jpg").getImage();
				break;
			case "ground_48s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_48s.jpg").getImage();
				break;
			case "ground_48e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_48e.jpg").getImage();
				break;
			case "ground_48w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_48w.jpg").getImage();
				break;
			case "ground_49n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_49n.jpg").getImage();
				break;
			case "ground_49s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_49s.jpg").getImage();
				break;
			case "ground_49e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_49e.jpg").getImage();
				break;
			case "ground_49w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_49w.jpg").getImage();
				break;
			case "ground_50n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_50n.jpg").getImage();
				break;
			case "ground_50s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_50s.jpg").getImage();
				break;
			case "ground_50e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_50e.jpg").getImage();
				break;
			case "ground_50w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_50w.jpg").getImage();
				break;
			case "ground_51n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_51n.jpg").getImage();
				break;
			case "ground_51s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_51s.jpg").getImage();
				break;
			case "ground_51e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_51e.jpg").getImage();
				break;
			case "ground_51w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_51w.jpg").getImage();
				break;
			case "ground_52n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_52n.jpg").getImage();
				break;
			case "ground_52s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_52s.jpg").getImage();
				break;
			case "ground_52e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_52e.jpg").getImage();
				break;
			case "ground_52w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_52w.jpg").getImage();
				break;
			case "ground_53n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_53n.jpg").getImage();
				break;
			case "ground_53s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_53s.jpg").getImage();
				break;
			case "ground_53e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_53e.jpg").getImage();
				break;
			case "ground_53w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_53w.jpg").getImage();
				break;
			case "ground_54n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_54n.jpg").getImage();
				break;
			case "ground_54s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_54s.jpg").getImage();
				break;
			case "ground_54e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_54e.jpg").getImage();
				break;
			case "ground_54w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_54w.jpg").getImage();
				break;
			case "ground_55n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_55n.jpg").getImage();
				break;
			case "ground_55s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_55s.jpg").getImage();
				break;
			case "ground_55e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_55e.jpg").getImage();
				break;
			case "ground_55w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_55w.jpg").getImage();
				break;
			case "ground_56n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_56n.jpg").getImage();
				break;
			case "ground_56s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_56s.jpg").getImage();
				break;
			case "ground_56e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_56e.jpg").getImage();
				break;
			case "ground_56w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_56w.jpg").getImage();
				break;
			case "ground_57n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_57n.jpg").getImage();
				break;
			case "ground_57s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_57s.jpg").getImage();
				break;
			case "ground_57e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_57e.jpg").getImage();
				break;
			case "ground_57w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_57w.jpg").getImage();
				break;
			case "ground_58n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_58n.jpg").getImage();
				break;
			case "ground_58s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_58s.jpg").getImage();
				break;
			case "ground_58e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_58e.jpg").getImage();
				break;
			case "ground_58w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_58w.jpg").getImage();
				break;
			case "ground_59n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_59n.jpg").getImage();
				break;
			case "ground_59s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_59s.jpg").getImage();
				break;
			case "ground_59e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_59e.jpg").getImage();
				break;
			case "ground_59w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_59w.jpg").getImage();
				break;
			case "ground_60n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_60n.jpg").getImage();
				break;
			case "ground_60s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_60s.jpg").getImage();
				break;
			case "ground_60e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_60e.jpg").getImage();
				break;
			case "ground_60w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_60w.jpg").getImage();
				break;
			case "ground_61n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_61n.jpg").getImage();
				break;
			case "ground_61s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_61s.jpg").getImage();
				break;
			case "ground_61e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_61e.jpg").getImage();
				break;
			case "ground_61w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_61w.jpg").getImage();
				break;
			case "ground_62n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_62n.jpg").getImage();
				break;
			case "ground_62s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_62s.jpg").getImage();
				break;
			case "ground_62e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_62e.jpg").getImage();
				break;
			case "ground_62w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_62w.jpg").getImage();
				break;
			case "ground_63n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_63n.jpg").getImage();
				break;
			case "ground_63s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_63s.jpg").getImage();
				break;
			case "ground_63e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_63e.jpg").getImage();
				break;
			case "ground_63w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_63w.jpg").getImage();
				break;
			case "ground_64n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_64n.jpg").getImage();
				break;
			case "ground_64s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_64s.jpg").getImage();
				break;
			case "ground_64e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_64e.jpg").getImage();
				break;
			case "ground_64w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_64w.jpg").getImage();
				break;
			case "ground_65n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_65n.jpg").getImage();
				break;
			case "ground_65s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_65s.jpg").getImage();
				break;
			case "ground_65e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_65e.jpg").getImage();
				break;
			case "ground_65w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_65w.jpg").getImage();
				break;
			case "ground_66n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_66n.jpg").getImage();
				break;
			case "ground_66s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_66s.jpg").getImage();
				break;
			case "ground_66e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_66e.jpg").getImage();
				break;
			case "ground_66w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_66w.jpg").getImage();
				break;
			case "ground_67n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_67n.jpg").getImage();
				break;
			case "ground_67s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_67s.jpg").getImage();
				break;
			case "ground_67e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_67e.jpg").getImage();
				break;
			case "ground_67w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_67w.jpg").getImage();
				break;
			case "ground_68n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_68n.jpg").getImage();
				break;
			case "ground_68s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_68s.jpg").getImage();
				break;
			case "ground_68e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_68e.jpg").getImage();
				break;
			case "ground_68w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_68w.jpg").getImage();
				break;
			case "ground_69n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_69n.jpg").getImage();
				break;
			case "ground_69s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_69s.jpg").getImage();
				break;
			case "ground_69e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_69e.jpg").getImage();
				break;
			case "ground_69w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_69w.jpg").getImage();
				break;
			case "ground_70n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_70n.jpg").getImage();
				break;
			case "ground_70s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_70s.jpg").getImage();
				break;
			case "ground_70e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_70e.jpg").getImage();
				break;
			case "ground_70w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_70w.jpg").getImage();
				break;
			case "ground_71n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_71n.jpg").getImage();
				break;
			case "ground_71s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_71s.jpg").getImage();
				break;
			case "ground_71e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_71e.jpg").getImage();
				break;
			case "ground_71w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_71w.jpg").getImage();
				break;
			case "ground_72n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_72n.jpg").getImage();
				break;
			case "ground_72s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_72s.jpg").getImage();
				break;
			case "ground_72e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_72e.jpg").getImage();
				break;
			case "ground_72w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_72w.jpg").getImage();
				break;
			case "ground_73n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_73n.jpg").getImage();
				break;
			case "ground_73s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_73s.jpg").getImage();
				break;
			case "ground_73e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_73e.jpg").getImage();
				break;
			case "ground_73w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_73w.jpg").getImage();
				break;
			case "ground_74n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_74n.jpg").getImage();
				break;
			case "ground_74s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_74s.jpg").getImage();
				break;
			case "ground_74e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_74e.jpg").getImage();
				break;
			case "ground_74w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_74w.jpg").getImage();
				break;
			case "ground_75n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_75n.jpg").getImage();
				break;
			case "ground_75s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_75s.jpg").getImage();
				break;
			case "ground_75e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_75e.jpg").getImage();
				break;
			case "ground_75w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_75w.jpg").getImage();
				break;
			case "ground_76n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_76n.jpg").getImage();
				break;
			case "ground_76s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_76s.jpg").getImage();
				break;
			case "ground_76e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_76e.jpg").getImage();
				break;
			case "ground_76w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_76w.jpg").getImage();
				break;
			case "ground_77n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_77n.jpg").getImage();
				break;
			case "ground_77s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_77s.jpg").getImage();
				break;
			case "ground_77e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_77e.jpg").getImage();
				break;
			case "ground_77w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_77w.jpg").getImage();
				break;
			case "ground_78n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_78n.jpg").getImage();
				break;
			case "ground_78s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_78s.jpg").getImage();
				break;
			case "ground_78e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_78e.jpg").getImage();
				break;
			case "ground_78w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_78w.jpg").getImage();
				break;
			case "ground_79n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_79n.jpg").getImage();
				break;
			case "ground_79s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_79s.jpg").getImage();
				break;
			case "ground_79e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_79e.jpg").getImage();
				break;
			case "ground_79w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_79w.jpg").getImage();
				break;
			case "ground_80n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_80n.jpg").getImage();
				break;
			case "ground_80ne":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_80ne.jpg").getImage();
				break;
			case "ground_80s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_80s.jpg").getImage();
				break;
			case "ground_80sw":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_80sw.jpg").getImage();
				break;
			case "ground_80e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_80e.jpg").getImage();
				break;
			case "ground_80w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_80w.jpg").getImage();
				break;
			case "ground_81n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_81n.jpg").getImage();
				break;
			case "ground_81ne":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_81ne.jpg").getImage();
				break;
			case "ground_81s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_81s.jpg").getImage();
				break;
			case "ground_81e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_81e.jpg").getImage();
				break;
			case "ground_81w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_81w.jpg").getImage();
				break;
			case "ground_82n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_82n.jpg").getImage();
				break;
			case "ground_82s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_82s.jpg").getImage();
				break;
			case "ground_82e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_82e.jpg").getImage();
				break;
			case "ground_82w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_82w.jpg").getImage();
				break;
			case "ground_83n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_83n.jpg").getImage();
				break;
			case "ground_83s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_83s.jpg").getImage();
				break;
			case "ground_83e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_83e.jpg").getImage();
				break;
			case "ground_83w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_83w.jpg").getImage();
				break;
			case "ground_84n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_84n.jpg").getImage();
				break;
			case "ground_84s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_84s.jpg").getImage();
				break;
			case "ground_84e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_84e.jpg").getImage();
				break;
			case "ground_84w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_84w.jpg").getImage();
				break;
			case "ground_85n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_85n.jpg").getImage();
				break;
			case "ground_85s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_85s.jpg").getImage();
				break;
			case "ground_85e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_85e.jpg").getImage();
				break;
			case "ground_85w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_85w.jpg").getImage();
				break;
			case "ground_86n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_86n.jpg").getImage();
				break;
			case "ground_86s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_86s.jpg").getImage();
				break;
			case "ground_86e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_86e.jpg").getImage();
				break;
			case "ground_86w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_86w.jpg").getImage();
				break;
			case "ground_87n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_87n.jpg").getImage();
				break;
			case "ground_87s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_87s.jpg").getImage();
				break;
			case "ground_87e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_87e.jpg").getImage();
				break;
			case "ground_87w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_87w.jpg").getImage();
				break;
			case "ground_88n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_88n.jpg").getImage();
				break;
			case "ground_88s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_88s.jpg").getImage();
				break;
			case "ground_88e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_88e.jpg").getImage();
				break;
			case "ground_88w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_88w.jpg").getImage();
				break;
			case "ground_89n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_89n.jpg").getImage();
				break;
			case "ground_89s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_89s.jpg").getImage();
				break;
			case "ground_89e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_89e.jpg").getImage();
				break;
			case "ground_89w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_89w.jpg").getImage();
				break;
			case "ground_90n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_90n.jpg").getImage();
				break;
			case "ground_90s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_90s.jpg").getImage();
				break;
			case "ground_90e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_90e.jpg").getImage();
				break;
			case "ground_90w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_90w.jpg").getImage();
				break;
			case "ground_91n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_91n.jpg").getImage();
				break;
			case "ground_91s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_91s.jpg").getImage();
				break;
			case "ground_91e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_91e.jpg").getImage();
				break;
			case "ground_91w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_91w.jpg").getImage();
				break;
			case "ground_92n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_92n.jpg").getImage();
				break;
			case "ground_92s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_92s.jpg").getImage();
				break;
			case "ground_92e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_92e.jpg").getImage();
				break;
			case "ground_92w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_92w.jpg").getImage();
				break;
			case "ground_93n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_93n.jpg").getImage();
				break;
			case "ground_93s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_93s.jpg").getImage();
				break;
			case "ground_93e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_93e.jpg").getImage();
				break;
			case "ground_93w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_93w.jpg").getImage();
				break;
			case "ground_94n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_94n.jpg").getImage();
				break;
			case "ground_94s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_94s.jpg").getImage();
				break;
			case "ground_94e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_94e.jpg").getImage();
				break;
			case "ground_94w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_94w.jpg").getImage();
				break;
			case "ground_95n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_95n.jpg").getImage();
				break;
			case "ground_95s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_95s.jpg").getImage();
				break;
			case "ground_95e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_95e.jpg").getImage();
				break;
			case "ground_95w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_95w.jpg").getImage();
				break;
			case "ground_96n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_96n.jpg").getImage();
				break;
			case "ground_96s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_96s.jpg").getImage();
				break;
			case "ground_96e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_96e.jpg").getImage();
				break;
			case "ground_96w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_96w.jpg").getImage();
				break;
			case "ground_97n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_97n.jpg").getImage();
				break;
			case "ground_97s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_97s.jpg").getImage();
				break;
			case "ground_97e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_97e.jpg").getImage();
				break;
			case "ground_97w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_97w.jpg").getImage();
				break;
			case "ground_98n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_98n.jpg").getImage();
				break;
			case "ground_98s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_98s.jpg").getImage();
				break;
			case "ground_98e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_98e.jpg").getImage();
				break;
			case "ground_98w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_98w.jpg").getImage();
				break;
			case "ground_99n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_99n.jpg").getImage();
				break;
			case "ground_99s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_99s.jpg").getImage();
				break;
			case "ground_99e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_99e.jpg").getImage();
				break;
			case "ground_99w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_99w.jpg").getImage();
				break;
			case "ground_100n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_100n.jpg").getImage();
				break;
			case "ground_100s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_100s.jpg").getImage();
				break;
			case "ground_100e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_100e.jpg").getImage();
				break;
			case "ground_100w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_100w.jpg").getImage();
				break;
			case "ground_101n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_101n.jpg").getImage();
				break;
			case "ground_101s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_101s.jpg").getImage();
				break;
			case "ground_101e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_101e.jpg").getImage();
				break;
			case "ground_101w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_101w.jpg").getImage();
				break;
			case "ground_102n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_102n.jpg").getImage();
				break;
			case "ground_102s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_102s.jpg").getImage();
				break;
			case "ground_102e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_102e.jpg").getImage();
				break;
			case "ground_102w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_102w.jpg").getImage();
				break;
			case "ground_103n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_103n.jpg").getImage();
				break;
			case "ground_103s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_103s.jpg").getImage();
				break;
			case "ground_103e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_103e.jpg").getImage();
				break;
			case "ground_103w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_103w.jpg").getImage();
				break;
			case "ground_104n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_104n.jpg").getImage();
				break;
			case "ground_104s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_104s.jpg").getImage();
				break;
			case "ground_104e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_104e.jpg").getImage();
				break;
			case "ground_104w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_104w.jpg").getImage();
				break;
			case "ground_105n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_105n.jpg").getImage();
				break;
			case "ground_105s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_105s.jpg").getImage();
				break;
			case "ground_105e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_105e.jpg").getImage();
				break;
			case "ground_105w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_105w.jpg").getImage();
				break;
			case "ground_106n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_106n.jpg").getImage();
				break;
			case "ground_106s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_106s.jpg").getImage();
				break;
			case "ground_106e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_106e.jpg").getImage();
				break;
			case "ground_106w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_106w.jpg").getImage();
				break;
			case "ground_107n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_107n.jpg").getImage();
				break;
			case "ground_107s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_107s.jpg").getImage();
				break;
			case "ground_107e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_107e.jpg").getImage();
				break;
			case "ground_107w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_107w.jpg").getImage();
				break;
			case "ground_108n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_108n.jpg").getImage();
				break;
			case "ground_108s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_108s.jpg").getImage();
				break;
			case "ground_108e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_108e.jpg").getImage();
				break;
			case "ground_108w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_108w.jpg").getImage();
				break;
			case "ground_109n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_109n.jpg").getImage();
				break;
			case "ground_109s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_109s.jpg").getImage();
				break;
			case "ground_109e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_109e.jpg").getImage();
				break;
			case "ground_109w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_109w.jpg").getImage();
				break;
			case "ground_110n":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_110n.jpg").getImage();
				break;
			case "ground_110s":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_110s.jpg").getImage();
				break;
			case "ground_110e":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_110e.jpg").getImage();
				break;
			case "ground_110w":
				oldPositionImage = new ImageIcon("resources/images/ground/ground_110w.jpg").getImage();
				break;
			case "tunnel_1n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1n.jpg").getImage();
				break;
			case "tunnel_1s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1s.jpg").getImage();
				break;
			case "tunnel_1e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1e.jpg").getImage();
				break;
			case "tunnel_1w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_1w.jpg").getImage();
				break;
			case "tunnel_2n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2n.jpg").getImage();
				break;
			case "tunnel_2s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2s.jpg").getImage();
				break;
			case "tunnel_2e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2e.jpg").getImage();
				break;
			case "tunnel_2w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_2w.jpg").getImage();
				break;
			case "tunnel_3n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3n.jpg").getImage();
				break;
			case "tunnel_3s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3s.jpg").getImage();
				break;
			case "tunnel_3e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3e.jpg").getImage();
				break;
			case "tunnel_3w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_3w.jpg").getImage();
				break;
			case "tunnel_4n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4n.jpg").getImage();
				break;
			case "tunnel_4s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4s.jpg").getImage();
				break;
			case "tunnel_4e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4e.jpg").getImage();
				break;
			case "tunnel_4w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_4w.jpg").getImage();
				break;
			case "tunnel_5n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5n.jpg").getImage();
				break;
			case "tunnel_5s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5s.jpg").getImage();
				break;
			case "tunnel_5e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5e.jpg").getImage();
				break;
			case "tunnel_5w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_5w.jpg").getImage();
				break;
			case "tunnel_6n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6n.jpg").getImage();
				break;
			case "tunnel_6s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6s.jpg").getImage();
				break;
			case "tunnel_6e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6e.jpg").getImage();
				break;
			case "tunnel_6w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_6w.jpg").getImage();
				break;
			case "tunnel_7n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7n.jpg").getImage();
				break;
			case "tunnel_7s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7s.jpg").getImage();
				break;
			case "tunnel_7e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7e.jpg").getImage();
				break;
			case "tunnel_7w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_7w.jpg").getImage();
				break;
			case "tunnel_8n":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8n.jpg").getImage();
				break;
			case "tunnel_8s":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8s.jpg").getImage();
				break;
			case "tunnel_8e":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8e.jpg").getImage();
				break;
			case "tunnel_8w":
				oldPositionImage = new ImageIcon("resources/images/tunnel/tunnel_8w.jpg").getImage();
				break;
			default:
				break;
		}
	}
	
	/** PAINT COMPONENT METHOD */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/** Draw black background */
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		/** Draw images (layered) */
		g.drawImage(currentPositionImage, image1X, image1Y, getWidth(), getHeight(), this);
		// g.drawImage(getImage1(), image1X, image1Y, getWidth(), getHeight(), this);
		// g.drawImage(getImage2(), image2X, image2Y, getWidth(), getHeight(), this);
		
		if (Animation.panningLeft || Animation.panningRight) {
			g.drawImage(oldPositionImage, imageOutgoing1X, imageOutgoing1Y, getWidth(), getHeight(), this);
			// g.drawImage(getOutgoingImage1(), imageOutgoing1X, imageOutgoing1Y, getWidth(), getHeight(), this);
			// g.drawImage(getOutgoingImage2(), imageOutgoing2X, imageOutgoing2Y, getWidth(), getHeight(), this);
		}		
		
		/** Draw HUD */
		if (hudVisible)
			g.drawImage(hud, 0, 0, getWidth(), getHeight(), this);
		
		if (displayingSpellBook1) {
			g.drawImage(spellBook1, 0, itemY, getWidth(), getHeight(), this);
		} else if (displayingSpellBook2) {
			g.drawImage(spellBook2, 0, itemY, getWidth(), getHeight(), this);
		}
		
		if (Data.showPosition) {
			g.setColor(new Color(222, 0, 0, 255));
			g.setFont(new Font("serif", Font.PLAIN, 111)); 
			g.drawString(Player.getPosition(), getWidth()/2, getHeight()/2);
		}
	}
	
	public void actionPerformed(ActionEvent e) {	
		Animation.animate(); 
		repaint();
	}
}