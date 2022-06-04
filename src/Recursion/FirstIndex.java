package Recursion;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        int k=in.nextInt();
        int fi=firstIndex(a,0,k);
        System.out.println(fi);

    }

    public static int firstIndex(int[] arr, int idx, int x){

        if(idx==arr.length) { return -1; }

        if(arr[idx]==x)  {  return idx;  }

        return firstIndex(arr,idx+1,x);

    }

}
