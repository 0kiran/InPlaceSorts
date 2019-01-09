public class InPlaceSorts {

    public static void insertionSort(int[] list1){
        for(int i = 1; i < list1.length; i++){
            for(int j= 0; j<i;j++){
                if(list1[j] > list1[i]) {
                    int temp = list1[i];
                    for(int k=i;k>j;k--){
                        //System.out.println(temp);
                        list1[k] = list1[k-1];
                    }
                    list1[0] = temp;
                }
            }
        }
    }

    public static void selectionSort(double[] list1){
        double minVal = list1[0];
        for(int curpos = 0; curpos < list1.length;curpos++){
            int minPos = curpos;
            for(int j = 0; j < list1.length; j++){
                if(list1[curpos] < minVal){
                    minVal = list1[curpos];
                }
            }
            swapDouble(list1,curpos,minPos);
        }
    }

    public static void bubbleSort(String[] list1){
        int swaps = -1;
        int end = list1.length-1;
        while(swaps != 0){
            int i = 0;
            swaps = 0;
            while(i < end){
                if(list1[i].compareTo(list1[i+1]) < 0){
                    swapString(list1,i,i+1);
                    swaps++;
                }
                i++;
            }
            end = i;
        }
    }

    public static void swapString(String[] a, int i, int j){
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void swapDouble(double[] a, int i, int j){
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10001);
        }
        return arr;
    }

    public static double[] randdoubleArr(int count){
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (Math.random()*10001);
        }
        return arr;
    }

    public String[] randomStringArr(int num, int length){
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while(i < length){
                char c= (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }



}
