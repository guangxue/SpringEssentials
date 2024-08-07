package WithArgs.StaticFactoryMethod;

public class Shape{
   private String shapeName;

   private Shape(String shapeName) {
       this.shapeName = shapeName;
   }
   public static Shape createShape(String shapeName){
       return new Shape(shapeName);
   }
   public void getShapeName() {
       System.out.println(STR."Shape: \{shapeName}");
   }
}
