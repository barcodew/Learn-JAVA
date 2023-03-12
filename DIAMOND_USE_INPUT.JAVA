package learning;
import java.util.*;

public class latihan004 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Segitiga : ");
        int angka = input.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= angka; i++){
            for(int j =angka-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int k =2;k<=i;k++){
                System.out.print("* ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
            
            for (int i = 1; i <= angka; i++){
                for(int j =1;j<=i;j++){
                    System.out.print("  ");
                }
                for(int k =angka-2;k>=i;k--){
                    System.out.print("* ");
                }
                for(int k =angka-1;k>=i;k--){
                    System.out.print("* ");
                }
                System.out.println();
        }
    
}
}
