public class ShapeDrawer {
    private final ShapeFactory shapeFactory;


    public ShapeDrawer(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void drawShape(ShapeType type) {
        try{
            Shape shape = shapeFactory.getShape(type);
            shape.draw();
        }catch (IllegalAccessError ex){
            System.out.println("Fehler: ");
        }
    }
}
