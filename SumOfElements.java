/**
 * SumOfElements
 */
public class SumOfElements {

    public static void main(String[] args) {
        int a[]={2,5,4,3,1};

     int sum=   add(a);
     System.out.println("Sum of Elements: "+sum);
    }

    private static int add(int[] a) {
        int temp=0;
       //Extract every value of array and sum each value with other
        for(int i=0;i<a.length;i++)
        {
            temp=temp+a[i];
        }

        return temp;
    }
}