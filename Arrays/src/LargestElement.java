
import java.util.Scanner;
public class LargestElement
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
        int largest=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>largest)
                largest=array[i];
        }
        System.out.println("Largest Element is "+largest);
    }
}
