package ss1_instruction_to_java.thuchanh;
import java.util.Scanner;
public class Tinhcannang {
    public static void main(String[] args) {
        double height,weight,bmi;
        Scanner sc=new Scanner(System.in);
        System.out.println("your height : ");
        height=sc.nextDouble();
        System.out.println("your weight : ");
        weight=sc.nextDouble();
        bmi=weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18 )
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "obese");

    }
}
