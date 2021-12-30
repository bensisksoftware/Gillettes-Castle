public class Item {
	public static void playPianoWhite() {
		if (Mouse.x <= 30) Audio.startPiano(2);
		if (Mouse.x > 30 && Mouse.x <= 96) Audio.startPiano(3);
		if (Mouse.x > 96 && Mouse.x <= 170) Audio.startPiano(5);
		if (Mouse.x > 170 && Mouse.x <= 232) Audio.startPiano(7);
		if (Mouse.x > 232 && Mouse.x <= 305) Audio.startPiano(9);
		if (Mouse.x > 305 && Mouse.x <= 367) Audio.startPiano(10);
		if (Mouse.x > 367 && Mouse.x <= 437) Audio.startPiano(12);
		if (Mouse.x > 437 && Mouse.x <= 503) Audio.startPiano(14);
		if (Mouse.x > 503 && Mouse.x <= 571) Audio.startPiano(15);
		if (Mouse.x > 571 && Mouse.x <= 636) Audio.startPiano(17);
		if (Mouse.x > 636 && Mouse.x <= 702) Audio.startPiano(19);
		if (Mouse.x > 702 && Mouse.x <= 769) Audio.startPiano(21);
		if (Mouse.x > 769 && Mouse.x <= 840) Audio.startPiano(22);
		if (Mouse.x > 840 && Mouse.x <= 903) Audio.startPiano(24);
		if (Mouse.x > 903 && Mouse.x <= 966) Audio.startPiano(26);
		if (Mouse.x > 966 && Mouse.x <= 1032) Audio.startPiano(27);
		if (Mouse.x > 1032 && Mouse.x <= 1097) Audio.startPiano(29);
		if (Mouse.x > 1097 && Mouse.x <= 1159) Audio.startPiano(31);
		if (Mouse.x > 1159 && Mouse.x <= 1226) Audio.startPiano(33);
		if (Mouse.x > 1226 && Mouse.x <= 1296) Audio.startPiano(34);
		if (Mouse.x > 1296 && Mouse.x <= 1360) Audio.startPiano(36);
		if (Mouse.x > 1360 && Mouse.x <= 1425) Audio.startPiano(38);
		if (Mouse.x > 1425 && Mouse.x <= 1488) Audio.startPiano(39);
		if (Mouse.x > 1488 && Mouse.x <= 1555) Audio.startPiano(41);
		if (Mouse.x > 1555 && Mouse.x <= 1626) Audio.startPiano(43);
		if (Mouse.x > 1626 && Mouse.x <= 1689) Audio.startPiano(45);
		if (Mouse.x > 1689 && Mouse.x <= 1757) Audio.startPiano(46);
		if (Mouse.x > 1757 && Mouse.x <= 1819) Audio.startPiano(48);
		if (Mouse.x > 1819 && Mouse.x <= 1884) Audio.startPiano(50);
		if (Mouse.x > 1884 && Mouse.x <= 1920) Audio.startPiano(51);
	} 

	public static void playPianoBlack() {
		if (Mouse.x <= 80) Audio.startPiano(1);
		if (Mouse.x > 80 && Mouse.x <= 184) Audio.startPiano(4);
		if (Mouse.x > 184 && Mouse.x <= 258) Audio.startPiano(6);
		if (Mouse.x > 258 && Mouse.x <= 344) Audio.startPiano(8);
		if (Mouse.x > 344 && Mouse.x <= 438) Audio.startPiano(11);
		if (Mouse.x > 438 && Mouse.x <= 532) Audio.startPiano(13);
		if (Mouse.x > 532 && Mouse.x <= 623) Audio.startPiano(16);
		if (Mouse.x > 623 && Mouse.x <= 687) Audio.startPiano(18);
		if (Mouse.x > 687 && Mouse.x <= 780) Audio.startPiano(20);
		if (Mouse.x > 780 && Mouse.x <= 872) Audio.startPiano(23);
		if (Mouse.x > 872 && Mouse.x <= 964) Audio.startPiano(25);
		if (Mouse.x > 964 && Mouse.x <= 1049) Audio.startPiano(28);
		if (Mouse.x > 1049 && Mouse.x <= 1122) Audio.startPiano(30);
		if (Mouse.x > 1122 && Mouse.x <= 1209) Audio.startPiano(32);
		if (Mouse.x > 1209 && Mouse.x <= 1298) Audio.startPiano(35);
		if (Mouse.x > 1298 && Mouse.x <= 1391) Audio.startPiano(37);
		if (Mouse.x > 1391 && Mouse.x <= 1479) Audio.startPiano(40);
		if (Mouse.x > 1479 && Mouse.x <= 1552) Audio.startPiano(42);
		if (Mouse.x > 1552 && Mouse.x <= 1636) Audio.startPiano(44);
		if (Mouse.x > 1636 && Mouse.x <= 1727) Audio.startPiano(47);
		if (Mouse.x > 1727 && Mouse.x <= 1814) Audio.startPiano(49);
		if (Mouse.x > 1814 && Mouse.x <= 1920) Audio.startPiano(52);
	}
}