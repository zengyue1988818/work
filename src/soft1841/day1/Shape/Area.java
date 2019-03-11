package soft1841.day1.Shape;
/**
 *zengyue 19.03.10
 */
public class Area {
    public static void main(String[] args) {
        Shape shape = new Circular();
        shape.radius = 5;
        shape.area();
        shape = new Rectangle();
        shape = new Rectangle();
        shape.high = 4;
        shape.width = 5;
        shape.area();
    }
}
