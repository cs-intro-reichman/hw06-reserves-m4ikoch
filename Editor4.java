import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image, and the number of morphing steps (an int).
 * The editor will morph the given image to its grey scale version in the given
 * number of steps. 
 * 
 **/

public class Editor4 {
    
    public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] image = Runigram.read(source);
        Color[][] gsImage = Runigram.grayScaled(image);
		Runigram.setCanvas(image);
		Runigram.morph(image, gsImage, n);
	}
}