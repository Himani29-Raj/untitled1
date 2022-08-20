package Dumps;

public class floats {
    static void doubling(Integer ref,int pv){
        ref = 20;
        pv = 20;
    }
    public static void main(String[] args) {
//        float var1 = (12_345.01 >= 123_45.00)?12_456:124_56.02f;
//        float var2 = var1 +1024;
//        System.out.println(var2);
//        StringBuilder sb1 = new StringBuilder("Duke");
//        String str1 = sb1.toString();
//        String str2 = str1;
//        System.out.println(str1 == str2);

//        int row = 10;
//        for (;row>0;){
//            int col = row;
//            while (col >= 0){
//                System.out.println(col + " ");
//                col -= 2;
//            }
//            row = row / col;
//        }
        Integer iObj = new Integer(10);
        int iVar = 10;
        doubling(iObj++,iVar++);
        System.out.println(iObj+ ", "+iVar);
    }
}
