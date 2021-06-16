import java.util.*;

public class car
{
    double speed, regularPrice;
    String color;
    

    car()
    {
        speed=0.0;
        regularPrice=0.0;
        color=" ";
    }
    double getSalePrice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed, regular price, color");
        speed =sc.nextDouble();
        regularPrice=sc.nextDouble();
        color= sc.next();
        System.out.println("Speed: "+ speed+"\nregular price: "+ regularPrice+ "\ncolor: "+color);
        return regularPrice;
    }
    
}
