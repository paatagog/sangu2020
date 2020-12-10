package klasi.game;

import klasi.game.gameEngine.Circle;
import klasi.game.gameEngine.Ellipse;
import klasi.game.gameEngine.Shape;

/**
 * ეს კლასი GameEngine-ს გამოსაცდელად არის განკუთვნილი.
 */
public class GameEnginePlayGround {
    public static void main(String[] args) {
        // შევქმენით GameEngine-ის ტიპის ობიექტი
        GameEngine gameEngine = new GameEngine();

        // შევქმნათ ფიგურა
        Shape shape = new Shape();
        gameEngine.draw(shape, 12, 45);

        // შევქმნათ წრეწირი და ელიფსი
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();

        // დავხატოთ წერწირი და ელიფსი
        gameEngine.draw(circle, -98.12, 111.3);
        gameEngine.draw(ellipse, 45.32, 34.6);

        // მშობელი ტიპის ობიექტს შეიძლება შვილობილი ტიპის ობიექტი მივანიჭოთ
        shape = circle;
        gameEngine.draw(shape, 643, 31);

    }
}
