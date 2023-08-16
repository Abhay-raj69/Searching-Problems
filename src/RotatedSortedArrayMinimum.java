import java.util.Scanner;

public class RotatedSortedArrayMinimum {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        System.out.println();
        int ans=findMin(arr);
        System.out.print(ans);
    }
    static int findMin(int[] arr){
        int n=arr.length;
        int start=0,end=n-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }
}
