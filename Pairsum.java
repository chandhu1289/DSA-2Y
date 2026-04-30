public class Pairsum{
    static boolean pairExists(int [] arr, int target){
        int left =0;
        int right=arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum==target)
                return true;

            else if (sum<target)
                left++;

            else
                right--;

            }
            return false;
            }
            public static void main(String[] args) {
                int[] arr ={1,2,3,4,5,6,7,8,9};
                int target =15;

                System.out.println(pairExists(arr, target)?
                "pair Exists":"No pair");
        }
    }