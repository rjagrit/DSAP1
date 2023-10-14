
//Q. Find Number of Elements in an Array in Java
public class CountAryElts
{
/*-----------1st way to find number of elements in a array------------
    public static void main(String [] args)
  {
       int ar[]={1,2,3,4,5,6,7,8,9,10,2,4,5,6,7};
       int length=ar.length;
       System.out.println("There are "+length+" elements in given array");
   }
 */
    /*----------2nd way to find number of elements in a array------------ */
    public static void main(String [] args)
    {
        int count=0;
        int ar[]={1,2,3,4,5,6,7,8,9,10,2,4,5,6,7};
        for(int i=0;i<ar.length;i++)
        {
            count+=1;
        }
        System.out.println("There are "+count+" elements in given array");
    }
}
