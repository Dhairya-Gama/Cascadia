import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.util.Collections;




public class BagOfAnimalTokens {
    private ArrayList<AnimalToken> tokenList;



    public BagOfAnimalTokens()
    {
        tokenList = new ArrayList<AnimalToken>();
        BufferedImage img;
        // add 20 bears
        try {
            img = ImageIO.read(BagOfAnimalTokens.class.getResource("/FinalFiles/guiImages/bearToken.png"));
        }
        catch(Exception E) {
            img = null;
            System.out.println("Bear Token: IMAGE NOT FOUND");
        }
        for (int i=0; i<20; i++) {
            tokenList.add(new AnimalToken(1,img));
        }
        // add 20 elk
        try {
            img = ImageIO.read(BagOfAnimalTokens.class.getResource("/FinalFiles/guiImages/elkToken.png"));
        }
        catch(Exception E) {
            img = null;
            System.out.println("Elk Token: IMAGE NOT FOUND");
        }
        for (int i=0; i<20; i++) {
            tokenList.add(new AnimalToken(2,img));
        }
        // add 20 salmon
        try {
            img = ImageIO.read(BagOfAnimalTokens.class.getResource("/FinalFiles/guiImages/salmonToken.png"));
        }
        catch(Exception E) {
            img = null;
            System.out.println("Salmon Token: IMAGE NOT FOUND");
        }
        for (int i=0; i<20; i++) {
            tokenList.add(new AnimalToken(3,img));
        }
        // add 20 hawks
        try {
            img = ImageIO.read(BagOfAnimalTokens.class.getResource("/FinalFiles/guiImages/hawkToken.png"));
        }
        catch(Exception E) {
            img = null;
            System.out.println("Hawk Token: IMAGE NOT FOUND");
        }
        for (int i=0; i<20; i++) {
            tokenList.add(new AnimalToken(4,img));
        }
        // add 20 foxes
        try {
            img = ImageIO.read(BagOfAnimalTokens.class.getResource("/FinalFiles/guiImages/foxToken.png"));
        }
        catch(Exception E) {
            img = null;
            System.out.println("Fox Token: IMAGE NOT FOUND");
        }
        for (int i=0; i<20; i++) {
            tokenList.add(new AnimalToken(5,img));
        }
        Collections.shuffle(tokenList);


    }
    public void addTokens(AnimalToken one) {
        tokenList.add(one);


        Collections.shuffle(tokenList);
    }


    public void addTokens(AnimalToken one, AnimalToken two, AnimalToken three) {
        tokenList.add(one);
        tokenList.add(two);
        tokenList.add(three);
        Collections.shuffle(tokenList);
    }


    public ArrayList<AnimalToken> getTokenList() {
        return tokenList;
    }


    public void addTokens(AnimalToken one, AnimalToken two, AnimalToken three, AnimalToken four) {
        tokenList.add(one);
        tokenList.add(two);
        tokenList.add(three);
        tokenList.add(four);
        Collections.shuffle(tokenList);
    }


    public ArrayList<AnimalToken> draw(int x) {
        ArrayList<AnimalToken> list = new ArrayList<AnimalToken>();
        for (int i=0; i<x; i++) {
            list.add(tokenList.remove(0));
        }
        Collections.shuffle(tokenList);
        return list;
    }


    public AnimalToken draw() {
        AnimalToken t = tokenList.remove(0);
        Collections.shuffle(tokenList);
        return t;
    }
}