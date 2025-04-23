
public class Sortingarrs {

    //print elements & arr
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 78 , 52 , 45 , 10 , 99 , 1 };
        //bubble shorting
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length-i-1; j++) {
                if(arr1[j] > arr1[j+1]){
                    //swaping a numbers
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        //caling function to print array
        printarr(arr1);
    }
}
