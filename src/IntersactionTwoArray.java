public class IntersectionOfTwoArray {

    public static void findCommonElements(int arr[],int arr2[])
    {
        for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<arr2.length;j++)
           {
               if(arr[i]==arr2[j])
               {
                   System.out.print(arr[i]+" ");
                   break;
               }
           }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={3,4,5,6,7};
        findCommonElements(arr,arr2);
    }
    
}
