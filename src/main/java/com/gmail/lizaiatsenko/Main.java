package com.gmail.lizaiatsenko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liza on 25/02/2017.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        Performer mag= (Performer) context.getBean("mag");
        mag.perform();

        Knight knight= (Knight) context.getBean("knight");
        knight.embarkOnQuest();

//        Volonteer volonteer= (Volonteer) context.getBean("volonteer");
//        volonteer.thinkOfSomething("i think about money");
//        Magician magician= (Magician) context.getBean("magician");
//        System.out.println("magician say"+ magician.getToughts());
    }
}
