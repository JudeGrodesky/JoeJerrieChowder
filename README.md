# JoeJerrieChowder(Jerry Ye, Raunak Chowdhury, Jude Grodesky): Analyzing the runtime of QuickSort
  ChickenBagel: Jerry Ye, Raunak Chowdhury, Jude Grodesky
  APCS2 PD02 <br />
  Lab01 -- But What Does the Data Say? <br /> 
  2018-03-14
### Hypothesis
For an array of size n, the QuickSort algorithm will run in O(nlogn) time on average and in the best case. It will run at a time of O(n^2) in the worst case. 
### Background
The QuickSort algorithm's runtime is O(nlogn) in the best and average case, but O(n^2) in the worst case. At worst, if you continously select the maximum or minimum as the pivot, QuickSort will run in O(n^2) run time because you are performing partition (a linear run time method) n times resulting in a O(n^2) runtime categorization. Alternatively, in the best case, you would select the median of the array everytime which would mean that you perform partition logn times exactly. On average, you would still perform partition less times than n so the average case is O(nlogn) as well. 
### Experiment methodology
