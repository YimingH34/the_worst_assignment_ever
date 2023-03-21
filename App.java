import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
  public static void main(String[] args) throws Exception  
  {  
  //parsing a CSV file into Scanner class constructor  
  Scanner sc = new Scanner(new File("C:\\Users\\s448048\\Desktop\\Java g12\\g12\\test\\src\\V.csv"));  
  sc.useDelimiter(",");   //sets the delimiter pattern  
  while (sc.hasNext())  //returns a boolean value  
  {  
  System.out.print(sc.next());  //find and returns the next complete token from this scanner  
  }   
  sc.close();  //closes the scanner  
  }  
    }


//google about LocalDate
//date formater

