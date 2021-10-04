import java.util.Scanner;

public class thietkemenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println( " menu ");
            System.out.println("1:ve hinh tam giac");
            System.out.println("2:ve hinh vuong");
            System.out.println("3:ve hinh chu nhat");
            System.out.println("4.exit");
            System.out.println("nhap lua chon cua ban: ");
            choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println(" ve hinh tam giac");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("ve hinh vuong");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");

                break;
            case 3:
                System.out.println(" ve hinh chu nhat");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                break;
            case 0:
                System.out.println("exit");
                break;
            default:
                System.out.println(" no choice");
                break;
        }
        }
    }
}
