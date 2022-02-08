package Week4;
import java.util.*;

public class BMIcalc {
    
public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        Double weight = input.nextDouble() * 0.45359237;

        System.out.print("Enter height in inches: ");
        Double height = input.nextDouble() * 0.0254;

        input.close();


        BMI newBMI = new BMI(height, weight);
        
        System.out.println("BMI is " + newBMI.calculateBMI());
        System.out.println(newBMI.checkBMI());

    }
}
