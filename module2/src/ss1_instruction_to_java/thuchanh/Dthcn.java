package ss1_instruction_to_java.thuchanh;

import java.util.Scanner;

public class Dthcn {
    public static void main(String[] args) {
        float width;
        float height;
        float area;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        width = Scanner.nextFloat();
        System.out.println("nhap chieu rong: ");
        height = Scanner.nextFloat();
        area= width * height;
        System.out.println("area =" + area);

    }
}
