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
public class DrawWithIOC {
    
    private Shape shape;
    
    public DrawWithIOC(Shape shape){
        this.shape = shape;
    }
    
    public void draw(){
        this.shape.draw();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape = new Rectangle();
        DrawWithIOC drawWithIOC = new DrawWithIOC(shape);
        drawWithIOC.draw();
    }
}