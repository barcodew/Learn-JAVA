package TugasPraktikum_1;
import java.util.*;

import javax.management.StringValueExp;
public class TugasNomer6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Baris : ");
        int sisi = input.nextInt();
        System.out.print("Masukkan Lebar : ");
        int lebar = input.nextInt();
 //       System.out.print("Masukkan Angka Biner : ");
 //       String biner = input.next();

 //       //print Pola 001
 //       pola001(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 002
 //       pola002(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 003
 //       pola003(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       //print Pola 004
 //       pola004(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 005
 //       pola005(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 006
 //       pola006(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 007
 //       pola007(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 008
 //       pola008(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 009
 //       pola009(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 010
 //       pola010(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 011
 //       pola011(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 012
 //       pola012(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 013
 //       pola013(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 014
 //       pola014(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 015
 //       pola015(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 016
 //       pola016(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 017
 //       pola017(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 018
 //       pola018(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 019
 //       pola019(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 020
 //       pola020(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 021
 //       pola021(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 022
 //       pola022(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 023
 //       pola023(sisi);
 //       System.out.println("\n--------------------------");
 //       //print Pola 024
 //       pola024(sisi,lebar);
 //       System.out.println("\n--------------------------");
//        //print Pola 025
//        pola025(sisi,lebar);
//        System.out.println("\n--------------------------");
 //       //print Pola 026
 //       pola026(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       //print Pola 027
 //       pola027(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       System.out.println("\n--------------------------");
 //       //print Pola 028
 //       pola028(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       //print Pola 029
 //       pola029(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       //print Pola 030
 //       pola030(sisi,lebar);
 //       System.out.println("\n--------------------------");
        //print Pola 031
 //       pola031(sisi);
 //       System.out.println("\n--------------------------");
 //       pola032(sisi);
 //       System.out.println("\n--------------------------");
 //       pola033(sisi);
 //       System.out.println("\n--------------------------");
 //       pola034(biner);
 //       System.out.println("\n--------------------------");
 //       pola035(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       pola036(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       pola037(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       pola038(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       pola039(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       pola040(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       pola041(sisi);
 //       System.out.println("\n--------------------------");
 //       pola042(sisi);
 //       System.out.println("\n--------------------------");
 //       pola043(sisi);
 //       System.out.println("\n--------------------------");
 //       pola044(sisi);
 //       System.out.println("\n--------------------------");
 //       pola045(sisi);
 //       System.out.println("\n--------------------------");
 //       pola046(sisi);
 //       System.out.println("\n--------------------------");
 //       pola047(sisi);
 //       System.out.println("\n--------------------------");
 //       pola048(sisi,lebar);
 //       System.out.println("\n--------------------------");
 //       pola049(sisi,lebar);
 //       System.out.println("\n--------------------------");
        pola050(sisi);
        System.out.println("\n--------------------------");



    }

    // Pola 001
    public static void pola001(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();
        for (int i = 1 ;i<=sisi;i++){
            System.out.print(" *");
        }
    }
    // Pola 002
    public static void pola002(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();
        for (int i = 1 ;i<=sisi;i++){
            System.out.println(" *");
        }
    }
    // Pola 003
    public static void pola003(int sisi,int lebar){
        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for(int j = 1;j<=lebar;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    // Pola 004
    public static void pola004(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    // Pola 005
    public static void pola005(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =sisi;k>=i;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    // Pola 006
    public static void pola006(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =sisi;k>=i;k--){
                System.out.print("  ");
            }
            for (int k =1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    // Pola 007
    public static void pola007(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =1+1;k<=i;k++){
                System.out.print("  ");
            }
            for (int k =sisi;k>=i;k--){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
        // Pola 008
        public static void pola008(int sisi){
            System.out.println("Baris = "+sisi);
            System.out.println();
    
            for (int i = 1 ;i<=sisi;i++){
                for (int k =sisi;k>=i;k--){
                    System.out.print(" ");
                }
                for (int k =1;k<=i;k++){
                    System.out.print("* ");
                }
    
                System.out.println();
            }
        }
        // Pola 009
        public static void pola009(int sisi){
            System.out.println("Baris = "+sisi);
            System.out.println();
    
            for (int i = 1 ;i<=sisi;i++){
                for (int k =1;k<=i;k++){
                    System.out.print(" ");
                }
                for (int k =sisi;k>=i;k--){
                    System.out.print("* ");
                }
    
                System.out.println();
            }
        }
            // Pola 010
    public static void pola010(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1 ;i<=sisi;i++){
            for (int k =sisi-1;k>=i;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

     // Pola 011
     public static void pola011(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =sisi;k>=i;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 2 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    // Pola 012
    public static void pola012(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =sisi;k>=i;k--){
                System.out.print("  ");
            }
            for (int k =1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 2 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print("  ");
            }
            for (int k =sisi;k>=i;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    // Pola 013
    public static void pola013(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print("  ");
            }
            for (int k =sisi;k>=i;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 2 ;i<=sisi;i++){
            for (int k =sisi;k>=i;k--){
                System.out.print("  ");
            }
            for (int k =1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    // Pola 014
    public static void pola014(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =sisi;k>=i;k--){
                System.out.print(" ");
            }
            for (int k =1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 2 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print(" ");
            }
            for (int k =sisi;k>=i;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Pola 015
    public static void pola015(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print("  ");
            }

            System.out.println("* ");
        }
    }
    
    // Pola 016
    public static void pola016(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for (int i = 1 ;i<=sisi;i++){
            for (int k =sisi;k>=i;k--){
                System.out.print("  ");
            }

            System.out.println("* ");
        }
    }
    // Pola 017
    public static void pola017(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for(int i = 0;i<sisi;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");

            }
            if (i < sisi-1){
                System.out.print("* ");
            }
            for (int j = 0;j< (2*(sisi-i-1)-1);j++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
    // Pola 018
    public static void pola018(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();

        for(int i = 0;i<sisi;i++){
            for(int j = 0;j< (sisi-i-1);j++){
                System.out.print("  ");

            }
            System.out.print("* ");
            if (i >0){
                for (int j = 0;j< (2*(i-1)+1);j++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pola 019
    public static void pola019(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();
        // pola \/
        for(int i = 0;i<sisi;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");

            }
            if (i < sisi-1){
                System.out.print("* ");
            }
            for (int j = 0;j< (2*(sisi-i-1)-1);j++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
        // pola /\
        for(int i = 1;i<sisi;i++){
            for(int j = 0;j< (sisi-i-1);j++){
                System.out.print("  ");

            }
            System.out.print("* ");
            if (i >0){
                for (int j = 0;j< (2*(i-1)+1);j++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
  // // Pola 20
 public static void pola020(int sisi){
     System.out.println("Baris = "+sisi);
     System.out.println();
 
     for (int i = 1 ;i<=sisi;i++){
         for (int k =sisi-1;k>=i;k--){
             System.out.print("  ");
         }
         for (int k =1;k<=i;k++){
             System.out.print("* ");
         }
 
         System.out.println();
     }
     for (int i = 1 ;i<=sisi;i++){
         for (int k =sisi-1;k>=i;k--){
             System.out.print("* ");
         }
         for (int k =1;k<=i;k++){
             System.out.print("  ");
         }
 
         System.out.println();
     }
 }
   // Pola 21
 public static void pola021(int sisi){
     System.out.println("Baris = "+sisi);
     System.out.println();
 
     for (int i = 1 ;i<=sisi;i++){
         for (int k =1;k<=i;k++){
             System.out.print("* ");
         }
         for (int k =sisi-1;k>=i;k--){
             System.out.print("  ");
         }
 
         System.out.println();
     }
     for (int i = 1 ;i<=sisi;i++){
         for (int k =1;k<=i;k++){
             System.out.print("  ");
         }
         for (int k =sisi-1;k>=i;k--){
             System.out.print("* ");
         }
 
         System.out.println();
     }
 }

    // Pola 22
    public static void pola022(int sisi){
        System.out.println("Baris = "+sisi);
        System.out.println();
    
        for (int i = 1 ;i<=sisi;i++){
            for (int k =1;k<=i;k++){
                System.out.print(i+" ");
            }
            for (int k =sisi-1;k>=i;k--){
                System.out.print("  ");
            }
    
            System.out.println();
        }
    }

        // Pola 23
        public static void pola023(int sisi){
            System.out.println("Baris = "+sisi);
            System.out.println();

            for(int i = 1 ;i<=sisi;i++){
                for(int k = 1;k<=sisi;k++){
                    System.out.print("+ ");
                }
                System.out.println();
            }

    }

    // Pola 24 
    public static void pola024(int sisi,int lebar){
        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);

        for (int i = 1;i<=sisi;i++){
            for (int j = 1;j<=lebar;j++){
                System.out.print("+ ");
            }
            System.out.println();
        }

    }
    // pola 025

    public static void pola025(int sisi,int lebar){
        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);

        for (int i = 1;i<=sisi;i++){
            for (int j = 1;j<=lebar;j++){
                if((j-1) % 2==0){
                    System.out.print("+ ");
                }else{
                    System.out.print("= ");
                }
            }
            System.out.println();
        }

    }
    // pola 026

    public static void pola026(int sisi,int lebar){
        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);

        for (int i = 1;i<=sisi;i++){
            for (int j = 1;j<=lebar;j++){
                if((i-1) % 2==0){
                    System.out.print("+ ");
                }else{
                    System.out.print("= ");
                }
            }
            System.out.println();
        }

    }

    //pola 27
    public static void pola027(int sisi,int lebar){
        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);

        for (int i = 1;i<=sisi;i++){
            for(int j = 1 ;j<=lebar;j++){
                if ( ((i+j) )%2==0 ){
                    System.out.print("+ ");
                }else {
                    System.out.print("= ");
                }

            }
            System.out.println();
        }

    }

    // pola 028

    public static void pola028(int sisi,int lebar){

        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);

        for (int i = 1;i<=lebar;i++){
            // looping untuk print ++++ atas
                System.out.print("+ ");
            }
            System.out.println();
        for (int i = 1;i<sisi-1;i++){
            System.out.print("+ ");
            for (int j =1;j<lebar-1;j++){
                System.out.print("~ ");
            }
            if( lebar>1){
                System.out.print("+ ");
            }
            System.out.println();
        }
        for (int i = 1;i<=lebar;i++){
            // looping untuk print ++++ bwah
                System.out.print("+ ");
            }
            System.out.println();

    }

    // pola 029

    public static void pola029(int sisi,int lebar){
        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);
            // looping untuk print ++++ atas
            for (int k = 1;k<=lebar;k++){
                System.out.print("*");
            }
            System.out.println();
            // looping baris tengah

            for (int i = 1;i<sisi-1;i++){
                System.out.print("*");

                for (int k = 1;k<lebar-1;k++){
                    System.out.print(".");
                }

                if(lebar>1){
                    System.out.print("*");
                }
                System.out.println();
            }

            // looping untuk print ++++ bawah
            for (int k = 1;k<=lebar;k++){
                System.out.print("*");
            }
            System.out.println();
        
    }
    // pola 030

    public static void pola030(int sisi,int lebar){
        System.out.println("Baris = "+sisi);
        System.out.println("Lebar = "+lebar);
            // looping untuk print ++++ atas
            for (int k = 1;k<=lebar;k++){
                System.out.print("+");
            }
            System.out.println();
            // looping baris tengah

            for (int i = 1;i<sisi-1;i++){
                System.out.print("+");

                for (int k = 1;k<lebar-1;k++){
                    System.out.print("-");
                }

                if(lebar>1){
                    System.out.print("+");
                }
                System.out.println();
            }

            // looping untuk print ++++ bawah
            for (int k = 1;k<=lebar;k++){
                System.out.print("+");
            }
            System.out.println();
        
    }

    // pola 031

    public static void pola031(int sisi){
        System.out.print("Baris = "+sisi);
        System.out.println();

        if (sisi >0 ){
            System.out.print("+");
            for(int i = 1;i<=sisi;i++){
                System.out.print("---+");
            }
            System.out.println();
        }
        System.out.print("|");
        for(int i = 1;i<=sisi;i++){
            System.out.print("   |");
        }
        System.out.println();

        System.out.print("+");
        for(int i = 1;i<=sisi;i++){
            System.out.print("---+");
        }
    }

    // pola 32 
    public static void pola032(int sisi) {
        System.out.print("Baris = "+sisi);
        System.out.println();

        if (sisi>0){
            System.out.print("+");
            for (int i = 1;i<=sisi;i++){
                System.out.print("---+");
            }
            System.out.println();
        }

        System.out.print("|");
        for (int i = 1;i<=sisi;i++){
            System.out.print(" x |");
        }
        System.out.println();

        System.out.print("+");
        for (int i = 1;i<=sisi;i++){
            System.out.print("---+");
        }



        
    }
    // pola 33

    public static void pola033(int sisi) {
        System.out.print("Baris = "+sisi);
        System.out.println();

        if(sisi>0){

            System.out.print("+");
            for (int i = 1;i<=sisi;i++){
                System.out.print("---+");
            }
            System.out.println();
        }
        System.out.print("|");
        for (int i =1;i<=sisi;i++){
            if( (i-1) % 2 == 0){

                System.out.print(" x |");
            }else {
                System.out.print(" o |");
            }
        }
        System.out.println();

        System.out.print("+");
        for (int i = 1;i<=sisi;i++){
            System.out.print("---+");
        }
        
    }
    // pola 34

    public static void pola034(String biner) {
        System.out.print("Biner : "+ biner);
        System.out.println();

        int n = biner.length();

        if(n>0){
            System.out.print("+");
            for (int i = 0 ;i<n;i++){
                System.out.print("---+");
            }
            System.out.println();

            System.out.print("|");
            for (int i = 0;i<n;i++){
                int nilai = Integer.parseInt(String.valueOf(biner.charAt(i)));

                if(nilai == 1){
                    System.out.print(" x |");
                }else if (nilai == 0){
                    System.out.print(" o |");
                }else{
                    System.out.print("   |");
                }
            }
            System.out.println();

            System.out.print("+");
            for (int i =1;i<=n;i++){
                System.out.print("---+");
            }


        }
    }

    // pola 35

    public static void pola035(int sisi,int lebar) {
        System.out.println("Rows = "+sisi);
        System.out.println("Cols = "+lebar);
        System.out.println();
        System.out.print("+");
        for (int i = 1;i<=lebar;i++){
            System.out.print("---+");
        }
        System.out.println();
        for (int i = 1 ;i<=sisi;i++){
            System.out.print("|");
            for (int j = 1;j<=lebar;j++){
                System.out.print("   |");
            }
            System.out.println();
            System.out.print("+");
            for (int k = 1;k<=lebar;k++){
                System.out.print("---+");
            }
            System.out.println();
        }

        
    }

    // pola 36

    public static void pola036(int sisi,int lebar) {
        System.out.println("Rows = "+sisi);
        System.out.println("Cols = "+lebar);
        System.out.println();

        System.out.print("+");
        for(int i =1;i<=lebar;i++){
            System.out.print("---+");
        }
        System.out.println();

        for (int i =0;i<=sisi;i++){
            System.out.print("|");
            for(int j=1 ;j<=lebar;j++){
                System.out.print(" x |");
            }
            System.out.println();
            System.out.print("+");
            for(int k = 1;k<=lebar;k++){
                System.out.print("---+");
            }
            System.out.println();
        }
        
    }

    // pola 037

    public static void pola037(int sisi,int lebar) {

        System.out.println("Rows : "+sisi);
        System.out.println("Cols : "+lebar);
        System.out.println();

        if (sisi>0){
            System.out.print("+");
            for(int i =0;i<lebar;i++){
                System.out.print("---+");
            }
            System.out.println();

            for(int i = 0;i<sisi;i++){
                System.out.print("|");
                for(int j = 0;j<lebar;j++){
                    if(j%2==0){

                        System.out.print(" x |");
                    }else{
                        System.out.print(" o |");
                    }
                }
                System.out.println();
                System.out.print("+");
                for (int k = 0;k<lebar;k++){
                    System.out.print("---+");
                }

                System.out.println();

            }


        }
        
    }

    // pola 038

    public static void pola038(int sisi,int lebar) {
        System.out.println("Rows : "+sisi);
        System.out.println("Cols : "+lebar);
        System.out.println();

        System.out.print("+");
    for(int i = 0;i<lebar;i++){
        System.out.print("---+");
    }        
    
    for(int i=0;i<sisi;i++){
        System.out.println();

        System.out.print("|");

        for(int j = 0;j<lebar;j++){
            if(i %2 == 0){
                System.out.print(" x |");
            }else{
                System.out.print(" o |");
            }
        }
        System.out.println();
        System.out.print("+");
        for(int k =0;k<lebar;k++){
            System.out.print("---+");
        }
    }
        
        
    }

    //pola 039
    public static void pola039(int sisi,int lebar) {
        System.out.println("Rows :"+sisi);
        System.out.println("Cols :"+lebar);
        System.out.println();

        System.out.print("+");
        for (int i = 0;i<lebar;i++){
            System.out.print("---+");
        }
        System.out.println();

        for(int i = 0;i<sisi;i++){
            System.out.print("|");

            for(int j = 0;j<lebar;j++){
                if((i+j) %2 ==0){
                    System.out.print(" x |");
                }else{
                    System.out.print(" o |");
                }
            }
            System.out.println();
            System.out.print("+");
            for(int k = 0;k<lebar;k++){
                System.out.print("---+");
            }
            System.out.println();
        }

        
    }
    //pola 040
    public static void pola040(int sisi,int lebar) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Rows : "+sisi);
        System.out.println("Cols : "+lebar);

        String [] data = new String[sisi];

        for( int i = 0;i<sisi;i++){
            data[i] = input.next();
        }
        if( sisi>0 && lebar>0){
            System.out.print("+");
            for (int j = 0 ;j <lebar;j++){
                System.out.print("---+");
            }
            System.out.println();
            for (int k = 0;k<sisi;k++){
                System.out.print("|");
                for (int l = 0;l<lebar;l++){
                    String baris = String.valueOf(data[k].charAt(l));
                    int value = Integer.parseInt(baris);
                    if (value == 0){

                        System.out.print(" o |");
                    } else if (value == 1){
                        System.out.print(" x |");
                    } else {
                        System.out.print("   |");
                    }
                }
                System.out.println();
                System.out.print("+");
                for (int h = 0 ;h<lebar;h++){
                    System.out.print("---+");
                }
                System.out.println();

            }
        }
        
    }
    // pola 041

    public static void pola041(int sisi) {
        System.out.println("Baris + "+sisi);
        System.out.println();

        if (sisi > 0){

            for (int i = 0 ;i<sisi;i++){

                System.out.print("+");
                for (int j = 0 ; j<=i;j++){
                    System.out.print("---+");
                }
                System.out.println();


                System.out.print("|");
                for (int j = 0;j<=i;j++){
                    System.out.print("   |");

                }
                System.out.println();
            }
            System.out.print("+");
            for (int j = 0 ;j <sisi;j++){
                System.out.print("---+");
            }
            System.out.println();


        }
        
    }

    // pola 042
    public static void pola042(int sisi) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Rows : "+sisi);
        System.out.println();

        int [] data = new int[sisi];

        for (int i = 0 ; i<sisi;i++){
            data[i] = input.nextInt();
        }
        if (sisi>0 ){
            int max = 0 ;
            for (int i = 0;i<sisi;i++){
                int panjang = data[i];

                max = Math.max(max, panjang);

                // polla +---+
                System.out.print("+");
                if( panjang > 0){
                    for (int j =0 ;j<max;j++){
                        System.out.print("---+");
                    }
                }
                System.out.println();

                // pola |   |

                System.out.print("|");
                if (panjang>0){
                    for(int j = 0 ;j<panjang;j++){
                        System.out.print("   |");
                    }
                }
                System.out.println();

            }

            System.out.print("+");
            for (int j = 0;j<max;j++){
                System.out.print("---+");
            }
            System.out.println();
        }        
    }
    // pola 43 
    public static void pola043(int sisi) {
        System.out.println("Baris :"+sisi);
        System.out.println();

        System.out.print("+");
        for (int j = 0;j<sisi;j++){
            System.out.print("---+");
        }
        for (int i = 0;i<sisi;i++){
            System.out.println();
            System.out.print("|");
            for (int j = 0; j<(sisi-i);j++){
                System.out.print("   |");
            }
            System.out.println();
            System.out.print("+");
            for (int j = 0;j<(sisi-i);j++){
                System.out.print("---+");
            }
        }
        
    }
    // Pola 44 
    public static void pola044(int sisi) {
        System.out.println("Rows    :"+ sisi);
        System.out.println();

        if(sisi > 0){

            for (int i = 0 ; i<sisi;i++){

                // pola space
                for (int j = 0 ;j <(sisi-i -1);j++){
                    System.out.print("    ");
                }
                // pola +---+
                System.out.print("+");
                for (int j = 0 ; j <= i;j++){
                    System.out.print("---+");
                }
                System.out.println();
                // pola space
                for (int j = 0 ;j <(sisi-i -1);j++){
                    System.out.print("    ");
                }
                // pola |   |
                System.out.print("|");
                for (int j = 0 ; j <= i;j++){
                    System.out.print("   |");
                }
                System.out.println();


            }
            System.out.print("+");
            for (int j = 0 ; j<sisi;j++){
                System.out.print("---+");
            }
            System.out.println();


        }
    }

    // pola 45
    public static void pola045(int sisi) {
        System.out.print("Rows  :"+sisi);
        System.out.println();

        System.out.print("+");
        for (int j = 0 ;j<sisi;j++){
            System.out.print("---+");
        }
        System.out.println();

        for (int i = 0 ; i<sisi;i++){

            for( int j = 0 ;j<i;j++){
                System.out.print("    ");
            }
            System.out.print("|");
            for (int j = 0 ;j<(sisi-i);j++){
                System.out.print("   |");
            }
            System.out.println();
            for (int j = 0 ; j<i;j++){
                System.out.print("    ");
            }
            System.out.print("+");
            for (int j = 0 ;j <(sisi-i);j++){
                System.out.print("---+");
            }
            System.out.println();


        }
        
    }

    // pola 46

    public static void pola046(int sisi) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Rows    :");
        System.out.println();
        String[] data = new String[sisi];
        for (int i = 0;i<sisi;i++){
            data[i] = input.next();
        } 
        if( sisi>0){
            int max = 0;

            for (int i = 0;i<sisi;i++){
                int panjang = data[i].length();
                max = Math.max(max, panjang);

                System.out.print("+");
                if (panjang>0){
                    for (int j = 0 ; j<max;j++){
                        System.out.print("---+");
                    }
                    System.out.println();
                    // pola | |
                    System.out.print("|");
                    if(panjang>0){
                        for (int j = 0;j<panjang;j++){
                            char cj = data[i].charAt(j);
                            String sj = String.valueOf(cj);
                            int value = Integer.parseInt(sj);
                            if (value == 0 ){
                                System.out.print(" o |");
                            }else if ( value == 1){
                                System.out.print(" x |");
                            } else{
                                System.out.print("   |");
                            }


                        }

                    }
                    System.out.println();
                    max = panjang;
                }  
            }
            System.out.print("+");
            for( int j = 0; j<max;j++){
                System.out.print("---+");
            }
            System.out.println();



        }
        
    }

    // Pola 47

    public static void pola047(int sisi) {
        System.out.println("Rows    :"+sisi);
        System.out.println();
        System.out.print("+");
        if (sisi>0){

            for (int i =0 ;i<sisi;i++){
            System.out.print("---+");
            }
            System.out.println();
            for (int i = 0 ;i<sisi;i++){
                System.out.print("|");
                for (int j = 0 ; j<sisi-1;j++){
                    System.out.print("    ");
                }
                System.out.println("   |");
                // pola +   +
                if (i <sisi -1 ){
                    System.out.print("+");
                    for (int j =0;j<sisi-1;j++){
                        System.out.print("    ");
                    }
                    System.out.println("   +");
                }
            }
            System.out.print("+");
            for (int j = 0 ;j<sisi;j++){
                System.out.print("---+");
            }
            System.out.println();
        }
        
    }

    // pola 48

    public static void pola048(int sisi , int lebar) {
        System.out.println("Rows    : "+sisi);
        System.out.println("Cols    : "+lebar);
        System.out.println();

        if(sisi>0){
            System.out.print("+");
            for (int i = 0;i<lebar;i++){
                System.out.print("---+");
            }
            System.out.println();
            for(int i = 0;i<sisi;i++){
                System.out.print("|");
                for (int j = 0 ;j<lebar-1;j++){
                    System.out.print("    ");
                }
                System.out.println("   |");

                if( i<lebar -1){
                    System.out.print("+");
                    for(int j = 0 ;j<lebar-1;j++){
                        System.out.print("    ");
                    }
                    System.out.println("   +");
                }
            }
            System.out.print("+");
            for (int j = 0;j<lebar;j++){
                System.out.print("---+");
            }
            System.out.println();



        }
        
    }

    // pola 49

    public static void pola049(int sisi,int lebar) {
        System.out.println("Rows    : "+sisi);
        System.out.println("Cols    : "+lebar);
        System.out.println();

        if( sisi >0 && lebar>0){
            for (int i = 0 ; i<sisi;i++){
                for(int j = 0 ; j<lebar;j++){
                    System.out.print("/\\");
                }
                System.out.println();
                for(int j = 0;j<lebar;j++){
                    System.out.print("\\/");
                }
                System.out.println();
            }

        }
        
    }

    // pola 50 

    public static void pola050(int sisi) {
        System.out.println("Rows    : "+sisi);

        for(int i = 0 ;i<sisi;i++){
            for (int j = 0;j<sisi-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("/");

            for (int j = 0 ;j<2*i;j++){
                System.out.print(" ");

            }
            System.out.println("\\");

        }

        for (int i = 0;i<sisi;i++){
            for (int j =0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("\\");

            for (int j = 0 ;j< 2*(sisi-i-1);j++){
                System.out.print(" ");
            }
            System.out.println("/");
        }
        
    }
    
}











