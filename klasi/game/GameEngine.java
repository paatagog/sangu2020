package klasi.game;

import klasi.game.gameEngine.Shape;

/**
 * ეს კლასი განკუთვნილია თამაშების ბირთვის დასაწერად.
 * შეიცავს სასარგებლო გეომეტრიულ ფუნქციებს სხვადასხვა ფორმის
 * ობიექტების მართვისთვის და დასახატად.
 */
public class GameEngine {

    public void draw(Shape shape, double x, double y) {
        shape.draw(x, y);
    }

    public void delete(Shape shape) {
        shape.delete();
    }

    public void move(Shape shape, double ax, double ay, double bx, double by) throws InterruptedException {
        double px = ax;
        double py = bx;
        shape.delete();
        while ((Math.abs(px - ax) + Math.abs(px - bx) <= Math.abs(ax - bx)) &&
                (Math.abs(py - ay) + Math.abs(py - by) <= Math.abs(ay - by))) {
            shape.draw(px, py);
            Thread.sleep(100);
            shape.delete();
            px += Math.signum(bx - ax);
            py += Math.signum(by - ay);
        }
        shape.draw(bx, by);
    }

}
