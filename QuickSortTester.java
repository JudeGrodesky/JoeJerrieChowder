//Raunak Chowdhury
//APCS2 pd2
//L01 -- What Does the Data Say? And how?
//2018-03-14

public class QuickSortTester {

public static void main(String[] args) {
        long startTime;
        long endTime;
        int trial = 1;
        //[100,10000] incremented by 100s
        System.out.println("Trial, Array Size, Time Elapsed");
        for(int arraySize = 100; arraySize <= 10000; arraySize += 100) {
                int[] testArr = QuickSort.buildArray(arraySize,1000);
                startTime = System.currentTimeMillis();
                QuickSort.qsort(testArr);
                endTime = System.currentTimeMillis();
                System.out.println(trial + "," + arraySize + "," + (endTime-startTime));
                trial += 1;
        }
}
}
