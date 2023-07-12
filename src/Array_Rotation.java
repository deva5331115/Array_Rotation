import java.util.Scanner;

public class Array_Rotation {
    public int [] Reverse(int[] arr,int start,int stop){
        int i=start;
        int j=stop;
        int temp=arr[start];
        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scam=new Scanner(System.in);
        int size=scam.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]=scam.nextInt();
        }
        int numrot=scam.nextInt();
        if (numrot>array.length){
            numrot=numrot%array.length;
        }
        Array_Rotation rotate=new Array_Rotation();
        rotate.Reverse(array,0,array.length-1);
        rotate.Reverse(array,0,numrot-1);
        rotate.Reverse(array,numrot,array.length-1);
        for (int arr:array
        ) {
            System.out.println(arr);
        }



    }
}
