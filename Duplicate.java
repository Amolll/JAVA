import java.util.*;

public class Duplicate
{
    public static void main(String[] args) {
        
        int arr[]= new int[]{1,2,3,1,3,5,6,8,9,7,9,8};

        System.out.println("Print Duplicate");

        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++ )
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
