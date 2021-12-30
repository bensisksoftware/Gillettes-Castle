import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gil extends JFrame {
	public static int frameWidth;
	public static int frameHeight;
	
	ImagePanel imagePanel = new ImagePanel();
	
	public Gil() {	
		add(imagePanel);
		
		// Set Starting Location
		// Player.setPosition("entry_1s"; 
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {	
				Mouse.setX(e.getX());
				Mouse.setY(e.getY());
				
				// dev print coords
				if (Data.button2Pushed) {
					PrintCoords.print(Data.xCoord, Mouse.x, Data.yCoord, Mouse.y);
					Data.button2Pushed = false;
				}
			}
			
			@Override	
			public void mouseEntered(MouseEvent e) {
				// Nada
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Mouse.clicks += 1;
				Mouse.setX(e.getX());
				Mouse.setY(e.getY());
				
				if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK && !Player.getBusy()) {
					Mouse.processAction("mouse");
				}
				
				if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
					Data.button2Pushed = true;
					Data.setCoords();
				}
				
				if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK && !Player.getBusy()) {
					WalkBack.walk();
				}
			}
		});
		
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Mouse.setX(e.getX());
				Mouse.setY(e.getY());
				
				Mouse.checkHUD(); 
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				Mouse.setX(e.getX());
				Mouse.setY(e.getY());
				
				Mouse.checkHUD();
			}
		});
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				// ESC		
				if (k.getKeyCode() == KeyEvent.VK_ESCAPE) {
					Data.printLast();
					System.exit(0);
				}
				
				if (k.getKeyChar() == 'c') {
					Data.cheat();
				}
				
				if (k.getKeyChar() == 'f') {
					PrintFix.print();
				}
				
				if (k.getKeyChar() == 'x') {
					if (Data.showPosition) {
						Data.showPosition = false;
					} else {
						Data.showPosition = true;
					}
				}
				
				// Arrow controls
				if (k.getKeyCode() == KeyEvent.VK_UP || k.getKeyCode() == KeyEvent.VK_DOWN || k.getKeyCode() == KeyEvent.VK_LEFT || k.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (!Player.getBusy()) {
						switch(k.getKeyCode()) { 
							case KeyEvent.VK_UP:
								Mouse.processAction("center");
								break;
							case KeyEvent.VK_DOWN:
								WalkBack.walk();
								break;
							case KeyEvent.VK_LEFT:
								Mouse.processAction("left");
								break;
							case KeyEvent.VK_RIGHT :
								Mouse.processAction("right");
								break;
							default:
								System.out.println("Gil arrow control error");
								break;
						 }
					}
				}
			}
		});
	}
	
	public static void main(String[] args) {
		Data.askForStartingPoint();
		JFrame frame = new Gil();
		
		frame.setTitle("Gillette's Castle");
		frame.setUndecorated(true);
		// frame.setSize(544, 416);
		// frame.setSize(1080, 720); // 3:2 Microsoft Surface
		// frame.setSize(1280, 549); // 21:9 Niki
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.toFront();
		frame.requestFocus();

		frameWidth = frame.getWidth();
		frameHeight = frame.getHeight();
		
		Data.setDimensions();
		// System.out.println(frameWidth + " " + frameHeight);
		
		Audio.loadAudio();
		
	}
}