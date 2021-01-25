public class Driver{
  public static void main(String[] args) {
    SuperArray array1 = new SuperArray();
    array1.add(10);
    array1.add(20);
    array1.add(30);
    array1.add(40);
    array1.add(50);
    array1.add(60);
    array1.add(70);
    array1.add(80);
    array1.add(90);
    array1.add(100);
    array1.add(110);
    System.out.println(array1.toString());
    array1.grow(1);
    System.out.println(array1.toString());
  } //end main
} //end class
