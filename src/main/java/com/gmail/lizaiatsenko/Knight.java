package com.gmail.lizaiatsenko;

/**
 * Created by liza on 24/02/2017.
 */
public class Knight {
    Quest quest;
    private String name;

    public Knight(Quest quest){
        this.quest= quest;
    }

    public Knight() {
    }

    public void embarkOnQuest(){
        quest.embark();
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
