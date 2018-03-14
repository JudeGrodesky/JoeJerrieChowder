//JoeJerrieChowder - Raunak Chowdhury, Jude Grodesky, Jerry Ye
//APCS2 pd2
//L01 -- What Does the Data Say? And how?
//2018-03-14

public class QuickSortTester {

public static void main(String[] args) {
    long startTime = 0;
    long endTime= 0;
        int trial = 1;
        //[10000,1000000] incremented by 10000s
        System.out.println("Trial, Array Size, Time Elapsed");
        for(int arraySize = 10000; arraySize <= 1000000; arraySize += 10000) {
		for( int i = 0; i < 100; i++){
		    int[] testArr = QuickSort.buildArray(arraySize,100);
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
