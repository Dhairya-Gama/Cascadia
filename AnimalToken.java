import java.awt.*;
import java.awt.image.BufferedImage;
public class AnimalToken {
    private int animalType;
    /*
     * 1: bear
     * 2: elk
     * 3: salmon
     * 4: hawks
     * 5: fox

     */
    private BufferedImage image;
    private boolean scored;


    public AnimalToken(int type, BufferedImage img) {
        animalType = type;
        image = img;
        scored = false;
    }


    public AnimalToken(int type) {
        animalType = type;
        image = null;
        scored = false;
    }


    public int getAnimalType() {
        return animalType;
    }


    public BufferedImage getImage() {
        return image;
    }


    public void setImage(BufferedImage x) {
        image = x;
    }


    public void setScored(Boolean c) {
        scored = c;
    }


    public boolean getScored() {
        return scored;
    }


    public void paint (Graphics g, int x, int y, int width, int height) {
        g.drawImage(this.image, x, y, width, height, null);
    }
}