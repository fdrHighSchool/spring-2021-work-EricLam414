public class Driver{
  public static void main(String[] args) {
    SuperArray array1 = new SuperArray();
    System.out.println(array1.isEmpty());
    for(int i = 10; i <= 110; i += 10){
      array1.add(i);
    }
    System.out.println(array1.toString());
    System.out.println(array1.isEmpty());
    array1.set(4,5);
    array1.grow(1);
    System.out.println(array1.toString());
    array1.remove(2);
    System.out.println(array1.toString());
    array1.add(2,300);
    System.out.println(array1.toString());
  } //end main
} //end class
