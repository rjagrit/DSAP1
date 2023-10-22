
//WE had use here noraml approcah that had O(n) Time complexity, and large auxilary space etc, cu we are creating 2 arrays.
public class RemoveDuplicate
{

    static int removeDuplicate(int arr[])
    {
        int rd=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[rd]!=arr[i])
                rd++;
                arr[rd]=arr[i];
        }
        return rd+1;
    }
    public static void main(String [] args)
    {
        int arr[]={2,2,3,4,4,5,6};
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        int index= removeDuplicate(arr);
        System.out.println("\nNew Array");
        for(int i=0;i<index;i++)
            System.out.print(arr[i]+" ");


    }
}


//----------------Logic-1---------------------------------------------
/*
    int arr1[]={1,1,2,2,3,3,4,4};
    int arr2[]=new int[arr1.length];
    int rd=0;
        arr2[rd]=arr1[0]; // storing 1st val of array 1 in second array
                for(int i=1;i< arr1.length;i++)
        {
        if(arr2[rd]!=arr1[i])
        rd++;
        arr2[rd]=arr1[i];
        }
        System.out.println("Duplicate  Elements are Removed");
        for(int i=0;i< arr2.length;i++)
        {
        if(arr2[i]!=0)
        System.out.println(arr2[i]);
        }
*/