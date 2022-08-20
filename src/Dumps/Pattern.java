package Dumps;

public class Pattern {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(128);
        int j = 0,k = 0;
        int x=2,y=3,z=4;
        for(int i= 0; i < x; i++){
            do {
                k = 0;
                while (k < z){
                    System.out.print(k + " ");
                }
                System.out.print(" ");
                j++;
            }while (j<y);
            System.out.print("---");
        }
    }
}
