//rotating array n times by transforming the value automatically to the original.
/*
-----------Left Rotate-----------
a[]={1,2,3,4}

R-1--->{2,3,4,1}
R-2--->{3,4,1,2}
R-3--->{4,1,2,3}
R-4--->{1.2.3.4} equal to R-1
R-5--->{2,3,4,1} equal to R-2......same as

# transforming the k-values

0 % 4 = 0
1 % 4 = 1
2 % 4 = 2
3 % 4 = 3
4 % 4 = 0
5 % 4 = 1................so on

----------------
k % array.length | will transform the values
----------------

----For Negative values of K (Rotation become opposite)--------
Let say K = -1, {4,1,2,3} equivalent to R-3

so to do so we ADD the value to the length,

- 1 + 4 (Array length) = 3......

if k is negative then
k + array.length
 */

import java.util.Scanner;
public class ArrayRotation
{
    static void rotateOnce(int a[])
    {
        int temp=a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];// shifting the array elelemts to the left means 1st iteration a[0]=a[1]
        }
        a[a.length-1]= temp; // placing first element that is stored in temp in the last position
    }

    static void rotate(int a[], int k){
        //k = number of times rotation has to be done
        //if condition to check if the array rotate result is not equal to the newly submission of array

        k = k%a.length;
        if(k<0){
            k = k + a.length;
        }
        for(int i=1;i<=k;i++){
            rotateOnce(a);
        }
    }
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5};
        Scanner obj= new Scanner(System.in);
        System.out.println("How many Times you want to rotate the Array if it had "+arr.length+" elements present");
        int rt= obj.nextInt();
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        rotate(arr, rt );
        System.out.println("\nNew Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}


//----------------Rotate array One place to the left-------------
/*
static void rotate(int a[])
    {
        int temp=a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];// shifting the array elelemts to the left means 1st iteration a[0]=a[1]
        }
        a[a.length-1]= temp; // placing first element that is stored in temp in the last position
    }
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5};
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        rotate(arr);
        System.out.println("\nNew Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
 */
