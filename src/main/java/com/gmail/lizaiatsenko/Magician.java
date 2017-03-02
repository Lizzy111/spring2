package com.gmail.lizaiatsenko;

/**
 * Created by liza on 01/03/2017.
 */
public class Magician implements MindReader {
String thoughts;

    @Override
    public void intersepthoughts(String thoughts) {
        System.out.println("intersepting thoughts....");
        this.thoughts=thoughts;
    }

    @Override
    public String getToughts() {
        return thoughts;
    }
}
