import java.util.*;

public class truck extends car
{
    double weight;
    truck()
    {
        super();
        System.out.println("Enter weight");
        Scanner sc = new Scanner(System.in);
        weight=sc.nextDouble();
    }

    double getSalePrice()
    {
        double salePrice = super.getSalePrice();
        if(weight>2300)
        salePrice=salePrice*0.9;
        else
        salePrice=salePrice*0.8;

        System.out.println("Modified Price="+salePrice);
        return salePrice;
    }

    public static void main(String[] args)
    {
        truck ob = new truck();
        ob.getSalePrice();
    }

    
}
