
import java.util.Scanner;
public class SmallestandSecodSmallest
{
    public static void main(String[] args)
    {
        int[] array =new int[4];
        Scanner obj= new Scanner(System.in);
        System.out.println("Write Array elements");
        for(int i=0;i<array.length;i++)
        {
            array[i]= obj.nextInt();
        }
        int smallest=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<smallest)
                smallest=array[i];
        }
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<secondsmallest && array[i]!=smallest)
                secondsmallest=array[i];
        }
        System.out.println("Smallestt is "+smallest);
        System.out.println("Second Smallest Element is "+secondsmallest);

    }
}
