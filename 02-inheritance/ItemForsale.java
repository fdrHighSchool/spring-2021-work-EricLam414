import java.util.*;

class ItemForSale
{
  private double price;
  private double salePercent;
  private int stock;

}

class Movie extends ItemForSale
{
  private String name;

}

class Book extends ItemForSale
{
  private String Name;

}
class Author extends Book
{
  private String AuthorName;
  private int age;


}

public class Main
{
     // instance variable (could be an array or ArrayList of one of the classes above)
     private ArrayList<ItemForSale> store;

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book();
        System.out.println(b instanceof ItemForSale);
     }
}
