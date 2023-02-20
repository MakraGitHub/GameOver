package com.makara.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApplication {

    public static void main(String[] args) {

//        ZoomBieGame game = new ZoomBieGame();
//        //MarioGame game = new MarioGame();
//        GameRunner gameRunner = new GameRunner ((Game) game);
        // ZoomebieGame game = new ZoomebieGame();

        // MarioGame game = new MarioGame();
        // GameRunner gameRunner = new GameRunner(game);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        GameRunner gameRunner = context.getBean(GameRunner.class);

//        gameRunner.moveUp();
//        gameRunner.moveDown();
        gameRunner.moveLeft();
        gameRunner.moveRight();


        //JPanel jp = new JPanel();

    }
}