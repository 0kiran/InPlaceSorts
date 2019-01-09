public class Runner {
    public static void main(String[] args){
        int[] testarray = InPlaceSorts.randIntArr(10);
        System.out.println("Standard Bubble Sort:\n");
        System.out.println("Before: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();
        long time = System.nanoTime();
        InPlaceSorts.insertionSort(testarray);
        time = System.nanoTime()-time;

        System.out.println("After: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();
    }

}
