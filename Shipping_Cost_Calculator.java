//Shopping Cost Calculator
import java.util.Scanner;
public class ShoppingCalvulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the package weight in kilograms:");
        float weigth = sc.nextFloat();
        System.out.println("Enter the shipping rate per kilogram: ");
        float rate = sc.nextFloat();
        float shopping_cost = weigth*rate;
        System.out.printf("Shopping Cost: %.2f",shopping_cost);
    }
}
  
