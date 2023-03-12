package learning;
/*
 * Made With Love By Barcodew ^__^
 */
import java.util.*;
public class latihan001 {
    public static void main(String[] args) {

        int [][] data_array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] data_array2 = {
            {11,22,33},
            {44,55,66},
            {77,88,99}
        };

        printDATA(data_array);
        System.out.println();
        printDATA(data_array2);
        System.out.println();
        System.out.println();

        
        int[][] jumlah = jumlah(data_array, data_array2);
        int[][] perkalian = perkalian(data_array, data_array2);
        printDATA(jumlah);
        System.out.println();
        printDATA(perkalian);


        
    }
    private static void printDATA(int[][] data1){
        int baris = data1.length;
        int kolom = data1[0].length;
        
        for (int i = 0 ;i<baris;i++){
            System.out.print("[");
            for (int j =0 ;j<kolom;j++){
                System.out.print(data1[i][j]);
                if(j<kolom -1){
                    System.out.print(",");
                }else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
    }

    private static int [][] jumlah(int [][]data1,int[][] data2){
        int baris = data1.length;
        int kolom = data1[0].length;

        int[][] hasil = new int [baris][kolom];
        for (int i = 0;i<baris;i++){
            for(int j = 0;j<kolom;j++){
                hasil[i][j] = data1[i][j]+data2[i][j];
            }
            
            
        }
        return hasil;


 
    }
    private static int [][] perkalian(int [][]data1,int[][] data2){
        int baris = data1.length;
        int kolom = data1[0].length;

        int[][] hasil = new int [baris][kolom];
        for (int i = 0;i<baris;i++){
            for(int j = 0;j<kolom;j++){
                hasil[i][j] = data1[i][j]*data2[i][j];
            }
            
            
        }
        return hasil;


 
    }

    
}
