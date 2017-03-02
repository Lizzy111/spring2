package com.gmail.lizaiatsenko;

/**
 * Created by liza on 01/03/2017.
 */
public class Volonteer implements Thinker {
    String thoughts;
    private String name;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts= thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
