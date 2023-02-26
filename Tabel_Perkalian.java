/*
 * Made With Love By Barcodew
 * Enjoy The Code
 */
import java.util.*;

public class perkalian {
    
    public static void main(String[] args) {

        Scanner inputAngka = new Scanner(System.in);
        myMenu();
        System.out.print("Masukkan Tabel Perkalian Berapa   ");
        int perkalian = inputAngka.nextInt();
        perKalian(perkalian);
    }

      private static void myMenu(){

        System.out.println("===========TABEL PERKALIAN===========");

        }

    private static int perKalian(int perkalian2){
        System.out.println("==============");

        for (int i = 1 ; i<=10;i++){
            int hasil = i *perkalian2;

            System.out.println(" "+i+" " +"x"+" "+perkalian2+" "+"= "+hasil);
        }
        System.out.println("==============");
        return perkalian2;
    }
}
