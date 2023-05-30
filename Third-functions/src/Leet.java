import java.util.Arrays;

public class Leet {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = new int[nums.length*2];
        int n = 0;
        int i = 0;

        while( i <= ans.length -1){
            if(i == nums.length) {n = 0;}
                ans[i] = nums[n];
                n++;
                i++;
        }
        System.out.print(Arrays.toString(ans));
    }
}

// for(int n = nums.length;n < ans.length; n++ ){
//                     ans[n] = nums[x];
//                     x++;
//                }