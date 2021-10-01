package ss1_instruction_to_java.thuchanh;

import java.util.Scanner;

public class Ptbn {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                double a,b,c;

                System.out.println("a= ");
                a=sc.nextDouble();
                System.out.println("b= ");
                b=sc.nextDouble();
                System.out.println("c= ");
                c=sc.nextDouble();


                if(a!=0){
                        double answer = (c - b) /a;
                        System.out.println("pt co nghiem x = %f\n" +answer);
                }
                else{
                        if(b==c){
                                System.out.println("pt vo so nghiem");
                        }
                        else{
                                System.out.println("khong co gia tri");

                        }
                }



        }
}