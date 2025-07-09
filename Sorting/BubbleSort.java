import java.util.*;
public class BubbleSort{
    public static int[] bubbleSort(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            int flag = 0; 
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }

        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = bubbleSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}