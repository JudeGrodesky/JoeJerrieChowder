//JoeJerrieChowder - Raunak Chowdhury, Jude Grodesky, Jerry Ye
//APCS2 pd2
//L01 -- What Does the Data Say? And how?
//2018-03-14

/* Experiment:
 * 1. Run 1000 trials of each array size in the interval [10000,1000000], in intervals of 10000.
    i. To run a trial, you build an array with random values, and then call quicksort on it. The start time is taken in between the bulding of the array and sorting, and the end time is taken after the array is sorted. The endtime and startTime are subtracted to find the time.
 * 2. Average the difference of the startTime and endTime to get the average runtime.
 * 3. Print to the CSV.
 */

public class QuickSortTester {

public static void main(String[] args) {
        long startTime = 0;
        long endTime= 0;
        int trial = 1;
        //[10000,1000000] incremented by 10000s
        System.out.println("Trial, Array Size, Time Elapsed");
        for(int arraySize = 10000; arraySize <= 1000000; arraySize += 10000) {
                for( int i = 0; i < 1000; i++) {
                        int[] testArr = QuickSort.buildArray(arraySize,1000);
                        startTime += System.currentTimeMillis();
                        QuickSort.qsort(testArr);
                        endTime += System.currentTimeMillis();
                }
                System.out.println(trial + "," + arraySize + "," + (endTime-startTime)/1000);
                trial += 1;
                startTime = 0;
                endTime = 0;
        }
}
}
