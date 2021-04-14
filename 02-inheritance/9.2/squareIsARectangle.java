class Rectangle
{
    private int length;
    private int width;

    public Rectangle()
    {
       this.length = 1;
       this.width = 1;
    }

    public Rectangle(int l, int w)
    {
       this.length = l;
       this.width = w;
    }

    public void draw()
    {
      for(int i=0; i < length; i++)
      {
         for(int j=0; j < width; j++)
             System.out.print("* ");
          System.out.println();
      }
      System.out.println();
    }
    public int area(){
      return this.length * this.width;
    }


}

// 1. Make the class square inherit from Rectangle
class Square extends Rectangle
{
     // 2. Add a Square no-argument constructor
     public Square(){
       super();
     }

     // 3. Add a Square constructor with 1 argument for a side
     public Square(int l){
       super(l, l);
     }

}
class LongRectangle extends Rectangle{
  public LongRectangle(){
    super(2, 1);
  }
  public LongRectangle(int l){
    super(2*l, l)
  }
}

public class squareIsARectangle{
  public static void main(String[] args)
  {
     Rectangle r = new Rectangle(3,5);
     r.draw();
     // Uncomment these to test
     Square s1 = new Square();
     s1.draw();
     Square s = new Square(3);
     s.draw();
     LongRectangle l = new LongRectangle();
     l.draw();
  }
}
