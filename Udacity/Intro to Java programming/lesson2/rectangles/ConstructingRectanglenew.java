// BlueJ project: lesson2/touchingRectangles
//
// You need to construct and draw two rectangles for this quiz.
//
// Both rectangles have width 20 and height 30. The first rectangle
// has top left corner at (60, 90). The bottom right corner of the 
// first rectangle should be the top left corner of the second 
// rectangle. 
public class ConstructingRectanglenew
{
    public static void main(String[] args)
    {
    Rectangle rec1 = new Rectangle(20,70,40,30);
    Rectangle rec2 = new Rectangle(60,70,40,30);
    Rectangle rec3 = new Rectangle(100,70,40,30);
    Rectangle rec4 = new Rectangle(40,40,40,30);
    Rectangle rec5 = new Rectangle(80,40,40,30);
    Rectangle rec6 = new Rectangle(60,10,40,30);
    rec1.draw(); rec2.draw(); rec3.draw(); rec4.draw(); rec5.draw(); rec6.draw();
    }
}