import java.util.Scanner;

//Checking array is sorted or not!
public class CheckSortedArray
{
    public static void main(String[] args)
    {
        int array[]=new int[4];
        Scanner obj= new Scanner(System.in);
        System.out.println("Write Array elements");
        for(int i=0;i<array.length;i++)
        {
            array[i]= obj.nextInt();
        }
        for(int i=0; i<array.length;i++)
        {
            if(array[i]>=array[i-1])
            {
                System.out.println("Array was sorted");
            }
            else
            {
                System.out.println("Array not sorted");
            }
        }
    }
}
