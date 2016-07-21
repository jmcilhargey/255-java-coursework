// Assignment 8
// Joe McIlhargey
// ComSc-255

public class SiblingExt extends Sibling {
	
	private int height;
	
	public SiblingExt(String n, int a, int w, int h) {
		super (n, a, w);
		height = h;
	}
	public int getHeight() {
		return height;
	}
}
