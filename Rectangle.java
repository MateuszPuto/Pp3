
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
   float firstSideLength;
   float secondSideLength;
   
   public void showDimension(){
        System.out.println("Dimensions: " + firstSideLength + "x" + secondSideLength);
    }

   public void showPerimeter(){
        float perimeter = 2 * firstSideLength + 2 * secondSideLength;
        System.out.println("Perimeter: " + perimeter);
    }
    
   public void showArea(){
        float area = firstSideLength * secondSideLength;
        System.out.println("Surface area: " + area);
    }
}
