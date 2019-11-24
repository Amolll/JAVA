import java.util.Scanner;

class SecondLargest
{
    void findSecondLargest(int arr[])
    { //write here logics
        int largest = arr[0];
		int secondLargest = arr[0];
        Scanner xyz=new Scanner(System.in);

        System.out.println("Input The Size Of array : ");
        int size=xyz.nextInt();

        System.out.println("Input "+ size +" elements in the array : ");

        for(int i=0;i<size;i++)
        
        {
            System.out.print("element -"+ i +" : "+ arr[i] +"\n");
        } 

		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
        }
        System.out.println("\nSecond largest number is:" + secondLargest);

 
        
    } 
} 
public class SecondLargestApp
{
   public static void main(String x[])
   {
       SecondLargest sl=new SecondLargest();
	int a[]=new int[]{5,6,4,8,9};
	sl.findSecondLargest(a);
   }
}
