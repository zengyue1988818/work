package soft1841.day36;

public class ShapeFactory {
    public static Shape getCircleInstance(){
        return new Circle();
    }
    public static Shape getRectangleInstance(){
        return  new Rectangle();
    }
}
