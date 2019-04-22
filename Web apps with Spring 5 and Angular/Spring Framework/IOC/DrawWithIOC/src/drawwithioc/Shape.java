/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawwithioc;

/**
 *
 * @author gab12
 */

class UndefinedShapeException extends Exception{}

public class Shape {    
    
    public void draw(){}
    
    public void draw(String shapeType) throws UndefinedShapeException{
    if(shapeType.equals("rectangle")) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    } else if(shapeType.equals("square")) {
        Square square = new Square();
        square.draw();
    } else {
        String shapeNotSupportedMessage = "Shape " + shapeType 
                + "not supported";
        throw new UndefinedShapeException();
        }
    }
}