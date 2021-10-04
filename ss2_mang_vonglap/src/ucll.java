import java.util.Scanner;

public class ucll {
    public static void main(String[] args) {
        int a,b;
        Scanner input= new Scanner(System.in);
        System.out.println("nhap a : ");
        a=input.nextInt();
        System.out.println("nhap b: ");
        b= input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0){
            System.out.println(" k co uoc chung lon nhat");
        }
        while (a!=b){
            if( a > b){
                a= a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println(" uoc chung lon nhat cua a va b la : " + a);
    }
}
