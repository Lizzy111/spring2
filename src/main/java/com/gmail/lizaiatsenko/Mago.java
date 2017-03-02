package com.gmail.lizaiatsenko;

/**
 * Created by liza on 01/03/2017.
 */
public class Mago implements Performer {
    private String magicWords;
    private MagicBox magicBox;

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    @Override
    public void perform() {
        System.out.println(magicWords);
        System.out.println(magicBox.getContents());
    }
}
