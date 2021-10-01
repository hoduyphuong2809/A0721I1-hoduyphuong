package ss1_instruction_to_java.baitap;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        double usd;
        double vnd=23000;
        Scanner sc= new Scanner(System.in);
        System.out.println("so tien usd: " );
        usd=sc.nextDouble();
        double quydoi= usd * 23000;
        System.out.println("So tien viet la: " + quydoi);

    }
}
