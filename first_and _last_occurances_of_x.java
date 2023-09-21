import java.util.*;
class Solution1 {
    public static ArrayList<Integer> binary_search(int arr[],int n,int x){
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                int left = mid;
                int right = mid;
                while(left>=0 && arr[left]==x){
                    left--;
                }
                while(right<n && arr[right]==x){
                    right++;
                }
                // System.out.println(left+1);
                // System.out.println(right-1);
                temp.add(left+1);
                temp.add(right-1);
                break;
            }
            
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        if(temp.size()==0){
            temp.add(-1);
        }

        return temp;
    }
        
    public static void main(String[] args) {
        int arr[] = {7,7,9,10,10};
        int x = 6;
        ArrayList<Integer> ans = binary_search(arr, arr.length, x);
         for(int i =0;i<ans.size();i++){
             System.out.println(ans.get(i));
         }
    }
}
