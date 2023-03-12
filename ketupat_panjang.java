
public class ketupad {
    public static void main(String[] args) {
        
        for (int i=1;i<=10;i++){
            for(int j=9;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2;i<=10;i++){
            for(int j = 1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=9;k>=i-1;k--){
                System.out.print("*");
            }
            for (int l=9;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
