package ss1_instruction_to_java.thuchanh;

import java.util.Scanner;

public class Tinhsongaytrongthang {
    public static void main(String[] args) {
        int month;
        String dayIsMonth;
        Scanner sc=new Scanner(System.in);
        System.out.printf("which that you want to count days?");
         month=sc.nextInt();
        switch (month){
            case 2:
                dayIsMonth="28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth="30";
                break;
            default:
                dayIsMonth="";


        }
        if(!dayIsMonth.equals(""))
            System.out.println("Thang la: " + month + " Ngay: " + dayIsMonth);
        else
            System.out.println("invalid '%d' %s  input");


        }
    }
