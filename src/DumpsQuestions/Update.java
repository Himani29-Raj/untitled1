package DumpsQuestions;

public class Update {
    private static void update(int[] nums,int index){
        index++;
        nums[index] = 14;
    }

    public static void main(String[] args) {
        int index = 2;
        int[]  nums = {1,3,5,7};
        update(nums,index);
        for (int n: nums){
            System.out.print(n + ", ");
        }
        System.out.println(index);
    }
}
interface AB{
    //private float getArea(Boolean[] ba);
    public void main(String[] wow);
  //  public static void main(String[] args);
    boolean setFlag(Boolean[] test);
}