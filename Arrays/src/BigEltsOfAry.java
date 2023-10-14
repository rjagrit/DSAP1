public class BigEltsOfAry
{
    public static void main(String [] args)
    {
        int ar[]={1,2,33,4};
        int max=ar[0];
        for(int i=0;i<ar.length;i++)
        {
           if(max<ar[i])
           {
               max=ar[i];
           }
        }
        System.out.println("Maximum value:"+max);
    }
}
