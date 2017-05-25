public class Rectangulator {
  public static void main(String[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt9args[1]);

    Rectangle myRectangle = new Rectangle(length, width);

   Sring output = String.format("***\n\nLength: %d\nwidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());


     System.out.println(output);
    }
}

