import java.util.Scanner;

public class tienlaichovay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate= 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter investment money: ");
        money = sc.nextDouble();
        System.out.println(" enter number of month: ");
        month=sc.nextInt();
        System.out.println(" enter annual interest rate in percentage: ");
        double totalInterest = 0;
        for (int i = 0; i < month; i ++){
            totalInterest = totalInterest + money*(interestRate/100) / 12 * month;
            System.out.println("total of interest" + totalInterest);
        }
    }
}
