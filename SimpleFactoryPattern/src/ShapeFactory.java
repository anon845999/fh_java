
public class ShapeFactory {

    public Shape getShape(ShapeType shapeName) {
        if(shapeName == null) {
            return null;
        }

        switch (shapeName) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                    return new Rectangle();
            case SQUARE:
                        return new Square();
                        default:
                            throw new IllegalArgumentException("Invalid shape name: " + shapeName);

        }
    }
}
